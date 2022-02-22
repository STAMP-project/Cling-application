import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest80 {

    public static boolean debug = false;

    @Test
    public void test40001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40001");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...\r                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\u0023                                                                                     hi!hi!hi!                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40002");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61hi!", "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test40003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.", "uuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40004");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("        #######    61        61        615c    61        61        61", "\\1111111111111111111111111111u11111111111111111111111111110020");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................" + "'", str5, "001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................");
    }

    @Test
    public void test40005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaa", "                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40006");
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...23\\u0023\\", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test40007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40007");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "023\\U0023\\U0023\\U0023    75                                                          75                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61hi!", "1HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!11HI!1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61hi!" + "'", str2, "\\u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61hi!");
    }

    @Test
    public void test40009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40009");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("6u666");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test40010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40010");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    61        61 ...", 8, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    61        61 ..." + "'", str3, "    61        61 ...");
    }

    @Test
    public void test40011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str2, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test40012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40012");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           \\61\\61\\61\\61\\61\\61", "6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       61", 125);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...0u\\314...0u\\311");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0u\\314...0u\\311" + "'", str1, "...0u\\314...0u\\311");
    }

    @Test
    public void test40014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("6U3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6U3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32" + "'", str1, "6U3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32");
    }

    @Test
    public void test40016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40016");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuu16\\16 \\16", "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ", 125, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40018");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("uuuuu");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'u' + "'", char1 == 'u');
    }

    @Test
    public void test40019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA", 83, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40020");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...                                                                                                                                                                                                                                   ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U0023AAAAAAAAAAAAAA000U\\", 297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40021");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaa u   6aaaaaaaaaaaaa", "   ...3\\u23\\u23U6    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "111111111111111111111       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("3200u\\300u\\", "u0023     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200u\\300u\\" + "'", str2, "3200u\\300u\\");
    }

    @Test
    public void test40024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40024");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '.', '.');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '.' + "'", char2 == '.');
    }

    @Test
    public void test40025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40025");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("1\\ ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u", 213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...1...                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40027");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("111111111111111111111u61111111111111111111111123\\U                                        ", "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11111111111u0023#u0023#u0023#u0023#u0023#u0023#u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40028");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "3333361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test40029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("\\u0023\\u00\\U0041\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u00\\U0041\\" + "'", str1, "\\u0023\\u00\\U0041\\");
    }

    @Test
    public void test40030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40030");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", 'A');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                       ", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test40031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("001!ih01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "001!ih01" + "'", str1, "001!ih01");
    }

    @Test
    public void test40032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40032");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '7', 183);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test40033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111");
    }

    @Test
    public void test40034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\n  ......  55555555555555555555555555555555555555555555555555555516  ......  555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  ......  55555555555555555555555555555555555555555555555555555516  ......  555555555555555555555555555555555555555555555555555555" + "'", str1, "\n  ......  55555555555555555555555555555555555555555555555555555516  ......  555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test40035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40035");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\n     ", 110, 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                        \\U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        \\U0023\\U00\\u0041\\U0023" + "'", str1, "                        \\U0023\\U00\\u0041\\U0023");
    }

    @Test
    public void test40037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40037");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 164);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                               ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                               ..." + "'", str1, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                               ...");
    }

    @Test
    public void test40039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40039");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 61", strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0020", strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", (java.lang.Object[]) strArray12);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10hi!100" + "'", str13, "10hi!100");
    }

    @Test
    public void test40040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40040");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC 6...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40041");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaa   uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 78 + "'", int1 == 78);
    }

    @Test
    public void test40042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40042");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h", " u004 ", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40043");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u00c\\u00", "0023\\00023\\00023\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "u6      61        61        61        61      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40045");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                   0041", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   0041" + "'", str2, "                   0041");
    }

    @Test
    public void test40047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40047");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" 61..                                                                                                                                                                                                                                                          ", 667, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str1, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test40049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\u0023\\u0023\\u0023\\u0023\\u0023", "\\ 6\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test40050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40050");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '2', 118);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test40051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40051");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\0023\\0023\\0023\\0023\\0023\\0023\\0023...", '0');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6", "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'U', (int) 'C', 456);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 67");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "####AU   2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...", "...23\\0023\\002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ..." + "'", str2, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
    }

    @Test
    public void test40055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("U                                                                                                                                         ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U                                                                                                                                         " + "'", str2, "U                                                                                                                                         ");
    }

    @Test
    public void test40056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40056");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa      ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             11111", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test40057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40057");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('0', 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61        ", "                                             \\61\\61\\61\\61\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40059");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA....AAAAAAAAAAAAAAAAAAAAAAAAA.......................AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.....", "\n\\u0020\\u0020\\u0020\\u00...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40060");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split(" 61", "                                                                                                  61");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaa", strArray13, strArray16);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10hi!100" + "'", str12, "10hi!100");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "aaaa" + "'", str17, "aaaa");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test40061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40061");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" 6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ", "uuuu61uuuu", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("           161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161\\161\\161\\161\\161\\16177777777777777777777777777" + "'", str1, "161\\161\\161\\161\\161\\16177777777777777777777777777");
    }

    @Test
    public void test40063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                       u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40064");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", (int) 'c');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40065");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n..", "...00...             ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...                           ...0023h\\hh0023h\\hh0023h                            ...", "...\r", 124);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                           ...0023h\\hh0023h\\hh0023h                            ..." + "'", str3, "...                           ...0023h\\hh0023h\\hh0023h                            ...");
    }

    @Test
    public void test40067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 98, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\                                                u                                                005                                                c", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\                                                u                                                005                                                c" + "'", str2, "\\                                                u                                                005                                                c");
    }

    @Test
    public void test40069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40069");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '0');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '6');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test40070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40070");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh", (java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test40071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40071");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  ......  555555555555555555555555555555555555555555555555555555", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6      61        61        61        61      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40072");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", "A000u\\");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("...1\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "16116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116" + "'", str4, "16116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116116");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test40073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", 'I', '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test40074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test40075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("2............................................................................................................................................................................................................................................................................................................................................................", "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40076");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n", 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\U", (int) '6', "5555555555555555aa        75                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5555555555555555aa        75                        \\U" + "'", str3, "5555555555555555aa        75                        \\U");
    }

    @Test
    public void test40078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40078");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\ 6\\", "AAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40079");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "                          I", 68);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40080");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '\n');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray12);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", strArray5, strArray12);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "AAAA51AAA");
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny("3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    " + "'", str7, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "               " + "'", str13, "               ");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "               " + "'", str15, "               ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              " + "'", str17, "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "               " + "'", str19, "               ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test40081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40081");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\u23\\u23\\u23\\u23\\u23\\u23\\u23                                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40082");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                                                                                                        aaaaaaa     ", (int) ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str4, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str5, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test40083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40083");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "33", (java.lang.CharSequence) "  \\005c  ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "33" + "'", charSequence2, "33");
    }

    @Test
    public void test40084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        " + "'", str2, "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
    }

    @Test
    public void test40085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str1, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test40086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                    " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test40087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61", 370, "                             6  6                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             6  6                                                           6  6                                                           6  6                                                           6  6                                                      0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61" + "'", str3, "                             6  6                                                           6  6                                                           6  6                                                           6  6                                                      0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test40088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40088");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n.....................................................", "A\\u0061\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\3AAAAAAAAAAAAAa000u\\", 87);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("3333333333333333333333333333333333                                                                             6U623\\u", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40090");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '1', 30, 508);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str4, "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test40091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40091");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023                                            ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   u61    ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###\n\\u002                                         \n\n1           ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0023\\u0023\\u0023\\u0023\\u0023\\u00", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u003\\u0023                                        ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test40092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40092");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" 6...0000000000000000000000000000000", "0023\\u0023\\u0023\\u0023\\u004444444444444 6A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777", 108);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 6...0000000000000000000000000000000" + "'", str4, " 6...0000000000000000000000000000000");
    }

    @Test
    public void test40093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1..." + "'", str1, "                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...");
    }

    @Test
    public void test40094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                        Aauaa23AAAAAAAAAAAAA                                        ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        Aauaa23AAAAAAAAAAAAA                                        " + "'", str2, "                                        Aauaa23AAAAAAAAAAAAA                                        ");
    }

    @Test
    public void test40095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40095");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 117);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "    ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("AAAA...", (java.lang.Object[]) strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666", 135, 7);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaa" + "'", str7, "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test40096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                   ", 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40097");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test40098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", "     1\n\n                                                    1\n\n                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\" + "'", str2, "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test40099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40099");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...", "23     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\\\\\u0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40101");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("..111111116 \\11\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0", "###\n\\u002                                         \n\n1", "                       \\u0036                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0" + "'", str3, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
    }

    @Test
    public void test40103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                              11111                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  61\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61" + "'", str1, "61\\61\\61");
    }

    @Test
    public void test40106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323", 135, "                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323" + "'", str3, "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323");
    }

    @Test
    public void test40107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", (int) 'u', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40109");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", (java.lang.CharSequence) "...10020\\...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666" + "'", charSequence2, "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
    }

    @Test
    public void test40110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  ", "ih01001!ih0", "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...061                                         \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  " + "'", str3, "\\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  ");
    }

    @Test
    public void test40111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "            23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40112");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......", "U535u5235u5235u5235u5235u523UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu52", 886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                    \n\n1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test40114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40114");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("             \\u0023\\u00\\U0041\\u              ", "2\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("... .hi!hi!hi!                                                                          ", "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\32\\U0068");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... .hi!hi!hi!                                                                          " + "'", str2, "... .hi!hi!hi!                                                                          ");
    }

    @Test
    public void test40116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 1AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40117");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A0u0023AAAAAAAAAAAAA", "3\\u0023u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40118");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                     ", "23\\u0023\\u0023................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAA HHHHHHHHHHHHHHHHH", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n210000000000000000000000000000000000000000000000000\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\0auu0", "23aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 1623");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40120");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u005c\\u0", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\u0023\\u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40122");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "11111");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("  U6                                            ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test40123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40123");
        char[] charArray9 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test40124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40124");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40125");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("UUUU", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40126");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('1', 250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test40127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("002aaaaaaa\\002aaaaaaa\\002aaaaaaa\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", 44, 243);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU" + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU");
    }

    @Test
    public void test40128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaa                            UUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaa                            UUUUUUUUUUUUUUUUUU" + "'", str1, "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaa                            UUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test40129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("........6 \\1616 \\16 \\1616 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "........6 \\1616 \\16 \\1616 " + "'", str1, "........6 \\1616 \\16 \\1616 ");
    }

    @Test
    public void test40130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40130");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161", "", 26);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test40131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U000AAAAAAAAAAAAAA3200U\\", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "1\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U000AAAAAAAAAAAAAA3200U\\" + "'", str4, "\\U000AAAAAAAAAAAAAA3200U\\");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test40134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40135");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("23hi!hi!hi!                                                                          ", 0, '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23hi!hi!hi!                                                                          " + "'", str3, "23hi!hi!hi!                                                                          ");
    }

    @Test
    public void test40136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40136");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaa", "00u\\0200u\\0200u\\0200u\\02");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                     UUUUUUUUUU...                                                                                     ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaa" + "'", str5, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaa");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 183 + "'", int6 == 183);
    }

    @Test
    public void test40137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA" + "'", str1, "AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA");
    }

    @Test
    public void test40138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" 66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6666666666666666666666666666663");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6666666666666666666666666666663" + "'", str1, " 66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6666666666666666666666666666663");
    }

    @Test
    public void test40139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40139");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                                                                                                                                                                 ", 98);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40140");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("000000000000000000000000000003200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A800000000000000000000000000000", 167);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ", "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             " + "'", str2, "                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ");
    }

    @Test
    public void test40142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("a000u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a000u\\" + "'", str1, "a000u\\");
    }

    @Test
    public void test40143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40143");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a         ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                             ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("uuuuuuuuuuuu 320011\\\\", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test40144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test40146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40147");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "AAAAAAAAAAAAA32u\\A                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                      \\u0023\\u00\\u0041\\u0023", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      \\u0023\\u00\\u0041\\u0023" + "'", str2, "                                      \\u0023\\u00\\u0041\\u0023");
    }

    @Test
    public void test40149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("..............................", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "          1111111111111111111116u11111111111          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test40151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40152");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAA", "Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40153");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                300u\\", " 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40154");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  2  UUUUUhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40155");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("575757575757575757575757575757575757575757575757575111", "                                              \\u0032", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40156");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016", "  ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40157");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("7777777777777777777777777777777777777777777777777777a000u\\7777777777777777777777777777777777777777777777777777", '0');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40158");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                          23\\U0023\\U                                          ", "6666666666666666666666666666666666666666666663 .....");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40159");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\\\u002", "0200\\\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40160");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6", (int) '.', (int) 'i');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                      ...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      ..." + "'", str2, "                                                                                      ...");
    }

    @Test
    public void test40162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...6\\66\\6\\66\\6\\66\\6\\6           \\u0\\u005                                                                                          \\u0\\u005");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40163");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                               002300230023002300230023002300230a000u\\002300230023002300230023002300230", 'C');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\r\r\r\r\r8", 26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40165");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("161\\161\\161\\161\\161\\161\\U6                      \n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                         \\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\", "....................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40167");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\1111111111111111111111111111u11111111111111111111111111110020", "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40168");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16");
    }

    @Test
    public void test40169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("iiiiiaaaaaa                             iiiiii", "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiaaaaaa                             iiiiii" + "'", str2, "iiiiiaaaaaa                             iiiiii");
    }

    @Test
    public void test40170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40170");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...", 11);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("AAAA...", "aaa", (int) (short) 1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "                                                                                                              ..");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!", strArray4, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'C');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!" + "'", str11, "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test40171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40171");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ih01001!ih0", "333333333333333333333333333333333333333333333333333333333333333333333333333333310HI!100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("61        61        61        61        61        61        61        61        61        61        61        61        61", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n210000000000000000000000000000000000000000000000000\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\0auu0", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40173");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "                                                                                                        AAAAAAA     ");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("61\\61\\61", strArray6);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0023                                                                                                                                                  hi!hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" 61\\ 61\\ ", strArray6, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10hi!100" + "'", str11, "10hi!100");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10hi!100" + "'", str13, "10hi!100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10hi!100" + "'", str15, "10hi!100");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test40174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40174");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              555555555555555555555555555555555555555555555555555555  ......  61555555", 178);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40175");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666614", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test40177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", 157);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\4003", "75");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\4003" + "'", str2, "\\4003");
    }

    @Test
    public void test40179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40179");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                  \\u0023\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                  \\u0023\\u0", 205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40180");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "U", (java.lang.CharSequence) "0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test40181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40181");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uu!IHu...", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                 hi!hi!hi!                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40183");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                         \n\n1           ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         \n\n1           " + "'", str2, "                                         \n\n1           ");
    }

    @Test
    public void test40184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###u\\32                                                                             ", "1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1", 78);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###u\\32                                                                             " + "'", str3, "u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###u\\32                                                                             ");
    }

    @Test
    public void test40185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40185");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U", "hCaaaaaaaaaaaaaaaaaaahCaaaaaaaaaaaaaaaaaaahCaaaaaaaaaaaaaaaaaaahCa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "3200U\\3200U\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40187");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0020");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0023", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", (java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith(" 61\\ 61\\61", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'i');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200uu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u0020" + "'", str6, "\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200uu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u0020");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\ 61\\ 61\\61u 61\\ 61\\610020" + "'", str7, "\\ 61\\ 61\\61u 61\\ 61\\610020");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\iui0020" + "'", str9, "\\iui0020");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0020" + "'", str11, "\\u0020");
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test40188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666" + "'", str1, "\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
    }

    @Test
    public void test40189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("3\\u0003\\u0111111111111111111111111111111111111111111111", "61.####################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0003\\u0" + "'", str2, "3\\u0003\\u0");
    }

    @Test
    public void test40190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40190");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40191");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\u0037");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\55555555555555555555510hi!10", "UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40193");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" \\ 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " \\ 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61" + "'", str2, " \\ 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61");
    }

    @Test
    public void test40195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("5544u4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5544u" + "'", str1, "5544u");
    }

    @Test
    public void test40196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61i!                                                                                   U0023                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("U###0u\\...", 650);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40198");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("3333333333333333333333333333333333                                                                             6U623\\u", "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ", (int) '3');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40199");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '0', 280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "22222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40201");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                    222222222222222222222222222222222");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40202");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200u", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test40203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40203");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("h                                                                ", 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test40204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 563);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  \n\n1                                         ", "6666666666666666                                                                                            AAAAAAA      66666666666666666", "23\\U0023\\U...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n1" + "'", str3, "\n\n1");
    }

    @Test
    public void test40206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002", 24, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002" + "'", str3, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002");
    }

    @Test
    public void test40207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40207");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40208");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\n\n......\n\n0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("23\\u                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u" + "'", str1, "23\\u");
    }

    @Test
    public void test40210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40210");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       uuuuuuu", (int) '\\');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40211");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAA\\20uuu\\20uuu\\20uuu\\                                               uuuuuuuuuuuu2", 33, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAA\\20uuu\\20uuu\\20uuu\\                                               uuuuuuuuuuuu2" + "'", str3, "AAAAAAAAAAAAA\\20uuu\\20uuu\\20uuu\\                                               uuuuuuuuuuuu2");
    }

    @Test
    public void test40212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40212");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61\\\\50020", "u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40213");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111      ", (java.lang.CharSequence) "222222222222222222222222222222222222222222222222222222222222u   6");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test40214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40214");
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "6\\6\\66\\6\\66\\6\\66\\6...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test40215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40215");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("51", 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                   ", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                   " + "'", str2, "...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                   ");
    }

    @Test
    public void test40217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40217");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                 \\u0036                                                                 ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("3333333333333333333333333333333333                                                                             6u623\\U", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test40218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......                        ", "\\u003", "23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U66666666666666666666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......                        " + "'", str3, "                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......                        ");
    }

    @Test
    public void test40219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("uuu0023", 0, "0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuu0023" + "'", str3, "uuu0023");
    }

    @Test
    public void test40221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40221");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                ", "                                                 61\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\U0023\\U0023\\U0023\\U0023\\U002", (int) (short) 10, "                   ######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U002" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U002");
    }

    @Test
    public void test40223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40223");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", 'h');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.', 250, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test40224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40224");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("6666666666666666                                                                                            AAAAAAA      66666666666666666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6666666666666666                                                                                            AAAAAAA      66666666666666666" + "'", str1, "6666666666666666                                                                                            AAAAAAA      66666666666666666");
    }

    @Test
    public void test40225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40225");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  \\U005C  ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test40226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40226");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1", " 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3261\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("1h!1020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u002", 103, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...20\\u0020\\u0020\\u002..." + "'", str3, "...20\\u0020\\u0020\\u002...");
    }

    @Test
    public void test40230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh....................................................................................................", "001\\u00", 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh001\\u00........................................" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh001\\u00........................................");
    }

    @Test
    public void test40231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40231");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "                                         \n\n                                                     \n\n                                      ", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032" + "'", str1, "032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
    }

    @Test
    public void test40233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("23                                               ...", "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str2, "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test40234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161" + "'", str2, "111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161");
    }

    @Test
    public void test40235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40235");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "                   55555555556uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu62626                   ", "6u", 255);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test40236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("6\\\\u0020                                                                                     ", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           " + "'", str2, "                                           ");
    }

    @Test
    public void test40237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40237");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", "222222222222222222222222222222222222222222222u6       ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiii");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40238");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40239");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A\\u0023AAAAAAAAAAAAA", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A\\u0023AAAAAAAAAAAAA" + "'", str3, "A\\u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test40240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40240");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\4   ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                        ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test40241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40242");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "\\u005c\\u0", (int) (byte) 100, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", strArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test40243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40243");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "33333333333333333333");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA", "         0000000000000000000000000000000000000000000000000\\U0037         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA" + "'", str2, "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA");
    }

    @Test
    public void test40245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                 a                                                                                                                                              ", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 a                                                                                                                                              " + "'", str2, "                                                 a                                                                                                                                              ");
    }

    @Test
    public void test40246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\             " + "'", str1, "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\             ");
    }

    @Test
    public void test40247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40247");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU    ", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40248");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("IUI0020\\4\n\n", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 162 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test40249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40249");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("62aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "62aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "62aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", "            aaaaaaaaaaaaa3200\\a ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40251");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\4003", '5');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny(" 61\\ 61\\ ", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                               !ih!ih!ih", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test40252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                           1\\u00234                                      \\u0023\\u00\\U0                    ..", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh111111111111111111111111                                                                      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           1\\u00234                                      \\u0023\\u00\\U0                    .." + "'", str2, "                           1\\u00234                                      \\u0023\\u00\\U0                    ..");
    }

    @Test
    public void test40253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaa3200U\\a                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40254");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'C', 449);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 449 + "'", int2 == 449);
    }

    @Test
    public void test40255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("UUUUUU 6\\\\U0020 6\\\\U0020 6              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6              " + "'", str1, "UUUUUU 6\\\\U0020 6\\\\U0020 6              ");
    }

    @Test
    public void test40256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40256");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023", "                                                                                                    ", (int) (byte) 1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0020", strArray5, strArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', (int) '.', 0);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", (int) '7');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray5, strArray20);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray20);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0020" + "'", str11, "\\u0020");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str21, "0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test40257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test40258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 288, 695);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40259");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0069", "                         A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075                         ", 370);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0069" + "'", str4, "\\u0069");
    }

    @Test
    public void test40260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40260");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023                                            ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   u61    ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###\n\\u002                                         \n\n1           ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("0023\\u0023\\u0023\\u0023\\u0023\\u00", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                  ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test40261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                                                                                               555555555555555                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6", "...    ...uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40263");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\ 61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaa    6aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa    6aaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaa    6aaaaaaaaaaaaa");
    }

    @Test
    public void test40265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40265");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("57");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40266");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                \\i\\                       61\n                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              555555555555555555555555555555555555555555555555555555  ......  61555555", "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "555555555555555555555555555555555555555555555555555555  ......  61555555" + "'", str2, "555555555555555555555555555555555555555555555555555555  ......  61555555");
    }

    @Test
    public void test40268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "           \n\n161\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032" + "'", str2, "40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
    }

    @Test
    public void test40269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200" + "'", str1, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200");
    }

    @Test
    public void test40270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "\\U0032\\U0032\\U0032\\U0032\\U0032\\U0032");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", 181);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test40272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40272");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6", "                              23\\u0023\\u0023\\u002   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test40273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", 365);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6" + "'", str2, "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
    }

    @Test
    public void test40274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40274");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith(".......................................1111111", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU" + "'", str4, "  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU");
    }

    @Test
    public void test40275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40275");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', (int) '\\', (int) (short) 1);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                        ", strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                             61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1161\\\\1u100201161\\\\1u10020116");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 104 + "'", int11 == 104);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test40276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40276");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'i', (int) 'C');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test40277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("cccccccccccccccccccccccccccccccccc\n     ", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    IUI0020\\4\n\nIUI0020\\4\n\nIUI0020\\4\n\nIUI002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccccc\n     " + "'", str2, "cccccccccccccccccccccccccccccccccc\n     ");
    }

    @Test
    public void test40280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("3\\u1111111111111111111111111111111111111111111116", "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      ", "                      75");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\u1111111111111111111111111111111111111111111116" + "'", str3, "3\\u1111111111111111111111111111111111111111111116");
    }

    @Test
    public void test40281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA" + "'", str2, "\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA");
    }

    @Test
    public void test40282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40282");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("111111111111111111111U6111111111111111111111", 52, (int) '6');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40283");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...            3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", "...    23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\...", "U62 \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62 \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62 \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", 297);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...            3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U" + "'", str4, "...            3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
    }

    @Test
    public void test40284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\0023\\0023\\0023\\0023\\0023\\0023\\0023...", "...11111111111111111111111111111111111111111111111111...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0023\\0023\\0023\\0023\\0023\\0023\\0023..." + "'", str3, "\\0023\\0023\\0023\\0023\\0023\\0023\\0023...");
    }

    @Test
    public void test40286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("6666666666666666666666666666666666666666666663 .....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6666666666666666666666666666666666666666666663 ....." + "'", str1, "6666666666666666666666666666666666666666666663 .....");
    }

    @Test
    public void test40287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40287");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", "\\U0023\\U00\\u0041\\U002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40288");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", '6');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0", '6');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 136");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test40289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40290");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '1');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test40291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\iui0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40292");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU61UUUUUUUUUUUUUUUUU                                                                                                        aaaaaaa", "200U\\3200U\\3200U", 89);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40293");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                      \\U0023\\U00\\u0041\\U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("22222A2AAUA  ", "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("u0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU", "                                        a0u0023aaaaaaaaaaaaa                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ", 'u', '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       " + "'", str3, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test40297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40297");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '0', 270);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40298");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "h          aaaaaaa       ", "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U", 90);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0055", "                                hi!", (int) (short) 100);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " ", 44, 7);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u0055" + "'", str8, "\\u0055");
    }

    @Test
    public void test40300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaa51");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40301");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                           U", "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", 6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0075", "\n");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", strArray4, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str12, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test40302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40302");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("uuu6  6  6  6  6", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40303");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("5700u\\23\\u                                    ", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test40304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("..                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       " + "'", str2, "..                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ");
    }

    @Test
    public void test40305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("61\\ 61\\ 61", 255, 497);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("33333333333333333333333333333333333333333333333333333333333333333333333333333333333333                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str2, "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
    }

    @Test
    public void test40307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", '.', '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str3, "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test40308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaa", 130, "       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa                                                                                                                              " + "'", str3, "aaaa                                                                                                                              ");
    }

    @Test
    public void test40309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40309");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Aaaa", 'I');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40310");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "!ih!ih!ih   2    2    2  ...", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..", "\\u002066666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6.." + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 6... 6..");
    }

    @Test
    public void test40312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "..................6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test40313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40313");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA", 31, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA");
    }

    @Test
    public void test40314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("77777###\n\\u002                                         \n\n1           aaaaaaaaaaa77777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "77777###\n\\u002                                         \n\n1           aaaaaaaaaaa77777" + "'", str1, "77777###\n\\u002                                         \n\n1           aaaaaaaaaaa77777");
    }

    @Test
    public void test40315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40315");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      \\u0023\\u00\\U0041\\u0023", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40316");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 26, "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, " 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test40317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40317");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\U000aaaaaaaaaaaaaa3200U\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("2U2U2U2U2U2U2U2U2U2", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2U2U2U2U2U2U2U2U2U2" + "'", str2, "2U2U2U2U2U2U2U2U2U2");
    }

    @Test
    public void test40320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40320");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                AAAA15AAAA                 ", "6\\\\u0020                                                                                     ", 39);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test40321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test40322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40322");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "33333333333333333333333333333333333333333333", (java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023### \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023### \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAA\\U0023\\U0023\\");
    }

    @Test
    public void test40324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40324");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40325");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200", "\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200" + "'", str2, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200");
    }

    @Test
    public void test40328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40328");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("         a          ", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...3\\u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111...3\\u...                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test40329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40329");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                  ...", "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002", 147);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                              11111                                ...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test40330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61" + "'", str2, "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
    }

    @Test
    public void test40331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAA     ", (int) 'I', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA                                                                  " + "'", str3, "AAAAAAA                                                                  ");
    }

    @Test
    public void test40332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40333");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10hi!1", 356, 456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230200\\\\", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230200\\\\" + "'", str2, "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230200\\\\");
    }

    @Test
    public void test40335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40335");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '6');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("       h", strArray1, strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "666666666666666666666666666666666666666666666666666666666aaa" + "'", str5, "666666666666666666666666666666666666666666666666666666666aaa");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "       h" + "'", str6, "       h");
    }

    @Test
    public void test40336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40336");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161", "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40337");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                 0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40339");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("6u623\\U", "444444444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U" + "'", str1, "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
    }

    @Test
    public void test40341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", "2222222222222222222222222222\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u" + "'", str2, "             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
    }

    @Test
    public void test40342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAaaaaaaaaaaaaaaaa...023\\u0061\\u0061\\u0 61 \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u 100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u" + "'", str1, "23\\u 100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u");
    }

    @Test
    public void test40344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40344");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu162uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ", "61uuuuuuuuuu...00160000000016000000001600000000160000000016000000001600000000160000000016000000001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       " + "'", str2, "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
    }

    @Test
    public void test40347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\", "a\\U0023AAAAAAAAAAAAAA000U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111...\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "1111111...\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test40348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", "u6      61        61        61        61      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032" + "'", str2, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
    }

    @Test
    public void test40349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (int) '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test40350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("..............................................6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40351");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40352");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\ 61\\ 61\\61u 61\\ 61\\610020", 213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40353");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAII" + "'", str1, "II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAII");
    }

    @Test
    public void test40354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("u1111111111111111111111111111111111111111111116", 532);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40355");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61uuu", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  \r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40356");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                    " + "'", str1, "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                    ");
    }

    @Test
    public void test40357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...", "61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000..." + "'", str3, "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...");
    }

    @Test
    public void test40358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40358");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40359");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("000000000000000000000000000000000000000000000\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ", '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16u    \n   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\" + "'", str2, "16u    \n   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\");
    }

    @Test
    public void test40361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("5u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5u" + "'", str1, "5u");
    }

    @Test
    public void test40362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40362");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6", "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40363");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("Aaaaaaa      ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test40364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("77777777777777777777700000000000000000000777777777777777777777\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 129);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        77777777777777777777700000000000000000000777777777777777777777\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n         " + "'", str2, "        77777777777777777777700000000000000000000777777777777777777777\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n         ");
    }

    @Test
    public void test40365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40365");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0\\\\\\\\  U  0\\\\\\\\  U  0\\\\\\\\  U  0\\\\\\\\  U  ", (java.lang.CharSequence) "1\\U00234                                      \\U0023\\U00\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40366");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\5u50055c5\\5u500", "U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0  \nU0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0020U0", "23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6              ", 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\5u50055c5\\5u500" + "'", str4, "\\5u50055c5\\5u500");
    }

    @Test
    public void test40367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                       u0023\\u002u0023\\u002u0023\\u002u0", "23                                               ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                       u0023\\u002u0023\\u002u0023\\u002u0" + "'", str2, "                                                                                                                                                                                                                                       u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test40368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00" + "'", str1, "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
    }

    @Test
    public void test40369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!11h!1", "111111111111111111111u61111111111111111111111123\\U                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40370");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("uuuuuuuuuaaaaaaa       3200u\\32033333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ", "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40371");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               ", 130);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40372");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61", "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        ", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("16        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16  uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu", 82, "                                                             \\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "16        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16  uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu" + "'", str3, "16        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16  uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ", "AAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...U0023\\U\\4003U0023\\U0023\\U0##########U0023U0023\\U00...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...00U\\3200U3200U##########0U\\3200U\\3200U3004\\U\\3200U..." + "'", str1, "...00U\\3200U3200U##########0U\\3200U\\3200U3004\\U\\3200U...");
    }

    @Test
    public void test40377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40377");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    IUI0020\\4\n\nIUI0020\\4\n\nIUI0020\\4\n\nIUI002", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40378");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAA      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40379");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("023\\u0023", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", 695);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40380");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test40381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40381");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                    61\\ 6161\\ 61\\ 6161\\ ", "3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...u0023\\u\\4003u0023\\u0023\\u0##########u0023u0023\\u00...", "                              11111                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40383");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("u003                                                u0023u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                                                                                             hi!hi!hi!", "                                                         \\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40384");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                      ", 95, "II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAA" + "'", str3, "                                      II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAA");
    }

    @Test
    public void test40385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                  ", "                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str2, "                                                                                                        aaaaaaa     ");
    }

    @Test
    public void test40386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAAAAAAAAAAAAAAAAAAAAAAA2AAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA2AAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAA2AAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40387");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\U000AAAAAAAAAAAAAA3200U\\", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   ..", 'A', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   .." + "'", str3, "   ..");
    }

    @Test
    public void test40389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40389");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...UUUUUUUUUU", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '5', 4, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...3\\u0023\\u00231\\40032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40391");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40392");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) (short) -1);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("      ", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("\\", strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("\\U002322222");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002", strArray6, strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\U002322222" + "'", str12, "\\U002322222");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002" + "'", str14, "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002");
    }

    @Test
    public void test40393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40393");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\               ", "3200U\\1400u\\00U\\3200U", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40394");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 433, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("23\\U###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0##" + "'", str1, "23\\U###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0##");
    }

    @Test
    public void test40396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("U535u5235u5235u5235u5235u523UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu52", "Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U535u5235u5235u5235u5235u523UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu52" + "'", str2, "U535u5235u5235u5235u5235u523UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu52");
    }

    @Test
    public void test40397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "001!IH0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", (int) (short) 0, 861);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057" + "'", str3, "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
    }

    @Test
    public void test40399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40399");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("3333361                                         \n\n1                                         ", "1\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3333361                                         \n\n1                                         " + "'", str2, "3333361                                         \n\n1                                         ");
    }

    @Test
    public void test40401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40401");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '\n');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40402");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\ 6\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 6\\" + "'", str1, "\\ 6\\");
    }

    @Test
    public void test40403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "U\\32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002\\U002066666666666666666666666666666666666666", "i!                                                                                   U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                                                                                   U0023" + "'", str2, "i!                                                                                   U0023");
    }

    @Test
    public void test40405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\0023\\0023\\0023\\0023\\0023\\0023\\0023...", "6161...", 124);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                           61\n                       ", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
    }

    @Test
    public void test40407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40407");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...1111111", 650, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40408");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", "                            AAAAAAAAAAAAA3200u\\A  ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40409");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("55          aaaaaaa       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa", 167);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                        61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa                                                        " + "'", str2, "                                                        61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa                                                        ");
    }

    @Test
    public void test40411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAA\\...\\AAAAAA\\                             \\HHHHHHHHHHHHHHHHHAAAAAA\\                             \\HHHHHHHHHHHHHHHHH", "                             6  6                                                           6  6                                                           6  6                                                           6  6                                                      0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA\\...\\AAAAAA\\                             \\HHHHHHHHHHHHHHHHHAAAAAA\\                             \\HHHHHHHHHHHHHHHHH" + "'", str2, "AAAA\\...\\AAAAAA\\                             \\HHHHHHHHHHHHHHHHHAAAAAA\\                             \\HHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test40412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuuuuuuuuuuuuUuuuuuUuuuuuUuuuuuUuuuuuUuuuuuUuuuuuUuuu", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uUuuu" + "'", str2, "uUuuu");
    }

    @Test
    public void test40413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40413");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       aaaaaaa", "UUUU", 19);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test40414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40414");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068", "...                           ...0023h\\hh0023h\\hh0023h                            ...", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068" + "'", str3, "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068");
    }

    @Test
    public void test40416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("3200u\\3200u\\3200u\\3200u\\3200u\\", 59, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\\\u0032\\u0032\\u0032\\u0032\\u003" + "'", str3, "3200u\\3200u\\3200u\\3200u\\3200u\\\\u0032\\u0032\\u0032\\u0032\\u003");
    }

    @Test
    public void test40417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40417");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1111111111111111111111111111111111111111...UUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111...UUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111...UUUUUUUUUUUUUUUUUUUUUUUUUUUU", "1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111", 682);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###AU#################################################", "#################################################\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###AU" + "'", str2, "###AU");
    }

    @Test
    public void test40419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" 61\\ ", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      61\\                                                       " + "'", str2, "                                                      61\\                                                       ");
    }

    @Test
    public void test40420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u", "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u" + "'", str2, "\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u");
    }

    @Test
    public void test40421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40421");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        ", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "3333333333333333333333333361u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u333333333333333333333333333", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test40422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111");
    }

    @Test
    public void test40423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u" + "'", str2, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u");
    }

    @Test
    public void test40424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40424");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test40425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40425");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "      3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu61uuuuuuuuuuuuuuuuuu3\\u0...\\u00", "\\\\0020        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                      " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                      ");
    }

    @Test
    public void test40426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40426");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", '5');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("\\                                                u                                                005                                                c", (java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'h');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test40427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40427");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                             6  6                              ", "                                 A\\u0023AAAAAAAAAAAAA                                  1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40428");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0\\\\0020        ", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40429");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\                                                u                                                005                                                c", "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test40431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40431");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "7");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  \\U005C  ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", strArray6, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("23\\u0023\\u...                                   UUUUUUUUUUUUUUUUUUUUU", strArray6);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2" + "'", str11, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test40432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("41AAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "41AAAAAAAA" + "'", str1, "41AAAAAAAA");
    }

    @Test
    public void test40433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40433");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ih01001!ih0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("6\\ 6\\6uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuu6\\6 \\6" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuu6\\6 \\6");
    }

    @Test
    public void test40435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40436");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "...      \n\n1           ...                                                                                              ", 138);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40437");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "610000000000000000000000000000000000000000000000000                                  0auu0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test40439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40439");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('c', (int) '3');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test40440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40440");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     " + "'", str1, "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
    }

    @Test
    public void test40441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40441");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAA51AAA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("UUUUUUUUUUUUUUUUUU", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test40442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40442");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                           \\\\335c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40443");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaa", 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test40444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                        ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 100);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "22222U6                                          ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test40445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                         161\\161\\161\\161\\161\\16177777777777777777777777777", 354, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         161\\161\\161\\161\\161\\16177777777777777777777777777IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "                                         161\\161\\161\\161\\161\\16177777777777777777777777777IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test40446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40448");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                           \\\\0033005", "                        UUUUUUUUUUU6UUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\ 61\\ 61\\61u 61\\ 61\\61002", "           \n\n161\\ 61\\ 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40450");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0055", "\\u0035", (int) '3');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\\u0023AAAAAAA...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test40451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40451");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\U005C                                                                                                                                                                  ", 234, 20);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test40452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", (java.lang.CharSequence) "                                       AAAAAAAAAAAAA3200u\\A                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40453");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "...\r                                                                                                                                                                                                         ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a");
    }

    @Test
    public void test40454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40454");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAA51AAA");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230200\\\\", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test40455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test40456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("1\\U00234                                      \\U0023\\U00\\u0                    ..", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40457");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\UuU0300u\\1                                                                                                                             75023U\\UuU0023U\\UuU0023U\\UuU0023U\\UuU0023U\\UuU0", (java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 459 + "'", int2 == 459);
    }

    @Test
    public void test40458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0");
    }

    @Test
    public void test40459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40459");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111", (java.lang.CharSequence) "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111" + "'", charSequence2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test40460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test40462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       231111111111111", "      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...", "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       231111111111111" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       231111111111111");
    }

    @Test
    public void test40463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40464");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("2...........................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void test40465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40465");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40466");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 94, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40467");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40468");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0023\\u\\", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'i');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0023\\u\\" + "'", str4, "\\u0023\\u\\");
    }

    @Test
    public void test40469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40469");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                        ", 203, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                        " + "'", str3, "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                        ");
    }

    @Test
    public void test40470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test40471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40471");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("..............................................", '6');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '.' + "'", char2 == '.');
    }

    @Test
    public void test40472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40472");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("3\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40473");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...AAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40474");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("    ", "0023\\U0023\\U0023\\ u020\\U0020\\U0020\\U00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 'i', '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test40476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40476");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'c');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test40477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40477");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", 23, 28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\U0023\\U0023\\U0023\\U03\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\1610023\\U0023\\U0023\\U0023\\U002" + "'", str4, "23\\U0023\\U0023\\U0023\\U03\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\1610023\\U0023\\U0023\\U0023\\U002");
    }

    @Test
    public void test40478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                   3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...11111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40480");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!", (java.lang.CharSequence) "U61616161616161616161616161U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#", (int) (short) -1, "\\U00685555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test40482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40482");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4", "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################", 153, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################");
    }

    @Test
    public void test40484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40484");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       ...\r", (int) '0', "AAAA                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA                            AAAA        ...\r" + "'", str3, "AAAA                            AAAA        ...\r");
    }

    @Test
    public void test40485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0020", "iiiiiii0##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20" + "'", str2, "20");
    }

    @Test
    public void test40486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40486");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0#" + "'", str1, "###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0#");
    }

    @Test
    public void test40487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23004\\       uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "23004\\       uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("   U61   ", "i                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U61" + "'", str2, "U61");
    }

    @Test
    public void test40489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih" + "'", str1, "!ih!ih!ih");
    }

    @Test
    public void test40490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40490");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("161\\ 61\\ 6", "33333333333333333333");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("\\u23\\u23\\u23\\u23\\u23\\u23\\u23                                                  ", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u23\\u23\\u23\\u23\\u23\\u23\\u23                                                  " + "'", str6, "\\u23\\u23\\u23\\u23\\u23\\u23\\u23                                                  ");
    }

    @Test
    public void test40491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u000d", (int) '\n', 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u000dCCCC" + "'", str3, "\\u000dCCCC");
    }

    @Test
    public void test40492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                   0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...                    ", 79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...                    " + "'", str2, "                   0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...                    ");
    }

    @Test
    public void test40493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", "\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3" + "'", str2, "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
    }

    @Test
    public void test40494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333" + "'", str1, "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333");
    }

    @Test
    public void test40495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("U00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", "\\u0030", "u003");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3" + "'", str3, "U00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
    }

    @Test
    public void test40496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuu 3200", "2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "\\U007  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test40498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40498");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "AAA51AAAA");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "UUUUUUUUUUUUUUUU...     32");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test40499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40499");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    16        16        16        16        16        16        16        16        16        16        16        16        16    ", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    16        16        16        16        16        16        16        16        16        16        16        16        16    " + "'", str3, "    16        16        16        16        16        16        16        16        16        16        16        16        16    ");
    }

    @Test
    public void test40500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest80.test40500");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0023\\u0023\\u0023\\u0023\\u0023", "5555555                     ...                                                                                ", (int) 'U');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

