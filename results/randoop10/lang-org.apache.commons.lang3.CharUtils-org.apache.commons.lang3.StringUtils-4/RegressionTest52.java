import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest52 {

    public static boolean debug = false;

    @Test
    public void test26001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26001");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", "20\\U0020\\U0020\\U0020\\U00   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26002");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U0023                                   ", "...1\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 4, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   ..." + "'", str3, "   ...");
    }

    @Test
    public void test26004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26004");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\\\2\\\\\\\\\\2\\\\\\ 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26005");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\n', '3');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\n' + "'", char2 == '\n');
    }

    @Test
    public void test26006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\iui0020", "###\n\\u002                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\iui0020" + "'", str2, "\\iui0020");
    }

    @Test
    public void test26007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u" + "'", str1, "3200u");
    }

    @Test
    public void test26008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26008");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAA15AAAA", "\\u0036");
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", strArray4, strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n666U3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\326", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000" + "'", str6, "0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test26009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00" + "'", str1, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
    }

    @Test
    public void test26010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("      AAAA...", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26011");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII 6\\\\U0020IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                                                 \\u0023                                                                                     hi!hi!hi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0020                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0020                                                                                     " + "'", str1, "0020                                                                                     ");
    }

    @Test
    public void test26015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                  I!", 111, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057                                                                                                                             1\\u0030UuU\\", "61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61" + "'", str2, "61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test26017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26017");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("U0023\\U00\\u0041\\U0023", "", 20);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26018");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023        75023\\u0023\\u002");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test26019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\61\\6161\\61\\6161\\61\\6161\\" + "'", str1, "1\\61\\6161\\61\\6161\\61\\6161\\");
    }

    @Test
    public void test26020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
    }

    @Test
    public void test26021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26021");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "3", (java.lang.CharSequence) "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test26022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\U0061\\U0061\\U\\U0023\\U0061\\U0061\\U0                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              0U\\1600U\\1600U\\3200U\\U\\1600U\\1600U\\" + "'", str1, "                              0U\\1600U\\1600U\\3200U\\U\\1600U\\1600U\\");
    }

    @Test
    public void test26023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26023");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...", "\\u0031", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii", 63);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA..." + "'", str4, "      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...");
    }

    @Test
    public void test26024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26024");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!", "\n\n......\n\n", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U", 508, 64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U" + "'", str3, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U");
    }

    @Test
    public void test26026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 112, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test26028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...", 124, "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U                 661uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...U                 61" + "'", str3, "U                 661uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...U                 61");
    }

    @Test
    public void test26029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26029");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", " 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "##############################################.16 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26031");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...", 54);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26032");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "        \\u0033 AAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        \\u0033 AAAAAAA      " + "'", str1, "        \\u0033 AAAAAAA      ");
    }

    @Test
    public void test26034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26034");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  575\\u0037200U\\", "\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      ", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\..." + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
    }

    @Test
    public void test26036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000", 60, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "666666666666...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000" + "'", str3, "666666666666...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
    }

    @Test
    public void test26037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("u0023#u0023#u0023#u0023#u0023#u0023#u0023", "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023#u0023#u0023#u0023#u0023#u0023#u0023" + "'", str2, "u0023#u0023#u0023#u0023#u0023#u0023#u0023");
    }

    @Test
    public void test26039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   2  ", "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26040");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "30\\\\\\\\", "\\U0023                                                                                     HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\..." + "'", str2, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\...");
    }

    @Test
    public void test26042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26042");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26043");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                            AAAAAAAAAAAAA3200\\A                                 ", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uU", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    ", 189);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\32\\U0068", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26046");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\i\\", "                       61\n                       ", (int) '0', 202);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\i\\                       61\n                       " + "'", str4, "\\i\\                       61\n                       ");
    }

    @Test
    public void test26047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\16");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26048");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                            AAAAAAAAAAAAA3200u\\A                                 ", 59, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            AAAAAAAAAAAAA3200u\\A                                 " + "'", str3, "                            AAAAAAAAAAAAA3200u\\A                                 ");
    }

    @Test
    public void test26049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("UUUUUUUUUUUUUUUUUU", "222222222222222222222222222222222222222222222222222222222222u   6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\400326666666666666666666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\4003266666666666666666666666666666666666666", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0..." + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...");
    }

    @Test
    public void test26053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00" + "'", str2, "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
    }

    @Test
    public void test26054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26054");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c\\u0", "a         ", 92);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "\\");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u", strArray6, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5", strArray1, strArray18);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ ", 161, 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str14, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str15, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "23\\u0023\\u" + "'", str19, "23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5" + "'", str20, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test26055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("3333361                                         \n\n1                                         ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3333361                                         \n\n1                                         " + "'", str3, "3333361                                         \n\n1                                         ");
    }

    @Test
    public void test26056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26056");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aAAAAAA     \\u0041                                                                                           ", "7777777777777777", 685);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26057");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u6      61        61        61        6", "555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("23\\U                                                                                             ", '4', '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\U                                                                                             " + "'", str3, "23\\U                                                                                             ");
    }

    @Test
    public void test26059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26059");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("75", ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray7, strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, " 61\\\\u0020");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", strArray10);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("  2   ", strArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("    61        61        61        61        61        61        61        61        61        61        61        61        61   ", strArray10);
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU", strArray10);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "75" + "'", str12, "75");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "75" + "'", str15, "75");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test26060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26060");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26061");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("i!", "\\U0023\\U00\\u0041\\U                                   ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "66666666666666666666666666666666666666666..." + "'", str2, "66666666666666666666666666666666666666666...");
    }

    @Test
    public void test26063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26063");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                        AAAAAAA    ", "...AAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA", 456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26064");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(".....", "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test26066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26066");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!i!hi!hi23                                                                                                                                                  h", (int) 'U');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("UUUUUUUUUUUUUUUUUU", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            UUUUUUUUUUUUUUUUUU" + "'", str2, "                            UUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test26068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26068");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '1');
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16" + "'", str3, "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test26069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u" + "'", str1, "c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u");
    }

    @Test
    public void test26070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("1", "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test26072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str2, "222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test26073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                           \\u003                                                                                                                                                                                                                                                            ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                           \\u003                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                           \\u003                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test26074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0#", "00U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0#" + "'", str2, "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0#");
    }

    @Test
    public void test26075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u23\\u23\\u23\\u23\\u23\\u23\\u23                                                  ", 92, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                             " + "'", str3, "...                             ");
    }

    @Test
    public void test26076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\" + "'", str2, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
    }

    @Test
    public void test26077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26077");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "61\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...                           ...0023h\\hh0023h\\hh0023h                            ...", 479, (int) 'c');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test26078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26078");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "1111111     ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("                                                 ...", (java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                           1400u\\", strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test26079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26079");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...261\\261\\261\\261\\261\\261\\261\\2...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005", 189);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu..." + "'", str3, "61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test26081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26081");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", 54);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'u', (int) 'c', (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test26082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26082");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\n', 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test26083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "000000000000000000000000000000...             ", (java.lang.CharSequence) "\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "222223200U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("16U", "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str2, "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test26086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26087");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "61\\ 61\\61");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '\\', 153, 85);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test26088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006", 59, '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006" + "'", str3, "                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006");
    }

    @Test
    public void test26089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "                  \\U0033\\U0033\\U0033\\U0033\\U0033\\U0033\\U");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaa...", "4  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("               AAAAAAAAAAAAA3200\\A                                 ", 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               AAAAAAAAAAAAA3200\\A                                 " + "'", str2, "               AAAAAAAAAAAAA3200\\A                                 ");
    }

    @Test
    public void test26092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("61\\ 61\\ ...", 0, 112);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ ..." + "'", str3, "61\\ 61\\ ...");
    }

    @Test
    public void test26093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26093");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777", 71, "0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777" + "'", str3, "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777");
    }

    @Test
    public void test26094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26094");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                hi!hi!hi!", "\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                hi!hi!hi!" + "'", str3, "                                                                hi!hi!hi!");
    }

    @Test
    public void test26095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26095");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u...", "  6\\\\u0020");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26096");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "                                       aaaaaaaaaaaaa\\\\");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("u0023", "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u0023" + "'", str3, "u0023");
    }

    @Test
    public void test26098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26098");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###        ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26099");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ", (int) '3', (int) 'i');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                               \\u0035");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26101");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "\n\n1");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i!                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                                                                                   " + "'", str1, "i!                                                                                   ");
    }

    @Test
    public void test26104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("UUUUU  2  ", "                                           \\6005c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUU  2  " + "'", str2, "UUUUU  2  ");
    }

    @Test
    public void test26105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u32057                                                                                                                             1" + "'", str1, "0uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u32057                                                                                                                             1");
    }

    @Test
    public void test26106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26106");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                            AAAAAAAAAAAAA3200\\A                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26107");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26108");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "\n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("2   ", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2   " + "'", str2, "2   ");
    }

    @Test
    public void test26110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26110");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26111");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666iiiiiiiiiii", "aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ ...", (int) (byte) 10, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ ..." + "'", str3, "\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ ...");
    }

    @Test
    public void test26113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", "                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", str3, "      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test26114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" 0##", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 0##" + "'", str2, " 0##");
    }

    @Test
    public void test26115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test26116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26116");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "11111111111111111111111111111...", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0055", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\61\\61\\61\\61\\61\\61", "\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\61\\61\\61\\61\\61\\61" + "'", str2, "\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test26118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26118");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("23\\U                         ", "                   0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...                    ", "55                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r                                                 ", "\\U005C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAA...AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAA                             HHHHHHHHHHHHHHHHH", "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26121");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 42);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "  \n\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test26122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26122");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 a", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("65                                  5a", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "65                                  5a" + "'", str2, "65                                  5a");
    }

    @Test
    public void test26124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26124");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0023                                                                                     hi!hi!hi!                                                                                                         ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", 173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66                                                                            " + "'", str2, "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66                                                                            ");
    }

    @Test
    public void test26126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa", '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa" + "'", str2, "5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa");
    }

    @Test
    public void test26127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26127");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", "3333361                                         \n\n1", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26128");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61uuu", "           \n\n1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26129");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26130");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A\\u0023AAAAAAAAAAAAAa000u\\", "\\u000d", 40);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                   \\u0033                   ", 479, 257);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26133");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("66666666666666666666666666666666666666666...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("002300230023002300230023002300230A000U\\002300230023002300230023002300230", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "002300230023002300230023002300230A000U\\002300230023002300230023002300230" + "'", str2, "002300230023002300230023002300230A000U\\002300230023002300230023002300230");
    }

    @Test
    public void test26136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                           \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26137");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666iiiiiiiiiii", "\\u0041", "UU03UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26138");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\\', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test26139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26139");
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u000d", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 23 + "'", int17 == 23);
    }

    @Test
    public void test26140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26141");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                 ...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111", "           A\\u0023AAAAAAAAAAAAA  u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu           A\\u0023AAAAAAAAAAAAA   ", "", 929);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                 ...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111" + "'", str4, "                                                                                                 ...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test26142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26142");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.CharSequence) "                                           \\u005c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26143");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("400u\\00U\\3200U\\", "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test26145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26145");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00", "   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26146");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("55555555555                                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26147");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..", (int) 'U');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26148");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu", "                         75                          ", "\\4\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu" + "'", str3, "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu");
    }

    @Test
    public void test26149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("   u61    ", 929);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   u61    " + "'", str2, "   u61    ");
    }

    @Test
    public void test26150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", "\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", " ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                               \\u0035", 936);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023", 115, 78);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26154");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26155");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'U', (int) (short) 100, 50);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ", strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 44 + "'", int8 == 44);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "      " + "'", str9, "      ");
    }

    @Test
    public void test26156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26156");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("   u61    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26157");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...h    h...aaaaaaa                            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", " 61.##########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26158");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", (java.lang.CharSequence) "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 118 + "'", int2 == 118);
    }

    @Test
    public void test26159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26159");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                  61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) '2');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                                                                                                        aaaaaaa     ", (int) ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("1111111", strArray5, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  ......  77777777777777777777777777777777777777777777777777777777777777777777777", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("        75                                                                                                           ", strArray9, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, 'c', 4, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111" + "'", str10, "1111111");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "        75                                                                                                           " + "'", str14, "        75                                                                                                           ");
    }

    @Test
    public void test26160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26160");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAA", 'u');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'A' + "'", char2 == 'A');
    }

    @Test
    public void test26161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26161");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\U000D");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00U\\3200U\\3200U\\3200U\\3200U\\3200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26163");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6\\\\U0020");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00" + "'", str1, "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
    }

    @Test
    public void test26165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("161\\161\\161\\161\\161\\161\\U6                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161\\161\\161\\161\\161\\161\\U6" + "'", str1, "161\\161\\161\\161\\161\\161\\U6");
    }

    @Test
    public void test26166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26166");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U", 297);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                23\\u0023\\u0023\\u00236                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 613\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "3\\u003\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("2\\UUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2\\UUUUUUUU" + "'", str1, "2\\UUUUUUUU");
    }

    @Test
    public void test26170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U000A16 16 16 16 16 16 16 16 16 16 16 U000A16 16 16 16 16 16 16 16 16 16 16 U000A" + "'", str1, "U000A16 16 16 16 16 16 16 16 16 16 16 U000A16 16 16 16 16 16 16 16 16 16 16 U000A");
    }

    @Test
    public void test26171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26172");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\", "u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "                                        A0u0023AAAAAAAAAAAAA                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26175");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666", "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26176");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiAlpha('I');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAAAAAAAAA\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAAAAAAAAA\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAAAAAAAAA\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test26178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26179");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23\\u                                                 ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26180");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666666666666666666666666666666666666660200U\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U00234444444444444444444444444444444444444444444444444444444" + "'", str1, "666666666666666666666666666666666666660200U\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U00234444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26181");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("  6  6  6  6  6  uuu", "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                         ", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26182");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '6', '.');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test26183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                     U6623\\U6623\\U6623\\U6623\\U6623\\U6623U666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U6623\\U6623\\U6623\\U6623\\U6623\\U6623U666" + "'", str1, "U6623\\U6623\\U6623\\U6623\\U6623\\U6623U666");
    }

    @Test
    public void test26184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("111111111", "a                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("6u666", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6u666" + "'", str2, "6u666");
    }

    @Test
    public void test26186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26186");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0034                                                                                           ", "                                                 ..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26187");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26188");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("U0023\\U00\\u0041\\U00232222");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\UUU02\\...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\UUU02\\..." + "'", str1, "\\UUU02\\...");
    }

    @Test
    public void test26190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\3200u\\32" + "'", str1, "u\\3200u\\32");
    }

    @Test
    public void test26191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...    23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\...", 56, " 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\..." + "'", str3, "...    23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\...");
    }

    @Test
    public void test26192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26192");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ", (java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test26193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61", 66, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... 61uuuuuuuuuuuuuuuuuuuuu   u61" + "'", str3, "... 61uuuuuuuuuuuuuuuuuuuuu   u61");
    }

    @Test
    public void test26195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020", "...                                                                                          ", "1\\hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020" + "'", str3, "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020");
    }

    @Test
    public void test26196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26196");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 94);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str5, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test26197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test26198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26198");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26199");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\u005c\\u003 u00\\u005c\\u003 u00\\u005c\\u003          3    \\u005c\\u003 u00\\u005c\\u003 u00\\u005c\\u003      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("u004", '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u004" + "'", str2, "u004");
    }

    @Test
    public void test26202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26202");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("161\\ 61\\ 6161\\ 61\\ 6161\\ 6", 'U');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26203");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("2...........................................................................................................................................................................................................................................................................................................................................................", "575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2..........................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "2...........................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test26205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26205");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", "                            AAAAAAAAAAAAA3200\\A                                               ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26206");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                        ", 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26207");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0061", (java.lang.CharSequence) "1\\u00234                                      \\u0023\\u00\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26208");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("uuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuu");
    }

    @Test
    public void test26209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 192);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26211");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '7', 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test26212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                               !ih!ih!ih", 1000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               !ih!ih!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               !ih!ih!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test26213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" 61\\ 6161\\ 61\\ 6161\\ ", "...111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26214");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str1, "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test26215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                        ...", "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ", " 61.##############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        ..." + "'", str3, "                                        ...");
    }

    @Test
    public void test26216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                               huuu02huuu02huuu02hAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               HUUU02HUUU02HUUU02HAAAAAAAAAAAAA" + "'", str1, "                                               HUUU02HUUU02HUUU02HAAAAAAAAAAAAA");
    }

    @Test
    public void test26217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26217");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "...0u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hhhhhhhhhhhhhhhhhhhhhhhh", "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test26219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26219");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0000002\\UUUUUUUU00000000000000000000000000000000000000000", 667);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26220");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u c", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26221");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U005C", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test26222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("i!                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "i!                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test26223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26223");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  6  6  6  6  6  uuu", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("111111111111111111111u61111111111111111111111123\\U", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test26224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100" + "'", str2, "666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
    }

    @Test
    public void test26225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26225");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAAAAAAA...0u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61 + "'", int1 == 61);
    }

    @Test
    public void test26226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                      61.##############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61.##############################################" + "'", str1, "61.##############################################");
    }

    @Test
    public void test26227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("23\\u0023\\u...                                   UUUUUUUUUUUUUUUUUUUUU", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u...                                   UUUUUUUUUUUUUUUUUUUUU" + "'", str2, "23\\u0023\\u...                                   UUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test26228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26228");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaa3200U\\a                                 ", 300);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26229");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                  61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) '2');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("............................                                                                                                                                     ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test26230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26230");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "", 55, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "u003                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", '\r', '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test26233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26235");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "23\\U0023\\U");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) '#', (int) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26236");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                         ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Aaaaaaaaaaaaa", (java.lang.CharSequence) "000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26238");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 234);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 234 + "'", int2 == 234);
    }

    @Test
    public void test26239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26239");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 16");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82 + "'", int2 == 82);
    }

    @Test
    public void test26240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26240");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("\\", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("   u61    ", strArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("    61    ", strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("u61", 'U');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("      ", strArray13, strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", strArray6, strArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23, "", 94, (int) ' ');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     ", strArray6, strArray23);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "      " + "'", str18, "      ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str19, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     " + "'", str28, "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     ");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "      " + "'", str29, "      ");
    }

    @Test
    public void test26241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26241");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\4003266666666666666666666666666666666666... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u3\\u0023\\u0023\\u0023\\u0023\\u00231\\40032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                           \\6005c", '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           \\6005c" + "'", str2, "                                           \\6005c");
    }

    @Test
    public void test26243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26244");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("11111111111U0023#U0023#U0023#U0023#U0023#U0023#U0023", "3200U\\1400u\\00U\\3200U", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26245");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("iiiiiiiiiiiiiiiiiiiiiiiiiii\\U005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii", "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26247");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                      " + "'", str1, "                                                      ");
    }

    @Test
    public void test26248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26249");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                 ", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057" + "'", str1, "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
    }

    @Test
    public void test26251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                    \n\n1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    \n\n" + "'", str1, "                    \n\n");
    }

    @Test
    public void test26252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26252");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "    16        16        16        16        16        16        16        16        16        16        16        16        16    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\n\n1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "                    \n                     ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26256");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023..." + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...");
    }

    @Test
    public void test26257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test26258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26258");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61" + "'", str1, " 61");
    }

    @Test
    public void test26259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111..." + "'", str1, "1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...");
    }

    @Test
    public void test26260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", 102, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str3, "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test26261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26261");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                  61", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuu                                  3200u", "1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("3AAAA51AAAA0023AAAA51AAAA0023", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 99 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test26262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26262");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0023\\u00 61\\ 61\\61\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test26263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26263");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                   U\\1400u\\00U\\3200U\\", (java.lang.CharSequence) "002300230023002300230023002300230a000u\\002300230023002...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test26264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26265");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\n");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 124);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA         " + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA         ");
    }

    @Test
    public void test26268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("23\\u0023\\u0023          3    23\\u0023\\u0023      ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu003u0023u0023u0023u0023u0023u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55" + "'", str2, "5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu003u0023u0023u0023u0023u0023u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55");
    }

    @Test
    public void test26270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61", "H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                         u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u002u0023\\u002u0023\\u002u0" + "'", str1, "u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test26273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26273");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26275");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '1', '7');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void test26276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                              41                                                                                                                                                                         ", 120, "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                              41                                                                                                                                                                         " + "'", str3, "                                                                                                                              41                                                                                                                                                                         ");
    }

    @Test
    public void test26277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                   \\u0037                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0037" + "'", str1, "\\u0037");
    }

    @Test
    public void test26278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  \\UUU02\\UUU02\\UUU02\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "222223200U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("i!         ", 243, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", (int) '\r', 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0");
    }

    @Test
    public void test26282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                    ", "11111111111", "75 ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test26283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26283");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', 'c');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void test26284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str1, "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test26286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("222222222222222222222222222222222222222222222u6                                          ", 936);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               222222222222222222222222222222222222222222222u6                                          " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               222222222222222222222222222222222222222222222u6                                          ");
    }

    @Test
    public void test26287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26287");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("22223200U\\1400u\\00U\\3200U", "#################################################  2   #################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" 61\\Aaaaaaaaaaaaa\\\\\\ ...", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\Aaaaaaaaaaaaa\\\\\\ ..." + "'", str2, " 61\\Aaaaaaaaaaaaa\\\\\\ ...");
    }

    @Test
    public void test26289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26289");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 55, 456);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26290");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
    }

    @Test
    public void test26291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26291");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26292");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("111111111111111111111u61111111111111111111111123\\U                                        ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test26293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26293");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                     u                         ", "00U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U", (int) '\\');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "U0023                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26295");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("             u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("\\4\n\n\n", "\\u0023                                                                                     hi!hi!hi!                                                                                                         ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..", strArray2, strArray5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.." + "'", str6, "uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test26296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuu..." + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test26297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26297");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "      61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26298");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\n\n\n\n\n1");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'c', 57, 43);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n\n\n\n\n1" + "'", str6, "\n\n\n\n\n1");
    }

    @Test
    public void test26299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 81);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "6                                     6    11111111111116                                     6     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                                                                                                 ", "777777777777777777777777777777777777777727777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26304");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", 59, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str3, "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test26305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26305");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u003\\u0023", "                                                                                      ..", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test26307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26307");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6", "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26308");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("23\\u0023\\u0023\\u002", "           A\\u0023AAAAAAAAAAAAA                                      ", 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26309");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", "20\\u0020\\u0020\\u0020\\u00  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26310");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test26311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26311");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test26312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26312");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test26313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ..." + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...");
    }

    @Test
    public void test26314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26314");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "  \\U005C  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test26315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26315");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61", "222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u0055");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("2                                                                                                                    ", 'c', 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2                                                                                                                    " + "'", str3, "2                                                                                                                    ");
    }

    @Test
    public void test26318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0\\u0020\\u000\\u0020\\u000\\u0020161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0\\u0020\\u000\\u0020\\u000\\u0020161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161" + "'", str2, "0\\u0020\\u000\\u0020\\u000\\u0020161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test26319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26319");
        char[] charArray17 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray17);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("                                         \n\n1           ", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u005c\\u00", charArray17);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test26320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26321");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\\\0020                                                                                 ", "u005cu0u005cu0u0023Uu005cu0u005cu0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("3\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3\\u0023\\u" + "'", str1, "3\\u0023\\u");
    }

    @Test
    public void test26323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26323");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaa      " + "'", str4, "aaaaaaa      ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaa      " + "'", str6, "aaaaaaa      ");
    }

    @Test
    public void test26324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26324");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "       ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", " 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("61", strArray8, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "61" + "'", str13, "61");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str14, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test26325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26325");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("1AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'h');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                                                                                   16u                 ");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("00u\\3200u\\3200u\\3200u\\3200u\\3200", strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("222222U0023#U0023#U0023#U0023#U0023#U0023#U0023      222222", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test26326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0023", 138, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0023" + "'", str3, "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0023");
    }

    @Test
    public void test26327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("u002#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#23U0023\\U0023\\U\\4003U0023\\U0023\\U0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u002#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#23U0023\\U0023\\U\\4003U0023\\U0023\\U0" + "'", str1, "u002#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#23U0023\\U0023\\U\\4003U0023\\U0023\\U0");
    }

    @Test
    public void test26328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26328");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U61", " 61", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("       aaaaaaa", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "U       aaaaaaa       aaaaaaa" + "'", str7, "U       aaaaaaa       aaaaaaa");
    }

    @Test
    public void test26329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26329");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "uuuuuuuuuuuuuuuuu3\\u0...\\U00", (java.lang.CharSequence) "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26330");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", (java.lang.CharSequence) "                                                                                                    61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 181 + "'", int2 == 181);
    }

    @Test
    public void test26331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU", "23\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU");
    }

    @Test
    public void test26332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26332");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26333");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '2', 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test26334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26334");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U", 80, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26335");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                           a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "\\u003\\u0023\\u0023\\u0023\\                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26336");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("55555555", 31, 456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26337");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ", "                                                                             23\\u0023\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u", 243);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u                                                                                                                                                                                                                  " + "'", str2, "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u                                                                                                                                                                                                                  ");
    }

    @Test
    public void test26339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26339");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1\\6", "..                                                                                                                 ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                 \\U0023\\U00\\u0041\\U                                   1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("16U", " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                                                                                        aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", '\n');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAA32u\\A                                 ", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAAAAAAAA32u\\A                                 " + "'", str7, "AAAAAAAAAAAAA32u\\A                                 ");
    }

    @Test
    public void test26342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555\\U00C\\U00", "  2   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("U0023\\U00\\u0041\\U00232222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0023\\U00\\u0041\\U00232222" + "'", str1, "U0023\\U00\\u0041\\U00232222");
    }

    @Test
    public void test26344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020  \n\\u" + "'", str2, "\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020\\u020  \n\\u");
    }

    @Test
    public void test26345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26345");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26346");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aa        75                                          aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa        75                                          aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "aa        75                                          aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test26347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26347");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u0023\\u0", "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test26349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26349");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26350");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray4, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("61", strArray4, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", "1111111     ");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("33333333", strArray4, strArray18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str10, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "61" + "'", str13, "61");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "33333333" + "'", str19, "33333333");
    }

    @Test
    public void test26351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("333333333333333333333333333333333333333333333333333333333   ...333333333333333333333333333333333333333333333333333333333", "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626" + "'", str2, "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626");
    }

    @Test
    public void test26352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26352");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...H    H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...H    H..." + "'", str1, "...H    H...");
    }

    @Test
    public void test26353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   ..", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                              .." + "'", str2, "                                                                                                              ..");
    }

    @Test
    public void test26354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26354");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32", 0, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3" + "'", str3, "0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3");
    }

    @Test
    public void test26355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26355");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 10);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                      \\u0023\\u00\\u0041\\u0023", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test26356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26356");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", "1\\6", 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26357");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!", "                                                3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test26358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26358");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26359");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("#####4", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("111111111111111111111       ", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111       " + "'", str2, "111111111111111111111       ");
    }

    @Test
    public void test26361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\", 205);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test26362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26362");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Aaaaaaaaaaa...      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...061                                         \n\n1", "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test26363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A" + "'", str1, "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
    }

    @Test
    public void test26364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" 0023\\U0023\\U0023\\U0023\\0023\\U0023 ...11111111111111", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 0023\\U0023\\U0023\\U0023\\0023\\U0023 ...11111111111111" + "'", str2, " 0023\\U0023\\U0023\\U0023\\0023\\U0023 ...11111111111111");
    }

    @Test
    public void test26365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26365");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test26366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26366");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26367");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("66666666666666666666666666666666666666666...", 'h');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26368");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("      61        61        61        61        61        61        61        61        61        61        61        61   ", "\\", "U0023\\U002375757575757575757575757575757575757575757575757575757575", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      61        61        61        61        61        61        61        61        61        61        61        61   " + "'", str4, "      61        61        61        61        61        61        61        61        61        61        61        61   ");
    }

    @Test
    public void test26369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26370");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("    16        16        16        16        16        16        16        16        16        16        16        16        16    ", 71, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    16        16        16        16        16        16        16        16        16        16        16        16        16    " + "'", str3, "    16        16        16        16        16        16        16        16        16        16        16        16        16    ");
    }

    @Test
    public void test26372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26372");
        char[] charArray6 = new char[] { ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 635 + "'", int11 == 635);
    }

    @Test
    public void test26373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26374");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 263);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 263 + "'", int2 == 263);
    }

    @Test
    public void test26375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26375");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test26376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26376");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "    61        61        615c    61        61        61", (java.lang.CharSequence) "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26378");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaa3200U\\a                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 a\\U0023aaaaaaaaaaaaa" + "'", str1, "                                 a\\U0023aaaaaaaaaaaaa");
    }

    @Test
    public void test26380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("U0023\\U0023\\U\\4003U0023\\U0023\\U0", "                     u                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U0023\\U\\4003U0023\\U0023\\U0" + "'", str2, "U0023\\U0023\\U\\4003U0023\\U0023\\U0");
    }

    @Test
    public void test26381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26381");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                                                                                                                                                                                    16AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 164 + "'", int2 == 164);
    }

    @Test
    public void test26382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                         \n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26383");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(".......................................111111161  \\\\0020                                                                               ", "23\\U", "     1\n\n                                                    1\n\n                                         ", 39);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".......................................111111161  \\\\0020                                                                               " + "'", str4, ".......................................111111161  \\\\0020                                                                               ");
    }

    @Test
    public void test26384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26384");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26385");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'C', 29, 125);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test26386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("A0u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0U0023aaaaaaaaaaaaa" + "'", str1, "a0U0023aaaaaaaaaaaaa");
    }

    @Test
    public void test26387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26387");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "  \\U005C  ", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26388");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("16u", "61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("u61", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u61                                         " + "'", str2, "u61                                         ");
    }

    @Test
    public void test26391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                        aaaaaaa    ", 192, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26392");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test26393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26393");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test26394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26395");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033", (java.lang.CharSequence) "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26396");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (int) (byte) 0, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26397");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                   ", (java.lang.CharSequence) "                      75");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                           ", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           " + "'", str2, "                                                                                           ");
    }

    @Test
    public void test26399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26399");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U0023                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26400");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", 110, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 61\\\\u0020", "a                        ", (int) 'A');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 61\\\\u0020" + "'", str6, " 61\\\\u0020");
    }

    @Test
    public void test26402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26402");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26403");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\U0033                   ", "3200U\\3200U\\320023aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26404");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...1\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", 'U');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26405");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\4003");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26406");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                             136u66136u", "0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26407");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "\\U0055");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test26409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                         1\\U00234                                      \\U0023\\U00\\u0                    ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..                    0u\\00U\\3200U\\                                      43200U\\1                                         " + "'", str1, "..                    0u\\00U\\3200U\\                                      43200U\\1                                         ");
    }

    @Test
    public void test26410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test26411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26411");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U                                            ", "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#####aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa#####", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26413");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", 93, "\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
    }

    @Test
    public void test26414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny(" 6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test26415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("6161616161616161616161616", "0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", '\n', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test26417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "7777777777777777777777777777777777777777777777777777a000u\\7777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("IUI0020\\4\n\n", 88, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IUI0020\\4\n\n............................................................................." + "'", str3, "IUI0020\\4\n\n.............................................................................");
    }

    @Test
    public void test26419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26419");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1\\U00234                                      \\U0023\\U00\\u0                    ..", 112, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\U00234                                      \\U0023\\U00\\u0                    ..23U0023\\U0023\\U\\4003U0023\\U0023" + "'", str3, "1\\U00234                                      \\U0023\\U00\\u0                    ..23U0023\\U0023\\U\\4003U0023\\U0023");
    }

    @Test
    public void test26421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26421");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                           \\\\0033005", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26422");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u022222\\U0023\\U00\\u0041\\U002322222\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test26423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", 86);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26424");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61", "    16        16        16        16        16        16        16        16        16        16        16        16        16    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61" + "'", str2, "61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61");
    }

    @Test
    public void test26426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26426");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  \\005C  ", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26427");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '3', '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '3' + "'", char2 == '3');
    }

    @Test
    public void test26428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\n\n\n\n\n\n\n\n\n\n\\u0055                                            ", "                                                        ..        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", "222222222222222222222222222222222222222222222222222222222222u   6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
    }

    @Test
    public void test26432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26433");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                         ", "\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26434");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("723aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61" + "'", str1, "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61");
    }

    @Test
    public void test26436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26436");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ ...", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26437");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                        aaaaaaa     ", "     \\U0023\\U00\\u0041\\U0023     ", 97);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str4, "                                                                                                        aaaaaaa     ");
    }

    @Test
    public void test26438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26438");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0023\\u0023\\u0023\\u0023\\uAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         U####AU####AU####AU####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\uAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         U####AU####AU####AU####" + "'", str1, "0023\\u0023\\u0023\\u0023\\uAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         U####AU####AU####AU####");
    }

    @Test
    public void test26439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26439");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("61\\61\\6", "\n\n\n\n\n\n\n\n\n\n\n\n                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26440");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("11111111111111111111111111111...", 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\u0032", "a000u\\       UUUUUUUUUUUUUUUUUUU", 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0032" + "'", str3, "\\u0032");
    }

    @Test
    public void test26442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\\\\\u0020", "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26443");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61", "\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26444");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\\\0020", "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                              5c");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5c" + "'", str1, "5c");
    }

    @Test
    public void test26446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26446");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\..." + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
    }

    @Test
    public void test26447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26447");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\ 61\\ 61\\61u 61\\ 61\\610020", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26448");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26449");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test26450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                              41                                                                                                                                                                         ", "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test26451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26451");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 'u');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test26452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26452");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", (int) 'U', (int) 'i');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26453");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                             U\\32", "                              11111                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26455");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "22222222222222222222uuu0023                                            222222222222222222222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test26456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "16\\5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#6666\r\r\r\r\r\r\r##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26458");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\U0023AAAAAAAAAAAAAA000U\\                                                                 A\\U", "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\");
    }

    @Test
    public void test26460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26460");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                         u0023\\u002u0023\\u002u0023\\u002u0");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("\\U0023\\U0023\\U0023\\U0023\\U002.......................................................................", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test26461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       " + "'", str1, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test26462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaA" + "'", str1, "00000000aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test26463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26463");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "                     u                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str2, "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test26465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26465");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("u0023#u0023#u0023#u0023#u0023#u0023#u0023", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test26466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26466");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0020                                         61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "11111                             ", "666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26468");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u002066666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26469");
        char[] charArray5 = new char[] { ' ' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "75", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test26470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26470");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                  61", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test26471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 55, " 6...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6.." + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..");
    }

    @Test
    public void test26472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "023\\u0023\\u0023" + "'", str1, "023\\u0023\\u0023");
    }

    @Test
    public void test26473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26473");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  \\U005C  ", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  \\U005C  " + "'", str4, "  \\U005C  ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test26474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26475");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'U', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test26476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26476");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  6  6  6  6  6  uuu", "11111111111U0023#U0023#U0023#U0023#U0023#U0023#U", 118);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                 ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26478");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                  61", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666", charArray16);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test26479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26479");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                   16u", (int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) '7', "3\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3" + "'", str3, "3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3");
    }

    @Test
    public void test26481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U", "        ###\n###    61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("22222222222222222222222222222222222222222222222222222222222222222223\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "22222222222222222222222222222222222222222222222222222222222222222223\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str1, "22222222222222222222222222222222222222222222222222222222222222222223\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test26483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA" + "'", str1, "AAAA");
    }

    @Test
    public void test26484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("5c11111111111111111111111111 61\\ 111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5c11111111111111111111111111 61\\ 111111111111111111111111111" + "'", str1, "5c11111111111111111111111111 61\\ 111111111111111111111111111");
    }

    @Test
    public void test26485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n" + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test26486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26486");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!1", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26487");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                             6u666", (java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 460 + "'", int2 == 460);
    }

    @Test
    public void test26488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u", "        #######    61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26489");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u", "UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6 161\\161\\161\\161\\161\\161", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26490");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "30\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test26491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26491");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U0023AAAAAAAAAAAAAA000U\\", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test26492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26492");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "61  \\\\0020                                                                                 \\  \\\\0020                                                                                 uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.CharSequence) "aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 178 + "'", int2 == 178);
    }

    @Test
    public void test26493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\u000a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\U0023\\U0023\\U0023\\U0023\\U002.......................................................................", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U002......................................................................." + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U002.......................................................................");
    }

    @Test
    public void test26495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("           \n\n161\\ 61\\ 6", "                                                                                               !ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26496");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                             11111111111111111111111111111111111                                                                             ", 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aa                                          ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                                                                                        aaaaaaa    ", (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU..." + "'", str8, "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test26498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("U0023\\U002U0023\\U002U0023\\U002U0", 245, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555U0023\\U002U0023\\U002U0023\\U002U0" + "'", str3, "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555U0023\\U002U0023\\U002U0023\\U002U0");
    }

    @Test
    public void test26499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26499");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...uuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test26500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26500");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "000000000000000000000000000000...             000000000000000000041\\u00000000000000000000000000000000...             000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

