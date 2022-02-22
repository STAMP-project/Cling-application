import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest75 {

    public static boolean debug = false;

    @Test
    public void test37501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "U00234                                      \\U0023\\U00\\U0                    ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ##", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("23\\U                                                                                      ", "\\u005c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u005c" + "'", str2, "\\u005c");
    }

    @Test
    public void test37504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                            \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                             ", "5c11111111111111111111111111 61\\ 111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                             " + "'", str2, "                            \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                             ");
    }

    @Test
    public void test37505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37505");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("023\\U0023\\U0023\\U0023    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...\r                                                                                                                                                                                                         ", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa", "...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa");
    }

    @Test
    public void test37508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'u');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " 61.");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "               ", 5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u005c\\u00", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU", strArray3, strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str11, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU" + "'", str13, "  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str15, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test37509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37509");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\4   ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                         23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test37510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37510");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                         ...0023h\\hh0023h\\hh0023h                            ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37511");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                            aaaaaaaaaaaaa3200\\a                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            aaaaaaaaaaaaa3200\\a                                " + "'", str1, "                            aaaaaaaaaaaaa3200\\a                                ");
    }

    @Test
    public void test37513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37513");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           \\61\\61\\61\\61\\61\\61", 8);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "16\\", (java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37515");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) (byte) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str4, "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test37516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "h          aaaaaa\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H          aaaaaa\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\" + "'", str1, "H          aaaaaa\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\");
    }

    @Test
    public void test37518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "                 \\u0030\\\\\\\\                  ", "\r\r\r\r\r\r\r...                                      57");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37520");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 139);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37521");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 476);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 476 + "'", int2 == 476);
    }

    @Test
    public void test37522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u" + "'", str2, "u 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
    }

    @Test
    public void test37523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37523");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAAAAAA", 'u');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", 297, 97);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u", strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test37524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37524");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\UUU02\\... 3hi!hi!hi!                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\UUU02\\...3hi!hi!hi!" + "'", str1, "\\UUU02\\...3hi!hi!hi!");
    }

    @Test
    public void test37525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37525");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37526");
        char[] charArray9 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\61\\61\\61\\61\\61\\61", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test37527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37527");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\1111111111111111111111111111u11111111111111111111111111110020", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ", 155, 43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              " + "'", str4, "\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ");
    }

    @Test
    public void test37528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA", "111111111111111111111111111111111111111111111111111                                                      ", "             U0023\\U002U0023\\U002U0023\\U002U0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAHHHHHHHHHHHHHHHHHAAAAAAAA" + "'", str3, "AAAAAAHHHHHHHHHHHHHHHHHAAAAAAAA");
    }

    @Test
    public void test37529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1111111111111111111111111111111111111111111110uhi!hi!hi!3000uhi!hi!hi!3111111111111111111111111111111111111111111111", "                                         \n\n1                                                    \n\n", "323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("d", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test37531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37531");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U00230023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test37532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37532");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) '2');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str6, "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test37533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("51AAAA", "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uU" + "'", str2, "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uU");
    }

    @Test
    public void test37534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37534");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                   U\\1400u\\00U\\3200U\\", "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   U\\1400u\\00U\\3200U\\" + "'", str2, "                                   U\\1400u\\00U\\3200U\\");
    }

    @Test
    public void test37536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             ", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuu3200", "\\IUI0020\\4\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\\U\\I\\U\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\n\\U" + "'", str3, "\n\\U\\I\\U\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\n\\U");
    }

    @Test
    public void test37537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\1111111111111111111111111111u11111111111111111111111111110020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\1111111111111111111111111111u11111111111111111111111111110020" + "'", str1, "\\1111111111111111111111111111u11111111111111111111111111110020");
    }

    @Test
    public void test37538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 98, "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa", "555555555555555555555555555... 16 16 16 16 16 16 16 16 165555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h    h...55555555555555555555555555555555555555555555555555555555555555 61                                          ...h    h...555555555555555555555555555555" + "'", str3, "...h    h...55555555555555555555555555555555555555555555555555555555555555 61                                          ...h    h...555555555555555555555555555555");
    }

    @Test
    public void test37540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                   ", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test37541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37541");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("111111111111111111111U", "U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...\r", "AAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\r" + "'", str2, "...\r");
    }

    @Test
    public void test37543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37543");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("        75                                                                                                           ", "23\\U                                         ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\n\n\n\n\n", 108, 55);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test37544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("61\\\\U0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0200U\\\\16" + "'", str1, "0200U\\\\16");
    }

    @Test
    public void test37545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\u", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u" + "'", str2, "\\u");
    }

    @Test
    public void test37546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37546");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 930, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test37548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test37549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37549");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "23\\U0023\\U", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                          61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                        ", "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", "                   0041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                          61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                        " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                          61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test37551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37551");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37552");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ", (int) '7', "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              " + "'", str3, "\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ");
    }

    @Test
    public void test37553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("75 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75 ..." + "'", str1, "75 ...");
    }

    @Test
    public void test37554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37554");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                               i!                                                                                                                                                                                                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U", "i!                                                                                   U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                                                                                   U0023" + "'", str2, "i!                                                                                   U0023");
    }

    @Test
    public void test37556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("60u0UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0U060\\\\0u000200U060\\\\0u000200U06");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "60u0UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0U060\\\\0u000200U060\\\\0u000200U06" + "'", str1, "60u0UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0U060\\\\0u000200U060\\\\0u000200U06");
    }

    @Test
    public void test37557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       UUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       UUUUUUU" + "'", str1, "\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       UUUUUUU");
    }

    @Test
    public void test37559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37560");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("6\\ 66\\ 6\\ 66\\ 6\\ 6 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "\\4003266666666666666666666666666666666666... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u3\\u0023\\u0023\\u0023\\u0023\\u00231\\40032", 267);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37561");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0032                                                                       ", "\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U                                            ", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37562");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37563");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#", "                                                        ..       ", "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("2222222222222222222222", 449, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666662222222222222222222222" + "'", str3, "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666662222222222222222222222");
    }

    @Test
    public void test37565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("6  6  6  6  6", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        \\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37566");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                   \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37567");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAA     \\u0041                                                                                           ", "                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test37569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37569");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u002066666666666666666666666666666666666666", (java.lang.CharSequence) " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u002066666666666666666666666666666666666666" + "'", charSequence2, "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u002066666666666666666666666666666666666666");
    }

    @Test
    public void test37570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37570");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U00\\u0041\\U", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37571");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence6, charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023                                                                                     ", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u002", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033                   ", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test37572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37572");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "001!IH0...", (java.lang.CharSequence) "\\U0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "001!IH0..." + "'", charSequence2, "001!IH0...");
    }

    @Test
    public void test37573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\IIIIIIII\\U", "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("230U00230U00230U00230U00230U00230U00230U00230U00230U002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "230U00230U00230U00230U00230U00230U00230U00230U00230U002" + "'", str1, "230U00230U00230U00230U00230U00230U00230U00230U00230U002");
    }

    @Test
    public void test37575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37575");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ", "aaa", 66);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...aaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200uaaaaaaaaaaaaaa", "0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37577");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 476);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       " + "'", str3, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
    }

    @Test
    public void test37578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37578");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", (java.lang.CharSequence) "22222222222222222222uuu0023                                            222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         " + "'", charSequence2, "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
    }

    @Test
    public void test37579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                              23\\u0023\\u0023\\u0023\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAA3200\\A", "61\\\\u002", "                                         3300\\                                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37581");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37582");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'u');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " 61.");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "               ", 5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u005c\\u00", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU", strArray3, strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '\n');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str11, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU" + "'", str13, "  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str14, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str16, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test37583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37583");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                     ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test37584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37584");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6" + "'", str1, "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6");
    }

    @Test
    public void test37585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37585");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("2............................................................................................................................................................................................................................................................................................................................................................", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '\n');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("aa        75", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aa        75" + "'", str9, "aa        75");
    }

    @Test
    public void test37586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  UUUaaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 53, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                            aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37588");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...", (java.lang.CharSequence) "23\\U                                                                                            ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6..." + "'", charSequence2, "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...");
    }

    @Test
    public void test37589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0" + "'", str1, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
    }

    @Test
    public void test37590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37590");
        char[] charArray12 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                     ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "41", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test37591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAA6516AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA6516AAA" + "'", str1, "AAA6516AAA");
    }

    @Test
    public void test37592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37592");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'h');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u", "", 23);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0068", strArray2, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0068" + "'", str10, "\\u0068");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test37593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37593");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("222222222222222222222222222222222222222222222U6                                          ", "\\4aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37594");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("1\\u1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6                                       ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...     61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37595");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
    }

    @Test
    public void test37596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37596");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                      u003                    ", "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 930, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37598");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u00", 245);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        " + "'", str1, "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ");
    }

    @Test
    public void test37600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37600");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("3200U\\3200U\\u6623\\u6623\\u6623\\u6623\\u6623\\u6623U6663200U\\3200U\\3", "                    \\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37601");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAAA51AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA51AAA" + "'", str1, "AAAA51AAA");
    }

    @Test
    public void test37603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666" + "'", str2, "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
    }

    @Test
    public void test37604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                         75                          ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         75                          " + "'", str2, "                         75                          ");
    }

    @Test
    public void test37605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\" + "'", str1, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
    }

    @Test
    public void test37606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37606");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", "\\u", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "u0020u0020u0020u0020u0020u00\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\ru0020u0020u0020u0020u0020u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37608");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37609");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u002066666666666666666666666666666666666666", "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", 7);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("...11111111111111111111111111111111111111111111111111111111", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u", strArray1, strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u" + "'", str8, "\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u");
    }

    @Test
    public void test37610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\               ", 262);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                                                                                                                                                                 " + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                                                                                                                                                                 ");
    }

    @Test
    public void test37611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37611");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("###\n###", 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test37612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37612");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("11111111111111..", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6" + "'", str2, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
    }

    @Test
    public void test37614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    61        61        61        61        61        61        61        61        61        61        61        61        61    ", 63, "AAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    61        61        61        61        61        61        61        61        61        61        61        61        61    " + "'", str3, "    61        61        61        61        61        61        61        61        61        61        61        61        61    ");
    }

    @Test
    public void test37615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37615");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('I', 543);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543 + "'", int2 == 543);
    }

    @Test
    public void test37616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37616");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37617");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('C', 685);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 685 + "'", int2 == 685);
    }

    @Test
    public void test37618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37618");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "222222222222...020u0020u0020u0020u0020u0020u0020u0020...        ", charArray14);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 77 + "'", int21 == 77);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test37619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37619");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray20 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray20);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray20);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray20);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray20);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray20);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray20);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray20);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray20);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray20);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ", charArray20);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", charArray20);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray20);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray20);
        int int34 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray20);
        boolean boolean35 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2                                         \n\n1                                                                                                                               ", charArray20);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test37620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37620");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "16\\", (java.lang.CharSequence) "2U2U2U2U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test37621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37621");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "3\\u003\\u", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test37622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("20u0020u0020u0020u00", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20u0020u0020u0020u00" + "'", str2, "20u0020u0020u0020u00");
    }

    @Test
    public void test37623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test37624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiii", 834, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiii" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiii");
    }

    @Test
    public void test37625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37625");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("610000000000000000000000000000000000000000000000000                                  0auu0aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "610000000000000000000000000000000000000000000000000                                  0AUU0AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U002" + "'", str1, "610000000000000000000000000000000000000000000000000                                  0AUU0AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U0020U0020U0020U0020U0020...        AAAAAAAAAAAAA...U0020U0020U0020U0020U002");
    }

    @Test
    public void test37626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("000000000000000000000000000000000000000000000000000000000000", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0", 267);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000000000000000000" + "'", str3, "000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test37627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("533333333333333333333333333333\\432333333333333333333333333333333C", "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "533333333333333333333333333333\\432333333333333333333333333333333C" + "'", str2, "533333333333333333333333333333\\432333333333333333333333333333333C");
    }

    @Test
    public void test37628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37628");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U0023", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                             \\u0069                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test37629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37629");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23hi!hi!hi!                                                                          ", "                                  AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\", "      AAAA...", 60);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "                                                                                                                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "Aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test37633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "555555555555555555555555555555555555555555555555555555  ......  61555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37634");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...                                      57", "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0023\\U0023\\U0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu", (int) '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\U0023\\U0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu" + "'", str2, "0023\\U0023\\U0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu");
    }

    @Test
    public void test37636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", strArray9);
        java.lang.String[] strArray12 = null;
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray9, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "    16        16        16        16        16        16        16        16        16        16        16        16        16    ");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", strArray3, strArray15);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032" + "'", str4, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str13, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023" + "'", str16, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test37637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37637");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaa", 479, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37638");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'u', (int) '5', 7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023     00U\\3200U\\3200U\\3200U\\3200U\\3200", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test37639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("........6 \\1616 \\16 \\1616 ", "3333361                                         \n\n1                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("200u\\3200u\\3200u\\", "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "200u\\3200u\\3200u\\" + "'", str2, "200u\\3200u\\3200u\\");
    }

    @Test
    public void test37641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "uuu0023                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37642");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test37643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HcuuuuuuUUUUUUUUUUUUUUUUUU\\4555555555555555555555555" + "'", str1, "HcuuuuuuUUUUUUUUUUUUUUUUUU\\4555555555555555555555555");
    }

    @Test
    public void test37644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\61\\61\\61\\61\\u0023", 63, "                                                                             6u666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             \\61\\61\\61\\61\\u0023" + "'", str3, "                                             \\61\\61\\61\\61\\u0023");
    }

    @Test
    public void test37645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37645");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("u0023\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222", "\\                                                u                                                005                                                c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaa" + "'", str1, "Aaaa");
    }

    @Test
    public void test37647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n.." + "'", str1, "...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n..");
    }

    @Test
    public void test37648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37648");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 112, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37649");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61UUUUUUUUUUUUHI!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61UUUUUUUUUUUUU", "0\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\", '#', 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\" + "'", str3, "23004\\13200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001666666666666666666666666666666666666623004\\");
    }

    @Test
    public void test37651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "uuuuuuuuuuuuuuuuu1u 61u 6161u 61u 6161u 61u 6161u 6uuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                 ...", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 ..." + "'", str2, "                                                 ...");
    }

    @Test
    public void test37653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", (int) '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            " + "'", str2, "                                                                                            ");
    }

    @Test
    public void test37654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37654");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      ", "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37655");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 61", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test37656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37656");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaa", (java.lang.CharSequence) "u0023                                                                             hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("6161616161616161616161616", "                             6  6  6  6  6  uuu                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37659");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...0u\\3114...0u\\31");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("   00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", "77777777777777777777700000000000000000000777777777777777777777\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37661");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                  AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U00\\u0041\\U                                   ", "uu!IHu...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("111111U1111111", "...000000000000000000000000000000000000000000000000000000000000...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111U1111111" + "'", str2, "111111U1111111");
    }

    @Test
    public void test37663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                 A\\u0023AAAAAAAAAAAAAa000u\\                                 3", 685, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("575\\u0037200U\\", ".....", "61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "575\\u0037200U\\" + "'", str3, "575\\u0037200U\\");
    }

    @Test
    public void test37665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37665");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\...hh...", "61......61\\61\\61\\61\\61\\61\\...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020", "161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\16177777777777777777777777777", "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020" + "'", str3, "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020");
    }

    @Test
    public void test37667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37667");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777", "6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666", 562, 110);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777776\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666" + "'", str4, "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777776\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666");
    }

    @Test
    public void test37668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###" + "'", str1, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
    }

    @Test
    public void test37669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37669");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("55555555555555555555555555555555555555555555555#####4", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", 237);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 157, "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUA\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3" + "'", str3, "61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUA\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3");
    }

    @Test
    public void test37671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37671");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37672");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u   2", "Aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC 6...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ccccccccccccccccccccccccccccccccccccccccccccccccc 6..." + "'", str1, "ccccccccccccccccccccccccccccccccccccccccccccccccc 6...");
    }

    @Test
    public void test37674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37674");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "1\\61\\61\\61\\61", (java.lang.CharSequence) "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 616");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37675");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                    ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u005c", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "       ");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                       61\n                       ", strArray7, strArray11);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAA                                                ", strArray2, strArray11);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str13, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                       61\n                       " + "'", str17, "                       61\n                       ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAA                                                " + "'", str18, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAA                                                ");
    }

    @Test
    public void test37676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37676");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa", "3200U\\3200U\\\\i\\3200U\\3200U\\3");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37677");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("22222\\U0023\\U00\\u0041\\U002322222", "\\u003");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test37678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 116, "22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test37679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37679");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37680");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37681");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "57");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3261\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", "                                         \n\n1                                                    \n\n1     ", (int) '\n');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333", strArray13, strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("222222222222222222222222222261\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\612222222222222222222222222222", strArray7, strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaa      " + "'", str6, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaa" + "'", str8, "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaa" + "'", str9, "aaaaaaa");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333" + "'", str18, "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u203\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\u23\\uu400323333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "222222222222222222222222222261\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\612222222222222222222222222222" + "'", str19, "222222222222222222222222222261\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\612222222222222222222222222222");
    }

    @Test
    public void test37682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" u004 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " u004 " + "'", str2, " u004 ");
    }

    @Test
    public void test37683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                 ####a\n", 685);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test37685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37685");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("6666666666666666                                                                                            AAAAAAA      66666666666666666", (int) '0', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666666666666666                                                                                            AAAAAAA      66666666666666666" + "'", str3, "6666666666666666                                                                                            AAAAAAA      66666666666666666");
    }

    @Test
    public void test37686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37686");
        char[] charArray9 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U002322222", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test37687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", " 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\U 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37688");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("U6623\\U6623\\U6623\\U6623\\U6623\\U6623U666", '0');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test37689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("    \n", "  UUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUU" + "'", str2, "UUU");
    }

    @Test
    public void test37690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37690");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37691");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00  " + "'", str1, "    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00  ");
    }

    @Test
    public void test37692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        " + "'", str2, "                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ");
    }

    @Test
    public void test37693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 518);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu" + "'", str3, "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu");
    }

    @Test
    public void test37694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37694");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\ 61\\ 61", 'h');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'h');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61\\ 61\\ 61" + "'", str4, "61\\ 61\\ 61");
    }

    @Test
    public void test37695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3322U\\3322U\\3322U\\...2U\\3322U\\3322U\\3322U\\3322U\\3322U\\33\\U22A8" + "'", str1, "3322U\\3322U\\3322U\\...2U\\3322U\\3322U\\3322U\\3322U\\3322U\\33\\U22A8");
    }

    @Test
    public void test37696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                        6u666u                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        6u666u                                        " + "'", str1, "                                        6u666u                                        ");
    }

    @Test
    public void test37697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37697");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###        ", "U0023\\U00\\u0041\\U");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37698");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("23\\U0023\\U");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  2   ", (int) (byte) 100, 98);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'A', 7, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test37699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\" + "'", str1, "61\\");
    }

    @Test
    public void test37700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37700");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37701");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("75", ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray6, strArray9);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", strArray6);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\r');
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "AAAA51AAAA");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u003", strArray6, strArray20);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray25);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray25, strArray30);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray25);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.stripAll(strArray25, "   u61    ");
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray34);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.stripAll(strArray34, "23                                                                                     hi!hi!hi!");
        java.lang.String[] strArray39 = org.apache.commons.lang3.StringUtils.stripAll(strArray34, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\\\", strArray6, strArray34);
        java.lang.String[] strArray41 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "75" + "'", str11, "75");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u003" + "'", str21, "\\u003");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str31, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\\\" + "'", str40, "\\\\");
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test37702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhhh", "023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37703");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', '.');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test37704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...", "0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00..." + "'", str2, "...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...");
    }

    @Test
    public void test37705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37705");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0055                                            1111111111111111111111111111111111111111111111", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ", '0', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      " + "'", str3, "      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ");
    }

    @Test
    public void test37708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37708");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\", 300);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37709");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("uUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'u' + "'", char1 == 'u');
    }

    @Test
    public void test37710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                           ", 87, "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                           " + "'", str3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                           ");
    }

    @Test
    public void test37711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37711");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("UUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u61", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U\\", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37713");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37714");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034......   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...                                                         ", 834);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test37716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                        \\u0023\\u\\", 161);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        \\u0023\\u\\" + "'", str2, "                                                                                                        \\u0023\\u\\");
    }

    @Test
    public void test37717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u00", "23\\U0023\\U...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "                               UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37719");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\0u00020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37720");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("   2     ...                                ...    \\U002", 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test37721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37721");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IUI0020\\4\n\n.............................................................................", "         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37722");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0055", "", 886);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '\\', 189, 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test37723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("000000000U0023\\U0023\\U0023\\U...", "\\u00c\\u00", 929);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37725");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37726");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("    u0034                                                                                          ", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("61\\61\\6", "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\6" + "'", str2, "61\\61\\6");
    }

    @Test
    public void test37728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37728");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37729");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("iiiiii                                                            iiiiii", "", "        61        61        6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiii                                                            iiiiii" + "'", str3, "iiiiii                                                            iiiiii");
    }

    @Test
    public void test37730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("u002322222                                                              ", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u002322222                                                              " + "'", str2, "u002322222                                                              ");
    }

    @Test
    public void test37731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37731");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111113\\u1111111111111111111111111111111111111111111116111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510HI!100", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37733");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0013200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\320001", "\\u0023                                                                                     hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                             ", (java.lang.CharSequence) " 11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37735");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...UUUUUUUUUUUUUUUUU                   ", "666666666666...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37736");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", '0');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0", "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0" + "'", str2, "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0");
    }

    @Test
    public void test37738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "3333361                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37740");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u002", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", 886);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37741");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("1\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37742");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\U0023\\U00\\U0041\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37743");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu", 'A');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu" + "'", str3, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu");
    }

    @Test
    public void test37744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("161\\ 61\\ 6161\\ 61\\ 6161\\ ", 237, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\\ 61\\ 6161\\ 61\\ 6161\\ " + "'", str3, "161\\ 61\\ 6161\\ 61\\ 6161\\ ");
    }

    @Test
    public void test37745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37745");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                     61\\\\u0020                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\\\u0020" + "'", str1, "61\\\\u0020");
    }

    @Test
    public void test37746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37746");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAA                             HHHHHHHHHHHHHHHHHAAAAAA                             HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37747");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37749");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37750");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'u');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU" + "'", str1, "57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU   2  57AAAU");
    }

    @Test
    public void test37752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37753");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "u003                    uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test37756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37756");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "33333333333333333333");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...", 50, 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU..." + "'", str3, "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test37758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37759");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "AAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAA" + "'", str1, "AAAAAAAA");
    }

    @Test
    public void test37760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                 ...", 356, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "                                 ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test37761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37761");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test37762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                 A\\u0023AAAAAAAAAAAAA                      ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37763");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                            uuuuuuuuuuuuuuuuuu", "                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhh", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhh                  " + "'", str2, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhh                  ");
    }

    @Test
    public void test37765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37765");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA  ......  \\u00410023\\U0023\\U0023\\U002");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37766");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "aaaaac500\\0\\0200\\0200\\0200\\0200\\0200\\\n###");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37767");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ", '0');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "", 117, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test37768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37768");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("u6      61        61        61        61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37769");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaa\\\\\\", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      ", charArray15);
        java.lang.Class<?> wildcardClass26 = charArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 57 + "'", int25 == 57);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test37770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37770");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("111111111111111111111111111111111111\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...11111111111111111111111111111111111111111U", "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\u");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37771");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!ih!ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\n\n\n\n\n1", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n1" + "'", str2, "\n\n\n\n\n1");
    }

    @Test
    public void test37774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("575\\u0037200U", "\\U002322222", "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "575#u##u7\\###" + "'", str3, "575#u##u7\\###");
    }

    @Test
    public void test37775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6" + "'", str2, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6");
    }

    @Test
    public void test37776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "6U665CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37777");
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("23                                                                                     hi!hi!hi!", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0034", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\05c0000000000000000000000000000000000000000000000000", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test37778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                       \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\", "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37779");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "       ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "           \n\n161\\ 61\\ 6");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str10, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str14, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37780");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aaaaaaaaaaa...616161616161616161616161", "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37781");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111", "400u\\00U\\3200U\\", 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37782");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                   0##                                                  ", 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37783");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", "\\                                                u                                                005                                                c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\U00685555555555555555555555555555555555555555555555555555555555555555555555", (int) 'C');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", "                                                                                                                                                                                                                   1\\61\\6161\\61\\6161\\61\\6161\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu " + "'", str2, " 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
    }

    @Test
    public void test37786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "23AAAAAAAAAAAAA0u0A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa", "3333361                                         \n\n133323\\U                                                                                             3333361                                         \n\n1333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 263, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37789");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                 \\u0023                                                                                     hi!hi!hi!  ", "020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37790");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", (java.lang.CharSequence) "1h!1020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u002");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", charSequence2, "u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test37791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...3\\u0023\\u00231\\40032", " 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116", "     8     8     8     8   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...3\\u0023\\u00231\\40032" + "'", str3, "...3\\u0023\\u00231\\40032");
    }

    @Test
    public void test37792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37792");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("6                                     ", "...                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23hi!hi!hi!", "        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    ", 29);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...", 296, "             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                                      200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32              " + "'", str3, "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                                      200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32              ");
    }

    @Test
    public void test37795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("uuuuuuuuuuuu 3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUU 3200U" + "'", str1, "UUUUUUUUUUUU 3200U");
    }

    @Test
    public void test37796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", 65, "\\aua005aca\\aua0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00" + "'", str3, "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
    }

    @Test
    public void test37797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37797");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                     ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test37798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("75", "3\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "75" + "'", str2, "75");
    }

    @Test
    public void test37799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37799");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  2   ", "                                                  75", (int) (short) 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test37800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37800");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   ", "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("8     8     8     8     8     8     8     8  8     8     8     8     8     8     8    ", 136, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37803");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...      \n\n1           ...                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37804");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1161\\", "AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test37805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37805");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str2, "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test37806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37806");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", 53);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ###", 543, 255);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test37807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37808");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("23\\u0023\\u0023          3    23\\u0023\\u0023      ", "111111116 \\16 \\16 \\16 \\16 \\16", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37809");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", "\\u0075", (int) (byte) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\n\n");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '6', 86, 70);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str5, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test37810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "55555555555", 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test37811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37811");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\r\r\r\r\r\r", (java.lang.CharSequence) "11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.1111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 243 + "'", int2 == 243);
    }

    @Test
    public void test37812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37812");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("3200u\\3200");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37813");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\  6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6", '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test37814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37814");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u\\" + "'", str1, "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u\\");
    }

    @Test
    public void test37816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37816");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("16u", 156);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16u" + "'", str2, "16u");
    }

    @Test
    public void test37818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37818");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("111111111111111111111U", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void test37819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37820");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...11111111111111111111111111111111111111111111111111111111", "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...11111111111111111111111111111111111111111111111111111111" + "'", str2, "...11111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test37822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", 260, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test37823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#6666\r\r\r\r\r\r\r##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023" + "'", str1, "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test37825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37825");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\nu002                                         \n\n1                                        ", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37826");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\", 'I');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test37827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37827");
        char[] charArray6 = new char[] { ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023                                            ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   u61    ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaaaaaaaaaaa\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test37828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37828");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 60, 930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       " + "'", str2, "...       ");
    }

    @Test
    public void test37830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                         ", 189, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37832");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "023\\U0023\\U0023\\U0023    ", 25);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          aaaaaaa       ", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 25 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test37833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("i!         ", 245);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.", 122, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.###################" + "'", str3, "\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.###################");
    }

    @Test
    public void test37835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37835");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u005c\\u00");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1aaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      6\\16");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#u#005#c##u#00" + "'", str5, "#u#005#c##u#00");
    }

    @Test
    public void test37836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37836");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                u                                                ", "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37838");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaa                             ", "  2   ", 104);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                           \\\\0033005");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaa                             " + "'", str4, "aaaaaa                             ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaa" + "'", str6, "aaaaaa");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test37839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37839");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test37840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1", "                                                     23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "\\U0075");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n1" + "'", str3, "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n1");
    }

    @Test
    public void test37841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37841");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("222222222222222222222222222222222222222222222u                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...", 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37842");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hhhhhhhhhhhhhuuuuuuu", (java.lang.CharSequence) "uuuuuuuuuaaaaaaa       3200u\\32033333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hhhhhhhhhhhhhuuuuuuu" + "'", charSequence2, "hhhhhhhhhhhhhuuuuuuu");
    }

    @Test
    public void test37843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37843");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "U00234                                      \\U0023\\U00\\U0                    ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37844");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37845");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666666666666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test37846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37846");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 " + "'", charSequence2, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ");
    }

    @Test
    public void test37847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37847");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444", 192, 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444" + "'", str3, "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
    }

    @Test
    public void test37848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     ", 255, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "555555555555555555555555555555555555555555555555555555555555555555555555555555555\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     5555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "555555555555555555555555555555555555555555555555555555555555555555555555555555555\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     5555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test37849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37849");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 61", strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0020", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
    }

    @Test
    public void test37850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37850");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (short) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test37851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Aaaaaaaaaaa...", "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222AAAAAAAAAAAAA U 6AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa..." + "'", str2, "aaaaaaaaaa...");
    }

    @Test
    public void test37852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37852");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str1, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test37854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37855");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!", "###", 55);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test37856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37856");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("1        61        615c    61        61        61", "161\\16161\\161");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test37858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "1111111111123\\U                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("1111111166662222222222222222222222222222222221111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111166662222222222222222222222222222222221111111" + "'", str1, "1111111166662222222222222222222222222222222221111111");
    }

    @Test
    public void test37860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37860");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u005c\\u00666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100666666666666666666666100023\\u0023", "                                                                                                                     ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37862");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\222223200U\\1400u\\00U\\3200U\\22222", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37863");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("00u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaa", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test37864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37864");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0063");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37866");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '1', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test37867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37868");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6" + "'", str1, "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
    }

    @Test
    public void test37869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37869");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61", (java.lang.CharSequence) "uuuuuuuuuuU6uuuuuuuuuuu                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 203 + "'", int2 == 203);
    }

    @Test
    public void test37870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37870");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37871");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                 ...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                            uuuuuuuuuuuuuuuuuu", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuu" + "'", str2, "uuuuuuuuuu");
    }

    @Test
    public void test37873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37873");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...        75                                                                                                                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 139 + "'", int4 == 139);
    }

    @Test
    public void test37874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                           Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\" + "'", str1, "Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
    }

    @Test
    public void test37875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" 6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ", "   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     " + "'", str2, "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     ");
    }

    @Test
    public void test37876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37876");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Uu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "...  u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37877");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("U0023                                            ", 117, "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U0023                                            66666666666666666666666666666666666666666666666666666666666666666666" + "'", str3, "U0023                                            66666666666666666666666666666666666666666666666666666666666666666666");
    }

    @Test
    public void test37878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37878");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "3\\U                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("       aaaaaaa          ", 370, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaa          " + "'", str3, "...aaaaaa          ");
    }

    @Test
    public void test37880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("UUuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UU" + "'", str3, "UU");
    }

    @Test
    public void test37881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("UUUUUUUUUUUU 3200U", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUU 3200U" + "'", str2, "UUUUUUUUUUUU 3200U");
    }

    @Test
    public void test37882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str2, "16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test37883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("6\\ 6\\6uuuuuuuuuuuuuuuuuuuuuuuuuu", 250, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "                                                        0U\\                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str2, "UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test37885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
    }

    @Test
    public void test37886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", 518);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                            \\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###                                                                                                                             " + "'", str2, "                                                                                                                            \\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###                                                                                                                             ");
    }

    @Test
    public void test37887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("777777777777777777777777777777777777777777    61    7777777777777777777777777777777777777777777", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("I!                                                                                   ", "u6      61        61        61        6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                   ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37890");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ", 82, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("10hi!10010hi!10010h\\400310hi!10010hi!10010hi", "3\\U                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\U                      " + "'", str2, "3\\U                      ");
    }

    @Test
    public void test37892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37892");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\61\\61\\61\\61\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37893");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("111111111111111111111u61111111111111111111111123\\U                                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111111111111111111u61111111111111111111111123\\U                                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "111111111111111111111u61111111111111111111111123\\U                                        AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("UU03UUU03", "   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu..." + "'", str2, "61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test37896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37896");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u", 18);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37897");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023                                                                                     ", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test37898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 6\\\\U0020 6\\\\U0020 6              " + "'", str1, "...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 6\\\\U0020 6\\\\U0020 6              ");
    }

    @Test
    public void test37899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                   ...", 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   ..." + "'", str2, "                   ...");
    }

    @Test
    public void test37900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37900");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 43, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37901");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37902");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\", "1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37903");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAA15AAAA", "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("u0023\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222" + "'", str1, "u0023\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test37905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37905");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...                                 ", "u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 563, 245);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                                 u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str4, "...                                 u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test37906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37906");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", "                                                                                                 ", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37907");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("               aaaaaaaaaaaaa3200\\a                                 ", "                   0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test37908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37908");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61", "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", (int) (byte) 10);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\U002322222", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     \\0023\\00\\u0041\\0023     ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " 61" + "'", str7, " 61");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 61" + "'", str9, " 61");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test37909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37909");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("11111111111111111111111111222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37910");
        char[] charArray5 = new char[] { ' ' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023                                            ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test37911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                 \\uhi!hi!hi!                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37912");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                           1\\u00234                                      \\u0023\\u00\\U0                    ..", (int) 'u');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test37913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37913");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ", "0020\\u0##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaa...", "\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0031\\u0\\\\0020        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaa..." + "'", str2, "...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaa...");
    }

    @Test
    public void test37915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37915");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                         \n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", (java.lang.CharSequence) "......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37916");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", " 61\\\\u002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             ", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 105");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaa      " + "'", str6, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test37917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...    ...uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37918");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...11111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37919");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u005c", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                                                 2  ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "0\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u005c" + "'", str8, "\\u005c");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u005c" + "'", str9, "\\u005c");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test37920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37920");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0020");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("1111111111111111111111111111", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\1111111111111111111111111111u11111111111111111111111111110020" + "'", str7, "\\1111111111111111111111111111u11111111111111111111111111110020");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0020" + "'", str11, "\\u0020");
    }

    @Test
    public void test37921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323", 11, '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323" + "'", str3, "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323");
    }

    @Test
    public void test37922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "6161...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("666u6", 0, 288);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "666u6" + "'", str3, "666u6");
    }

    @Test
    public void test37924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", "                                                                                               555555555555555                                                                                               ", "                                                                                                                             0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37925");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37926");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                                      200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37927");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30\\\\\\\\30uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '3' + "'", char1 == '3');
    }

    @Test
    public void test37928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37928");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032", "\\      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaa", 48);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                           \\\\0033005c", "U0023                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           \\\\0033005c" + "'", str2, "                                           \\\\0033005c");
    }

    @Test
    public void test37930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test37931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("a         ", "        #######    61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37932");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U002322222", "...U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U...", 96);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("23i23i23i23iui31i23i23i23i23", "6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "", "1\\ 61\\ 6");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37935");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "", (int) 'h');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test37936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA..." + "'", str2, "      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...      AAAA...");
    }

    @Test
    public void test37937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37937");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6", "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068", (int) '2');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("    UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU    ", "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U" + "'", str2, "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
    }

    @Test
    public void test37939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("c5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c5" + "'", str1, "c5");
    }

    @Test
    public void test37940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055" + "'", str2, "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055");
    }

    @Test
    public void test37941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37941");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37942");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0055", "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test37944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37944");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                    \\4   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37945");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    ", "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0uAAAAAAAAAAAA  6  6  6  6  6  uuu", "uuu0023                                            ", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    " + "'", str4, "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test37946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37946");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                    \n                     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "6666666666666666666666666666666666666666666666666666622222\\U0023\\U00\\u0041\\U002322222                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37947");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "CCC                              23\\u0023\\u0023\\u0023\\UCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37948");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                         \n\n1                                                    \n\n", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test37949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "023AAAA51AAAA0023AAAA51AAAA0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ", (int) 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     " + "'", str2, "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ");
    }

    @Test
    public void test37951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37951");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", '6');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test37952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("U6", "6\\\\u0020");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37953");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                               i!                                                                                                                                                                                                                  ", 7, 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                   ..." + "'", str3, "...                                                                                                   ...");
    }

    @Test
    public void test37954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000", 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     ...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000" + "'", str2, "                                                     ...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
    }

    @Test
    public void test37955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002" + "'", str1, "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
    }

    @Test
    public void test37956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37956");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                     ...", "111", 177);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37957");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("U0023\\U002375757575757575757575757575757575757575757575757575757575", 563, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37958");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777776\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666", "   U61    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37959");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    " + "'", str3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ");
    }

    @Test
    public void test37960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37960");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32          aaaaaaa       u61\\61\\61\\61\\61\\", 177);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37961");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test37962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "U00234                                      \\U0023\\U00\\u0                    ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                     61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                     61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37964");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '6', 30, 173);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 136");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "2\\u005c                                               ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2\\u005c                                               ..." + "'", str1, "2\\u005c                                               ...");
    }

    @Test
    public void test37966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37966");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##0U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n###");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                       AAAAAAAAAAAAA3200u\\A                                      ", "\n     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       AAAAAAAAAAAAA3200u\\A                                      " + "'", str2, "                                       AAAAAAAAAAAAA3200u\\A                                      ");
    }

    @Test
    public void test37968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", 349, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ " + "'", str3, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                  \\u0023\\u0023\\u061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
    }

    @Test
    public void test37969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37969");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAA\\20UUU\\20UUU\\20UUU\\                                               ", "                AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                 ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 172 + "'", int4 == 172);
    }

    @Test
    public void test37970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "00u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000", 263, '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str3, "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
    }

    @Test
    public void test37972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0AAAAAAAAAAAAAAAAAAAAAAAC5AAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                             6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "000u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37973");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00", "...                             AAAA15AAAA                                 AAAA15AAAA               ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37974");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.substringsBetween("", "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ", " 61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa             U0023\\U002U0023\\U002U0023\\U002U0             U0023\\U002U0023\\U002U0023\\U002U0             U0023\\U002U0023\\U002U0023\\U002U0             U0023\\U002U0023\\U002U0023\\U002U0        ", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                             6u623\\U", strArray5, strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                             6u623\\U" + "'", str9, "                                                                             6u623\\U");
    }

    @Test
    public void test37975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", (int) (short) 0, "\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    " + "'", str3, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
    }

    @Test
    public void test37976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu61uuuuuuuuuuuuuuuuuu3\\u0...\\u00" + "'", str1, "      3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu61uuuuuuuuuuuuuuuuuu3\\u0...\\u00");
    }

    @Test
    public void test37978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37978");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u61uuuuuuu", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23                                               ...", charArray6);
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
    public void test37979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37979");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23                                                                                     hi!hi!hi!", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("   61        61                                                       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test37980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37980");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 a", "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37981");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                                                                                                   ");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test37982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16", "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("23\\u0023\\u...                                   UUUUUUUUUUUUUUUUUUUUU", "...h    h...                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h...", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37985");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2 2 2 2 4444444444444 1 1", "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h... ", 227);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37986");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("222222222222222222222222222222222222222222222222222222222222222222222222222222 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              2222222222222222222222222222222222222222222222222222222222222222222222222222222", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test37987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626" + "'", str1, "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626");
    }

    @Test
    public void test37988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37988");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...3u6              aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37989");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "666666      66666", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37990");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0032", "75", "6...0000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0032" + "'", str3, "\\u0032");
    }

    @Test
    public void test37991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U", "16U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U" + "'", str2, "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U");
    }

    @Test
    public void test37992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!", "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37993");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666................U0023                                            ................", "43\\0043\\0043\\0043\\0043\\0043\\0043\\0043U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ", "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             " + "'", str2, "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ");
    }

    @Test
    public void test37995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37995");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test37996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\\iui2\\4\n\n", "222222222222222222222222222222222222222222222u6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\iui2\\4\n\n" + "'", str2, "\\iui2\\4\n\n");
    }

    @Test
    public void test37997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37997");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                               !ih!ih!ih", "004");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                            5a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u" + "'", str2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u");
    }

    @Test
    public void test38000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test38000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ", "\\u003");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU " + "'", str2, "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ");
    }
}

