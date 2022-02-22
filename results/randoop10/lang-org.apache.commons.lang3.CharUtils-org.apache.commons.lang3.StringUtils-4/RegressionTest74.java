import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest74 {

    public static boolean debug = false;

    @Test
    public void test37001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61                                                                             6u666                                                                  ", 4, (int) 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61        " + "'", str3, "\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61        ");
    }

    @Test
    public void test37002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                             7777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7777777777777777777                             " + "'", str1, "7777777777777777777                             ");
    }

    @Test
    public void test37003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16" + "'", str1, "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16");
    }

    @Test
    public void test37004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37004");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\ 61\\ 61\\ 61\\ 61\\ 611111111..  UUU6  6  6  6  6  ", 205, (int) '\\');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      " + "'", str2, "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ");
    }

    @Test
    public void test37006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37006");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "       ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str5, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str7, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test37007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...1111111", "                                 \\U0023\\U00\\u0041\\U                                   1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37008");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '6');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test37009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\r\r\r\r\r\r\r...                                      57");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37010");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0023\\u\\u", "23\\u0023\\u002", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37011");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "\\ 61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37012");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'A');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test37013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37013");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("6u", "ua61a\na\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6u" + "'", str2, "6u");
    }

    @Test
    public void test37015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                     ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u000d", strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "...hhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test37016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37016");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" 61\\ 61\\ ...", "i!                                                                                   U0023                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61");
    }

    @Test
    public void test37018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37018");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith(" u   6", (java.lang.Object[]) strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0023                                                                                     hi!hi!hi!", strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("23\\u", strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str8, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str9, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test37019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37020");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "", 38);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '3');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str9, "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034......   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034" + "'", str14, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034......   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034");
    }

    @Test
    public void test37021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u002aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "................................3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200", "\\U000A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, " 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6 6aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37022");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...", (java.lang.CharSequence) "U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test37023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37023");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAA\\20UUU\\20UUU\\20UUU\\                                               ", "\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1", 30);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test37024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37024");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                  ...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 79);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37025");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 61, 886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                 ...", "1 1", "000000000000000000000000000000.....");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000..." + "'", str3, "0000000000000000000000000000000000000000000000000...");
    }

    @Test
    public void test37027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37027");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\n\n\n\n\n\n\n\n\n\n\n\n                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n", 79, 685);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test37029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37029");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "111111111111111111111111111111111111111111", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...", 5, "        ###\n###    61        61        615c    61        61        61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ..." + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
    }

    @Test
    public void test37031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...", "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111..." + "'", str2, "1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...");
    }

    @Test
    public void test37032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37032");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#11#1111\n\n\n\n\n\n\n\n", "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37033");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("UUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str1, "UUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test37035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37035");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "\\16 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
    }

    @Test
    public void test37037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37037");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61        61        61        61        61        61        61        61        61        61        61        61        61   ", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaa...", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                261aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test37038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37038");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", "\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37039");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                           \\u003                                                                                                                                                                                                                                                            ", "                                        3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaa!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaa", "iiiiiiiiiiiiiiiiiiiii...uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaa!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaa" + "'", str2, "aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaa!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...aaaa");
    }

    @Test
    public void test37041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37042");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                              23\\u0023\\u0023\\u0023\\U", 59, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCC                              23\\u0023\\u0023\\u0023\\UCCCC" + "'", str3, "CCC                              23\\u0023\\u0023\\u0023\\UCCCC");
    }

    @Test
    public void test37043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111...UUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111...UUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111...UUUUUUUUUUUUUUUUUUUUUUUUUUUU", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37044");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi" + "'", str2, "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi");
    }

    @Test
    public void test37046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37046");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ", "u0023\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...", (int) 'h', "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...23\\u0023\\" + "'", str3, "23\\u0023Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...23\\u0023\\");
    }

    @Test
    public void test37048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37048");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("3200U\\3200U\\3200\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200", 100, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                \\i\\                       61\n                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\i\\                       61" + "'", str1, "\\i\\                       61");
    }

    @Test
    public void test37050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...\r                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU" + "'", str2, "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  \\\\0020", (int) '\n', 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                      ..", "666u6", (int) 'i');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\n\n\n\n\n\n\n\n\n\n", "2                                         \n\n1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                 ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16" + "'", str1, "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16");
    }

    @Test
    public void test37056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37056");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("23\\u0023\\u...", "61                                         \n\n1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004\\23004", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                          \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAA", '3', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          \\u0061\\u0061\\u\\U002a\\u0061\\u0061\\u0 AAAAA" + "'", str3, "                          \\u0061\\u0061\\u\\U002a\\u0061\\u0061\\u0 AAAAA");
    }

    @Test
    public void test37059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37059");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       231111111111111", "\\u0031");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37060");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '3', (int) 'C', 13);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  " + "'", str6, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
    }

    @Test
    public void test37061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "3200u                            aaaaaaaaaaaaa3200\\a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("500u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\U\\3200u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "500u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\U\\3200u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\" + "'", str2, "500u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\U\\3200u\\0u\\                                                                                          500u\\0u\\                                                                                          500u\\");
    }

    @Test
    public void test37063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1        61   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37064");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16", (java.lang.CharSequence) "\\iui2\\4\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U", " 61\\ 6161\\ 61\\ 6161\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U" + "'", str2, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U");
    }

    @Test
    public void test37066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37066");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray22 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray22);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray22);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray22);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray22);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray22);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray22);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  2   ", charArray22);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray22);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray22);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "10hi!10010hi!10010h\\400310hi!10010hi!10010hi", charArray22);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", charArray22);
        int int34 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray22);
        boolean boolean35 = org.apache.commons.lang3.StringUtils.containsAny("", charArray22);
        boolean boolean36 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray22);
        boolean boolean37 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161", charArray22);
        boolean boolean38 = org.apache.commons.lang3.StringUtils.containsAny("0023\\U0023\\U0023\\ u020\\U0020\\U0020\\U00", charArray22);
        boolean boolean39 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u002", charArray22);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 48 + "'", int34 == 48);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test37067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37067");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\321\\ u1\\ 1\\ 1\\ 1\\ 1\\  1\\ u1\\ 1\\ 1\\ 1\\ 1\\", (java.lang.CharSequence) "         0000000000000000000000000000000000000000000000000\\u0037         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test37068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37068");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("U   6", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...U0023\\U\\4003U0023\\U0023\\U0##########U0023U0023\\U00...", "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...U0023\\U\\4003U0023\\U0023\\U0##########U0023U0023\\U00..." + "'", str2, "...U0023\\U\\4003U0023\\U0023\\U0##########U0023U0023\\U00...");
    }

    @Test
    public void test37070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37070");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...0u005cu0", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                      6u666", charArray16);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test37071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ", 834, "\\u0033");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0023\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 " + "'", str3, "\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0033\\u0023\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ");
    }

    @Test
    public void test37072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37072");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0", (int) '6');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test37074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "", 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37076");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "     8");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37077");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\U                                                                                            ", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\U0023AAAAAAAAAAAAAA000U\\                                                                 A\\U", 191);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test37078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("3333333333333333333333333333333333333333333\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3333333333333333333", 61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("16161616161616161616161616", "AAAAAA HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37080");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37081");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("33333333        753333333333333333333333333    ", "\\u003\\u0023\\u0023\\u0023\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37082");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("23\\U0023\\U...", "uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u", 70, 263);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\U0023\\U...uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u" + "'", str4, "23\\U0023\\U...uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
    }

    @Test
    public void test37083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37083");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "333333333333333333333333333333333333333333333333333333333333333333333333333333310HI!100", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37084");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("###AU#################################################");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '#' + "'", char1 == '#');
    }

    @Test
    public void test37085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             " + "'", str1, "                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test37086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37086");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaa23\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaa", "ChUUUUUUUUUUUUUUUUUUUhCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000...", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000..." + "'", str2, "0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000...");
    }

    @Test
    public void test37088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37088");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8", "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37089");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("111111111aaaa\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111111aaaa\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0" + "'", str1, "111111111aaaa\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0");
    }

    @Test
    public void test37090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37090");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     \\0023\\00\\u0041\\0023     ", "333333333333333333333333333333333333333333333333333333333333333333333333333333310HI!100");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test37092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", "Aaaaaaaaaaa...616161616161616161616161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u" + "'", str2, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u");
    }

    @Test
    public void test37093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37093");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                                                                                                                                                                                         Aaaaaaaaaaa...      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                ", '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test37094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37094");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Hi!hi!hi!", 54, 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37095");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("uuu0023", 508);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("3200u\\3200u\\32    3          3200u\\3200u\\32", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200u\\3200u\\32    3          3200u\\3200u\\32" + "'", str2, "3200u\\3200u\\32    3          3200u\\3200u\\32");
    }

    @Test
    public void test37097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...UUUUUUUUUU", "                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...UUUUUUUUUU" + "'", str2, "...UUUUUUUUUU");
    }

    @Test
    public void test37098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37098");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("111", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37099");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 135 + "'", int1 == 135);
    }

    @Test
    public void test37100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37100");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', 116);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 116 + "'", int2 == 116);
    }

    @Test
    public void test37101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37101");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih!ih!ih 300u 300u 300u 300u 300u 300u 300u 300u3200u 300u", '\n', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih 300u 300u 300u 300u 300u 300u 300u 300u3200u 300u" + "'", str3, "!ih!ih!ih 300u 300u 300u 300u 300u 300u 300u 300u3200u 300u");
    }

    @Test
    public void test37102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", (java.lang.CharSequence) "77777777777777777777700000000000000000000777777777777777777777");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37103");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("ih01001!ih01", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37104");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  \\005C                                                                                                                                                                      ", "aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37106");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1111111111111111111111111111111111111111111113\\u0...", "                           1\\u00234                                      \\u0023\\u00\\U0                    ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...AAAA      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\i\\161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37109");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuu", 181, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37110");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0023", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                             ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023\\u002u0023\\u002u0023\\u002u0", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002               20\\u0", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("23aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  0023", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test37111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     " + "'", str2, "                                                                                                                     ");
    }

    @Test
    public void test37112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("3200u", "#################", "1\\U00234                                      \\U0023\\U00\\u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3200u" + "'", str3, "3200u");
    }

    @Test
    public void test37113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...261\\261\\261\\261\\261\\261\\261\\2...", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...261\\261\\261\\261\\" + "'", str2, "...261\\261\\261\\261\\");
    }

    @Test
    public void test37114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                                                                                 A7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777", "    2222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                                                                                 A7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777" + "'", str2, "7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                                                                                 A7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test37115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37115");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37116");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                     \\U0023\\U00\\u0           ...", "0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37117");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '0', (int) '\n');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "23\\u0023\\u0023          3    23\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\U0061\\U0061\\U0061\\U0061\\ u61 1\\U0061\\U0061\\U0061\\U0061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1600U\\1600U\\1600U\\1600U\\1 16u \\1600U\\1600U\\1600U\\1600U\\" + "'", str1, "1600U\\1600U\\1600U\\1600U\\1 16u \\1600U\\1600U\\1600U\\1600U\\");
    }

    @Test
    public void test37120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37120");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444444444", (int) '#', (int) '5');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37121");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n.....................................................", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test37122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37122");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA", "5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u005555555555222222222222222222222222222222222222222222222u6                                          5555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u00555555555555555555555555555555555555555523\\u0023\\u0023        75023\\u0023\\u0055555555555", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("U0023\\U002U0023\\U002U0023\\U002U0", 369);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                        U0023\\U002U0023\\U002U0023\\U002U0                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                        U0023\\U002U0023\\U002U0023\\U002U0                                                                                                                                                                         ");
    }

    @Test
    public void test37124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37124");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\", "             h23h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh002h             ", 479);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37125");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '5', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test37126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37126");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("               \\", "AAAAAAA      ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37128");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAA51AAAA", "\\u002066666666666666666666666666666666666666", 105);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "616161616161616161616161\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 76, 306);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37129");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "61\\ 61\\\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37130");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                              6u666", "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("610000000000000000000000000000000000000000000000000                                  0auu0", 562, "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "610000000000000000000000000000000000000000000000000                                  0auu0aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u002" + "'", str3, "610000000000000000000000000000000000000000000000000                                  0auu0aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        aaaaaaaaaaaaa...u0020u0020u0020u0020u002");
    }

    @Test
    public void test37132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37132");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" ", 929, 440);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test37133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                           001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................                                                                                           ", "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37134");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..", (java.lang.CharSequence) "61        61        61        61        61        61        61        61        61        61        61        61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37135");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "43\\0043\\0043\\0043\\0043\\0043\\0043\\0043U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...h61\\h61\\h610000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 479, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37137");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("2\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test37138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU" + "'", str1, "2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU");
    }

    @Test
    public void test37139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("22222222222222222222uuu0023                                            222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "22222222222222222222uuu0023 222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "22222222222222222222uuu0023 222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test37140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37140");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 241);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37141");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h... ", "111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023757575757                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "cccccccccccccccccccccccccccccccccccccccccccccccccccccc", "        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        75");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37143");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", 'C');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37144");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('0', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a000u\\", "261                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\16 ", "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37147");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                   0041", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666666666666");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                                      \\U0023\\U00\\u0041\\U002", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\U0023\\U00\\u0041\\U002" + "'", str8, "\\U0023\\U00\\u0041\\U002");
    }

    @Test
    public void test37148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37148");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test37149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61" + "'", str2, "U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test37150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37150");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37151");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  \r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                         \n\n1    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test37154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222", 76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37155");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray17 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence7, charArray17);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023                                                                                     ", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u002", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "....................................................................................................                                    ", charArray17);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaa...000200002000020000200002000020000200002000020...\\\\\\\\\\\\\\", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test37156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37156");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "111111111111111111111U6111111111111111111111");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test37157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37157");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                         \n\n1                                         ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 96);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0023                                                                                     hi!hi!hi!", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "u003                                                ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u007  \n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0  \n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075", strArray4, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                         \n\n1                                         " + "'", str7, "                                         \n\n1                                         ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "u003                                                u0023u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                                                                                             hi!hi!hi!" + "'", str13, "u003                                                u0023u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                                                                                             hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "u0023                                                                             hi!hi!hi!" + "'", str14, "u0023                                                                             hi!hi!hi!");
    }

    @Test
    public void test37158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37158");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                                                                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37159");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                  H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37160");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!ih                                                                                                                             300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u3200u                                                300u", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37161");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...000000000000000000000000000000000000000000000000000000000000...", "UUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37163");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test37164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37164");
        char[] charArray9 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaa", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                 ####a\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 257 + "'", int13 == 257);
    }

    @Test
    public void test37165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37165");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u005c\\u001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (java.lang.CharSequence) "U61\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test37166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hi!", (int) ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach(" 61", strArray8, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("\\", strArray3, strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("\n\n1                                                                                         ", strArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " 61" + "'", str13, " 61");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\" + "'", str14, "\\");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\u0075" + "'", str19, "\\u0075");
    }

    @Test
    public void test37167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "111111U1111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("U61", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023u6                                       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0061" + "'", str5, "\\u0061");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test37169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "uuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuu3\\u0...\\U00" + "'", str1, "uuuuuuuuuuuuuuuuu3\\u0...\\U00");
    }

    @Test
    public void test37170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 267);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37171");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", "                                             aaa", 288);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "                                                                                                        aaaaaaa    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test37173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37173");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".16 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...........................................\\u0023 hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...........................................\\u0023 hi!hi!hi!" + "'", str1, "...........................................\\u0023 hi!hi!hi!");
    }

    @Test
    public void test37176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##############################################.16 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################.16 " + "'", str1, "##############################################.16 ");
    }

    @Test
    public void test37177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37177");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "7777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("   a                             ", "555555555555555555555555555555555555555555555555555555  ......  ", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37179");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray17 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray17);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u005c\\u00", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "............................", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "111111111aaaa\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034", charArray17);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1 1", charArray17);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test37180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37180");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023          3    23\\u0023\\u0023      ", " 6  6  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37181");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("400u\\00U\\3200U\\", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37182");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666", 563, 349);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                 " + "'", str2, "                                                                                 ");
    }

    @Test
    public void test37184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37184");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068", (java.lang.CharSequence) "\\U0033                   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068" + "'", charSequence2, "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068");
    }

    @Test
    public void test37185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37186");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023", "                                                                                                    ", (int) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "\\U0075", 100, 92);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0023" + "'", str10, "\\u0023");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\u0023" + "'", str11, "\\u0023");
    }

    @Test
    public void test37187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\n\n\n\n", '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\n\n\n\n" + "'", str2, "0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\n\n\n\n");
    }

    @Test
    public void test37188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\" + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
    }

    @Test
    public void test37189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str1, "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test37190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075", "\\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075" + "'", str2, "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
    }

    @Test
    public void test37191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37191");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "6\\\\u0020", 339);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                                              23");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test37192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("UUUUUUUUUUUUUUUUUUUUUUUUUU", "###\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37193");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 102, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37194");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("23\\U0023\\U");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\U0023\\U" + "'", str4, "23\\U0023\\U");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test37195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37195");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ", (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      " + "'", str2, "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ");
    }

    @Test
    public void test37198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37198");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("a\\U0023AAAAAAAAAAAAAA000U\\", 137, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAA000U\\" + "'", str3, "...AAAAAAAAAAAAA000U\\");
    }

    @Test
    public void test37200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "55          aaaaaaa       CCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37201");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                ", (java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                 10hi!10010hi!161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U10hi!10010hi!1                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("61 61 61 61 61 61 61 6UUUUUUUUUUUUUUUUUU...", "                                             aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61 61 61 61 61 61 61 6UUUUUUUUUUUUUUUUUU..." + "'", str2, "61 61 61 61 61 61 61 6UUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test37203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37203");
        char[] charArray10 = new char[] { '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("23                                                                                     hi!hi!hi!", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                        a000u\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "16U", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test37204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("61\\ 61\\ 61\\ 61\\ 61\\ 611111111...", 93, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..." + "'", str3, "61\\ 61\\ 61\\ 61\\ 61\\ 611111111...");
    }

    @Test
    public void test37205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37205");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\ 6\\", "61\\\\u0020");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'U');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U UU" + "'", str4, "U UU");
    }

    @Test
    public void test37206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37206");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37207");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85 + "'", int1 == 85);
    }

    @Test
    public void test37208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6", 63, "a...\\61\\61\\61\\61\\u0023     ...a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6" + "'", str3, "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6");
    }

    @Test
    public void test37209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005" + "'", str1, "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
    }

    @Test
    public void test37210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37210");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                  61", "\\u005c", 4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\\u002                                         \n\n1");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("               3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...               ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                  61" + "'", str7, "                                                                                                  61");
    }

    @Test
    public void test37211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37211");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" 11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111...", '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test37212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37212");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", 'h');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37213");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U00234                                      \\U0023\\U00\\U0                    ..", "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", "                                                                                                               \\u0035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 29, 563);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37216");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111      ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111      " + "'", str5, "1111111      ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test37217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37217");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                        0U\\                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37219");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("                             7777777777777777777", "AAAA                            ", 508);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u003\\u0023", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "               " + "'", str5, "               ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u003\\u0023" + "'", str10, "\\u003\\u0023");
    }

    @Test
    public void test37220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37220");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test37221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37221");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "UUUUUUUUUUUUUUUUUU\\4555555555555555555555555", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37222");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023", "                                                                                                    ", (int) (byte) 1);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A\\u0023AAAAAAAAAAAAAa000u\\", 'i');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      ", "      ");
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.concatWith("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray16);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("h", strArray10, strArray16);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5, strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'C', 189, 263);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 189");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A\\u0023AAAAAAAAAAAAAa000u\\" + "'", str11, "A\\u0023AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str22, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37223");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\", '2');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '5', 31, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37224");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  uuu", "                                                                                                                                                                                                      \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37226");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", 95);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test37227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37227");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(".....", "\\u0034                                                                                           ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..", (int) (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   .." + "'", str3, "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..");
    }

    @Test
    public void test37229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "U0023                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37230");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                          23\\U0023\\U                                          ", "11111111111111...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37231");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8   ", "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757" + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757");
    }

    @Test
    public void test37233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37233");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", " 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37235");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test37236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37236");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u", ".");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("111111111111111111111111111111111111111111111111111", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111111111111111111111111111111                                                      " + "'", str2, "111111111111111111111111111111111111111111111111111                                                      ");
    }

    @Test
    public void test37238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37238");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37239");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37240");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", (java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("\\aua005aca\\aua0", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str5, "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\aua005aca\\aua0\\aua005aca\\aua0\\aua005aca\\aua0\\aua005aca\\aua0" + "'", str7, "\\aua005aca\\aua0\\aua005aca\\aua0\\aua005aca\\aua0\\aua005aca\\aua0");
    }

    @Test
    public void test37241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37241");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "    16                                           ", (java.lang.CharSequence) "U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0 u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "    16                                           " + "'", charSequence2, "    16                                           ");
    }

    @Test
    public void test37242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaa  .....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaa  ....." + "'", str1, "aaaaaaaaaaaaaaaaaa  .....");
    }

    @Test
    public void test37243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37243");
        char[] charArray10 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "000000000000000000000000000000...             000000000000000000041\\u00000000000000000000000000000000...             00000000000000000", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test37244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37244");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37245");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test37246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626", (int) ' ', 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str2, "7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test37248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("23\\U0023\\U...", "                                                                                                                                                  H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37249");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444   ...4444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37250");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("####au", "\\u0043", 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("61UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h");
    }

    @Test
    public void test37252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37252");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                 \\u0036                                                                 ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "..                    0u\\00U\\3200U\\                                      43200U\\1                                         ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test37253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\", "hCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555", "\r\r\r\r\r\r666661666661666U6666666661666661666\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111113660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066" + "'", str3, "1111111111111111111111111111111111111111111113660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066");
    }

    @Test
    public void test37254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37254");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("666666666666666666666666666666666666660200U\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U00234444444444444444444444444444444444444444444444444444444", "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", 886);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u0023\\u0023\\u0023\\u0023\\u0023\\u", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               " + "'", str2, "                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               ");
    }

    @Test
    public void test37256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test37257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               ", "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37258");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###\nu002                                         \n\n1                                        ", "222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222", 635);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37259");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("u   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37260");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033", (int) 'c');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37261");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..", (java.lang.CharSequence) "\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 129 + "'", int2 == 129);
    }

    @Test
    public void test37262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37262");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" 61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "1\\u00234                                      \\u0023\\u00\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\u00234                                      \\u0023\\u00\\U00" + "'", str1, "1\\u00234                                      \\u0023\\u00\\U00");
    }

    @Test
    public void test37264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......", 68, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......");
    }

    @Test
    public void test37265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37265");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37266");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("23\\U                                                                                            ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test37267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37267");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("616161616161616161616161616161616161616161616161616161616161u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC 6...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37268");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222", '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'u' + "'", char2 == 'u');
    }

    @Test
    public void test37269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37269");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ", "6666666666666666666666666666666666666666666663\\u0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37270");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\n\n1                        23\\u0023\\u0023\\u00...", "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n", 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37271");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\u0055", "uUUUUUUUUU...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37272");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...061                                         \n\n", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555", 61);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", "###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  " + "'", str2, "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
    }

    @Test
    public void test37274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37275");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hi!", (int) ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach(" 61", strArray6, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray6);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("I!", "61.");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray6, strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " 61" + "'", str11, " 61");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str16, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "I!" + "'", str17, "I!");
    }

    @Test
    public void test37276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37277");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "                 3200U          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("001!IH0...", "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("200U\\3", "5555555                                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "200U\\3" + "'", str2, "200U\\3");
    }

    @Test
    public void test37280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37280");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37281");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAA15AAAA", charArray14);
        java.lang.Class<?> wildcardClass24 = charArray14.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test37282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", 191, (int) '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("5700u\\", "i!                                                                                   U0023                           ", "!ih!ih!ih                                                                                                                             300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u3200u                                                300u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5700u\\" + "'", str3, "5700u\\");
    }

    @Test
    public void test37284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test37285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37286");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                         AAAAAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37287");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...AAA                                             AAA       ", "############################################################################################################################################################################################\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     " + "'", str1, "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ");
    }

    @Test
    public void test37289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test37290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37290");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '\\', 26, (int) '5');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37291");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", "                                                        20\\u0020\\u0020\\u0020\\u00", "                              0U\\1600U\\1600U\\3200U\\U\\1600U\\1600U\\", 50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6" + "'", str4, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
    }

    @Test
    public void test37292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "3200U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U" + "'", str1, "3200U");
    }

    @Test
    public void test37293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37293");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("61aaaaaaaaaaaaaaaaaaaaaa...", "", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37294");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", "0UuU\\U3200", 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3333333333333333333333333333333333333333333330UuU\\U320033333333333333333333333333333333333333333333" + "'", str3, "3333333333333333333333333333333333333333333330UuU\\U320033333333333333333333333333333333333333333333");
    }

    @Test
    public void test37295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                  uAAAAAA\\u005c\\u0", "u61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                  uAAAAAA\\u005c\\u0" + "'", str2, "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                  uAAAAAA\\u005c\\u0");
    }

    @Test
    public void test37296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u 6aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222AAAAAAAAAAAAA U 6AAAAAAAAAAAAA" + "'", str1, "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222AAAAAAAAAAAAA U 6AAAAAAAAAAAAA");
    }

    @Test
    public void test37297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37297");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray2, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str8, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test37298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37298");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("u1111111111111111111111111111111111111111111116", "                                                        20\\u0020\\u0020\\u0020\\u00", "   2     ...                                ...    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaa                                                ", "161\\161\\161\\161\\161\\161\\u6                                          161\\161\\161\\161\\161\\161\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\161\\161\\161\\161\\161\\u6                                          161\\161\\161\\161\\161\\161\\" + "'", str2, "161\\161\\161\\161\\161\\161\\u6                                          161\\161\\161\\161\\161\\161\\");
    }

    @Test
    public void test37300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                              41                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     " + "'", str2, "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
    }

    @Test
    public void test37302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37302");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37303");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("61\\ 61\\\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006", ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test37304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37304");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '2');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test37305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37305");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6              ", 'h');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37306");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37307");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("......", "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h... ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("5555555                                             ...", "3\\u1111111111111111111111111111111111111111111116");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555                                             ..." + "'", str2, "5555555                                             ...");
    }

    @Test
    public void test37309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37310");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                               HUUU02HUUU02HUUU02HAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "UUUUUUUUUUUUUUUUUUUUUUUUUU", "61\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test37312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16", 101, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16" + "'", str3, "23\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16");
    }

    @Test
    public void test37313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37313");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa222222222222222222222222222222222222222222222u6                                         ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37314");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0uua0                                  000000000000000000000000000000000000000000000000016", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("U002", 0, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U002" + "'", str3, "U002");
    }

    @Test
    public void test37316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37316");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 456);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37317");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  2     2     2     2     4444444444444  1    1 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("23\\u0023\\u0023323\\u0023\\u0023                                                               ", "23\\U                                                                                             ", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37320");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444", "222222222222222222222222222222222222222222222u6                                          ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("##U###\n####U###\n####U###\n####U###\n####U###\n##57                                                                                                                             1", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 173 + "'", int4 == 173);
    }

    @Test
    public void test37321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37321");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "                   00414444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "          \\U000AAAAAAAAAAAAAA3200U\\A          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("u6      61        61        61        61      ", "                                                         ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37324");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\55555555555555555555510hi!10", "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u" + "'", str2, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u");
    }

    @Test
    public void test37326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37326");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...  ...", '7');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("20\\U0020\\U0020\\U0020\\U00   ", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    20\\U0020\\U0020\\U0020\\U00        " + "'", str2, "    20\\U0020\\U0020\\U0020\\U00        ");
    }

    @Test
    public void test37328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37328");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37329");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   2     ...                                ...    \\U0023");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37330");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!", "575\\u0037200U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\u0055", "AAAA4...4AAAAAA4                             4HHHHHHHHHHHHHHHHHAAAAAA4                             4HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0055" + "'", str2, "\\u0055");
    }

    @Test
    public void test37332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###0\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U002322222", 380);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U002322222                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "U002322222                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test37335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37335");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ", "                   \\u0023\\u0023\\u0023\\u0023\\u0023\\u                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37336");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "23 u0023 u0023          3    23 u0023 u0023      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37337");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType(".....");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAA", strArray4, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "6");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '6', 124, 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAA" + "'", str7, "AAAAAAA");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test37338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\77777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\7777" + "'", str1, "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\7777");
    }

    @Test
    public void test37339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37339");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                   ", "           161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test37340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("####AU   2", '6', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####AU   2" + "'", str3, "####AU   2");
    }

    @Test
    public void test37341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test37342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37342");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   55555555556uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu62626                   " + "'", str1, "                   55555555556uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu62626                   ");
    }

    @Test
    public void test37343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37343");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray6, strArray8);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("\r", strArray6, strArray14);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.concatWith("623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", (java.lang.Object[]) strArray14);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\r" + "'", str16, "\r");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10hi!100" + "'", str18, "10hi!100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10hi!100" + "'", str19, "10hi!100");
    }

    @Test
    public void test37344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                   ", "7777777777777777777777777770023\\u0...777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test37345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37345");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 191);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 59, 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test37347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "    61        61 ...II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAIIII\\U0023\\U0023\\U0023\\U0023\\U0023\\U0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 24, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str3, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test37349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                         \n\n1    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         \n\n1    " + "'", str1, "                                         \n\n1    ");
    }

    @Test
    public void test37350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37350");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37351");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("23\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U" + "'", str1, "23\\U");
    }

    @Test
    public void test37356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37357");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("111111111", "222222222222222222222222222222222222222222222222222222222222u   66666666666666666666666666666666666", (int) '6');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37358");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("u                                  ", "UUUU61UUUU", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37359");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                                                                                                   ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                 \\u0023                                                                                     hi!hi!hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023                                                                                     hi!hi!hi!" + "'", str1, "\\u0023                                                                                     hi!hi!hi!");
    }

    @Test
    public void test37361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 404, "...00...             ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test37362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###\nu002                                         \n\n1                                        ", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###\nu002                                         \n\n1                                        " + "'", str2, "###\nu002                                         \n\n1                                        ");
    }

    @Test
    public void test37363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37363");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  ......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("23\\u0023\\u002", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u002" + "'", str2, "23\\u0023\\u002");
    }

    @Test
    public void test37365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("222223200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA400uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA00Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA3200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA22222", '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222223200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA400uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA00Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA3200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA22222" + "'", str2, "222223200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA400uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA00Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA3200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA22222");
    }

    @Test
    public void test37366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\4aaa", "55555555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\4aaa" + "'", str2, "\\4aaa");
    }

    @Test
    public void test37367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u003" + "'", str1, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u003");
    }

    @Test
    public void test37368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37368");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  UUU", (java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37369");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     " + "'", str1, "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ");
    }

    @Test
    public void test37370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37370");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                      \\U0023\\U00\\u0041\\U0023", "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 122);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37371");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '2', 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test37372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...666    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61\\ 61\\ 61\\ 61\\ 61\\ 611111111..", '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 1\\ 1\\ 1\\ 1\\ 11111111.." + "'", str2, "1\\ 1\\ 1\\ 1\\ 1\\ 11111111..");
    }

    @Test
    public void test37374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37374");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61                                         \n\n1                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("UUUUUUUUUUU6UUUUUUUUUUU                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        UUUUUUUUUUU6UUUUUUUUUUU" + "'", str1, "                        UUUUUUUUUUU6UUUUUUUUUUU");
    }

    @Test
    public void test37376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("222222222222222222222222222222uu55                                            2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222222222222222222222222222222uu55                                            2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   .." + "'", str2, "222222222222222222222222222222uu55                                            2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..");
    }

    @Test
    public void test37377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  6\\\\u0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  6\\\\u0020" + "'", str1, "  6\\\\u0020");
    }

    @Test
    public void test37378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37378");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'u' + "'", char2 == 'u');
    }

    @Test
    public void test37379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              555555555555555555555555555555555555555555555555555555  ......  61555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37380");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626" + "'", str1, "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626");
    }

    @Test
    public void test37382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("        ###\n###    61        61        615c    61        61        61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\n###    61        61        615c    61        61        61" + "'", str1, "###\n###    61        61        615c    61        61        61");
    }

    @Test
    public void test37383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00" + "'", str1, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
    }

    @Test
    public void test37384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                      \\u0023\\u00\\u0041\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37385");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37386");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih" + "'", str3, "!ih!ih!ih");
    }

    @Test
    public void test37387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37387");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("666u6", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37388");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "3333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333333333333333333333333" + "'", str1, "3333333333333333333333333");
    }

    @Test
    public void test37389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37389");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...\r                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa222222222222222222222222222222222222222222222u6                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37391");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                 A                                                                                             ", 404, 370);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37392");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "uUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uUUUUUUUUU..." + "'", str1, "uUUUUUUUUU...");
    }

    @Test
    public void test37393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", "22223200U\\1400u\\00U\\3200U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333" + "'", str2, "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333");
    }

    @Test
    public void test37397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37397");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", " 61\\ 61\\ ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37398");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                  \\u0023\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                  \\u0023\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) " 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61" + "'", str1, " 61");
    }

    @Test
    public void test37400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37400");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("7777777777777777777777777777777777777777777777777777777777777                                        a0u0023aaaaaaaaaaaaa                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37402");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                 10hi!10010hi!161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U10hi!10010hi!1                                                                                  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                         ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test37405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5" + "'", str1, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5");
    }

    @Test
    public void test37406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8", "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8" + "'", str2, "3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8");
    }

    @Test
    public void test37407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "         ", (java.lang.CharSequence) "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("616161616161616161616161", "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "616161616161616161616161" + "'", str2, "616161616161616161616161");
    }

    @Test
    public void test37409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37409");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", (java.lang.CharSequence) "77777777777777777777700000000000000000000777777777777777777777\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test37410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37410");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023...", "                            AAAAAAAAAAAAA3200\\A                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test37411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37411");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "3333333333333333333333333");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str4, "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test37412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("CCC                              23\\u0023\\u0023\\u0023\\UCCCC", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCC                              23\\u0023\\u0023\\u0023\\UCCCC" + "'", str2, "CCC                              23\\u0023\\u0023\\u0023\\UCCCC");
    }

    @Test
    public void test37413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("uuuuuuuuu23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6uuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuu23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6uuuuuuuuu" + "'", str1, "uuuuuuuuu23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6uuuuuuuuu");
    }

    @Test
    public void test37414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37415");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61\\uuuuuuuuuuuuuuuu6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 177, 861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "                                 \\U0023\\U00\\u0041\\U                                   ", "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test37417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 695);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test37418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37418");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116", "...1...                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37419");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'A');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1113" + "'", str3, "1113");
    }

    @Test
    public void test37420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37420");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\     \\     \\     \\     \\       \\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37421");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("575\\u0037200U", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "61\\ 61\\ 61\\ 61\\ 61\\ 611111111...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "575\\u0037200U" + "'", str3, "575\\u0037200U");
    }

    @Test
    public void test37422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37423");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37424");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("3AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\13AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37425");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\U0023\\U0023\\U0023\\U0023\\U002", "222222222222222222222222222222222222222222222222222222222222u   66666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("10hi!100", "U003                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!100" + "'", str2, "10hi!100");
    }

    @Test
    public void test37427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("161\\161\\161\\161\\161\\161\\u6                      \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37428");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", "023\\u0023\\u002361\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37429");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", " 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37430");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "023\\U0023\\U0023\\U0023    ", 25);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                        ..        ", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '2', 43, 393);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 43");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test37431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37431");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.substringsBetween("", "\\u0055", "61\\ 61\\ 61");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("00U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U", strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...22222222    2222222222222222222222222222222222    2222222222222222222222222222222222    ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test37432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37432");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0026666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 4, 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37433");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("1\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000", "77777777777777777777777777777777777777777777777777uuuuuuuuuaaaaaaa       3200u\\320");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "1111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111" + "'", str1, "1111111");
    }

    @Test
    public void test37435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37435");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("uuuuuuuuuaaaaaaa       3200u\\320", "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ", 39, 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uuuuuuuuuaaaaaaa       3200u\\32033333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     " + "'", str4, "uuuuuuuuuaaaaaaa       3200u\\32033333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
    }

    @Test
    public void test37436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37436");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1                                                 ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\0u00020", "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0u00020" + "'", str2, "\\0u00020");
    }

    @Test
    public void test37438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37438");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU33333333333333333333UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "AAAAAAA     \\u0041                                                                                           ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("uuuuuuuuuuuu 320011\\\\", "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...AAA                                             AAA       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37440");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", "uuuuuuuuuuuu 3200u           ", (int) 'h');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37441");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                           \\\\335c");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test37442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37442");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("5500\r\\", "23\\u###\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u", "A\\u0061\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\3AAAAAAAAAAAAAa000u\\", 69);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5500\r\\" + "'", str4, "5500\r\\");
    }

    @Test
    public void test37443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n", "......A000u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n" + "'", str2, "!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n");
    }

    @Test
    public void test37444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                  ", "                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  " + "'", str2, "                                                                                  ");
    }

    @Test
    public void test37445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("U0023                                                                                                                                                                                ", 148);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023                                                                                                                                                                                " + "'", str2, "U0023                                                                                                                                                                                ");
    }

    @Test
    public void test37446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37446");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      ", "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...h    h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...h    h..." + "'", str1, "...h    h...");
    }

    @Test
    public void test37448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("cccccccccccccccccccccccccccccccccc\n     ", "5555555                     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccccc\n     " + "'", str2, "cccccccccccccccccccccccccccccccccc\n     ");
    }

    @Test
    public void test37449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37449");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("u6      61        61        61        61", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test37450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("00000000000000000000... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", 11, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("16U", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16U" + "'", str2, "16U");
    }

    @Test
    public void test37452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37452");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\U0023\\U00\\u0041\\U 1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", 1, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...", "\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu..." + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test37454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u002aaaaaaaaaaaaaa000u\\                                                                 a\\u" + "'", str1, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u002aaaaaaaaaaaaaa000u\\                                                                 a\\u");
    }

    @Test
    public void test37455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37455");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37456");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh    aaaaaaa                                                                                                        " + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh    aaaaaaa                                                                                                        ");
    }

    @Test
    public void test37457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "\\u0033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37458");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\", "AAA51AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37459");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test37460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37460");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000", (java.lang.CharSequence) "            2");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "000000000000000000000000000000000000000000000000000000000000" + "'", charSequence2, "000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test37461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc" + "'", str2, "ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc");
    }

    @Test
    public void test37462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37462");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                       ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'A', (int) 'u', (int) (short) 100);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test37463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 113, "                                                                                             U\\32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\             " + "'", str3, "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\             ");
    }

    @Test
    public void test37464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37464");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...    ...", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1", 79);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37465");
        char[] charArray12 = new char[] { ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0033", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "6", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                        U0023\\U002U0023\\U002U0023\\U002U0                                                                                                                                                                         ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 104 + "'", int17 == 104);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test37466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37466");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                   U\\1400u\\00U\\3200U\\", "                                                                                                  I!", 354);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '3', 21, 250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37467");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82 + "'", int2 == 82);
    }

    @Test
    public void test37468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37468");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0041                                                                                           ", "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37470");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 104);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AAAA51AAAA");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "23AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023" + "'", str6, "23AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23002300230023002300230023002300230023" + "'", str7, "23002300230023002300230023002300230023");
    }

    @Test
    public void test37471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37471");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\\\\\u0020", "                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test37472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\i\\                       61\n                       ", 930, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...      61\n                       " + "'", str3, "...      61\n                       ");
    }

    @Test
    public void test37473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37473");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "23\\U0023\\U...uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37475");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37476");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 117, 497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...                          ...", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3205761\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002" + "'", str2, "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002");
    }

    @Test
    public void test37479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37479");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "cccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37480");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  uuu", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0069", '.', '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0069" + "'", str3, "\\u0069");
    }

    @Test
    public void test37482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00", "U0023000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00" + "'", str2, "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00");
    }

    @Test
    public void test37483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaa...616161616161616161616161");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37484");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37486");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0" + "'", str1, "Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0");
    }

    @Test
    public void test37487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37487");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "UUUUUUUUUU...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37488");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 460);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 460 + "'", int2 == 460);
    }

    @Test
    public void test37489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37489");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".16 ", "                     61aaaaaaaaaaaaaaaaaaaaaa...", 267);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37490");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("U   6");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'U' + "'", char1 == 'U');
    }

    @Test
    public void test37491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\u0055                                            ", "ih01001!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih01001!ih0" + "'", str2, "ih01001!ih0");
    }

    @Test
    public void test37492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37492");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (java.lang.Object[]) strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("2                                                                                                                    ", 'a');
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("u", strArray13);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", strArray7, strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str16, "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2                                                                                                                    " + "'", str17, "2                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2                                                                                                                    " + "'", str18, "2                                                                                                                    ");
    }

    @Test
    public void test37493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37493");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61UUUUUUUUUU", (int) '\n', 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37494");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("  2  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37495");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", charSequence2, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37496");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "U0032\\U0032\\U0032\\U0032\\U0032\\U0032");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###\nAAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu###", 168, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###\nAAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu###" + "'", str3, "###\nAAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu###");
    }

    @Test
    public void test37498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\n\n\n\n\n\n\n\n\n\n\n\n                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37499");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200", (java.lang.CharSequence) "\\U0030\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest74.test37500");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

