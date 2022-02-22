import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest81 {

    public static boolean debug = false;

    @Test
    public void test40501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("3333361                                         \n\n1", "22222222222222222222                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
    }

    @Test
    public void test40504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40504");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!ih   2    2    2    2    2    2    2    2    2  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("            1hi!1             ", "777777777777777777777777777777777777777727777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            1hi!1             " + "'", str2, "            1hi!1             ");
    }

    @Test
    public void test40507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       " + "'", str1, "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ");
    }

    @Test
    public void test40508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1111111111111111111111111111111111111111111113660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066", "                     ......  7777777777777777777777777777777777777777777777777777777777777777777777761\\                     ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066" + "'", str2, "3660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066");
    }

    @Test
    public void test40509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40510");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(".......................................1111111", 260, (int) 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".......................................1111111" + "'", str3, ".......................................1111111");
    }

    @Test
    public void test40511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40511");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Aaaaaaa      ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  16        16        16        16        16        16        16        16        16", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test40512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40512");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\4003266666666666666666666666666666666666... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u3\\u0023\\u0023\\u0023\\u0023\\u00231\\40032", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    ", "U0023                                            66666666666666666666666666666666666666666666666666666666666666666666", 543);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\4003266666666666666666666666666666666666... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u3\\u0023\\u0023\\u0023\\u0023\\u00231\\40032" + "'", str4, "\\4003266666666666666666666666666666666666... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u3\\u0023\\u0023\\u0023\\u0023\\u00231\\40032");
    }

    @Test
    public void test40513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "                                                                                                                                                                                                                                                  0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str2, "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test40514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40514");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", "        75                                                                                                           ", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                             61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1161\\\\1u100201161\\\\1u10020116");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("\\i\\                       61", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\" + "'", str7, "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\");
    }

    @Test
    public void test40515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("3333333333333333333333333", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        3333333333333333333333333                        " + "'", str2, "                        3333333333333333333333333                        ");
    }

    @Test
    public void test40516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40516");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", 77);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test40517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("23A23A23A23AuA31A23A23A23A23", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23A23A23A23AuA31A23A23A23A23" + "'", str2, "23A23A23A23AuA31A23A23A23A23");
    }

    @Test
    public void test40518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("u003", 122, '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33333333333333333333333333333333333333333333333333333333333u00333333333333333333333333333333333333333333333333333333333333" + "'", str3, "33333333333333333333333333333333333333333333333333333333333u00333333333333333333333333333333333333333333333333333333333333");
    }

    @Test
    public void test40519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40519");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 104);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                      \\U0023\\U00\\u0041\\U0023", strArray3, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                      \\U0023\\U00\\u0041\\U0023" + "'", str13, "                                      \\U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test40520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "000000000000000000000000000000000000000000000\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\U0043                                                                                                     ", 192, 268);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40522");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("66666666666666666666666666666666666666666666666666666AAAAAAA     U   3U    41U   3     ", 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40523");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                            AAAAAAAAAAAAA3200u\\A  ...", 55, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            AAAAAAAAAAAAA3200u\\A  ...\r\r" + "'", str3, "                            AAAAAAAAAAAAA3200u\\A  ...\r\r");
    }

    @Test
    public void test40524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40524");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 6u666u                                                  ", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40525");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu", 92, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61" + "'", str1, "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61");
    }

    @Test
    public void test40527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               ", (int) (short) 10, 177);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               " + "'", str3, "                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               ");
    }

    @Test
    public void test40528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40528");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "       ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ", 532, (int) 'C');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str10, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test40529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40529");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                    ", "\\U0023\\U00\\u0041\\U                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40530");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......                        ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40531");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                              11111                             ", "                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40532");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1!0h01", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 121);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "222222222222222222222222222222222222222222222222222222222222u   6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("500u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\U\\3200u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "500u\\0u\\500u\\0u\\500u\\U\\3200u\\0u\\500u\\0u\\500u\\" + "'", str1, "500u\\0u\\500u\\0u\\500u\\U\\3200u\\0u\\500u\\0u\\500u\\");
    }

    @Test
    public void test40535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("3\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", 70, "             3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r" + "'", str3, "3\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test40536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40536");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0023", "   ...                             ", "200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023" + "'", str4, "\\U0023");
    }

    @Test
    public void test40537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAAAAAA      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAA      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "AAAAAAA      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test40538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32          aaaaaaa       u61\\61\\61\\61\\61\\", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32          aaaaaaa       u61\\61\\61\\61\\61\\" + "'", str2, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32          aaaaaaa       u61\\61\\61\\61\\61\\");
    }

    @Test
    public void test40539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40539");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                            AAAAAAAAAAAAA3200\\A                                               ", "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("3\\u0023u0023\\u0023\\u0023\\u0023\\u002             ", 157, 64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40541");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("55555555");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40542");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023", "                                                                                                    ", (int) (byte) 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0020", strArray6, strArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a', (int) '.', 0);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", (int) '7');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray6, strArray21);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10hi!100" + "'", str11, "10hi!100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\u0020" + "'", str12, "\\u0020");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str22, "0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test40543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                          57", 47, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                          57" + "'", str3, "                                                          57");
    }

    @Test
    public void test40544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020", 562, "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655552361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020" + "'", str3, "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6262655552361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020");
    }

    @Test
    public void test40545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40545");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "                   0041hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("23\\U                                                                                             ", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("3200u\\3200u\\3200u\\3200u\\3200u\\\\u0032\\u0032\\u0032\\u0032\\u003", "                                                                             6u666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HcuuuuuuUUUUUUUUUUUUUUUUUU\\4555555555555555555555555", "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" 61\\\\u0020                                                      ", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\\\u0020                                                      " + "'", str2, " 61\\\\u0020                                                      ");
    }

    @Test
    public void test40550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40550");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("uuuuuuuuuuuu 3200u           ", "555555U00230000000000000000000000000000000000000000000005555555");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40551");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 66, 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40552");
        char[] charArray11 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5C", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("  \\U005C  ", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test40553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("16161616161616161616161616", 340, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1616161616161616161616161677777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777" + "'", str3, "1616161616161616161616161677777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test40554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40554");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2  ", "                                                                             23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40556");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        \\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40557");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa                                                ", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", charArray12);
        java.lang.Class<?> wildcardClass20 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test40558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61\\61\\61", 73, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) ".....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....." + "'", str1, ".....");
    }

    @Test
    public void test40560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("   61        61                                                       ", "c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   61        61                                                       " + "'", str2, "   61        61                                                       ");
    }

    @Test
    public void test40561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40561");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 23");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test40562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40562");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" 61", 191);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("20u0020u0020u0020u00", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20u0020u0020u0020u00" + "'", str2, "20u0020u0020u0020u00");
    }

    @Test
    public void test40564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40564");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                   0200iui\\", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\u00c\\u00", 635);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00c\\u00" + "'", str2, "\\u00c\\u00");
    }

    @Test
    public void test40566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40566");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "261                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40568");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c\\u00", "U61", (int) 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("2                                                                                                                    ", 'a');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("u", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("Aaaac11111111111111111111111111111111111111111", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Aaaac11111111111111111111111111111111111111111" + "'", str10, "Aaaac11111111111111111111111111111111111111111");
    }

    @Test
    public void test40569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAAAAAAAAA\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAAAAAAAAA\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAAAAAAAAA\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40570");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("      \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "IIIIIIIIII0023\\u0...IIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("77777777777777777777777777777777777777777777777777777", 93, 635);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("      3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu61uuuuuuuuuuuuuuuuuu3\\u0...\\u00", "iiiiiiii\\u", 369);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu61uuuuuuuuuuuuuuuuuu3\\u0...\\u00" + "'", str3, "      3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu61uuuuuuuuuuuuuuuuuu3\\u0...\\u00");
    }

    @Test
    public void test40573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40573");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "261                                                                                                                    ", (java.lang.CharSequence) "                               \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40574");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ccccccc", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...3\\U0##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40576");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "UUUUUUUUUUu6UUUUUUUUUUU", (java.lang.CharSequence) "U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0 u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test40577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40577");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("55", 110, 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55" + "'", str3, "55");
    }

    @Test
    public void test40578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "00000000000000000000000000000000AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAA000000000000000000000000000000000", "1hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test40579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                                                                                                                                   ", "  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("3333361                                         \n\n1", 192, (int) '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40581");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n3\\U                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" 61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40583");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "                       \\U0023\\U00\\u0041\\U                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40584");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("aaaa                                                 ", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test40585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "   .");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40586");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 90, 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40587");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 532);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 532 + "'", int2 == 532);
    }

    @Test
    public void test40588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40588");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\", '\\');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\U", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 94 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test40589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("023\\u0023       aaaaaaauuuuuuuuu", "                                                                                                                                                                                                                                                           \\u003                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "023\\u0023       aaaaaaauuuuuuuuu" + "'", str2, "023\\u0023       aaaaaaauuuuuuuuu");
    }

    @Test
    public void test40590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("61\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\u0061\\u\\U0023\\u0061\\u0061\\u0" + "'", str1, "61\\u0061\\u\\U0023\\u0061\\u0061\\u0");
    }

    @Test
    public void test40591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40591");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" u61                                           ", "    3    ", 94);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "\\61\\61\\61\\61\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40593");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                              6u666");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40594");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0#", (java.lang.CharSequence) "\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0#" + "'", charSequence2, "###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0#");
    }

    @Test
    public void test40595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40595");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("uuuuuuuuuuuuuuuuu1u 61u 6161u 61u 6161u 61u 6161u 6uuuuuuuuuuuuuuuuuu", "23AU0023AU0023AU0023AU0023AU0023AU0023AU0023UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40596");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033                   ", (java.lang.CharSequence) "       ...\r");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033                   " + "'", charSequence2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033                   ");
    }

    @Test
    public void test40597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40597");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                 ", "61\\aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61..", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40599");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...                                 ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40600");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("U0023\\U00\\u0041\\U00232222", "20\\u0020\\u0020\\u0020\\u00  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40601");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA111111111111111111111u6111111111111111111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40602");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUU 6\\\\U0020 6\\\\U0020 6              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40603");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ ...", "                                                                                                                                                                                                                          11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111", 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ ..." + "'", str3, "\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ ...");
    }

    @Test
    public void test40604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "\\61\\61\\61\\61\\61\\61");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40605");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   ", "10hh!10hh1!10hh1!10hh1!1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40606");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  2   ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\U23\\U23\\U23\\U23\\U23\\U23\\U23", "##U###\n####U###\n####U###\n####U###\n####U###\n##57                                                                                                                             1");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########" + "'", str2, "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
    }

    @Test
    public void test40610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40610");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                            AAAAAAAAAAAAA3200u\\A                                 ", 137);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40611");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                         ...0023h\\hh0023h\\hh0023h                            ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                            16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...\r                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                            16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40613");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                        aaaaaaa    ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test40614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40614");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "..............................................6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40615");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test40616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40616");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("\\UUU02\\... 3hi!hi!hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "iiiiiiii\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40618");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\\\u0020", "                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002", 280);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...h...3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...h ", "6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h...3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...h " + "'", str2, "...h...3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...h ");
    }

    @Test
    public void test40620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test40621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!i16\\16\\16\\16\\16\\16\\16\\u0023\\u00\\U0041\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i16\\16\\16\\16\\16\\16\\16\\u0023\\u00\\U0041\\u" + "'", str1, "!i16\\16\\16\\16\\16\\16\\16\\u0023\\u00\\U0041\\u");
    }

    @Test
    public void test40622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40622");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034......   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034", 148, "                                                                                                                                                                        41                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034......   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034......   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034");
    }

    @Test
    public void test40623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "3200U\\3200U\\u6623\\u6623\\u6623\\u6623\\u6623\\u6623U6663200U\\3200U\\3                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11111111111u0023#u0023#u0023#u0023#u0023#u0023#", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100", "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau23#u23#u23#u23#u23#u23#" + "'", str3, "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau23#u23#u23#u23#u23#u23#");
    }

    @Test
    public void test40625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("               \\", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40626");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('C', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40627");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("002u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "222222U0023#U0023#U0023#U0023#U0023#U0023#U0023      222222", 148);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40628");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...1...                                    ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40629");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                         \n\n1                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40630");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!", "                                                         ", "                                                ", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                            HI!HI!HI!" + "'", str4, "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                            HI!HI!HI!");
    }

    @Test
    public void test40631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\aa\\a", 930);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\aa\\a" + "'", str2, "\\aa\\a");
    }

    @Test
    public void test40632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40632");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40633");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, " \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757", 60, 476);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test40634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40634");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111113660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test40635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r..." + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
    }

    @Test
    public void test40636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40636");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h..." + "'", str1, "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...");
    }

    @Test
    public void test40637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40637");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U6623\\U6623\\U6623\\U6623\\U6623\\U6623U666", "                                                                             136u66136u");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("UUUUUUUUUUUUUUUU...     32", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test40638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\U                                                                                             ", "                                           \\\\335c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40639");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U0023                                   ", "0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", (int) (byte) 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("       22222\\U0023\\U00\\u0041\\U00232222", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test40640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaa", '7', '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa" + "'", str3, "aaa");
    }

    @Test
    public void test40641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40642");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\400326666666666666666666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\40032", 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40643");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40644");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 16" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 16");
    }

    @Test
    public void test40646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40646");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...", "    \n     ", "0023\\u00 61\\ 61\\61\n\n\n\n\n\n\n\n", 245);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023..." + "'", str4, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...");
    }

    @Test
    public void test40647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40647");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 433);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40648");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('U', 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test40649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U" + "'", str2, "61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
    }

    @Test
    public void test40650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40650");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2a1", "AAAAAAAAAAAAAAAAAAAA", 456);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40651");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ", "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("...      61\n                       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test40652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "     aaaaaaa                                                                                                        UUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test40653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40653");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40654");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\U0023\\U00\\U0041\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001");
    }

    @Test
    public void test40657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ", '7', 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     " + "'", str3, "                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
    }

    @Test
    public void test40659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40659");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "23hi!hi!hi!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                        A0u0023AAAAAAAAAAAAA                                        ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0", strArray6, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 81");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test40660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40660");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("5c");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5c" + "'", str1, "5c");
    }

    @Test
    public void test40661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40661");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("1111111...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40662");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaa", 'U');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40664");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray14 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                     ", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "41", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0041\\u00", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaa u   6aaaaaaaaaaaaa", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test40665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40665");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("uU\\U320570UuU\\U3200UuU\\U3200UuU\\U3200UuU\\", "\\U003 111 ", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("3\\U                      ", 243);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\U                      " + "'", str2, "3\\U                      ");
    }

    @Test
    public void test40667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40667");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii61\\ 61\\ 61", (int) '1');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40668");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                        uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!", "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!" + "'", str2, "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!");
    }

    @Test
    public void test40670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                  aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "3\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ " + "'", str2, "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ");
    }

    @Test
    public void test40673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("u 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u", "61.##############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u" + "'", str2, "u 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
    }

    @Test
    public void test40674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40674");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40675");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u", '5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40676");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61\\61\\61", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\61\\61" + "'", str3, "61\\61\\61");
    }

    @Test
    public void test40677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40677");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                               ", (int) '1', 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                               " + "'", str3, "                                                                                                               ");
    }

    @Test
    public void test40678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str2, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test40679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40679");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ", 'C');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40680");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'D' + "'", char1 == 'D');
    }

    @Test
    public void test40681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40681");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test40682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "a000u\\       UUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a000u\\       UUUUUUUUUUUUUUUUUUU" + "'", str1, "a000u\\       UUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test40683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40683");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("        75                                                                                                           ", "000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAA\\20uuu\\20uuu\\20uuu\\                                               uuuuuuuuuuuu2", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "75" + "'", str7, "75");
    }

    @Test
    public void test40684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\" + "'", str2, "               61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\");
    }

    @Test
    public void test40685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str1, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test40686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40686");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " \\u003 ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U0006", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test40687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("1111111111111111111111111111\\u0023\\u0023 6u\\161\\161\\161\\161\\161\\161", "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111\\u0023\\u0023 6u\\161\\161\\161\\161\\161\\161" + "'", str2, "1111111111111111111111111111\\u0023\\u0023 6u\\161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test40689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhh", 480);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                        AAAAAAA    ", (int) '0', "66666666666666666666         66666666666666666666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                        AAAAAAA    " + "'", str3, "                                                                                                        AAAAAAA    ");
    }

    @Test
    public void test40691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "UUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40692");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test40693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("i!                                                                                   ", "300000", (int) '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!                      300000                        " + "'", str3, "i!                      300000                        ");
    }

    @Test
    public void test40694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", 404, "u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61u0023                                111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str3, "u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61u0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61u0023                                111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test40695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40695");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "\\16 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                         ", 19, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40696");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("u003                    111111111111111", "a0U0023aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40697");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ", "\\u003\\u0023", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HHHHHHHHHHHHHUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U", 349);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                 HHHHHHHHHHHHHUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U" + "'", str2, "                                                                                                                                                                                                                                                                                 HHHHHHHHHHHHHUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U");
    }

    @Test
    public void test40699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40699");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa", (int) 'i');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0023\\u0... UU000u" + "'", str1, "U0023\\u0... UU000u");
    }

    @Test
    public void test40701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "uuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\U002066666666666666666666666666666666666666", 4, "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U002066666666666666666666666666666666666666" + "'", str3, "\\U002066666666666666666666666666666666666666");
    }

    @Test
    public void test40703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40703");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "ccccccc", (java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40704");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                        a0u0023aaaaaaaaaaaaa                                        ", "1\\U00234                                      \\U0023\\U00\\u");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '\n');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                        a0u0023aaaaaaaaaaaaa                                        " + "'", str4, "                                        a0u0023aaaaaaaaaaaaa                                        ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                        a0u0023aaaaaaaaaaaaa                                        " + "'", str5, "                                        a0u0023aaaaaaaaaaaaa                                        ");
    }

    @Test
    public void test40705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "1h!1020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaa                             ", "###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ", 161, "                                      \\U0023\\U00\\u0041\\U002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                                                          \\U" + "'", str3, "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                                                          \\U");
    }

    @Test
    public void test40708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40708");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111113660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066", "\\U005C                                                                                                                                                                  ", 280);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40709");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\u005c", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...            3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40711");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "                                                        20\\u0020\\u0020\\u0020\\u00", (int) '\\');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test40712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                  \\  \\\\0020                              ", "                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  \\  \\\\0020                              " + "'", str3, "                                                  \\  \\\\0020                              ");
    }

    @Test
    public void test40714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40714");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test40715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str2, "\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test40717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("....................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...................................................................................................." + "'", str1, "....................................................................................................");
    }

    @Test
    public void test40718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40718");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U0023                                   ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " ##");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40719");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "3200U\\3200U\\320023aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\320023aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "3200U\\3200U\\320023aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("     aaaaaaa                                                                                                        UUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     aaaaaaa                                                                                                        UUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16" + "'", str2, "     aaaaaaa                                                                                                        UUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16");
    }

    @Test
    public void test40721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023", 57, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023" + "'", str3, "....\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023");
    }

    @Test
    public void test40723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40723");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("U0023\\U002U0023\\U002U0023\\U002U0", "...AAAA      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40724");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0031", "  ", (int) 'h');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006", 268, 41);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "                                                         u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", strArray5, strArray11);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", '6');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6", strArray5, strArray19);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str16, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6" + "'", str20, "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6");
    }

    @Test
    public void test40725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                               I!                                                                                                                                                                                                                  ", "      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...      aaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                               I!                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                               I!                                                                                                                                                                                                                  ");
    }

    @Test
    public void test40726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40726");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("61UUUUUUUUUU", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40727");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", "u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40728");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 682, 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "\\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str2, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test40730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40730");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "222223200U\\  ", (java.lang.CharSequence) "555555555555555");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "222223200U\\  " + "'", charSequence2, "222223200U\\  ");
    }

    @Test
    public void test40731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaa  .....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40732");
        char[] charArray10 = new char[] { '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "11111", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("UUUUUUUUUUUUUUUUUUUUUUUUU...", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\  \\\\0020                                                            ", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA             ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test40733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                           1\\U0034                                      \\U003\\U00\\u0           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAAAAAAAAAAA\\20uuu\\20uuu\\20uuu\\                                               uuuuuuuuuuuu2", "                        \\U0023\\U00\\u0041\\U0023                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###\nu002                                         \n\n1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\n\n                                         200u\n###" + "'", str1, "1\n\n                                         200u\n###");
    }

    @Test
    public void test40736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40736");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("11111111111111111111111111111...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40737");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaac11111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u" + "'", str2, "                                  \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u");
    }

    @Test
    public void test40739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40739");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test40740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40740");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...U0023\\U\\4003U0023\\U0023\\U0##########U0023U0023\\U00...", "6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\" + "'", str2, "0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\");
    }

    @Test
    public void test40742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40742");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ", (java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40743");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40744");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40746");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", "222222222222222222222222222222222\\UUU02\\...2222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              " + "'", str2, "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
    }

    @Test
    public void test40748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("cccccccccccccccccccccccccccccccccc", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccccc" + "'", str2, "cccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test40750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40750");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "iiiiiiiiiii 6\\\\u0020iiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("     8", "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test40752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40752");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002\\\\\\\\", (java.lang.CharSequence) "                                                      ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002\\\\\\\\" + "'", charSequence2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002\\\\\\\\");
    }

    @Test
    public void test40753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40753");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", "aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40754");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\r');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "AAAA51AAAA");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("...232U00232U00237575757575757575757575757575757575757575757575757575757533333333333333UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str7, "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test40755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh" + "'", str1, "aAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh");
    }

    @Test
    public void test40756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40756");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u", 77, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u");
    }

    @Test
    public void test40758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ", (int) (short) 100, "c200U\\1400u\\00U\\c200U\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "caaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa                   c2" + "'", str3, "caaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa                   c2");
    }

    @Test
    public void test40759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(" 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "55555555555                                  ", 456);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66" + "'", str3, " 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
    }

    @Test
    public void test40760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40760");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...111111111111111111111111111111111111111111111111111111111", '5');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...111111111111111111111111111111111111111111111111111111111" + "'", str3, "...111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...111111111111111111111111111111111111111111111111111111111" + "'", str4, "...111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test40761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40761");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        \\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40762");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                       iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########", 148, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40763");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "3\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40764");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                     222222222222222222222222222222222222222222222222222222                                                                                                      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test40765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40765");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 68, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str4, "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test40766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40766");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("uuuu61uuuu", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test40767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    " + "'", str1, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ");
    }

    @Test
    public void test40768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\n\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5" + "'", str1, "1\n\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5");
    }

    @Test
    public void test40769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40769");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "1\n\n                                         200u\n###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40770");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) '3', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40771");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", 'h');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                            ", 0, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test40772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40772");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("111111111111111111111u61111111111111111111111123\\U", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu" + "'", str1, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu");
    }

    @Test
    public void test40774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                      \\U0023\\U00\\u0                    ..4                           1\\U0023", "001!ih01", "\\u0023 hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      \\U\\\\23\\U\\\\\\u\\                    ..4                           0\\U\\\\23" + "'", str3, "                                      \\U\\\\23\\U\\\\\\u\\                    ..4                           0\\U\\\\23");
    }

    @Test
    public void test40775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                   3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", 121, 61);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40777");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 245, (int) '0');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concatWith("                                 ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaaa      " + "'", str10, "aaaaaaa      ");
    }

    @Test
    public void test40778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", 245);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0..." + "'", str2, "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0...");
    }

    @Test
    public void test40779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40779");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...111111111111111111111111111111111111111111111111111111111111", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ..." + "'", str1, "aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...");
    }

    @Test
    public void test40781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40781");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                         \n\n1                                         ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '.');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 135, (int) 'u');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         \n\n1                                         ", "                                       aaaaaaaaaaaaa\\\\\\", 2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   c                                           \\u005", strArray2, strArray13);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                         \n\n1                                         " + "'", str14, "                                         \n\n1                                         ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   c                                           \\u005" + "'", str16, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   c                                           \\u005");
    }

    @Test
    public void test40782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...0UuU\\\\0UuU\\\\0U75757575757575757575757575757575757575757575757575757575", "1111111111111111111111111111\\u0023\\u0023 6u\\161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0UuU\\\\0UuU\\\\0U75757575757575757575757575757575757575757575757575757575" + "'", str2, "...0UuU\\\\0UuU\\\\0U75757575757575757575757575757575757575757575757575757575");
    }

    @Test
    public void test40783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40783");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", "\r");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "u0023", 90);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\" + "'", str8, "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\");
    }

    @Test
    public void test40784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0033", 'U', '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0033" + "'", str3, "\\u0033");
    }

    @Test
    public void test40785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40785");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61", 79, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... U61\\ 61\\ 61\\ 61\\ 61" + "'", str3, "... U61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test40787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\61", "000000000000000000000000000000...             000000000000000000041\\u00000000000000000000000000000000...             000000000000000000", "1111111");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("23\\u0023\\u0023................................", "aaaaaa                             hhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023................................" + "'", str2, "23\\u0023\\u0023................................");
    }

    @Test
    public void test40789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40790");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40791");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                        UUUUUUUUUUU6UUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 88, "a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a61\\ 61\\ 6161\\ 61\\ 6161\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\\ 61\\ 6161\\ 61\\ 6161\\" + "'", str3, "a61\\ 61\\ 6161\\ 61\\ 6161\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\\ 61\\ 6161\\ 61\\ 6161\\");
    }

    @Test
    public void test40793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40793");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "111111111111111111111111111111111111\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...11111111111111111111111111111111111111111U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111111111111111111111111111111111\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...11111111111111111111111111111111111111111U" + "'", str1, "111111111111111111111111111111111111\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...11111111111111111111111111111111111111111U");
    }

    @Test
    public void test40794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40794");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                      61\\ 61\\61", "0000000000000000U00232222200000000000000000", 51, 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "               0000000000000000U00232222200000000000000000" + "'", str4, "               0000000000000000U00232222200000000000000000");
    }

    @Test
    public void test40795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40795");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0", 101, 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1111111111111111111111111111111111111111111110ua3000ua3111111111111111111111111111111111111111111111", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111110ua3000ua3111111111111111111111111111111111111111111111" + "'", str2, "1111111111111111111111111111111111111111111110ua3000ua3111111111111111111111111111111111111111111111");
    }

    @Test
    public void test40797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###uuuuuuuuuuuU6uuuuuuuuuuu                        ##############################################################################################################################################################################################", "16        16        16        16        16        16        16        16        16");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###uuuuuuuuuuuU6uuuuuuuuuuu                        ##############################################################################################################################################################################################" + "'", str2, "u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###uuuuuuuuuuuU6uuuuuuuuuuu                        ##############################################################################################################################################################################################");
    }

    @Test
    public void test40798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                       AAAAAAAAAAAAA3200u\\A                                      ", "A0u0023AAAAAAAAAAAAA", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU16");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40799");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u0032\\u0032\\u0032\\u0032\\u0032\\u0032", "6666666666666666666666666666666666666666666663 .....");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40800");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(" \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40801");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\n\\u0020\\u0020\\u0020\\u00...", "                                                                                                               \\u0035", 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40802");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\U0030\\\\\\\\", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40804");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("3333361                                         \n\n133323\\U                                                                                             3333361                                         \n\n1333");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333361                                         \n\n133323\\U                                                                                             3333361                                         \n\n1333" + "'", str1, "3333361                                         \n\n133323\\U                                                                                             3333361                                         \n\n1333");
    }

    @Test
    public void test40805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", (int) '5', "                                                \\i\\                       61\n                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U" + "'", str3, "            3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
    }

    @Test
    public void test40806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("u0023\\u002u0023\\u002u0023\\u002u0                                                          ", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u0023\\u002u0023\\u002u0023\\u002u0                                                          " + "'", str3, "u0023\\u002u0023\\u002u0023\\u002u0                                                          ");
    }

    @Test
    public void test40807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "U0023#U0023#U0023#U0023#U0023#U0023#U0023      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40808");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 'h');
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!i!hi!hi23                                                                                                                                                  h", strArray4, strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("3322U\\3322U\\3322U\\...2U\\3322U\\3322U\\3322U\\3322U\\3322U\\33\\U22A8", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!i!hi!hi23                                                                                                                                                  h" + "'", str6, "!i!hi!hi23                                                                                                                                                  h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test40809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40809");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "   ...                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40811");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                         75                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAA...                                                                                                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau613200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uU", "                                                                              2  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40813");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "00u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", (java.lang.CharSequence) "\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 160 + "'", int2 == 160);
    }

    @Test
    public void test40814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40814");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111", "\\u0034                                                                                          ", 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40815");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                             11111                              ", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40816");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "575\\u0037200U\\", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40817");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "      Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test40819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40819");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###AU#################################################");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test40820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40820");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0023\\U0023\\U0023\\ u020\\U0020\\U0020\\U00", "u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###u\\32                                                                             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "61UUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61########61########61########61########61########61########61########61########61########61########61########61########61###", 67, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61########61########61########61########61########61########61########61########61########61########61########61########61###" + "'", str3, "61########61########61########61########61########61########61########61########61########61########61########61########61###");
    }

    @Test
    public void test40823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40823");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("23 u0023 u0023          3    23 u0023 u0023      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23 u0023 u0023          3    23 u0023 u0023" + "'", str1, "23 u0023 u0023          3    23 u0023 u0023");
    }

    @Test
    public void test40824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Aaaaaaaaaaaaa\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("A000u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A000u\\" + "'", str1, "A000u\\");
    }

    @Test
    public void test40826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ..." + "'", str2, " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...");
    }

    @Test
    public void test40827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0020\\u0020\\u0020\\u0020\\u0020\\u...", 296, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u...111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u...111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test40828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40828");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   ", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    IUI0020\\4\n\nIUI0020\\4\n\nIUI0020\\4\n\nIUI002", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test40830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40830");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".", "cccccccccccccccccccccccccccccccccc", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 177);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test40832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40832");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 96, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test40833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40833");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("2  ", 161, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40834");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("6                                     ", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAaaaaaaaaaaaaaaaa...023\\u0061\\u0061\\u0 61 \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\" + "'", str2, "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\");
    }

    @Test
    public void test40837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "33333333        753333333333333333333333333");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "1600u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test40839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("11111111111111.", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111111111111." + "'", str2, "11111111111111.");
    }

    @Test
    public void test40840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40840");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0033", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        java.lang.Class<?> wildcardClass18 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 104 + "'", int14 == 104);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test40841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40841");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n....................................................u61IUI0020\\4\n\n.............................................................................IUI0020\\4\n\n.....................................................");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'I' + "'", char1 == 'I');
    }

    @Test
    public void test40842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40842");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU", (int) ' ', "###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU");
    }

    @Test
    public void test40843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                             u\\\n  16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16u\\\n                                                                                                                                                                                                                                                              " + "'", str1, "                                                                                                                                                                                                                                                             u\\\n  16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16u\\\n                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test40844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40844");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0023\\", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                 10hi!10010hi!161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U10hi!10010hi!1                                                                                  ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00" + "'", str1, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
    }

    @Test
    public void test40846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("A000U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A000U\\" + "'", str1, "A000U\\");
    }

    @Test
    public void test40847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40847");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("   \n\\u002                                   ...", (int) 'h', "1\\6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\61\\61\\61\\61\\61\\61\\61\\61\\61   \n\\u002                                   ...1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\" + "'", str3, "1\\61\\61\\61\\61\\61\\61\\61\\61\\61   \n\\u002                                   ...1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
    }

    @Test
    public void test40848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...1...                     ", "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40849");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\16177777777777777777777777777", 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test40850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                             U002322222                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40851");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023                                                                                     hi!hi!hi!", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "       ...", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#6666\r\r\r\r\r\r\r##", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test40852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                        ", "16 16 16 16 16 16 16 16 16");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                        ");
    }

    @Test
    public void test40853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40853");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("400u\\00U\\3200U\\", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 20);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400u\\00U\\3200U\\" + "'", str5, "400u\\00U\\3200U\\");
    }

    @Test
    public void test40854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test40855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40855");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh....................................................................................................", (java.lang.CharSequence) "u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 221 + "'", int2 == 221);
    }

    @Test
    public void test40856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40856");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6\\\\u00206\\\\u00206");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40857");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "222223200U\\1400u\\00U\\3200U\\22222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40858");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\n\n\n\n\n\n\n", "                     \\U0023\\U00\\u0           ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAAAAAAAAAAAAAAAAAAAAAAA2AAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40861");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 51);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("3200U\\1400u\\00U\\3200U\\", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0023\\u0023\\u0023\\u0023\\u0023", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "!ih!ih!ih   2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2    2");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str10, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test40862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40862");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "UUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 729);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", "6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test40865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40865");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("666666666666666666666666666666666666666\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\AAAAAAAAAAAAA   ", "    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                          57", "AAAA\\...\\AAAAAA\\                             \\HHHHHHHHHHHHHHHHHAAAAAA\\                             \\HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "57" + "'", str2, "57");
    }

    @Test
    public void test40867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", "H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("20\\u0020\\u0020\\u0020\\u00", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40869");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "........................................................................................1111111     ", "aaaaaaaaaaaaa...000200002000020000200002000020000200002000020...\\\\\\\\\\\\\\", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test40870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40870");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40871");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  \\005c  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\005c" + "'", str1, "\\005c");
    }

    @Test
    public void test40873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40873");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAA...AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAA                             HHHHHHHHHHHHHHHHH");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA4...4AAAAAA4                             4HHHHHHHHHHHHHHHHHAAAAAA4                             4HHHHHHHHHHHHHHHHH" + "'", str3, "AAAA4...4AAAAAA4                             4HHHHHHHHHHHHHHHHHAAAAAA4                             4HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test40874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                             11111111111111111111111111111111111                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40875");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003", (java.lang.CharSequence) ".......................................1111111");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
    }

    @Test
    public void test40876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40876");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('5', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test40877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "u003");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str2, "16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test40878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40878");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test40879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40879");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                61..               ", "u002311111                             u002311111                             u002311111                             u002311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u002311111                             u002311111                             u002311111                             u002311111                             u", 35, 116);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                61..               u002311111                             u002311111                             u002311111                             u002311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u002311111                             u002311111                             u002311111                             u002311111                             u" + "'", str4, "                61..               u002311111                             u002311111                             u002311111                             u002311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u002311111                             u002311111                             u002311111                             u002311111                             u");
    }

    @Test
    public void test40880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40880");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                300u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                300u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                300u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40882");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa                                                ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("3333361                                         \n\n1", "  uuu", "\\u0061");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test40884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40884");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                 10hi!10010hi!161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U10hi!10010hi!1                                                                                  ", "###AU#################################################", 929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                    \\u0020\\u0020\\u0020\\u0", 203, "2U2U2U2U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    \\u0020\\u0020\\u0020\\u02U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U" + "'", str3, "                    \\u0020\\u0020\\u0020\\u02U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U");
    }

    @Test
    public void test40886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40887");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhh                  ", "61uuu", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40888");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiNumeric('D');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40889");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                    61\\ 6161\\ 61\\ 6161\\ ", 566);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "", "        61        61        6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test40891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("323\\u00\\U0041\\u002\\u00266666666666666666666666666666666666666666666666666666       ", "                                                                                                                               i!                                                                                                                                                                                                                 ", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "323\\u00\\U0041\\u002\\u00266666666666666666666666666666666666666666666666666666       " + "'", str3, "323\\u00\\U0041\\u002\\u00266666666666666666666666666666666666666666666666666666       ");
    }

    @Test
    public void test40892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40892");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 296, 203);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str4, "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test40893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\     \\     \\     \\     \\       \\", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\     \\     \\     \\     \\       \\" + "'", str2, "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\     \\     \\     \\     \\       \\");
    }

    @Test
    public void test40894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40894");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                 ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaa                                                 ", 161, 148);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test40895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40895");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                         \n\n1                 AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         \n\n1                 aaaa\\ \\61\\aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                         \n\n1                 aaaa\\ \\61\\aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test40896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test40897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40899");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " 61\\\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40900");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ", 40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40901");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                        41                                                                                                                                                                         ", "\\U003 111", 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 93, 930);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 93");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("               0000000000000000U00232222200000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               0000000000000000U00232222200000000000000000" + "'", str1, "               0000000000000000U00232222200000000000000000");
    }

    @Test
    public void test40903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61");
    }

    @Test
    public void test40904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40904");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40905");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", 32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test40906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "u5c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40907");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("c111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40908");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("333333333333333333333333333333333333333333u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test40909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40909");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\400326666666666666666666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\4003266666666666666666666666666666666666666");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...\\61\\61\\61\\61\\U0023     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\\61\\61\\61\\61\\U0023     ..." + "'", str1, "...\\61\\61\\61\\61\\U0023     ...");
    }

    @Test
    public void test40911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                               !ih!ih!ih", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               !ih!ih!ih" + "'", str2, "                                                                                               !ih!ih!ih");
    }

    @Test
    public void test40912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40912");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11111111111u0023#u0023#u0023#u0023#u0023#u0023#", "11111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "555555555555555" + "'", str1, "555555555555555");
    }

    @Test
    public void test40914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40915");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "\\U002066666666666666666666666666666666666666", 100);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test40916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40916");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "                                                                                                        \\u0023\\u\\", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\", 936);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     ......  77777777777777777777777777777777777777777777777777777777777777777777777" + "'", str3, "                     ......  77777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test40918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40918");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757", '3');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "23\\u");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '0', 340, (int) 'u');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test40919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 94, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test40920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40920");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                  uAAAAAA\\u005c\\u0", "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111", "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                                      200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111" + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111");
    }

    @Test
    public void test40922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("A000u\\", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000u\\" + "'", str2, "A000u\\");
    }

    @Test
    public void test40923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40923");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("11111111111111111111111111111...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u ...... \\u004...u", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0", "5C1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\i\\                       61\n                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0" + "'", str3, "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0");
    }

    @Test
    public void test40925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40925");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'A');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 3hi!hi!hi!                                                                          ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      " + "'", str4, "      ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 79 + "'", int5 == 79);
    }

    @Test
    public void test40926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("A\\u0023AAAAAAAAAAAAA", "4  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A\\u0023AAAAAAAAAAAAA" + "'", str2, "A\\u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test40927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", "AAAAAAA      ", 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "75        75        75        75        75        75 AAAAAAA       75        75        75        75        75        75" + "'", str3, "75        75        75        75        75        75 AAAAAAA       75        75        75        75        75        75");
    }

    @Test
    public void test40928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40928");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("60u0UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0U060\\\\0u000200U060\\\\0u000200U06", "uuuuuuuuuaaaaaaa       32\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111\\U003");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40929");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40930");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                        a", (java.lang.CharSequence) "A\\u0061\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\3AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                        a" + "'", charSequence2, "                        a");
    }

    @Test
    public void test40931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaauuuuuuuuu 023\\u0023", "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("   U61   ", "                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   U61   " + "'", str2, "   U61   ");
    }

    @Test
    public void test40934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("i!         ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40935");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\uhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test40936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40936");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0033", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "6", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..", charArray11);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 104 + "'", int16 == 104);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test40937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                        ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str1, "                                        ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test40938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666" + "'", str2, "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
    }

    @Test
    public void test40939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40939");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                   0041hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ......................................", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111U0023#U0023#U0023#U", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test40940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40940");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                       \\u0036                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40941");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "23\\U0023\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str1, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test40943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...                                 ...", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              ...                                 ..." + "'", str2, "                                                                              ...                                 ...");
    }

    @Test
    public void test40944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", (int) (byte) 100, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str3, "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test40945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u0023                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023                                                                                     hi!hi!hi!" + "'", str1, "\\u0023                                                                                     hi!hi!hi!");
    }

    @Test
    public void test40946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40946");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ", "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61002 61002 61002 61002 61002 61002 61002 610...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    " + "'", str3, "61002 61002 61002 61002 61002 61002 61002 610...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ");
    }

    @Test
    public void test40947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("5...", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...777777777777777777777777777777777777777777");
    }

    @Test
    public void test40948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
    }

    @Test
    public void test40949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40949");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n", "                                                                                                                                                                                    16aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40950");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", '1');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    1600U\\1600U\\1600U\\1600U\\1    16u   \\1600U\\1600U\\1600U\\1600U\\" + "'", str1, "                                    1600U\\1600U\\1600U\\1600U\\1    16u   \\1600U\\1600U\\1600U\\1600U\\");
    }

    @Test
    public void test40952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40953");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                             \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0", "aaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40954");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111      ", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", (int) '1', (int) 'i');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      c111111111111111111111111111111111111111111\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n     " + "'", str4, "      c111111111111111111111111111111111111111111\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n     ");
    }

    @Test
    public void test40955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40955");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\\u005c\\u0", (int) (byte) 100, (int) (byte) -1);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test40956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40956");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hi!", (int) ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach(" 61", strArray4, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'U', 90, 13);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '6', 98, (int) '\\');
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 61" + "'", str9, " 61");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test40957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40957");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    ", "u0023     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40958");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0032");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str2, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test40960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40960");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'u', 73);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73 + "'", int2 == 73);
    }

    @Test
    public void test40961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("61UUUUUUUUUU", "  ......  \\u00410023\\U0023\\U0023\\U0023\\U0023\\U001\\u0041\\u006666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61UUUUUUUUUU" + "'", str2, "61UUUUUUUUUU");
    }

    @Test
    public void test40962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40962");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40963");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                  0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test40964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40964");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("U6623\\U6623\\U6623\\U6623\\U6623\\U6623U666", "...261\\261\\261\\261\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("3200u                            aaaaaaaaaaaaa3200\\a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U                            AAAAAAAAAAAAA3200\\A" + "'", str1, "3200U                            AAAAAAAAAAAAA3200\\A");
    }

    @Test
    public void test40966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("i                                                                                                           ", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                         " + "'", str2, "                                                                                                         ");
    }

    @Test
    public void test40967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40967");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii", 136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40969");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ", "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23 u0023 u0023          3    23 u0023 u0023", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40971");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6", (java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r3200");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test40972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      " + "'", str1, "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ");
    }

    @Test
    public void test40973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("I!                                                                                   ", 191);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     I!                                                                                                                                        " + "'", str2, "                                                     I!                                                                                                                                        ");
    }

    @Test
    public void test40974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40975");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("####A000U\\", "  2   ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                      \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test40976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40977");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\", "...aaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                       \\U0023\\U00\\u0041\\U                        ", "\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40979");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', (int) '7');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test40980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40980");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '4', 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa20\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           " + "'", str4, "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa20\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ");
    }

    @Test
    public void test40981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                             6u623\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6u623\\U" + "'", str1, "6u623\\U");
    }

    @Test
    public void test40982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40982");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "", 358);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test40983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0023 hi!hi!hi!", "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555\\U00C\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444");
    }

    @Test
    public void test40985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\02                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\02                                                                                                   " + "'", str1, "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\02                                                                                                   ");
    }

    @Test
    public void test40986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40986");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', 563);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 563 + "'", int2 == 563);
    }

    @Test
    public void test40987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                         \n\n1                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         \n\n1                                         " + "'", str1, "                                         \n\n1                                         ");
    }

    @Test
    public void test40988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "uuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uuuuuuuuuuuuuuuuu3\\u0...\\U00" + "'", str1, "Uuuuuuuuuuuuuuuuu3\\u0...\\U00");
    }

    @Test
    public void test40989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40989");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 126);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40990");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40991");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test40992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40992");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test40993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                       ", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40994");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 96);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40995");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00", "                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test40996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40996");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'C', '2');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test40997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                           U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test40998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40998");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", "61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test40999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test40999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("5555555                     ...                                                                                ", "UUUU61UUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test41000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest81.test41000");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "U 61.", (java.lang.CharSequence) "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

