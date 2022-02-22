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
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("2\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test37502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU" + "'", str1, "2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU");
    }

    @Test
    public void test37503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("22222222222222222222uuu0023                                            222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "22222222222222222222uuu0023 222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str1, "22222222222222222222uuu0023 222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test37504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37504");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 241);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37505");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h... ", "111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023757575757                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "cccccccccccccccccccccccccccccccccccccccccccccccccccccc", "        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        75");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37507");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", 'C');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37508");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('0', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37509");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a000u\\", "261                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\16 ", "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37511");
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
    public void test37512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37512");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test37513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61" + "'", str2, "U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test37514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37514");
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
    public void test37515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37515");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  \r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                         \n\n1    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test37518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37518");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222", 76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37519");
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
    public void test37520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37520");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "111111111111111111111U6111111111111111111111");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test37521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37521");
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
    public void test37522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37522");
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
    public void test37523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                  H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37524");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!ih                                                                                                                             300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u3200u                                                300u", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...000000000000000000000000000000000000000000000000000000000000...", "UUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37526");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'A');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
    }

    @Test
    public void test37527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37528");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test37529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37529");
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
    public void test37530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37530");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\u005c\\u001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (java.lang.CharSequence) "U61\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test37531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37531");
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
    public void test37532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37532");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "111111U1111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37533");
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
    public void test37534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "uuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuu3\\u0...\\U00" + "'", str1, "uuuuuuuuuuuuuuuuu3\\u0...\\U00");
    }

    @Test
    public void test37535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37535");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 267);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37536");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", "                                             aaa", 288);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "                                                                                                        aaaaaaa    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test37538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".16 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37539");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       aaaaaaa", "UUUU", 19);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "001!IH0...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "       aaaaaaa" + "'", str5, "       aaaaaaa");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "       aaaaaaa" + "'", str6, "       aaaaaaa");
    }

    @Test
    public void test37540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37540");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...........................................\\u0023 hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...........................................\\u0023 hi!hi!hi!" + "'", str1, "...........................................\\u0023 hi!hi!hi!");
    }

    @Test
    public void test37542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##############################################.16 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################.16 " + "'", str1, "##############################################.16 ");
    }

    @Test
    public void test37543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "7777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("   a                             ", "555555555555555555555555555555555555555555555555555555  ......  ", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37545");
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
    public void test37546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37546");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023          3    23\\u0023\\u0023      ", " 6  6  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37547");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("400u\\00U\\3200U\\", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37548");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("666666666666666666666666666666666666666666                                                                                                                                                              ...666666666666666666666666666666666666666666", 563, 349);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                 " + "'", str2, "                                                                                 ");
    }

    @Test
    public void test37550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37550");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068", (java.lang.CharSequence) "\\U0033                   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068" + "'", charSequence2, "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\U0068");
    }

    @Test
    public void test37551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37551");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               " + "'", str3, "               ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test37552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37553");
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
    public void test37554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\n\n\n\n", '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\n\n\n\n" + "'", str2, "0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\n\n\n\n");
    }

    @Test
    public void test37555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\" + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
    }

    @Test
    public void test37556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37556");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626", "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11111111111u0023#u0023#u0023#u0023#u0023#u0023#u", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str1, "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test37558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075", "\\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  \\4  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075" + "'", str2, "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
    }

    @Test
    public void test37559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37559");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "6\\\\u0020", 339);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                                              23");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test37560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("UUUUUUUUUUUUUUUUUUUUUUUUUU", "###\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 102, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37562");
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
    public void test37563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37563");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", 60);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200UAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test37565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ", (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      " + "'", str2, "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ");
    }

    @Test
    public void test37567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37567");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("a\\U0023AAAAAAAAAAAAAA000U\\", 137, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAA000U\\" + "'", str3, "...AAAAAAAAAAAAA000U\\");
    }

    @Test
    public void test37569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "55          aaaaaaa       CCCCCCCCCCCCCCCC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37570");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                ", (java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                 10hi!10010hi!161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U10hi!10010hi!1                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("61 61 61 61 61 61 61 6UUUUUUUUUUUUUUUUUU...", "                                             aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61 61 61 61 61 61 61 6UUUUUUUUUUUUUUUUUU..." + "'", str2, "61 61 61 61 61 61 61 6UUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test37572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37572");
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
    public void test37573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("61\\ 61\\ 61\\ 61\\ 61\\ 611111111...", 93, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 611111111..." + "'", str3, "61\\ 61\\ 61\\ 61\\ 61\\ 611111111...");
    }

    @Test
    public void test37574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37574");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\ 6\\", "61\\\\u0020");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'U');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U UU" + "'", str4, "U UU");
    }

    @Test
    public void test37575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37575");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37576");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 85 + "'", int1 == 85);
    }

    @Test
    public void test37577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37577");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6", 63, "a...\\61\\61\\61\\61\\u0023     ...a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6" + "'", str3, "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6");
    }

    @Test
    public void test37578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005" + "'", str1, "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
    }

    @Test
    public void test37579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37579");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                  61", "\\u005c", 4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\\u002                                         \n\n1");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("               3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...               ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                  61" + "'", str7, "                                                                                                  61");
    }

    @Test
    public void test37580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37580");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" 11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111111111111111...", '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test37581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37581");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", 'h');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37582");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U00234                                      \\U0023\\U00\\U0                    ..", "10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\10hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi!10010hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37583");
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
    public void test37584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37585");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111      ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1111111      " + "'", str5, "1111111      ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test37586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37586");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                        0U\\                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37588");
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
    public void test37589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37589");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test37590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37590");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "UUUUUUUUUUUUUUUUUU\\4555555555555555555555555", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37591");
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
    public void test37592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37592");
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
    public void test37593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37593");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  uuu", "                                                                                                                                                                                                      \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37595");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", 95);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test37596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37596");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                 \\u0030\\\\\\\\                  ", strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!1");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test37597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37597");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(".....", "\\u0034                                                                                           ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..", (int) (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   .." + "'", str3, "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..");
    }

    @Test
    public void test37599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "U0023                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                          23\\U0023\\U                                          ", "11111111111111...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8   ", "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757" + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757");
    }

    @Test
    public void test37603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37603");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", " 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37604");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37605");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'h', 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test37606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37606");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u", ".");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("111111111111111111111111111111111111111111111111111", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111111111111111111111111111111                                                      " + "'", str2, "111111111111111111111111111111111111111111111111111                                                      ");
    }

    @Test
    public void test37608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "5");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37609");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37610");
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
    public void test37611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37611");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "    16                                           ", (java.lang.CharSequence) "U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0 u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "    16                                           " + "'", charSequence2, "    16                                           ");
    }

    @Test
    public void test37612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaa  .....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaa  ....." + "'", str1, "aaaaaaaaaaaaaaaaaa  .....");
    }

    @Test
    public void test37613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37613");
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
    public void test37614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37615");
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
    public void test37616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37616");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626", (int) ' ', 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str2, "7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test37618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("23\\U0023\\U...", "                                                                                                                                                  H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444   ...4444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37620");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("####au", "\\u0043", 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("61UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h");
    }

    @Test
    public void test37622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37622");
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
    public void test37623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\", "hCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555", "\r\r\r\r\r\r666661666661666U6666666661666661666\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111113660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066" + "'", str3, "1111111111111111111111111111111111111111111113660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066");
    }

    @Test
    public void test37624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37624");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("666666666666666666666666666666666666660200U\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U00234444444444444444444444444444444444444444444444444444444", "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", 886);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u0023\\u0023\\u0023\\u0023\\u0023\\u", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               " + "'", str2, "                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               ");
    }

    @Test
    public void test37626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test37627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37627");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '\r', 393, (int) 'I');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test37628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37628");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                              \\u0023\\u0023\\u0023\\u0023\\u0023\\u                               ", "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37629");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###\nu002                                         \n\n1                                        ", "222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222", 635);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37630");
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
    public void test37631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033", (int) 'c');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37632");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..", (java.lang.CharSequence) "\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 129 + "'", int2 == 129);
    }

    @Test
    public void test37633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37633");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" 61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "1\\u00234                                      \\u0023\\u00\\U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\u00234                                      \\u0023\\u00\\U00" + "'", str1, "1\\u00234                                      \\u0023\\u00\\U00");
    }

    @Test
    public void test37635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......", 68, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......");
    }

    @Test
    public void test37636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37636");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37637");
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
    public void test37638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37638");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("616161616161616161616161616161616161616161616161616161616161u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC 6...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37639");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222", '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'u' + "'", char2 == 'u');
    }

    @Test
    public void test37640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ", "6666666666666666666666666666666666666666666663\\u0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37641");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\n\n1                        23\\u0023\\u0023\\u00...", "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n", 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\u0055", "uUUUUUUUUU...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37643");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...061                                         \n\n", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555", 61);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", "###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  " + "'", str2, "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
    }

    @Test
    public void test37645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37646");
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
    public void test37647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37648");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "                 3200U          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("001!IH0...", "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("200U\\3", "5555555                                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "200U\\3" + "'", str2, "200U\\3");
    }

    @Test
    public void test37651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37651");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37652");
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
    public void test37653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37653");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", 191, (int) '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("5700u\\", "i!                                                                                   U0023                           ", "!ih!ih!ih                                                                                                                             300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u                                                300u3200u                                                300u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5700u\\" + "'", str3, "5700u\\");
    }

    @Test
    public void test37655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test37656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                         AAAAAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37658");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 18 + "'", int19 == 18);
    }

    @Test
    public void test37659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37659");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("61\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", "", 103);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("5555555\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "61\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161" + "'", str5, "61\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test37660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37660");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...AAA                                             AAA       ", "############################################################################################################################################################################################\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     " + "'", str1, "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ");
    }

    @Test
    public void test37662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test37663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37663");
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
    public void test37664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37664");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", "                                                        20\\u0020\\u0020\\u0020\\u00", "                              0U\\1600U\\1600U\\3200U\\U\\1600U\\1600U\\", 50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6" + "'", str4, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
    }

    @Test
    public void test37665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37665");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "3200U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U" + "'", str1, "3200U");
    }

    @Test
    public void test37666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37666");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("61aaaaaaaaaaaaaaaaaaaaaa...", "", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", "0UuU\\U3200", 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3333333333333333333333333333333333333333333330UuU\\U320033333333333333333333333333333333333333333333" + "'", str3, "3333333333333333333333333333333333333333333330UuU\\U320033333333333333333333333333333333333333333333");
    }

    @Test
    public void test37668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                  uAAAAAA\\u005c\\u0", "u61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                  uAAAAAA\\u005c\\u0" + "'", str2, "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                  uAAAAAA\\u005c\\u0");
    }

    @Test
    public void test37669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u 6aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222AAAAAAAAAAAAA U 6AAAAAAAAAAAAA" + "'", str1, "16101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101616101610161016101610161016122222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222AAAAAAAAAAAAA U 6AAAAAAAAAAAAA");
    }

    @Test
    public void test37670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37670");
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
    public void test37671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37671");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("u1111111111111111111111111111111111111111111116", "                                                        20\\u0020\\u0020\\u0020\\u00", "   2     ...                                ...    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaa                                                ", "161\\161\\161\\161\\161\\161\\u6                                          161\\161\\161\\161\\161\\161\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\161\\161\\161\\161\\161\\u6                                          161\\161\\161\\161\\161\\161\\" + "'", str2, "161\\161\\161\\161\\161\\161\\u6                                          161\\161\\161\\161\\161\\161\\");
    }

    @Test
    public void test37673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37673");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                              41                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     " + "'", str2, "  H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H                                                     ");
    }

    @Test
    public void test37675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37675");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37676");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("61\\ 61\\\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006", ' ');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '6' + "'", char2 == '6');
    }

    @Test
    public void test37677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37677");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '#', '2');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test37678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37678");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6              ", 'h');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37679");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23                                                                                     hi!hi!hi!", "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37680");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("......", "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h... ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("5555555                                             ...", "3\\u1111111111111111111111111111111111111111111116");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555                                             ..." + "'", str2, "5555555                                             ...");
    }

    @Test
    public void test37682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37682");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                               HUUU02HUUU02HUUU02HAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37684");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "UUUUUUUUUUUUUUUUUUUUUUUUUU", "61\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test37685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37685");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16", 101, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16" + "'", str3, "23\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16");
    }

    @Test
    public void test37686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa222222222222222222222222222222222222222222222u6                                         ", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0041");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37687");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0uua0                                  000000000000000000000000000000000000000000000000016", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("U002", 0, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U002" + "'", str3, "U002");
    }

    @Test
    public void test37689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37689");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 456);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37690");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  2     2     2     2     4444444444444  1    1 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37692");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("23\\u0023\\u0023323\\u0023\\u0023                                                               ", "23\\U                                                                                             ", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37693");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444", "222222222222222222222222222222222222222222222u6                                          ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("##U###\n####U###\n####U###\n####U###\n####U###\n##57                                                                                                                             1", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 173 + "'", int4 == 173);
    }

    @Test
    public void test37694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37694");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", "                   00414444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37695");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "          \\U000AAAAAAAAAAAAAA3200U\\A          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("u6      61        61        61        61      ", "                                                         ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37697");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\55555555555555555555510hi!10", "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u" + "'", str2, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u");
    }

    @Test
    public void test37699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37699");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...  ...", '7');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("20\\U0020\\U0020\\U0020\\U00   ", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    20\\U0020\\U0020\\U0020\\U00        " + "'", str2, "    20\\U0020\\U0020\\U0020\\U00        ");
    }

    @Test
    public void test37701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37701");
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
    public void test37702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37702");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   2     ...                                ...    \\U0023");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37703");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777723hi!hi!hi!", "575\\u0037200U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\u0055", "AAAA4...4AAAAAA4                             4HHHHHHHHHHHHHHHHHAAAAAA4                             4HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0055" + "'", str2, "\\u0055");
    }

    @Test
    public void test37705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37706");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###0\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U002322222", 380);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U002322222                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "U002322222                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test37708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37708");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ", "                   \\u0023\\u0023\\u0023\\u0023\\u0023\\u                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37709");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1\\U00234                                      \\U0023\\U00                                                .\\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "23 u0023 u0023          3    23 u0023 u0023      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37710");
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
    public void test37711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\77777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\7777" + "'", str1, "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\7777");
    }

    @Test
    public void test37712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37712");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                   ", "           161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test37713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("####AU   2", '6', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####AU   2" + "'", str3, "####AU   2");
    }

    @Test
    public void test37714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test37715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   55555555556uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu62626                   " + "'", str1, "                   55555555556uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu62626                   ");
    }

    @Test
    public void test37716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37716");
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
    public void test37717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                   ", "7777777777777777777777777770023\\u0...777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test37718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37718");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 191);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 59, 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test37720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "    61        61 ...II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAIIII\\U0023\\U0023\\U0023\\U0023\\U0023\\U0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37721");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 24, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str3, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test37722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                         \n\n1    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         \n\n1    " + "'", str1, "                                         \n\n1    ");
    }

    @Test
    public void test37723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37723");
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
    public void test37724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37724");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37725");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37726");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("23\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U" + "'", str1, "23\\U");
    }

    @Test
    public void test37729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37730");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("111111111", "222222222222222222222222222222222222222222222222222222222222u   66666666666666666666666666666666666", (int) '6');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37731");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("u                                  ", "UUUU61UUUU", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37732");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                                                                                                   ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37733");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                 \\u0023                                                                                     hi!hi!hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023                                                                                     hi!hi!hi!" + "'", str1, "\\u0023                                                                                     hi!hi!hi!");
    }

    @Test
    public void test37734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 404, "...00...             ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test37735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###\nu002                                         \n\n1                                        ", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###\nu002                                         \n\n1                                        " + "'", str2, "###\nu002                                         \n\n1                                        ");
    }

    @Test
    public void test37736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37736");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  ......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("23\\u0023\\u002", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u002" + "'", str2, "23\\u0023\\u002");
    }

    @Test
    public void test37738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("222223200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA400uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA00Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA3200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA22222", '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222223200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA400uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA00Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA3200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA22222" + "'", str2, "222223200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA400uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA00Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA3200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA22222");
    }

    @Test
    public void test37739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\4aaa", "55555555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\4aaa" + "'", str2, "\\4aaa");
    }

    @Test
    public void test37740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u003" + "'", str1, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u003");
    }

    @Test
    public void test37741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37741");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  UUU", (java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     " + "'", str1, "                    \\U0020\\U0020\\U0020\\U0020\\U0020\\U...                     ");
    }

    @Test
    public void test37743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37743");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                      \\U0023\\U00\\u0041\\U0023", "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 122);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37744");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '2', 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test37745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...666    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61\\ 61\\ 61\\ 61\\ 61\\ 611111111..", '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 1\\ 1\\ 1\\ 1\\ 11111111.." + "'", str2, "1\\ 1\\ 1\\ 1\\ 1\\ 11111111..");
    }

    @Test
    public void test37747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37747");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61                                         \n\n1                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37748");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("UUUUUUUUUUU6UUUUUUUUUUU                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        UUUUUUUUUUU6UUUUUUUUUUU" + "'", str1, "                        UUUUUUUUUUU6UUUUUUUUUUU");
    }

    @Test
    public void test37749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("222222222222222222222222222222uu55                                            2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222222222222222222222222222222uu55                                            2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   .." + "'", str2, "222222222222222222222222222222uu55                                            2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..");
    }

    @Test
    public void test37750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  6\\\\u0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  6\\\\u0020" + "'", str1, "  6\\\\u0020");
    }

    @Test
    public void test37751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37751");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", '#');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'u' + "'", char2 == 'u');
    }

    @Test
    public void test37752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37752");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("41AAAAAAAA", "                                       aaaaaaaaaaaaa\\\\\\", (int) 'u');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "41AAAAAAAA" + "'", str6, "41AAAAAAAA");
    }

    @Test
    public void test37753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37753");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              555555555555555555555555555555555555555555555555555555  ......  61555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37754");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626" + "'", str1, "55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626");
    }

    @Test
    public void test37756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("        ###\n###    61        61        615c    61        61        61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\n###    61        61        615c    61        61        61" + "'", str1, "###\n###    61        61        615c    61        61        61");
    }

    @Test
    public void test37757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37757");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U000AAAAAAAAAAAAAA3200U\\", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "1\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U000AAAAAAAAAAAAAA3200U\\" + "'", str4, "\\U000AAAAAAAAAAAAAA3200U\\");
    }

    @Test
    public void test37758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37758");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00" + "'", str1, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
    }

    @Test
    public void test37759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                      \\u0023\\u00\\u0041\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37760");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37761");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih" + "'", str3, "!ih!ih!ih");
    }

    @Test
    public void test37762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("666u6", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "3333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333333333333333333333333" + "'", str1, "3333333333333333333333333");
    }

    @Test
    public void test37764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37764");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...\r                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37765");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '.');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "3\\u003\\u");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test37766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa222222222222222222222222222222222222222222222u6                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                 A                                                                                             ", 404, 370);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "uUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uUUUUUUUUU..." + "'", str1, "uUUUUUUUUU...");
    }

    @Test
    public void test37769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37769");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test37772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", "22223200U\\1400u\\00U\\3200U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333" + "'", str2, "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333");
    }

    @Test
    public void test37773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37773");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ...", "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37774");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", " 61\\ 61\\ ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                  \\u0023\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                  \\u0023\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) " 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61" + "'", str1, " 61");
    }

    @Test
    public void test37777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37777");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("7777777777777777777777777777777777777777777777777777777777777                                        a0u0023aaaaaaaaaaaaa                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37779");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                 10hi!10010hi!161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U10hi!10010hi!1                                                                                  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                         ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test37782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37782");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5" + "'", str1, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5");
    }

    @Test
    public void test37783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8", "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8" + "'", str2, "3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8");
    }

    @Test
    public void test37784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "         ", (java.lang.CharSequence) "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("616161616161616161616161", "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "616161616161616161616161" + "'", str2, "616161616161616161616161");
    }

    @Test
    public void test37786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37786");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "75\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", (java.lang.CharSequence) "77777777777777777777700000000000000000000777777777777777777777\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test37787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37787");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023...", "                            AAAAAAAAAAAAA3200\\A                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test37788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37788");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "3333333333333333333333333");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str4, "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test37789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("CCC                              23\\u0023\\u0023\\u0023\\UCCCC", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CCC                              23\\u0023\\u0023\\u0023\\UCCCC" + "'", str2, "CCC                              23\\u0023\\u0023\\u0023\\UCCCC");
    }

    @Test
    public void test37790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("uuuuuuuuu23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6uuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuu23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6uuuuuuuuu" + "'", str1, "uuuuuuuuu23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6uuuuuuuuu");
    }

    @Test
    public void test37791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37791");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37792");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61\\uuuuuuuuuuuuuuuu6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 177, 861);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "                                 \\U0023\\U00\\u0041\\U                                   ", "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test37794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 695);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test37795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37795");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116", "...1...                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37796");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'A');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1113" + "'", str3, "1113");
    }

    @Test
    public void test37797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37797");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\     \\     \\     \\     \\       \\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("575\\u0037200U", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "61\\ 61\\ 61\\ 61\\ 61\\ 611111111...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "575\\u0037200U" + "'", str3, "575\\u0037200U");
    }

    @Test
    public void test37799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37801");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("3AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\13AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 929);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37802");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\U0023\\U0023\\U0023\\U0023\\U002", "222222222222222222222222222222222222222222222222222222222222u   66666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("10hi!100", "U003                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!100" + "'", str2, "10hi!100");
    }

    @Test
    public void test37804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("161\\161\\161\\161\\161\\161\\u6                      \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37805");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", "023\\u0023\\u002361\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...UUUUUUUUUU", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37807");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", " 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test37808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37808");
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
    public void test37809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37809");
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
    public void test37810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37810");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0026666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 4, 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37811");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("1\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000", "77777777777777777777777777777777777777777777777777uuuuuuuuuaaaaaaa       3200u\\320");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "1111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111" + "'", str1, "1111111");
    }

    @Test
    public void test37813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37813");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("uuuuuuuuuaaaaaaa       3200u\\320", "33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ", 39, 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uuuuuuuuuaaaaaaa       3200u\\32033333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     " + "'", str4, "uuuuuuuuuaaaaaaa       3200u\\32033333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
    }

    @Test
    public void test37814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1                                                 ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\0u00020", "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\0u00020" + "'", str2, "\\0u00020");
    }

    @Test
    public void test37816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37816");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU33333333333333333333UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "AAAAAAA     \\u0041                                                                                           ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37817");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("uuuuuuuuuuuu 320011\\\\", "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...AAA                                             AAA       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37818");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", "uuuuuuuuuuuu 3200u           ", (int) 'h');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37819");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                           \\\\335c");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test37820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37820");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("5500\r\\", "23\\u###\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u", "A\\u0061\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\3AAAAAAAAAAAAAa000u\\", 69);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5500\r\\" + "'", str4, "5500\r\\");
    }

    @Test
    public void test37821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n", "......A000u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n" + "'", str2, "!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n");
    }

    @Test
    public void test37822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                  ", "                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  " + "'", str2, "                                                                                  ");
    }

    @Test
    public void test37823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("U0023                                                                                                                                                                                ", 148);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023                                                                                                                                                                                " + "'", str2, "U0023                                                                                                                                                                                ");
    }

    @Test
    public void test37824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37824");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      ", "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...h    h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...h    h..." + "'", str1, "...h    h...");
    }

    @Test
    public void test37826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("cccccccccccccccccccccccccccccccccc\n     ", "5555555                     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cccccccccccccccccccccccccccccccccc\n     " + "'", str2, "cccccccccccccccccccccccccccccccccc\n     ");
    }

    @Test
    public void test37827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37827");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("u6      61        61        61        61", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test37828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("00000000000000000000... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", 11, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("16U", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16U" + "'", str2, "16U");
    }

    @Test
    public void test37830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37830");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\U0023\\U00\\u0041\\U 1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", 1, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...", "\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu..." + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test37832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37832");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u002aaaaaaaaaaaaaa000u\\                                                                 a\\u" + "'", str1, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u002aaaaaaaaaaaaaa000u\\                                                                 a\\u");
    }

    @Test
    public void test37833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37834");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test37835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh    aaaaaaa                                                                                                        " + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh    aaaaaaa                                                                                                        ");
    }

    @Test
    public void test37836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "\\u0033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\", "AAA51AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37838");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test37839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37839");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000", (java.lang.CharSequence) "            2");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "000000000000000000000000000000000000000000000000000000000000" + "'", charSequence2, "000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test37840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc" + "'", str2, "ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc");
    }

    @Test
    public void test37841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37841");
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
    public void test37842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37842");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 113, "                                                                                             U\\32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\             " + "'", str3, "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\             ");
    }

    @Test
    public void test37843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37843");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...    ...", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1", 79);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37844");
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
    public void test37845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37845");
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
    public void test37846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37846");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'h', 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82 + "'", int2 == 82);
    }

    @Test
    public void test37847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37847");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0041                                                                                           ", "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37848");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37849");
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
    public void test37850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\\\\\u0020", "                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test37851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\i\\                       61\n                       ", 930, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...      61\n                       " + "'", str3, "...      61\n                       ");
    }

    @Test
    public void test37852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37852");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "23\\U0023\\U...uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37854");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37855");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 117, 497);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...                          ...", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3205761\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002" + "'", str2, "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002");
    }

    @Test
    public void test37858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37858");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "cccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37859");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  uuu", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0069", '.', '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0069" + "'", str3, "\\u0069");
    }

    @Test
    public void test37861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00", "U0023000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00" + "'", str2, "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00223\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u00");
    }

    @Test
    public void test37862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaa...616161616161616161616161");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0" + "'", str1, "Aaaaaaa     U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0");
    }

    @Test
    public void test37866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37866");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "UUUUUUUUUU...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37867");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) ' ', 460);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 460 + "'", int2 == 460);
    }

    @Test
    public void test37868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(".16 ", "                     61aaaaaaaaaaaaaaaaaaaaaa...", 267);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37869");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("U   6");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'U' + "'", char1 == 'U');
    }

    @Test
    public void test37870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\u0055                                            ", "ih01001!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih01001!ih0" + "'", str2, "ih01001!ih0");
    }

    @Test
    public void test37871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37871");
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
    public void test37872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37872");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61UUUUUUUUUU", (int) '\n', 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37873");
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
    public void test37874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37874");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", charSequence2, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37875");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "U0032\\U0032\\U0032\\U0032\\U0032\\U0032");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###\nAAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu###", 168, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###\nAAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu###" + "'", str3, "###\nAAA51AAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu###");
    }

    @Test
    public void test37877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\n\n\n\n\n\n\n\n\n\n\n\n                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test37878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37878");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200", (java.lang.CharSequence) "\\U0030\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37879");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "U00234                                      \\U0023\\U00\\U0                    ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ##", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("23\\U                                                                                      ", "\\u005c");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u005c" + "'", str2, "\\u005c");
    }

    @Test
    public void test37883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                            \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                             ", "5c11111111111111111111111111 61\\ 111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                             " + "'", str2, "                            \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                             ");
    }

    @Test
    public void test37884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37884");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("023\\U0023\\U0023\\U0023    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...\r                                                                                                                                                                                                         ", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa", "...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa");
    }

    @Test
    public void test37887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37887");
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
    public void test37888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37888");
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
    public void test37889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37889");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                         ...0023h\\hh0023h\\hh0023h                            ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37890");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test37891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                            aaaaaaaaaaaaa3200\\a                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            aaaaaaaaaaaaa3200\\a                                " + "'", str1, "                            aaaaaaaaaaaaa3200\\a                                ");
    }

    @Test
    public void test37892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37892");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           \\61\\61\\61\\61\\61\\61", 8);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37893");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "16\\", (java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37894");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) (byte) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str4, "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test37895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test37896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37896");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "h          aaaaaa\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H          aaaaaa\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\" + "'", str1, "H          aaaaaa\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\");
    }

    @Test
    public void test37897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "                 \\u0030\\\\\\\\                  ", "\r\r\r\r\r\r\r...                                      57");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test37899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37899");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 139);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37900");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 476);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 476 + "'", int2 == 476);
    }

    @Test
    public void test37901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u" + "'", str2, "u 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
    }

    @Test
    public void test37902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37902");
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
    public void test37903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\UUU02\\... 3hi!hi!hi!                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\UUU02\\...3hi!hi!hi!" + "'", str1, "\\UUU02\\...3hi!hi!hi!");
    }

    @Test
    public void test37904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37904");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37905");
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
    public void test37906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37906");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\1111111111111111111111111111u11111111111111111111111111110020", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ", 155, 43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              " + "'", str4, "\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ");
    }

    @Test
    public void test37907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA", "111111111111111111111111111111111111111111111111111                                                      ", "             U0023\\U002U0023\\U002U0023\\U002U0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAHHHHHHHHHHHHHHHHHAAAAAAAA" + "'", str3, "AAAAAAHHHHHHHHHHHHHHHHHAAAAAAAA");
    }

    @Test
    public void test37908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1111111111111111111111111111111111111111111110uhi!hi!hi!3000uhi!hi!hi!3111111111111111111111111111111111111111111111", "                                         \n\n1                                                    \n\n", "323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("d", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test37910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37910");
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
    public void test37911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37911");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) '2');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str6, "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test37912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("51AAAA", "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uU" + "'", str2, "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uU");
    }

    @Test
    public void test37913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37913");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                   U\\1400u\\00U\\3200U\\", "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   U\\1400u\\00U\\3200U\\" + "'", str2, "                                   U\\1400u\\00U\\3200U\\");
    }

    @Test
    public void test37915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             ", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuu3200", "\\IUI0020\\4\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\\U\\I\\U\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\n\\U" + "'", str3, "\n\\U\\I\\U\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\\\\I\n\\U");
    }

    @Test
    public void test37916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\1111111111111111111111111111u11111111111111111111111111110020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\1111111111111111111111111111u11111111111111111111111111110020" + "'", str1, "\\1111111111111111111111111111u11111111111111111111111111110020");
    }

    @Test
    public void test37917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 98, "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37918");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa", "555555555555555555555555555... 16 16 16 16 16 16 16 16 165555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h    h...55555555555555555555555555555555555555555555555555555555555555 61                                          ...h    h...555555555555555555555555555555" + "'", str3, "...h    h...55555555555555555555555555555555555555555555555555555555555555 61                                          ...h    h...555555555555555555555555555555");
    }

    @Test
    public void test37919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                   ", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test37920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37920");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("111111111111111111111U", "U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...\r", "AAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\r" + "'", str2, "...\r");
    }

    @Test
    public void test37922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37922");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("        75                                                                                                           ", "23\\U                                         ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\n\n\n\n\n", 108, 55);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test37923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("61\\\\U0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0200U\\\\16" + "'", str1, "0200U\\\\16");
    }

    @Test
    public void test37924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\u", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u" + "'", str2, "\\u");
    }

    @Test
    public void test37925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37926");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 930, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test37927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "UUUUUU 6\\\\U0020 6\\\\U0020 6              IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test37928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37928");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "23\\U0023\\U", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37929");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                          61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                        ", "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", "                   0041");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                          61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                        " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                          61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test37930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37930");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ", (int) '7', "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              " + "'", str3, "\\1111111111111111111111111111u111111111111123\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ");
    }

    @Test
    public void test37932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("75 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75 ..." + "'", str1, "75 ...");
    }

    @Test
    public void test37933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37933");
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
    public void test37934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U", "i!                                                                                   U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                                                                                   U0023" + "'", str2, "i!                                                                                   U0023");
    }

    @Test
    public void test37935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("60u0UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0U060\\\\0u000200U060\\\\0u000200U06");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "60u0UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0U060\\\\0u000200U060\\\\0u000200U06" + "'", str1, "60u0UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0U060\\\\0u000200U060\\\\0u000200U06");
    }

    @Test
    public void test37936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       UUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       UUUUUUU" + "'", str1, "\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       UUUUUUU");
    }

    @Test
    public void test37938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37938");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test37939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37939");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("6\\ 66\\ 6\\ 66\\ 6\\ 6 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "\\4003266666666666666666666666666666666666... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u3\\u0023\\u0023\\u0023\\u0023\\u00231\\40032", 267);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0032                                                                       ", "\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U                                            ", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37941");
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
    public void test37942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37942");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#", "                                                        ..       ", "  575757575757575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test37943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37943");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("2222222222222222222222", 449, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666662222222222222222222222" + "'", str3, "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666662222222222222222222222");
    }

    @Test
    public void test37944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("6  6  6  6  6", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        \\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37945");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                   \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37946");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test37947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37947");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAA     \\u0041                                                                                           ", "                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test37948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37948");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u002066666666666666666666666666666666666666", (java.lang.CharSequence) " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u002066666666666666666666666666666666666666" + "'", charSequence2, "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u002066666666666666666666666666666666666666");
    }

    @Test
    public void test37949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37949");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U00\\u0041\\U", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37950");
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
    public void test37951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37951");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "001!IH0...", (java.lang.CharSequence) "\\U0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "001!IH0..." + "'", charSequence2, "001!IH0...");
    }

    @Test
    public void test37952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\IIIIIIII\\U", "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test37953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("230U00230U00230U00230U00230U00230U00230U00230U00230U002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "230U00230U00230U00230U00230U00230U00230U00230U00230U002" + "'", str1, "230U00230U00230U00230U00230U00230U00230U00230U00230U002");
    }

    @Test
    public void test37954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37954");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ", "aaa", 66);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test37955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...aaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200uaaaaaaaaaaaaaa", "0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 476);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       " + "'", str3, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
    }

    @Test
    public void test37957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37957");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", (java.lang.CharSequence) "22222222222222222222uuu0023                                            222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         " + "'", charSequence2, "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
    }

    @Test
    public void test37958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                              23\\u0023\\u0023\\u0023\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAA3200\\A", "61\\\\u002", "                                         3300\\                                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test37960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37960");
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
    public void test37961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37961");
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
    public void test37962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37962");
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
    public void test37963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6" + "'", str1, "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6");
    }

    @Test
    public void test37964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37964");
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
    public void test37965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  UUUaaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 53, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                            aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test37967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37967");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...", (java.lang.CharSequence) "23\\U                                                                                            ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6..." + "'", charSequence2, "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...");
    }

    @Test
    public void test37968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0" + "'", str1, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
    }

    @Test
    public void test37969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37969");
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
    public void test37970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAA6516AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA6516AAA" + "'", str1, "AAA6516AAA");
    }

    @Test
    public void test37971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37971");
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
    public void test37972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("222222222222222222222222222222222222222222222U6                                          ", "\\4aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37973");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("1\\u1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6                                       ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...    ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...     61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 6", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37974");
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
    public void test37975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37975");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                      u003                    ", "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37976");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 930, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37977");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u00", 245);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        " + "'", str1, "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ");
    }

    @Test
    public void test37979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37979");
        char[] charArray6 = new char[] { ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                 \\u0030\\\\\\\\                  ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#61#6161\n\n\n\n\n\n\n\n", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...\\61\\61\\61\\61\\u0023     ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test37980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37980");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("3200U\\3200U\\u6623\\u6623\\u6623\\u6623\\u6623\\u6623U6663200U\\3200U\\3", "                    \\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37981");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test37982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37982");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAAA51AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA51AAA" + "'", str1, "AAAA51AAA");
    }

    @Test
    public void test37983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666" + "'", str2, "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
    }

    @Test
    public void test37984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                         75                          ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         75                          " + "'", str2, "                         75                          ");
    }

    @Test
    public void test37985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\" + "'", str1, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
    }

    @Test
    public void test37986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37986");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", "\\u", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test37987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "u0020u0020u0020u0020u0020u00\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\ru0020u0020u0020u0020u0020u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test37988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37988");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test37989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37989");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u002066666666666666666666666666666666666666", "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", 7);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("...11111111111111111111111111111111111111111111111111111111", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u", strArray1, strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u" + "'", str8, "\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u");
    }

    @Test
    public void test37990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\               ", 262);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                                                                                                                                                                 " + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                                                                                                                                                                 ");
    }

    @Test
    public void test37991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37991");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("###\n###", 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '#' + "'", char2 == '#');
    }

    @Test
    public void test37992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37992");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("11111111111111..", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test37993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6" + "'", str2, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
    }

    @Test
    public void test37994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37994");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    61        61        61        61        61        61        61        61        61        61        61        61        61    ", 63, "AAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    61        61        61        61        61        61        61        61        61        61        61        61        61    " + "'", str3, "    61        61        61        61        61        61        61        61        61        61        61        61        61    ");
    }

    @Test
    public void test37995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37995");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('I', 543);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543 + "'", int2 == 543);
    }

    @Test
    public void test37996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37996");
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
    public void test37997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37997");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('C', 685);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 685 + "'", int2 == 685);
    }

    @Test
    public void test37998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37998");
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
    public void test37999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test37999");
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
    public void test38000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest75.test38000");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "16\\", (java.lang.CharSequence) "2U2U2U2U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }
}

