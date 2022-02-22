import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest76 {

    public static boolean debug = false;

    @Test
    public void test38001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38001");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\", "####AU", (int) '2');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\" + "'", str4, "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\");
    }

    @Test
    public void test38002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38002");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0", ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0" + "'", str2, "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test38004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                         ..", 33, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         .." + "'", str3, "                                                         ..");
    }

    @Test
    public void test38005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38005");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38006");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u0023                                            ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "#", 115, 105);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test38007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38007");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa      ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U6663\\u6623\\u6623\\u6623\\u6623\\u6623UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu662", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test38008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                  75", 'I', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  75" + "'", str3, "                                                  75");
    }

    @Test
    public void test38009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\" + "'", str1, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
    }

    @Test
    public void test38010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", 148);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                            " + "'", str2, "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                            ");
    }

    @Test
    public void test38011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa", "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666", "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666" + "'", str3, "666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666");
    }

    @Test
    public void test38013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38013");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 'A');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("55555555555                                  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61", 115);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38016");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0023");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u0023" + "'", str6, "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u0023");
    }

    @Test
    public void test38017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ", 135, (int) 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               " + "'", str3, "...0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ");
    }

    @Test
    public void test38018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38018");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                 cccccccccccccccccccccccccccccccccc\n     ", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38019");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\\\\\\\\\\\\\\\\\\\...hh...", "11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111", 72);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38020");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\U 1", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38021");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0\\u0020\\u000\\u0020\\u000\\u0020161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("cccccccccccccccccccccccccccccccccccccccccccccccccccccc", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test38022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("23 U  23 U", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("41");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "41" + "'", str1, "41");
    }

    @Test
    public void test38024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...............................................................................\\u0034", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".............................." + "'", str2, "..............................");
    }

    @Test
    public void test38026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38026");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                        \\u003 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700", 'C', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700" + "'", str3, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700");
    }

    @Test
    public void test38028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38028");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3u61\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38029");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c\\u00", "                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U..." + "'", str2, "\\U0023\\U...");
    }

    @Test
    public void test38031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38031");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ", 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa", "1\\U00234                                      \\U0023\\U00\\u", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa" + "'", str3, "aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa");
    }

    @Test
    public void test38033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           ", "                                                                                             U23");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           " + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                           ");
    }

    @Test
    public void test38034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38034");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...                                    ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("3232323232323                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3232323232323                                                 " + "'", str1, "3232323232323                                                 ");
    }

    @Test
    public void test38036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "3200U\\3200U\\\\i\\3200U\\3200U\\3", "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                     23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "...      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38038");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  ", "                                                                                                        aaaaaaa     ", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38040");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38042");
        char[] charArray11 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("aaaa                                                 ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("!ih!ih!ih   2    2    2    2    2    2    2    2    2  ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test38043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38044");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u", "                                                                                        iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38045");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "A000u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\U0043");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", "UUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "u003aaaaaa                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 17, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38050");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ", 161, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       " + "'", str3, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test38051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38051");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\4", 54, 157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38052");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaa3aaaaaaaaaaaaaaaaaaaaaaaaaa", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "22222222222222222222222222222222222222241");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38054");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\......A000u\\", "2 2 2 2 4444444444444 1 1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38055");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("........................................................................................1111111     ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test38056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38056");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("22222\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023..." + "'", str2, "22222\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...");
    }

    @Test
    public void test38057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38057");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test38058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 84, 520);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38059");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("33", "AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38060");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6", 14, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6" + "'", str3, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
    }

    @Test
    public void test38061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38061");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'C', 288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288 + "'", int2 == 288);
    }

    @Test
    public void test38062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38062");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("2                                        uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \n\n1                                                                                                                               ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", 460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38063");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                      u003                    ", "55555555555", "\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U                                            ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38064");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38065");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("3200u                            aaaaaaaaaaaaa3200\\a", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38066");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61\\\\U0020", (java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("U0023\\u0... U", "5555555\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38068");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...                                                                                                                 ", (int) '7', 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            " + "'", str3, "                            ");
    }

    @Test
    public void test38069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38069");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23A23A23A23AuA31A23A23A23A23", "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38070");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  2   ", "41AAAAAAAA");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("                              11111                             ", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2" + "'", str6, "2");
    }

    @Test
    public void test38071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38071");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                                     ...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38072");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 6, 155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                     UUUUUUUUUU...                                                                                     ", '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     UUUUUUUUUU...                                                                                     " + "'", str2, "                                                                                     UUUUUUUUUU...                                                                                     ");
    }

    @Test
    public void test38075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38075");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "......A000u\\                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test38076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38076");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("2", "         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", 245);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38078");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test38079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                ", "10hh!10hh1!10hh1!10hh1!1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38080");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\\\0020", "65                                  5a", 7, 94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\002065                                  5a" + "'", str4, "\\\\002065                                  5a");
    }

    @Test
    public void test38081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("   ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   ." + "'", str1, "   .");
    }

    @Test
    public void test38082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) " 61\\\\u0020                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "  ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38084");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u", "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777", "UUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38086");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'c', 88, 41);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("...6\\66\\6\\66\\6\\66\\6\\6           \\u0\\u005                                                                                          \\u0\\u005", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test38087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...", '2', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h..." + "'", str3, "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
    }

    @Test
    public void test38088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0063");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38089");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\u0068", "IIIIIIIIII0023\\u0...IIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test38090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaa...", "                                                                                                                                                            000000000000000000000000000000...             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaa...");
    }

    @Test
    public void test38092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...000000000000000000000000000000000000000000000000000000000000...", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ...000000000000000000000000000000000000000000000000000000000000..." + "'", str2, "           ...000000000000000000000000000000000000000000000000000000000000...");
    }

    @Test
    public void test38093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032" + "'", str2, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
    }

    @Test
    public void test38094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                      \\U0023\\U00\\u0                    ..4                           1\\U0023", "575#u##u7\\###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      \\U0023\\U00\\u0                    ..4                           1\\U0023" + "'", str2, "                                      \\U0023\\U00\\u0                    ..4                           1\\U0023");
    }

    @Test
    public void test38095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38095");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0043", "...hhhhhhhhhhhhhhhhhhhhhU61hhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...                                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                 ..." + "'", str1, "...                                 ...");
    }

    @Test
    public void test38097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38097");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 936, (int) 'i');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38098");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         \n\n1                                         ", "                                       aaaaaaaaaaaaa\\\\\\", 2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                         \n\n1                                         " + "'", str4, "                                         \n\n1                                         ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test38099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("23\\U0023\\U...                                   ", "61  \\\\0020                                                                                 \\  \\\\0020                                                                                 uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\U0023\\U...                                   " + "'", str2, "23\\U0023\\U...                                   ");
    }

    @Test
    public void test38100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38100");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) '\\');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\  6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6" + "'", str1, "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
    }

    @Test
    public void test38102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38102");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\r', 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test38103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str1, "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test38104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Aaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       aaaaaaA" + "'", str1, "       aaaaaaA");
    }

    @Test
    public void test38105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61\n", 10, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55561\n5555" + "'", str3, "55561\n5555");
    }

    @Test
    public void test38106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38106");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                         U0023\\U002U0023\\U002U0023\\U002U0", "   00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", (int) '.');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0");
    }

    @Test
    public void test38107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38108");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U003 ", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111", "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111" + "'", str2, "11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38110");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262 + "'", int2 == 262);
    }

    @Test
    public void test38111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0000000000000000000000000000000000000000000000000\\u0037", (int) '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0037" + "'", str2, "\\u0037");
    }

    @Test
    public void test38112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38112");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U0023", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "22222222222222222222222222222222222222241AAAAAAAA", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray16);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 39 + "'", int26 == 39);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test38113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi", "aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi" + "'", str2, "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi");
    }

    @Test
    public void test38114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38114");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                             23\\u###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u", "1111111111111                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                              11111                                ", " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                         ...0023h\\huh0023h\\huh0023h                            ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38117");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        ", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 85 + "'", int4 == 85);
    }

    @Test
    public void test38118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "###\n\\u002                                         \n\n1         1        61   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38119");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                      A\\u0023AAAAAAAAAAAAA                                       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38120");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                       ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("...0023h\\huh0023h\\huh0023h                            ...            ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test38121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38121");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("111111111111111111111111111111111111111111111111111                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38122");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "     ", (java.lang.CharSequence) "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", charSequence2, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test38123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "  ......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("23     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...     32" + "'", str1, "...     32");
    }

    @Test
    public void test38125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38125");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...                                                                                                                                                                                                                                   " + "'", str1, "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test38126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6" + "'", str1, "1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6");
    }

    @Test
    public void test38127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c..\\u5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c..\\u5" + "'", str1, "\\c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c\\u5c..\\u5");
    }

    @Test
    public void test38128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("UUUUUUUUUUu6UUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUU6uUUUUUUUUUU" + "'", str1, "UUUUUUUUUUU6uUUUUUUUUUU");
    }

    @Test
    public void test38129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38129");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          ", (java.lang.CharSequence) "\\\\U0023\\U0023...i\\\\U0023\\U0023    3\\U0023\\U0023\\i1\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                             \\u0069                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "\\u0023\\u\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38131");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U003", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "U" + "'", str5, "U");
    }

    @Test
    public void test38132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38132");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      ", (java.lang.CharSequence) "\n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", charSequence2, "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test38133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("3200u\\3200u\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200u\\3200u\\3200", "5555555                     ..");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test38134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38134");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('c', 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262 + "'", int2 == 262);
    }

    @Test
    public void test38135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38135");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "6\\\\u0020", (java.lang.CharSequence) "533333333333333333333333333333\\40032333333333333333333333333333333C");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "6\\\\u0020" + "'", charSequence2, "6\\\\u0020");
    }

    @Test
    public void test38136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38136");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("6666\r\r\r\r\r\r\r", "...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 563);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666\r\r\r\r\r\r\r" + "'", str3, "6666\r\r\r\r\r\r\r");
    }

    @Test
    public void test38137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                     ...", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     ..." + "'", str2, "                                                                                     ...");
    }

    @Test
    public void test38138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38138");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "                   \\u0037                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38139");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("U0023\\u0..  6\\\\u0020                                                              ", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38140");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("41                                                                                        ", 25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38141");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\u23\\u23\\u23\\u23\\u23\\u23\\u23");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u23\\u23\\u23\\u23\\u23\\u23\\u23" + "'", str1, "\\u23\\u23\\u23\\u23\\u23\\u23\\u23");
    }

    @Test
    public void test38143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38143");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("000000000000000000000000000003200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A800000000000000000000000000000", 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38144");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", 107, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38145");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ", "                                    ................U0023                                           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("111111111111111111111u61111111111111111111111123\\U                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111111111111111111u61111111111111111111111123\\U" + "'", str1, "111111111111111111111u61111111111111111111111123\\U");
    }

    @Test
    public void test38147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u", "\\U003 111 ", "323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u" + "'", str3, "00000000000033u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u33233u3\n06u");
    }

    @Test
    public void test38148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...............................................................................\\u0034", "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "00u\\0200u\\0200u\\0200u\\\n16u    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00u\\0200u\\0200u\\0200u\\\n16u    " + "'", str1, "00u\\0200u\\0200u\\0200u\\\n16u    ");
    }

    @Test
    public void test38150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "...6666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str2, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test38151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38152");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...", "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38153");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("I!                                                                                   u003                          ", "                                                   0##                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38155");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  \\                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  \\", "                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38156");
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
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...", charArray19);
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
    public void test38157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38157");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 118);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 118 + "'", int2 == 118);
    }

    @Test
    public void test38158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38158");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023                                                   ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#################################################\n\n\n\n\n\n\n\n\n\n\n\n\n\n", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38159");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('h', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test38160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38160");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ", '5');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("..............................................", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test38161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....       ", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....       " + "'", str2, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....       ");
    }

    @Test
    public void test38162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222222222222222222222222222222" + "'", str1, "222222222222222222222222222222222");
    }

    @Test
    public void test38163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38163");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u0023\\u00\\U0041\\u", (java.lang.CharSequence) " 61\\ 61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test38164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaa", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa" + "'", str2, "aaaa");
    }

    @Test
    public void test38165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38165");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '6');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray11, strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray11);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "   u61    ");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray11);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "Hi!hi!hi!");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..", strArray4, strArray11);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 55 + "'", int5 == 55);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u" + "'", str7, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str17, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.." + "'", str24, "uuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test38166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38166");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38167");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u005555555555222222222222222222222222222222222222222222222u6                                          5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u0055555555555", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "10HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\10HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI!10010HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("23AAAAAAAAAAAAA0u0A", '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23AAAAAAAAAAAAA0u0A" + "'", str2, "23AAAAAAAAAAAAA0u0A");
    }

    @Test
    public void test38170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0" + "'", str2, "Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0");
    }

    @Test
    public void test38171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA", " 11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA" + "'", str2, "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA");
    }

    @Test
    public void test38172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38172");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\U005C                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38173");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                 ", 33, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 69");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38175");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("11111111111111111111 111111111111111111111", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38176");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU... 61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161########61########61########61########61########61########61########61########61########61########61########61########61###61#####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test38177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38177");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38178");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                   0##                                                  ", "111111U1111111##############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38179");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u003aaaaaa                                             ", 268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38180");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... \\\\\\aaaaaaaaaaaaA\\16 ", "                                      \\u0023\\u00\\u0041\\u0023", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38181");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa", "23\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test38182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("555555555555555555555555555555555555555555555555555555  ......  61555555555555555555555555555555555555555555555555555555  ......  \n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n  ......  55555555555555555555555555555555555555555555555555555516  ......  555555555555555555555555555555555555555555555555555555" + "'", str1, "\n  ......  55555555555555555555555555555555555555555555555555555516  ......  555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test38183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "... AAAA15AAAA AAAA15AAAA ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38184");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 433);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38185");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test38186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38186");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38187");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "1111111");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str8, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "11111111111111111111 111111111111111111111", (java.lang.CharSequence) "                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u" + "'", str2, "                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
    }

    @Test
    public void test38190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38190");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ", "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 84);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 370, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            " + "'", str4, " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test38191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38191");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38192");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38193");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                            aaaaaaaaaaaaa3200\\a                                 ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test38194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38194");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38196");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...1...                                    ", 497, 227);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("16\\U0061", "4141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16\\U0061" + "'", str2, "16\\U0061");
    }

    @Test
    public void test38198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38198");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 97);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################" + "'", str5, "\\\\\\################################################\\\\\\\\\\\\61\\\\\\############################");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\\\\\\\\\\\61\\\\\\" + "'", str6, "\\\\\\\\\\\\\\\\\\61\\\\\\");
    }

    @Test
    public void test38199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38199");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 61", (int) '\r');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '3', 80, 191);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38200");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...3200U\\3200U\\\\i\\3200U\\3200U\\3    3200U\\3200U\\\\i\\3200U\\3200U\\3...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (java.lang.CharSequence) "1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 650 + "'", int2 == 650);
    }

    @Test
    public void test38201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38201");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA111111111111111111111u6111111111111111111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("AAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38203");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaa      ", "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 28);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test38204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38204");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("161\\161\\161\\161\\161\\161\\U6                      \n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test38205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38205");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0023\\u00   ..\\u0023\\u00", 138, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38206");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "55          aaaaaaa       CCCCCCCCCCCCCCCC");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55          aaaaaaa       CCCCCCCCCCCCCCCC" + "'", str1, "55          aaaaaaa       CCCCCCCCCCCCCCCC");
    }

    @Test
    public void test38207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("2                                         \n\n1", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2                                         \n\n1" + "'", str2, "2                                         \n\n1");
    }

    @Test
    public void test38208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38208");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("001!IH0...", "\\16 ", (int) 'U');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38210");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                         111111111111111111111U6111111111111111111111                         ", "       11111111111111..", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("20\\U0020\\U0020\\U0020\\U00", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00" + "'", str2, "20\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
    }

    @Test
    public void test38212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test38213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("61\n", "...111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\n" + "'", str2, "61\n");
    }

    @Test
    public void test38214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\" + "'", str3, "\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
    }

    @Test
    public void test38215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223", "23\\U                         ", 227);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223" + "'", str3, "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223");
    }

    @Test
    public void test38216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\uccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "  \\U005C  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38217");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("......", "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38218");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555##############################################.16 5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10555555555555555555555555555555555555555555555555555", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                      3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38220");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ", 19, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test38221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                              23\\u0023\\u0023\\u002                                                       ", "U003aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              23\\u0023\\u0023\\u002                                                       " + "'", str2, "                              23\\u0023\\u0023\\u002                                                       ");
    }

    @Test
    public void test38222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38222");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("000000000000000000000000000000", 9, 667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38223");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                              #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###                                                                                     ", "161\\161\\161\\161\\161\\161\\U6                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6", 433, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 237);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test38226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38226");
        char[] charArray10 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("0023", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test38227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38227");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "5700u\\", 130, 118);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test38228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38228");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU... 61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38229");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaa", "                   \\u0023\\u0023\\u0023\\u0023\\u0023\\u                   ", 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\0023\\0023\\0023\\0023\\0023\\0023\\0023...", 130, "U002322222");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U0\\0023\\0023\\0023\\0023\\0023\\0023\\0023..." + "'", str3, "U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U0\\0023\\0023\\0023\\0023\\0023\\0023\\0023...");
    }

    @Test
    public void test38231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38231");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  2     2     2     2     4444444444444  1    1 ", "0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("023\\u0023aaaaaaa", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U" + "'", str2, "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
    }

    @Test
    public void test38234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\UUU02\\... 3hi!hi!hi!", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000", 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\UUU02\\... 3hi!hi!hi!" + "'", str3, "\\UUU02\\... 3hi!hi!hi!");
    }

    @Test
    public void test38235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38235");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  \n\n1                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test38236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("5...", "61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUA\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5..." + "'", str2, "5...");
    }

    @Test
    public void test38237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38237");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...                           ...0023h\\hh0023h\\hh0023h                            ...", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str1, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test38239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38239");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                             a   ", "\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAA                            ", "\\U0023\\U00\\U0041\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ", 369, 685);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           " + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ");
    }

    @Test
    public void test38242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("               3200", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               3200" + "'", str2, "               3200");
    }

    @Test
    public void test38243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38243");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("400u\\00U\\3200U\\", "             \\u0023\\u00\\U0041\\u              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38244");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAA...", 167, 566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U..." + "'", str1, "...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U...");
    }

    @Test
    public void test38246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777" + "'", str1, "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38247");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" \\u003 ", "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      ", "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020", 71);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " \\u003 " + "'", str4, " \\u003 ");
    }

    @Test
    public void test38248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("A\\u0023AAAAAAAAAAAAA", 297);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38249");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "    u0034                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38250");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ", "444444444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test38251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38251");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\61\\61\\61\\61\\61\\61" + "'", str1, "\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test38253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38253");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111", "111111111111111111111U6111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38254");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0023\\00023\\00023\\ U", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666");
    }

    @Test
    public void test38256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 191, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\U005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323", (java.lang.CharSequence) "                     ......  7777777777777777777777777777777777777777777777777777777777777777777777761\\                     ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                 A                                                                                             ", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 A                                                                                             " + "'", str2, "                                                                                                 A                                                                                             ");
    }

    @Test
    public void test38259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023  h\\huh0023");
    }

    @Test
    public void test38260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38260");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\n\n1                                                    \n\n1                                  61\\", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38262");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38263");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1\\ 61\\ 6 ", " 61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61", 367);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "5544u4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38265");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u", "3200U\\3200U\\\\i\\3200U\\3200U\\3");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa26");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "62aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "62aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test38267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38267");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#################################################", "222222222222222222222222222222222222222222222222222111111111aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38268");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aa                                          ", "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38269");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075", '.');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075" + "'", str3, "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
    }

    @Test
    public void test38270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38270");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("\\u005c", '#');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                                                                                                 2  ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aaaaaaa      ", strArray2, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 171 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u005c" + "'", str11, "\\u005c");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\u005c" + "'", str12, "\\u005c");
    }

    @Test
    public void test38271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("66666666666666666666666666666666666666666666666666666AAAAAAA     U   3U    41U   3     ", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuu3200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "66666666666666666666666666666666666666666666666666666AAAAAAA     U   3U    41U   3     " + "'", str2, "66666666666666666666666666666666666666666666666666666AAAAAAA     U   3U    41U   3     ");
    }

    @Test
    public void test38272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38272");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Aaaa", " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38273");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("UUU6  6  6  6  6", "6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test38275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                     222222222222222222222222222222222222222222222222222222                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222222222222222222222222222222222222222222222222222" + "'", str1, "222222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test38276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38276");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test38277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("U\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "u\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test38278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAA", "  ......  \\u00410023\\U0023\\U0023\\U0023\\U0023\\U001\\u0041\\u006666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38279");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ", "                       \\U0023\\U00\\u0041\\U                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                      u\\32");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\32" + "'", str1, "u\\32");
    }

    @Test
    public void test38281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\61", "33333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c533333333333333333333333333333\\40032333333333333333333333333333333c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\61" + "'", str2, "\\61");
    }

    @Test
    public void test38282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38282");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38283");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111161\\", "0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057                                                                                                                             1\\u0030UuU\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38284");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("77777777777777777777777777", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38285");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                          \\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test38286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ", "                                AAAAAAAAAAAAAAAAAAAA                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             " + "'", str2, "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ");
    }

    @Test
    public void test38287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\U0023\\U00\\U0041\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("22222222222222222222uuu0023                                            222222222222222222222", "0023U6                                       u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222222222222222222uuu0023                                            222222222222222222222" + "'", str2, "22222222222222222222uuu0023                                            222222222222222222222");
    }

    @Test
    public void test38289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38289");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\U00u3\\16u3\\16u \\16 \\16 \\16 \\16 \\16  \\16u \\16 \\16 \\16 \\16 ", "22222222222222222222uuu0023 222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38290");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\", "\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 101, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
    }

    @Test
    public void test38292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U   ", 138);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U                                                                                                                                         " + "'", str2, "U                                                                                                                                         ");
    }

    @Test
    public void test38293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0023                                                                                     hi!hi!hi!                                                                                                         ", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 hi!hi!hi!                                                                                                         " + "'", str2, "                 hi!hi!hi!                                                                                                         ");
    }

    @Test
    public void test38294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38294");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "U0##########\\U0023\\4003U0023\\U\\U0023\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0##########\\U0023\\4003U0023\\U\\U0023\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023" + "'", str1, "U0##########\\U0023\\4003U0023\\U\\U0023\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023");
    }

    @Test
    public void test38296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38296");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\i\\");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("u61", '\\');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "\\u00c\\u00", (int) (short) 100, 28);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061" + "'", str11, "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061");
    }

    @Test
    public void test38297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38297");
        char[] charArray12 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U61", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U0023", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test38298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38298");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("3333333333333333333333333333333333                                                                             6u623\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333333333333333333333333333333333                                                                             6u623\\" + "'", str1, "3333333333333333333333333333333333                                                                             6u623\\");
    }

    @Test
    public void test38300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38301");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("U0023\\U002U0023\\U002U0023\\U002U0", "23\\U0023\\U...                                   ", (int) 'U');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        " + "'", str2, "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
    }

    @Test
    public void test38304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\" + "'", str1, "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
    }

    @Test
    public void test38305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\", "44444444444444444444423\\u0023\\u444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\" + "'", str2, "\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\");
    }

    @Test
    public void test38306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38306");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu", 92);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Aaaac11111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38309");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\", (java.lang.CharSequence) "###");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\" + "'", charSequence2, "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\163200u\\");
    }

    @Test
    public void test38310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38310");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "111111111111111111111111111111111111111111111...", (java.lang.CharSequence) "1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "111111111111111111111111111111111111111111111..." + "'", charSequence2, "111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test38311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38311");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       aaaaaaa          ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u6      61        61        61        61", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test38312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700", 729);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str1, "623\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U666\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test38314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "6  6  6  6  6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "UUU6 6 6 6 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAAAAAA", 213);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAA" + "'", str2, "AAAAAAAA");
    }

    @Test
    public void test38317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("2                                             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 563);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2                                             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str2, "2                                             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test38318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  ", 71, "                                                                                                     hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  " + "'", str3, "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  ");
    }

    @Test
    public void test38319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuu 3200u           ", "u0023\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222", "aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38321");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                           \\u003                                                                                                                                                                                                                                                            ", "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("3200", 28, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r3200" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r3200");
    }

    @Test
    public void test38323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("11111111111U0023#U0023#U0023#U0023#U0023#U0023#U0023", 113);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38324");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\2\\\\\\\\\\", "00000000    2222222222222222222222222222222220000000", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38325");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222AAAAAAAAAAAAA U 6AAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38326");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   \\u003 ", "61\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                     61\\\\u0020                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                     61\\\\U0020                                                                                                                     " + "'", str1, "                                                                                                                     61\\\\U0020                                                                                                                     ");
    }

    @Test
    public void test38328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ", "\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       " + "'", str2, "323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ");
    }

    @Test
    public void test38329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38329");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("..                    0u\\00U\\3200U\\                                      43200U\\1                                         ", "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u003\\u0023                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38331");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                   0041", "\\u0023\\u0023\\u0023\\u0023\\u0023\\16", "15 15 15 15 15 11111111");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\aa\\a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...AAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38335");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) ".\\16 ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
    }

    @Test
    public void test38336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38336");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "23\\u0023\\u...                                   UUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       ", 26, "HHHHHHHHHHHHH023\\U0023       AAAAAAAUUUUUUUUUHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       " + "'", str3, "61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       ");
    }

    @Test
    public void test38338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002" + "'", str2, "3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
    }

    @Test
    public void test38339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38339");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\\u0023AAAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "...23\\u0023\\u002375757575757575757575757575757575757575757575757575757575", "                                                                                                                                                            000000000000000000000000000000...             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test38341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38341");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111", "u  ......  \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ", "5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u005555555555222222222222222222222222222222222222222222222u6                                          5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u0055555555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111" + "'", str3, "\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111");
    }

    @Test
    public void test38343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38343");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                             ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38344");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "......A000u\\                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" 61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61" + "'", str1, "61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test38346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38346");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061", "3\\u0003\\u0111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38347");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUU61UUUU", "", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", "161\\161\\161\\161\\161\\161\\U6                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ", "...........................................\\u0023 hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...........................................\\u0023 hi!hi!hi!" + "'", str2, "...........................................\\u0023 hi!hi!hi!");
    }

    @Test
    public void test38350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("16161616161616161616161616", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16161616161616161616161616" + "'", str2, "16161616161616161616161616");
    }

    @Test
    public void test38351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38351");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38352");
        char[] charArray13 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5C", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("  \\U005C  ", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2U2U2U2U2U2U2U2U2U2", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test38353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38353");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055", (java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 271 + "'", int2 == 271);
    }

    @Test
    public void test38354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...6666666666666666666666666666666666666666666" + "'", str1, "...6666666666666666666666666666666666666666666");
    }

    @Test
    public void test38355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38355");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38356");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                         1\\U00234                                      \\U0023\\U00\\u0                    ..", 70, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         1\\U00234                                      \\U0023\\U00\\u0                    .." + "'", str3, "                                         1\\U00234                                      \\U0023\\U00\\u0                    ..");
    }

    @Test
    public void test38357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38357");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", "\\u0032                                                                       ", 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "", 136, 257);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 136");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38358");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\i\\                       61\n                       ", "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 271);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                         \n\n                                                     \n\n                                      ", "...3\\u23\\u23u6              c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38360");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '5', 173);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test38361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38362");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                             ", "\\u003                                                ", 55);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "0000000000000000000000000000000000000000000000000000000");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test38363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\" + "'", str2, "666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test38364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38365");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#6666\r\r\r\r\r\r\r##", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test38366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
    }

    @Test
    public void test38367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38367");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                            aaaaaaaaaaaaa3200\\a                                 ", "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ", 369);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38368");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "  \n\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "66666666666666666666666666666666666666666666666666666AAAAAAA     U   3U    41U   3     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("555555555555555555555555555555555555555555555555555555  ......  ", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "555555555555555555555555555555555555555555555555555555  ......  " + "'", str2, "555555555555555555555555555555555555555555555555555555  ......  ");
    }

    @Test
    public void test38371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ccccccccccccccccccccccccccccccccccccccccccccccccc 6...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38372");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "61.####################################################################################################", (java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "61.####################################################################################################" + "'", charSequence2, "61.####################################################################################################");
    }

    @Test
    public void test38373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   c                                           \\u005", "aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 16");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38374");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...3200U\\3200U\\\\i\\3200U\\3200U\\3    3200U\\3200U\\\\i\\3200U\\3200U\\3...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38375");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "u0023\\u002");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", charSequence2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test38376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("61  \\\\0020                                                                                 \\  \\\\0020                                                                                 uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 41, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  \\  \\\\0020                              " + "'", str3, "                                                  \\  \\\\0020                              ");
    }

    @Test
    public void test38377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 64, "uuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuu" + "'", str3, "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test38378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38378");
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
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA", charArray11);
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
    public void test38379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0020\\u0##", 173, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("U0023\\u0..  6\\\\u0020                                                              ", "                                               HUUU02HUUU02HUUU02HAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0..  6\\\\u0020                                                              " + "'", str2, "3\\u0..  6\\\\u0020                                                              ");
    }

    @Test
    public void test38381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38382");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\u005c", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '1');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test38383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38383");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38384");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u 6aaaaaaaaaaaaa", "                                                  75", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38385");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str1, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test38387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38387");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000", "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38388");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 349);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str4, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test38389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38389");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "7777777777777777777                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38391");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38392");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hhhhhhhhhhhhh", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "\\u0075");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("U61", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("2", "", 100);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray13, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray9, strArray13);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", strArray4, strArray13);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", 393, (int) 'U');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str19, "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          " + "'", str21, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test38393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("2uuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2UUUUUUUUUUUUUUUUUUUU" + "'", str1, "2UUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38394");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test38395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38395");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0", "    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", "    U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test38396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" 61..", "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u 6aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test38397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38397");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("         0000000000000000000000000000000000000000000000000\\U0037         ", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 96 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test38398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("IIIIIIIIIIIII...AAAA      ", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIII...AAAA      " + "'", str2, "IIIIIIIIIIIII...AAAA      ");
    }

    @Test
    public void test38399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38399");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "00000000000000000000");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                    3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test38400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", (int) '7');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ", "u0032\\u0032\\u0032\\u0032\\u0032\\u0032", 116);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38402");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '.');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\", 380);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\");
    }

    @Test
    public void test38405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38405");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38406");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222" + "'", str1, "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222");
    }

    @Test
    public void test38407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38407");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "    2222222222222222222222222222222222UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38408");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38409");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("u003            0023         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test38410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38410");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", "6\\\\u0020");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\u002                                         \n\n1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u002                                         \n\n1" + "'", str1, "\\u002                                         \n\n1");
    }

    @Test
    public void test38412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", 'u', '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161" + "'", str3, "\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test38413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ", "                 \\uhi!hi!hi!                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38415");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 172);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 172 + "'", int2 == 172);
    }

    @Test
    public void test38416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38416");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 A\\u0023AAAAAAAAAAAAA                                  ", "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("u003            0023         ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test38417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38417");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iiiiiiiiiiiiiiiiiiiii...uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiii", "21                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 92);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38418");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ", 17, '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 " + "'", str3, "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ");
    }

    @Test
    public void test38419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38419");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ih01001!ih01", "uuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38420");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA", 886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38421");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...3\\u23\\u23U6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "0U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test38423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("610000000000000000000000000000000000000000000000000                                  0auu0", "2U2U2U2U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "610000000000000000000000000000000000000000000000000                                  0auu0" + "'", str2, "610000000000000000000000000000000000000000000000000                                  0auu0");
    }

    @Test
    public void test38424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38424");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                ", "                  \\U0033\\U0033\\U0033\\U0033\\U0033\\U0033\\U", (int) 'c');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38425");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2", "       ", 91);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test38426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("41                                                                                        ", 339, "                                         \n\n1           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         \n\n1                                                    \n\n1                         41                                                                                                                                 \n\n1                                                    \n\n1                          " + "'", str3, "                                         \n\n1                                                    \n\n1                         41                                                                                                                                 \n\n1                                                    \n\n1                          ");
    }

    @Test
    public void test38427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38427");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa", 62, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa" + "'", str3, "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa");
    }

    @Test
    public void test38429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38429");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("#11#1111\n\n\n\n\n\n\n\n", '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test38430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", "\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
    }

    @Test
    public void test38431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38431");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray4, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '\\', 156, 113);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test38432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\u0023 hi!hi!hi!", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  " + "'", str2, "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
    }

    @Test
    public void test38434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        " + "'", str2, "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
    }

    @Test
    public void test38435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003", 47, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
    }

    @Test
    public void test38436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38436");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("5                                                                                                ", "3322U\\3322U\\3322U\\...2U\\3322U\\3322U\\3322U\\3322U\\3322U\\33\\U22A8", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                            AAAAAAAAAAAAA3200\\A                                               ", 508, 562);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            AAAAAAAAAAAAA3200\\A                                               " + "'", str3, "                            AAAAAAAAAAAAA3200\\A                                               ");
    }

    @Test
    public void test38438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           " + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ");
    }

    @Test
    public void test38439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" 61..        ", 255);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61..                                                                                                                                                                                                                                                          " + "'", str2, " 61..                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test38440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38440");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa                                                ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                  3200 61\\ 61\\ 61", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                               #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###                                                                                                                                                                                                                      ", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test38441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                             \n\n1                                                    \n\n1     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaa                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h ", 'u', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h " + "'", str3, "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h ");
    }

    @Test
    public void test38444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  \\                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  \\", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               \\" + "'", str2, "                               \\");
    }

    @Test
    public void test38445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 2, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55" + "'", str3, "55");
    }

    @Test
    public void test38446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 54, "3\\u0003\\u0111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\u0003\\u011111111111111111111111111111111111111111111" + "'", str3, "3\\u0003\\u011111111111111111111111111111111111111111111");
    }

    @Test
    public void test38447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38447");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'c', (int) '0');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test38448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("777777777777777777777777777777777777777777777777777777777777777777777777777777777", "hhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhhhhhh   ...                             hhhhh                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777" + "'", str2, "777777777777777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38449");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "           161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                   ######", 262);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38451");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("11111111111111111111       111111111111111111111                                                                                           ", "A\\u0023AAAAAAAAAAAAAa000u\\", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38452");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "1\\ 1\\ 1\\ 1\\ 1\\ 11111111..", 354, 93);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test38453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38453");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                  ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38454");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0023\\U00\\u0041\\U", "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "1111111111111...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\U0023\\U00\\u0041\\U" + "'", str6, "\\U0023\\U00\\u0041\\U");
    }

    @Test
    public void test38455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38455");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61" + "'", str1, "61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test38458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38458");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\U0061\\U0061\\U0061\\U0061\\ u61 1\\U0061\\U0061\\U0061\\U0061", "                 \\ 0030                  ", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023", 127, "                                                                                                   20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023" + "'", str3, "23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023");
    }

    @Test
    public void test38460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                                                                             136u66136u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("U                 661uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...U                 61", "ua", "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U                 661                                                                                ...U                 61" + "'", str3, "U                 661                                                                                ...U                 61");
    }

    @Test
    public void test38462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38462");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " uuuuuuuuuuU6uuuuuuuuuuu                         ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test38463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38463");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("UUUUUUUUUUU6UUUUUUUUUUU", 520, 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("16...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575 ", 97, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "16...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575 111111111111111111111" + "'", str3, "16...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575 111111111111111111111");
    }

    @Test
    public void test38465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38465");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("\\u003 ", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("1hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test38466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38466");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                        u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\77777");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38467");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...  u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ...", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38468");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("575757575757575757575757575757575757575757575757575111", 75, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38469");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 257);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 257 + "'", int2 == 257);
    }

    @Test
    public void test38470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) '\\');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test38471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38471");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '0', 0, 62);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test38472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38472");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", "a");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("        75", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '\\');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    " + "'", str8, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
    }

    @Test
    public void test38473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38473");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'i', 181, 11);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test38474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38474");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...", "5c11111111111111111111111111 61\\ 111111111111111111111111111", 73);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test38475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", "                                                                                                                                                           uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38477");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", 80, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38478");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) (short) 1);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("    61        61        61        61        61        61        61        61        61        61        61        61        61   ", strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                 ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0", strArray8, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                 " + "'", str12, "                 ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0" + "'", str13, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            U0023\\U002U0023\\U002U0023\\U002U0");
    }

    @Test
    public void test38479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...h    h...aaaaaaa                            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61" + "'", str1, " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
    }

    @Test
    public void test38481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38481");
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
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray20);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "33333333333333333333333333333\\40032333333333333333333333333333333", charArray20);
        boolean boolean34 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\U0023\\U", charArray20);
        int int35 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           ", charArray20);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 48 + "'", int32 == 48);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 91 + "'", int35 == 91);
    }

    @Test
    public void test38482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 61 \\ AAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test38483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test38484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38484");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("575\\u0037200U\\", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test38485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaa", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38486");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, 'u', (int) '5', 7);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                 A                                                                                             ", strArray10, strArray13);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c", strArray4, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                 A                                                                                             " + "'", str20, "                                                                                                 A                                                                                             ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c" + "'", str21, "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c");
    }

    @Test
    public void test38487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38487");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 104 + "'", int13 == 104);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test38488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38488");
        char[] charArray10 = new char[] { '#', '4', 'a', '#', 'a', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!100", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U61", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#4a#a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#4a#a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, 4, a, #, a,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test38489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38489");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "ih01001!ih01      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa        ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test38491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38491");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   U61    ", 28, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhh   U61    " + "'", str3, "hhhhhhhhhhhhhhhhhh   U61    ");
    }

    @Test
    public void test38493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "65                                  5a5757575757575757575757575757575757575757575751115757575757575757575757575757575757575757575751115");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                 ####AU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38495");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...  ", "U61");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 48, (int) (byte) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "23hi!hi!hi!                                                                          ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, 'a', 161, 35);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777", 191, 84);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test38496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test38497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38497");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "                                           \\\\0033005c");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test38498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("......77777777777777777777777777777777777777777777777777777777777777777777777", 183);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......77777777777777777777777777777777777777777777777777777777777777777777777" + "'", str2, "......77777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test38499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38499");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("55", "                                                                                           4300u\\", 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test38500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest76.test38500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................61aaaaaaaaaaaaaaaaaa", 476);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}

