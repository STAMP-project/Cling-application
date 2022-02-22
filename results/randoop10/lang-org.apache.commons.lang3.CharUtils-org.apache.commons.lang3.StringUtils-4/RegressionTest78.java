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
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "                                                                                           4300u\\", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test39002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39002");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "       ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str5, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test39003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39003");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hhhhhhhhhhhhh", "20\\u0020\\u0020\\u0020\\u00                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                            5a", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            5a" + "'", str2, "                            5a");
    }

    @Test
    public void test39005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39005");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39006");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("3\\u0023u0023\\u0023\\u0023\\u0023\\u002             ", "", "aaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("uUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU" + "'", str1, "uUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002", "61\\\\u0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\\\u0020" + "'", str2, "61\\\\u0020");
    }

    @Test
    public void test39009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39009");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "                                  AAAAAAAAAAAAA3200u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39010");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!                                                                                   U0023                          ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("00u\\0200u\\0200u\\0200u\\02", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     1\n\n                                                    1\n\n                                         ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 104 + "'", int5 == 104);
    }

    @Test
    public void test39011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39011");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\...6 \\66 \\6 \\66 \\6 \\66 \\6 \\6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6", "                                           \\6005c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6" + "'", str2, "\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6");
    }

    @Test
    public void test39014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39014");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                       iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u");
    }

    @Test
    public void test39016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39016");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2U2U2U2U2U2U2U2U2U2", "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323", 205);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39017");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IUI0020\\4\n\n", "2U2U2U2U", 82);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39018");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "3\\u0...", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39019");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                                  ...", '7');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test39020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39020");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'i', '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'i' + "'", char2 == 'i');
    }

    @Test
    public void test39021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39021");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("uuu0023                                            ", "", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test39022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                            aaaaaaa      ", "                                                                                                                                      61.##############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39023");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa                                                ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("\\u0037", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5500\r\\", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test39024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                     23\\u0023\\u0023          3    23\\u0023\\u0023UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("61\\ 61\\61", "\\U0023\\U00\\U0041\\U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\6" + "'", str2, "61\\ 61\\6");
    }

    @Test
    public void test39026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39026");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", "uuuuuuuuuuuu 320011\\\\", 518);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39027");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test39028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39028");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U005C                                                                                                                                                                  ", "533333333333333333333333333333\\40032333333333333333333333333333333c", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39029");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a", (java.lang.CharSequence) "                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 280 + "'", int2 == 280);
    }

    @Test
    public void test39030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39030");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1                                                 ", "                                 A\\u0023AAAAAAAAAAAAA                                  ", 0, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                 A\\u0023AAAAAAAAAAAAA                                  1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1                                                 " + "'", str4, "                                 A\\u0023AAAAAAAAAAAAA                                  1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1                                                 ");
    }

    @Test
    public void test39031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39031");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\", "   ...                                                                                           \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUU" + "'", str1, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUU");
    }

    @Test
    public void test39033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003", "666666661\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003" + "'", str2, "u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003");
    }

    @Test
    public void test39034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023 HI!HI!HI!aaaaaaaaaaa", "aaaaaa                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023 HI!HI!HI!aaaaaaaaaaa" + "'", str2, "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023 HI!HI!HI!aaaaaaaaaaa");
    }

    @Test
    public void test39035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" 6...", 52, 367);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39036");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\iui2\\4\n\n                                                                                                  ", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u\\", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n6161\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n6161\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61" + "'", str2, "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n6161\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n6161\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61");
    }

    @Test
    public void test39038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 191, "222222222222222222222222222222222222222222222u                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "222222222222222222222222222222222222222222222u      7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\222222222222222222222222222222222222222222222u      " + "'", str3, "222222222222222222222222222222222222222222222u      7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\222222222222222222222222222222222222222222222u      ");
    }

    @Test
    public void test39039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0200iui\\", 105);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###\n\\u002                                      ", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    " + "'", str2, "                    ");
    }

    @Test
    public void test39041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39041");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("cccccccccccccccccccccccccccccccccccccccccccccccccccccc", 48, "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str3, "cccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test39042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39042");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("20\\u0020\\u0020\\u0020\\u00   ", "\\u005c\\u0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39043");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       ...\r", "61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u", (int) (byte) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "       ...\r" + "'", str5, "       ...\r");
    }

    @Test
    public void test39044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39044");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaac11111111111111111111111111111111111111111", "uuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39046");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "111111111", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("11111111111111111111111111111...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r3200", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test39047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U", "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U" + "'", str2, "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
    }

    @Test
    public void test39048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "\\                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39050");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test39051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "00000000    2222222222222222222222222222222220000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000    2222222222222222222222222222222220000000" + "'", str1, "00000000    2222222222222222222222222222222220000000");
    }

    @Test
    public void test39052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u", (int) '0', "uuu  \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u");
    }

    @Test
    public void test39053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39053");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0 u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39054");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("uuuuuuuuuuuuuuuuuu\\4a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32000\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32\\", "222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39055");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 270 + "'", int1 == 270);
    }

    @Test
    public void test39056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39056");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("61                                         \n\n1", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test39057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39057");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\UUU02\\... 3hi!hi!hi!                                                                          ", "23\\U                                       ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\UUU02\\... 3hi!hi!hi!                                                                          " + "'", str3, "\\UUU02\\... 3hi!hi!hi!                                                                          ");
    }

    @Test
    public void test39058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39058");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("2                                                                                                                    ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                         \n\n1           ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2                                         \n\n1                                                                                                                               " + "'", str3, "2                                         \n\n1                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2                                                                                                                    " + "'", str4, "2                                                                                                                    ");
    }

    @Test
    public void test39059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39059");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("61");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                          \\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("111111111111111111111u61111111111111111111111123\\U                                        ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test39060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39060");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "   ...3\\u23\\u23U6    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("23\\u U   6", (int) '6', 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     " + "'", str2, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ");
    }

    @Test
    public void test39063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39063");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                             U002322222                                             ", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\5u50055c5\\5u500");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39065");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '\n', (int) (short) 10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0061", strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u005c\\u003 u00\\u005c\\u003 u00\\u005c\\u003          3    \\u005c\\u003 u00\\u005c\\u003 u00\\u005c\\u003      ", strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test39066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39066");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("575\\u0037200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "575\\u0037200U\\" + "'", str1, "575\\u0037200U\\");
    }

    @Test
    public void test39067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39067");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 11, (int) '.');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39068");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '0');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '6');
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test39069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39071");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", (int) '5', (int) '\\');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test39072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39072");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        75");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test39073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                             a   ", "                                                                                                                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("..", "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                             ");
    }

    @Test
    public void test39075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39075");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("111111111aaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str1, "...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test39077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HHHHHHHHHHHHH023\\U0023       AAAAAAAUUUUUUUUUHHHHHHHHHHHHHH", "4444444444444444440023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\4444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u002066666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hCUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "                                         161\\161\\161\\161\\161\\16177777777777777777777777777", "                              23\\u0023\\u0023\\u002                                                       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u002" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u002");
    }

    @Test
    public void test39082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39082");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhh", 365, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..................................................................................................................................................................................................................................................................................................................hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhh" + "'", str3, "..................................................................................................................................................................................................................................................................................................................hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhh");
    }

    @Test
    public void test39083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39083");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("23                                                                                                                                                  hi!hi!hi!", "", "555555555555555555555555555555555555555555555555555555555555555555555555555555555\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     5555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23                                                                                                                                                  hi!hi!hi!" + "'", str3, "23                                                                                                                                                  hi!hi!hi!");
    }

    @Test
    public void test39084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("77777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "77777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "77777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test39085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test39086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39086");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", 61, 168);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str3, "u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test39087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...         1 61 6161 61 6161 61 6161 6...         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 19, "6666666666666666666666666666666666666666666663\\u0...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666666666666666666" + "'", str3, "6666666666666666666");
    }

    @Test
    public void test39089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39089");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("3200u\\3200", "                                                 61\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39090");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaa                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39091");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              23\\u0023\\u0023\\u002   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39092");
        char[] charArray12 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                 \\u0036                                                                 ", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U6663\\u6623\\u6623\\u6623\\u6623\\u6623UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu662", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test39093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39093");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "222222222222222222222222222222222222222222222222222111111111aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test39094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39094");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("11111111111U0023#U0023#U0023#U0023#U0023#U0023#U");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39095");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                       ", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("........", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test39096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39096");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('6', 404);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test39097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39097");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "                                             \\61\\61\\61\\61\\u0023", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39098");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii 6\\\\u0020iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "                0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0061", 393);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061" + "'", str2, "\\u0061");
    }

    @Test
    public void test39100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39100");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                         \n\n1                                                    \n\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39101");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0055", "\\u0035", (int) '3');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\n\n\n\n\n1", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test39102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39102");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '3', 563);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test39103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                    \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                    \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39104");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '\r', '0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\r' + "'", char2 == '\r');
    }

    @Test
    public void test39105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39105");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                             a   ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0u\\1600u\\1600u\\3200U\\u\\1600u\\1600u\\" + "'", str1, "0u\\1600u\\1600u\\3200U\\u\\1600u\\1600u\\");
    }

    @Test
    public void test39107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39107");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  UUU6  6  6  6  6  ", "                    3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u00" + "'", str1, "\\u00");
    }

    @Test
    public void test39109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39109");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23 U  23 U", "61                                                300U\\                                                300Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 75);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39110");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\\\\\\\                                      030                 \\u", "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "...      \n\n1           ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test39112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test39113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...                                       ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00         ...", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                       ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                           " + "'", str2, "...                                       ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                           ");
    }

    @Test
    public void test39116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39116");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '5', '0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '5' + "'", char2 == '5');
    }

    @Test
    public void test39117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39117");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test39118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39118");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 'i');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test39119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39119");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("U002", "0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39120");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...aaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200uaaaaaaaaaaaaaa", "                            AAAAAAAAAAAAA3100\\A                             6\\6\\66\\6\\66\\6\\66\\6...", "23\\u0023\\u0023        75023\\u0023\\u00", 103);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...aaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200uaaaaaaaaaaaaaa" + "'", str4, "...aaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200uaaaaaaaaaaaaaa");
    }

    @Test
    public void test39121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39121");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "uuu  \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075" + "'", str1, "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
    }

    @Test
    public void test39123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39123");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\", "   a                             ", 4);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1\\U00234                                      \\U0023\\U00\\u", "2                                        uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \n\n1                                                                                                                               ", "u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U00u3400000000000000000000000000000000000000\\U00u3\\U00\\" + "'", str3, "\\U00u3400000000000000000000000000000000000000\\U00u3\\U00\\");
    }

    @Test
    public void test39125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39125");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\n\n", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\" + "'", str2, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
    }

    @Test
    public void test39128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\ 6\\", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 6\\" + "'", str2, "\\ 6\\");
    }

    @Test
    public void test39129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39129");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                     23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test39131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39131");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                           ...                                                                                                                                                                                                                          ", "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("111111111        ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111        " + "'", str2, "111111111        ");
    }

    @Test
    public void test39133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\U00\\u0041\\U0023" + "'", str1, "u0023\\U00\\u0041\\U0023");
    }

    @Test
    public void test39134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\" + "'", str1, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\");
    }

    @Test
    public void test39136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39136");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hCUUUUUUUU", "777777777777777777777777777777777777777777777777777777777777777777777777777777777", "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hCUUUUUUUU" + "'", str3, "hCUUUUUUUU");
    }

    @Test
    public void test39137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39137");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0023\\00023\\00023\\ U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39138");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\\\0020", "                    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) " u004 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " u004 " + "'", str1, " u004 ");
    }

    @Test
    public void test39140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39140");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222", 49);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test39141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39141");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                  61", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 ", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 99 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test39142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaa...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa..." + "'", str2, "aaaaaaaa...");
    }

    @Test
    public void test39145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39145");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                          11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111", "00000000000000000000... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\U0023\\U0023\\U0023\\U0023\\U002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ", "a11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU " + "'", str2, " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ");
    }

    @Test
    public void test39148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39148");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                A\\u0023AAAAAAAAAAAAAa000u\\                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             ", 147, "61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             " + "'", str3, "                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             ");
    }

    @Test
    public void test39151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39151");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A" + "'", str1, "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
    }

    @Test
    public void test39152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39152");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "A...\\61\\61\\61\\61\\U0023     ...A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...6666666666666666661AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA666666666666666666666666666666", (int) '5', "                            AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAA                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...6666666666666666661AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA666666666666666666666666666666" + "'", str3, "...6666666666666666661AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA666666666666666666666666666666");
    }

    @Test
    public void test39155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39155");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0030\\\\\\\\" + "'", str1, "\\u0030\\\\\\\\");
    }

    @Test
    public void test39156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39156");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("\\u005c", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n1                                                                                         ", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000ucccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", charArray16);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test39157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39157");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\u005", "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5", "                                                                                                                                                                                                                                                                                                                                   ...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...                                                                                                                                                                                                                                                                                                                                   ", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       0013200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001                       " + "'", str1, "                       0013200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001                       ");
    }

    @Test
    public void test39160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39160");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("u003                                               ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 57, (int) '\n');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "u003                                               " + "'", str6, "u003                                               ");
    }

    @Test
    public void test39161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39161");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("     \\0023\\00\\u0041\\0023     ", "11111111111111111111111111111...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u", "U000A16 16 16 16 16 16 16 16 16 16 16 U000A16 16 16 16 16 16 16 16 16 16 16 U000A", 94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     \\0023\\00\\u0041\\0023     " + "'", str4, "     \\0023\\00\\u0041\\0023     ");
    }

    @Test
    public void test39162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39162");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\u0023                                                                                                                                                  hi!hi!hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("iiiiiii61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\iiiiiiii", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test39163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                 a                                                                                                                                              ", '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 a                                                                                                                                              " + "'", str2, "                                                 a                                                                                                                                              ");
    }

    @Test
    public void test39164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39164");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("61\\61\\61");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test39165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  UUUaaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'h', (int) '1', 3);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555", strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "c");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test39167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39167");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("cccccccccccccccccccccccccccccccccc\n     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39168");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\U0023", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", (int) '\r');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("  2   ", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '.');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3" + "'", str7, "3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3" + "'", str8, "3");
    }

    @Test
    public void test39169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39169");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '7', '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '7' + "'", char2 == '7');
    }

    @Test
    public void test39170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39170");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u01\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                           a             u6", "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39171");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!                                                              ", '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                              " + "'", str2, "hi!                                                              ");
    }

    @Test
    public void test39173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39173");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Aaaaaaa      ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  16        16        16        16        16        16        16        16        16", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test39174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39174");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", "                                         \n\n1                                                    \n\n1     ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa                   " + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ");
    }

    @Test
    public void test39175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39175");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("u002#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#23U0023\\U0023\\U\\4003U0023\\U0023\\U0", 205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39176");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("61                                         \n\n1                                         ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\", 270, 234);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test39177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39177");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39178");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n", "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n" + "'", str2, "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n");
    }

    @Test
    public void test39180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0000000000000000000000000000000000000000000000000...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39181");
        char[] charArray20 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray20);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray20);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray20);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray20);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray20);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray20);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray20);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray20);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!10010hi!10010h\\400310hi!10010hi!10010hi", charArray20);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", charArray20);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", charArray20);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray20);
        boolean boolean34 = org.apache.commons.lang3.StringUtils.containsAny("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", charArray20);
        boolean boolean35 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray20);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 42 + "'", int32 == 42);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test39182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("61uuuuuuuuuuuuuuuuuu3\\u0...\\U0023\\U0##########", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0##########.61uuuuuuuuuuuuuuuuuu3\\u0" + "'", str2, "\\U0023\\U0##########.61uuuuuuuuuuuuuuuuuu3\\u0");
    }

    @Test
    public void test39183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("1\\U00234                                      \\U0023\\U00\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\U00234                                      \\U0023\\U00\\u0" + "'", str1, "1\\U00234                                      \\U0023\\U00\\u0");
    }

    @Test
    public void test39185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                                                                                                                                                                                                                                                                                                                 U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                 U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                 U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ");
    }

    @Test
    public void test39186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39186");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih!ih", "                                                                                      3200U\\1400\\00U\\3200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("            1hi!1             ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu162uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            1hi!1             " + "'", str2, "            1hi!1             ");
    }

    @Test
    public void test39188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUU                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUU                                                                                                        aaaaaaa" + "'", str1, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUU                                                                                                        aaaaaaa");
    }

    @Test
    public void test39189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39189");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U", (java.lang.CharSequence) "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U" + "'", charSequence2, "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U");
    }

    @Test
    public void test39190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39190");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("10hi!100", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 288);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39191");
        char[] charArray5 = new char[] { ' ' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023                                            ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U002322222", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                           1\\u00234                                      \\u0023\\u00\\U0                    ..", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test39192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39192");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...0u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0u\\3111111111111111111111111111111111111111111111" + "'", str1, "...0u\\3111111111111111111111111111111111111111111111");
    }

    @Test
    public void test39194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("iiiiiiiiiiiiiiiiiiiii...uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiii", "61uuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiii...uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiii...uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test39195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39195");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0061", strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("\\\\0020", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test39196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39196");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test39197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                       61\n                       ", "                                                                                           U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39198");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa      ", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!11111111111111111111111111111111111111111111111111111111111111111111111111111111111U000011111111111111111111111111", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test39199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39199");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\300 066666666666666666666666666666666666666", "iiiiiiiiiiiiiiiii23uu0023uu0023uu0023uu0023uu0023uu0023uu0023", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("####au", 245);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####au" + "'", str2, "####au");
    }

    @Test
    public void test39201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0030\\\\\\\\", '1', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0030\\\\\\\\" + "'", str3, "\\u0030\\\\\\\\");
    }

    @Test
    public void test39202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39202");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0023\\u00 61\\ 61\\61\n\n\n\n\n\n\n\n", 460, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39204");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "555555555555555555555555555555555555555555555555555555  ......  61555555555555555555555555555555555555555555555555555555  ......  \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     " + "'", str2, "                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
    }

    @Test
    public void test39206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39206");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", "...00...             ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\\\\\\\\\\\\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\\\\\\\\\\\\\\" + "'", str1, "\\\\\\\\\\\\\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\\\\\\\\\\\\\\");
    }

    @Test
    public void test39208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "1113");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39209");
        java.lang.CharSequence charSequence9 = null;
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray19);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray19);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence9, charArray19);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023                                                                                     ", charArray19);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray19);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u002", charArray19);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", charArray19);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", charArray19);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23\\U", charArray19);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", charArray19);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "      AAAA...", charArray19);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test39210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39210");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'c' + "'", char1 == 'c');
    }

    @Test
    public void test39211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39211");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test39212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39212");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r", 729, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39213");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII              6 0200U\\\\6 0200U\\\\6 UUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test39214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "\\61\\61\\61\\61\\61\\61");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                              23au0023au0023au0023au0023au0023au0023au0023au0023au002" + "'", str4, "                              23au0023au0023au0023au0023au0023au0023au0023au0023au002");
    }

    @Test
    public void test39215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39215");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                     ", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", 52, (int) '\r');
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray3);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test39216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("33333333333333333333333333333333333333333333", "                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ", "                                         \n\n1           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     " + "'", str2, "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ");
    }

    @Test
    public void test39218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39218");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" 61..                                                                                                                                                                                                                                                          ", "222222222222222222222222222222222222222222222u                                           ", 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39220");
        char[] charArray12 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U61", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U0023", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test39221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39221");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\u0055                                            1111111111111111111111111111111111111111111111", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39222");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "23\\u                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test39223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("6\\\\u0020", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\\\u0020" + "'", str2, "6\\\\u0020");
    }

    @Test
    public void test39224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39224");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '.', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test39225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("... .hi!hi!hi!                                                                          ", 3, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... .hi!hi!hi!                                                                          " + "'", str3, "... .hi!hi!hi!                                                                          ");
    }

    @Test
    public void test39226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\" + "'", str2, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
    }

    @Test
    public void test39227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000", "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000" + "'", str2, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test39228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39228");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("         0000000000000000000000000000000000000000000000000\\U0037         ", 270);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test39230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39230");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u", "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    61        61", "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39232");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\n\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39233");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0023\\U0023\\U0023\\U0023\\U0023\\U00", "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("       ...\r", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "0023\\U0023\\U0023\\ u020\\U0020\\U0020\\U00");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str6, "0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test39234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39234");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\U0023\\U0023\\U0023\\U0023\\U002.......................................................................", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("55          aaaaaaa       CCCCCCCCCCCCCCCC", 380);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  " + "'", str1, "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
    }

    @Test
    public void test39237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\", "                                       \\                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       \\                                                                              \\                                       61                                       \\                                       aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 100, 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                 ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\\u005");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "                                 ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test39241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("11111111111111111111123                                                                                     hi!hi!hi!", '\r', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11111111111111111111123                                                                                     hi!hi!hi!" + "'", str3, "11111111111111111111123                                                                                     hi!hi!hi!");
    }

    @Test
    public void test39242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\55555555555555555555510hi!10", "\\u0023                                                                                                                                                  hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\55555555555555555555510hi!10" + "'", str2, "\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\55555555555555555555510hi!10");
    }

    @Test
    public void test39243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("61\\ 61\\ 61\\ 61\\ 61\\ 611111111..  UUU6  6  6  6  6  ", 'A', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..  UUU6  6  6  6  6  " + "'", str3, "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..  UUU6  6  6  6  6  ");
    }

    @Test
    public void test39245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 370, (int) '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39247");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ua61a\na\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua00", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", 93);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39248");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray4, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("61", strArray4, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("!ih!ih!ih   2    2    2    2    2    2    2    2    2  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str10, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "61" + "'", str13, "61");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test39249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39249");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "######", (java.lang.CharSequence) "  UUU6  6  6  6  6  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("IIIIIIIIII0023\\u0...IIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39251");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("2", "", 100);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("                                                 ...        ", "aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (int) ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   2     ...                                ...    \\U002", strArray7, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    ...             ...                                ...    \\U00                                                 ...        " + "'", str12, "                                                    ...             ...                                ...    \\U00                                                 ...        ");
    }

    @Test
    public void test39252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39252");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           u005cu0u005cu0u0023Uu005cu0u005cu0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U0\\0023\\0023\\0023\\0023\\0023\\0023\\0023...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u005cu0u005cu0u0023Uu005cu0u005cu0" + "'", str3, "u005cu0u005cu0u0023Uu005cu0u005cu0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test39253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39253");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", "   8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8", 45);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "55561\n5555", 243, 20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test39254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h", 122, "...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...11111111111111111111111111111111111111111111111111...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str3, "...11111111111111111111111111111111111111111111111111...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test39255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39255");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("UUUUUU 6\\\\U0020 6\\\\U0020 6", "\nu002                                         \n\n1                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "\\u003                                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str3, "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test39257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39257");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("U UU", "", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test39258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "uuuuuuuuuuuuuuuuu1u 61u 6161u 61u 6161u 61u 6161u 6uuuuuuuuuuuuuuuuuu", "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("        5c11111111111111111111111111 61\\ 1111111111111111111111", "UUUUUU 6\\\\U0020 6\\\\U0020 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        5c11111111111111111111111111 61\\ 1111111111111111111111" + "'", str2, "        5c11111111111111111111111111 61\\ 1111111111111111111111");
    }

    @Test
    public void test39260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39260");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  2   ", 92);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "  \\U005C  ", 94, 39);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "023\\u0023       aaaaaaa                             61\\");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 213);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39262");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 33);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39263");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!", '5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39264");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.", "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39265");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                     HHHHHHHHHHHHHHHHH", (int) '1', 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("................................3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200", 138);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "................................3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200                                                            " + "'", str2, "................................3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200                                                            ");
    }

    @Test
    public void test39267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39267");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("    61    ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("aaaa                            ", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\\');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    61    " + "'", str4, "    61    ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "    61    " + "'", str7, "    61    ");
    }

    @Test
    public void test39268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39268");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                             ...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39269");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("UUU6  6  6  6  6", "                                             U002322222                                             ", (int) 'A');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39270");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                           ", "2\\3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\320032", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555##############################################.16 5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555", "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu..." + "'", str3, "61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test39272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39272");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '7', 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test39276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39277");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U" + "'", str2, "          3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
    }

    @Test
    public void test39280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39280");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("##############################################.16", "         ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAAAA   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhhaaaaaa   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nhhhhhhhhhhhhhhhhh", 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
    }

    @Test
    public void test39282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                               i!                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "001!IH0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("23                                                                                     hi!hi!hi!", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39285");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hhhhhhhhhhhhhhhhhhhhhhhh");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test39286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("23\\u                                        ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u..." + "'", str2, "23\\u...");
    }

    @Test
    public void test39287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                              5c             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5c             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str1, "5c             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test39288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39288");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "2", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                              23\\u0023\\u0023\\u002                                                       ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00    ", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "UUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test39289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39289");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                             \\61\\61\\61\\61\\u0023", "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333", 929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                      3200U\\1400\\00U\\3200U\\", "6161...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      3200U\\1400\\00U\\3200U\\" + "'", str2, "                                                                                      3200U\\1400\\00U\\3200U\\");
    }

    @Test
    public void test39291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39291");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'A');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\u0023                                                                                                                                                  hi!hi!hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6...", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu" + "'", str5, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6..." + "'", str9, "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6...");
    }

    @Test
    public void test39292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39292");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("61\\\\U0020", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39293");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                         U0023\\U002U0023\\U002U0023\\U002U0", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ", (int) 'h');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111                                                                   ", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 161 + "'", int6 == 161);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test39294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39296");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####A000U\\", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...02...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test39297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39297");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                              5c             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39298");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test39299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39299");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("20\\u0020\\u0020\\u0020\\u00  ", "\\U003");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39300");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "5C1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5C1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "5C1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test39301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39301");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\ \\61\\aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                AAAAAAAAAAAAAAAAAAAA                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39302");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("11111111111111111111111111222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222", "\\61\\61\\61\\61\\61\\61", 99, 138);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11111111111111111111111111222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222\\61\\61\\61\\61\\61\\61" + "'", str4, "11111111111111111111111111222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test39303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39303");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  \\\\0020                                                                                 ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '1');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test39304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("..111111116 \\11\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..111111116 \\11\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "..111111116 \\11\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test39305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39305");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "... 16 16 16 16 16 16 16 16 16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\" + "'", str1, "\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
    }

    @Test
    public void test39307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39307");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                  \\U0023\\U00\\u0041\\U                                   ", (java.lang.CharSequence) "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555\\U23\\U23\\U23\\U23\\U23\\U23\\U23                                                  ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                  \\U0023\\U00\\u0041\\U                                   " + "'", charSequence2, "                                  \\U0023\\U00\\u0041\\U                                   ");
    }

    @Test
    public void test39308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39308");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                                                                                  61", "\\u005c", 4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0023", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", "23hi!hi!hi!                                                                          ", 161);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii", strArray6, strArray11);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii" + "'", str12, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test39309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39309");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "22222222222222222222222222222222222222241AAAAAAAAcccccccccc", 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39310");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'A', 234);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 234 + "'", int2 == 234);
    }

    @Test
    public void test39311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39311");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("3300Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39312");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\", "                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39313");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'I');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'A' + "'", char2 == 'A');
    }

    @Test
    public void test39314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39314");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '7', '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '7' + "'", char2 == '7');
    }

    @Test
    public void test39315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...", "          ...", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39316");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                               \\40032");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032" + "'", str2, "                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032");
    }

    @Test
    public void test39318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10", (int) 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10" + "'", str2, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10");
    }

    @Test
    public void test39319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\" + "'", str2, "0023u0023\\u0023\\u0023\\u0023\\u0023\\u003\\u\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\");
    }

    @Test
    public void test39320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39321");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("##############################################.16", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("uu!IHu...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uu!IHu..." + "'", str1, "uu!IHu...");
    }

    @Test
    public void test39323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaa...555555555555555555555555555555555555555555555555", 358, 155);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39324");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39325");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("                                 0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("3AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\13AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u" + "'", str2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
    }

    @Test
    public void test39327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA", "Uuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA" + "'", str2, "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA");
    }

    @Test
    public void test39328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\\\\\\\\\\\\\...", (int) '#', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "333333333333\\\\\\\\\\\\\\...3333333333333" + "'", str3, "333333333333\\\\\\\\\\\\\\...3333333333333");
    }

    @Test
    public void test39329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39329");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "\\U002066666666666666666666666666666666666666", 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str4, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test39330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39330");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...", 59, "16 16 16");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "16 16 1616 16 1616 16 1616 16 1616 16 1616 16 1616 16 16..." + "'", str3, "16 16 1616 16 1616 16 1616 16 1616 16 1616 16 1616 16 16...");
    }

    @Test
    public void test39331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                        uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39332");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1111111111111111111111111111111111111111111111", "4444444444444444444444444444444444444   ...4444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "  ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test39334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\U0043", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0043                                                                                                     " + "'", str2, "\\U0043                                                                                                     ");
    }

    @Test
    public void test39335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39335");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                         ", "                                                                                                                                                                        41                                                                                                                                                                         ", 48);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test39336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39336");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16", 685, 110);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16" + "'", str3, "uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16");
    }

    @Test
    public void test39338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("C", "                                      \\u0023\\u00\\u0041\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C" + "'", str2, "C");
    }

    @Test
    public void test39339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39339");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("22222222222222222222222222222222222222241AAAAAAAA", "\\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4", "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161\\161\\161\\161\\161\\161\\U6                                              3200U\\3200U\\1111111111111111111111111111" + "'", str1, "161\\161\\161\\161\\161\\161\\U6                                              3200U\\3200U\\1111111111111111111111111111");
    }

    @Test
    public void test39341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61 61 61 61 61 61 61 6UUUUUUUUUUUUUUUUUU...", 358, "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61 61 61 61 61 61 61 6UUUUUUUUUUUUUUUUUU...                \n\n\n\n\n\n\n\n\n\n\\u0055                                                                             \n\n\n\n\n\n\n\n\n\n\\u0055                                                                             \n\n\n\n\n\n\n\n\n\n\\u0055                                                                             \n\n\n\n\n\n\n\n\n\n\\u0055    " + "'", str3, "61 61 61 61 61 61 61 6UUUUUUUUUUUUUUUUUU...                \n\n\n\n\n\n\n\n\n\n\\u0055                                                                             \n\n\n\n\n\n\n\n\n\n\\u0055                                                                             \n\n\n\n\n\n\n\n\n\n\\u0055                                                                             \n\n\n\n\n\n\n\n\n\n\\u0055    ");
    }

    @Test
    public void test39342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\", 20, "200U\\3");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\" + "'", str3, "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
    }

    @Test
    public void test39343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39343");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test39344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("        h75", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        h75" + "'", str2, "        h75");
    }

    @Test
    public void test39345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("    61        61        615c    61        61        61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    61        61        615c    61        61        61" + "'", str1, "    61        61        615c    61        61        61");
    }

    @Test
    public void test39346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39346");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("33333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "33333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c" + "'", str2, "33333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c");
    }

    @Test
    public void test39348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                    \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                    \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 110);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39350");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 61\\ 61\\ ...", "61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39351");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray18 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray18);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray18);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray18);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray18);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray18);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa", charArray18);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                  61", charArray18);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", charArray18);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100", charArray18);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray18);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "00000000000000000000000000000000AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAA000000000000000000000000000000000", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test39352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", "     8     8     8     8   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ..." + "'", str2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
    }

    @Test
    public void test39353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39353");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A\\u0023AAAAAAAAAAAAA", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39354");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1111111111111111111111111111111111111111111110u\\3000u\\3111111111111111111111111111111111111111111111", 161);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39355");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaaaa", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                         A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075                         ", charArray11);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 25 + "'", int20 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test39356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u", "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39357");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("11111111111111. 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuu", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39358");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("iiiiiiiiiiiiiiiiiiiiiiiiiiiU775Ciiiiiiiiiiiiiiiiiiiiiiiiiiii7777777777777777777777777777777777", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16" + "'", str4, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16");
    }

    @Test
    public void test39359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39359");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("    222222222222222222222222222222222", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39361");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61hi!", (java.lang.CharSequence) "###\n\\u002                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39362");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  " + "'", str1, "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
    }

    @Test
    public void test39363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39363");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...aaaaaa          ", 729, 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaa          " + "'", str3, "...aaaaaa          ");
    }

    @Test
    public void test39364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39364");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  ", "aa        75");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0032", "                                       2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0032" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0032");
    }

    @Test
    public void test39366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39366");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "............................", "7");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39367");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\u0063", "23AAAAAAAAAAAAA0u0A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39368");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "                            UUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("20\\u0020\\u0020\\u0020\\u00  ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39370");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(".\\16", "uuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39371");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\", (int) 'h');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test39372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaa", 0, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaaaaaaaaaaaaaaa u   6aaaaaaaaaaaaa");
    }

    @Test
    public void test39373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaa...", "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa..." + "'", str2, "aaaaaaaa...");
    }

    @Test
    public void test39374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39374");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...AAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......", (int) 'U');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA");
    }

    @Test
    public void test39376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39376");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('c', 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test39377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("        75");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75" + "'", str1, "75");
    }

    @Test
    public void test39378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\U0023\\U00\\U0041\\", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0041\\U00\\U0023\\U\\" + "'", str2, "0041\\U00\\U0023\\U\\");
    }

    @Test
    public void test39379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("2\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2\\" + "'", str1, "2\\");
    }

    @Test
    public void test39380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39381");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'c');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "1\\U00234                                      \\U0023\\U00\\u00");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test39382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("U UU", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U UU" + "'", str2, "U UU");
    }

    @Test
    public void test39383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39383");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61", "                                                                                                                               I!                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39384");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 61\\", 929);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 61\\" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 61\\");
    }

    @Test
    public void test39386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39386");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "20\\u0020\\u0020\\u0020\\u00  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("             U0023\\U002U0023\\U002U0023\\U002U0", 404, "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555             U0023\\U002U0023\\U002U0023\\U002U0555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555             U0023\\U002U0023\\U002U0023\\U002U0555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test39388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 24, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################" + "'", str3, "########################");
    }

    @Test
    public void test39389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "\\\\2\\\\\\\\\\2\\\\\\ 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########" + "'", str3, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
    }

    @Test
    public void test39390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2", "000u\\", 54);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61" + "'", str1, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test39392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                             0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057", "i!                                                                                   U0023                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "...  u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ...", "111111111        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39394");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("U003aaaaaa", "\n\n\n\n\n1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "     1111111........................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test39396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39396");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39397");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("d", 137, 370);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\3200u\\32                                                                             uuuuuuuu16\\16 \\16" + "'", str1, "u\\3200u\\32                                                                             uuuuuuuu16\\16 \\16");
    }

    @Test
    public void test39399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39399");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6\\\\u00206\\\\u00206", 155, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("1111111      ", "111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111      " + "'", str2, "1111111      ");
    }

    @Test
    public void test39401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39401");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("222222222222222222222222222222222222222222222222222222222222222222222222222222 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              2222222222222222222222222222222222222222222222222222222222222222222222222222222", 'h');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111", "U   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111" + "'", str2, "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111");
    }

    @Test
    public void test39403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("               ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               " + "'", str2, "               ");
    }

    @Test
    public void test39404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u003", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u003" + "'", str2, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u003");
    }

    @Test
    public void test39405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("##U###\n####U###\n####U###\n####U###\n####U###\n##57                                                                                                                             1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##U###\n####U###\n####U###\n####U###\n####U###\n##57                                                                                                                             1" + "'", str1, "##U###\n####U###\n####U###\n####U###\n####U###\n##57                                                                                                                             1");
    }

    @Test
    public void test39406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("6161", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6161" + "'", str2, "6161");
    }

    @Test
    public void test39407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                        6u666u                                        ", "AAAAAAAAAAAAA3200\\A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        6u666u                                        " + "'", str2, "                                        6u666u                                        ");
    }

    @Test
    public void test39408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39409");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("UUUU", "             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                       ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       " + "'", str2, "                                       ");
    }

    @Test
    public void test39411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39411");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test39412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!", "\\U0061\\U0061\\U0061\\U0061\\ u61 1\\U0061\\U0061\\U0061\\U0061");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111", 356, "                      61\\\\u002                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      61\\\\u002                                            61\\\\u002                                            61\\\\u002                                            61\\\\u002                                            61\\\\u002                  1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111" + "'", str3, "                      61\\\\u002                                            61\\\\u002                                            61\\\\u002                                            61\\\\u002                                            61\\\\u002                  1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111");
    }

    @Test
    public void test39415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      " + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      ");
    }

    @Test
    public void test39416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39418");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39419");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u0023\\u0023        75023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test39420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 356);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu162uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r..." + "'", str2, " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...");
    }

    @Test
    public void test39422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39422");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'c', 88, 41);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '\\');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061..." + "'", str7, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
    }

    @Test
    public void test39423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                       AAAAAAAAAAAAA3200u\\A                                      ", "1111", 155);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39424");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161\\", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("\\ 61\\61aaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test39425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                      ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("6\\ 6\\ 6\\u0023\\u0023\\u0023\\u002 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\", 367, "AAAAAAAAAAAAA3200\\A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA326\\ 6\\ 6\\u0023\\u0023\\u0023\\u002 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\AAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA320" + "'", str3, "AAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA326\\ 6\\ 6\\u0023\\u0023\\u0023\\u002 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\AAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA3200\\AAAAAAAAAAAAAA320");
    }

    @Test
    public void test39427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39427");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1\\\\4003261\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\", "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("23\\U0023\\U...uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39430");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39431");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ", 267);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39433");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 296, '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str3, "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
    }

    @Test
    public void test39434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" u004 ", "A\\U0023\\U00\\U0041\\A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " u004 " + "'", str2, " u004 ");
    }

    @Test
    public void test39435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39435");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("3333333333333333333333333333333333333333333330UuU\\U320033333333333333333333333333333333333333333333", "\\U0023\\U\\", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39436");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test39437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39437");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test39438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39438");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ......  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '1');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '5');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  ......  " + "'", str6, "  ......  ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test39439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39439");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\4003", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0032\\40032\\40032\\40032\\40032\\40032\\40032\\4003" + "'", str2, "0032\\40032\\40032\\40032\\40032\\40032\\40032\\4003");
    }

    @Test
    public void test39441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\U0023\\U00\\u0041\\U0023", "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39442");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39443");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("aa        75                                          ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void test39444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("2222222222222222222222", "\n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39445");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                300u\\", "                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("uUUUUUUUUU...", "6666666666666666666666666666666666666666666663 .....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 ", 339, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 ");
    }

    @Test
    public void test39448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "...h    h...55555555555555555555555555555555555555555555555555555555555555 61                                          ...h    h...555555555555555555555555555555", 98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39449");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39450");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '7', 122);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test39451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "3\\U0023\\U0023\\U0023\\U0023\\U00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test39452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39452");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", "023\\u0023aaaaaaa2222222222222222222222222222222222222222222222222222222222222222222222222222");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'I');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str4, "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test39453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39453");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("          aaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa" + "'", str1, "aaaaaaa");
    }

    @Test
    public void test39455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39455");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '5', 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test39456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39456");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("000000000000000000000000000000000000000000000000016 ", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39457");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", strArray9);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test39458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAA51AAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA51AAA" + "'", str2, "AAA51AAA");
    }

    @Test
    public void test39459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39459");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39460");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111", "\\u0023\\u0023\\u002");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39462");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str5, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test39463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32" + "'", str2, "\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32");
    }

    @Test
    public void test39464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih!ih!ih   2    2    2  ...", "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ......16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih   2    2    2  ..." + "'", str2, "!ih!ih!ih   2    2    2  ...");
    }

    @Test
    public void test39465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39465");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test39467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...", "                                                                                            AAAAAAA                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\                                                                                            AAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh..." + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...");
    }

    @Test
    public void test39469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39469");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "u", (java.lang.CharSequence) "0\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ", "U0023\\U002U0023\\U002U0023\\U002U0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    " + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ");
    }

    @Test
    public void test39472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39472");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\16", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6116" + "'", str4, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6116");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test39473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA", 31, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39474");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        ", "                                                3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        " + "'", str3, "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        ");
    }

    @Test
    public void test39475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39475");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhh", "", 6);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 456, 168);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test39476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39476");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("0020\\u0##");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void test39477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39478");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "...                           ...0023h\\hh0023h\\hh0023h                            ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                   20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\02                                                                                                   " + "'", str1, "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\02                                                                                                   ");
    }

    @Test
    public void test39480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39480");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "11111111111u6111111111111111111111   2 11111111UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6" + "'", str6, " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
    }

    @Test
    public void test39481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39482");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261", "...      \n\n1           ...", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39484");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "IIIIIIIIIIIII...AAAA      ", 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39485");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test39486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 6", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("2...........................................................................................................................................................................................................................................................................................................................................................", "                                           \\6005c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39488");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "5700u\\23\\u                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39489");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA", " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           ", 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    ", "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test39491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39491");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\4   ", "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("       ", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("333333333333333333333333333333333333333333u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("500u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\U\\3200u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str10, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test39492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U", 369);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                            61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U                                                                                                                                                             " + "'", str2, "                                                                                                                                                            61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U                                                                                                                                                             ");
    }

    @Test
    public void test39494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "       22222\\U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39495");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "u6", 30);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("uuuuuuuuuaaaaaaa       3200u\\32", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test39496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39496");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\", 'h');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("#################################################", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6                                       ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...     61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6");
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\" + "'", str4, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\" + "'", str6, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test39497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaa3200\\a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAA3200\\A" + "'", str1, "AAAAAAAAAAAAA3200\\A");
    }

    @Test
    public void test39498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("111111111111111111111u61111111111111111111111123\\U1###AU#################################################", "###\n\\u003\\u0023\\u0023\\u0023\\###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...AAAA      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\i\\161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAA      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\i\\161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61" + "'", str1, "...AAAA      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\i\\161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
    }

    @Test
    public void test39500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest78.test39500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057                                                                                                                             1\\u0030UuU\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\UuU0300u\\1                                                                                                                             75023U\\UuU0023U\\UuU0023U\\UuU0023U\\UuU0023U\\UuU0" + "'", str1, "\\UuU0300u\\1                                                                                                                             75023U\\UuU0023U\\UuU0023U\\UuU0023U\\UuU0023U\\UuU0");
    }
}

