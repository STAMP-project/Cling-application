import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest79 {

    public static boolean debug = false;

    @Test
    public void test39501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39501");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\n\n\n\n\n", 476);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ccccccccccccc\\U0068cccccc");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ccccccccccccc\\U0068cccccc" + "'", str1, "ccccccccccccc\\U0068cccccc");
    }

    @Test
    public void test39503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("..", 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test39504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test39505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("222222222222222222222222222222222222222222U6                                          ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222222222222222222222222222222222222222222U6                                          " + "'", str2, "222222222222222222222222222222222222222222U6                                          ");
    }

    @Test
    public void test39506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...3\\U0##########", "c5");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...3\\U0##########" + "'", str2, "...3\\U0##########");
    }

    @Test
    public void test39507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("..............................................", 85, "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..............................................6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "..............................................6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39508");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0063", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39509");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("000u", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu23                  \\U23\\U23\\U23\\U23\\U23\\U23\\U23");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39510");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("22223200U\\1400u\\00U\\3200U", '1', '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "22223200U\\2400u\\00U\\3200U" + "'", str3, "22223200U\\2400u\\00U\\3200U");
    }

    @Test
    public void test39511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666" + "'", str2, "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
    }

    @Test
    public void test39512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\                                           " + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\                                           ");
    }

    @Test
    public void test39513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...023\\U0023\\U00237575757575757575757575757575757575757", "hhhhhhhhhhhhhUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...023\\U0023\\U00237575757575757575757575757575757575757" + "'", str2, "...023\\U0023\\U00237575757575757575757575757575757575757");
    }

    @Test
    public void test39514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39514");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\40032", 'A');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("\r\r\r\r\r\r\r...                                      57", (java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 440, 296);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\40032" + "'", str4, "\\40032");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test39515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000" + "'", str1, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000");
    }

    @Test
    public void test39516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...0023h\\huh0023h\\huh0023h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0023h\\huh0023h\\huh0023h..." + "'", str1, "...0023h\\huh0023h\\huh0023h...");
    }

    @Test
    public void test39517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39517");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                        aaaaaaa     ", " 61\\ ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str6, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020" + "'", str7, "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020");
    }

    @Test
    public void test39518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39518");
        char[] charArray10 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U002322222", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A000U\\", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U61\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test39519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\..." + "'", str1, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\...");
    }

    @Test
    public void test39520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                            AAAAAAAAAAAAA3200\\A                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39521");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'u', 'A');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'u' + "'", char2 == 'u');
    }

    @Test
    public void test39522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("uuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444", "\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002         ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39523");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", strArray4);
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "    16        16        16        16        16        16        16        16        16        16        16        16        16    ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str8, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test39524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", "3\\u0023u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\u0023u0023\\u0023\\u0023\\u0023\\u002             " + "'", str2, "3\\u0023u0023\\u0023\\u0023\\u0023\\u002             ");
    }

    @Test
    public void test39525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39525");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\...", "6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\..." + "'", str2, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\...");
    }

    @Test
    public void test39527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0032\\40032\\40032\\40032\\40032\\40032\\40032\\4003", (java.lang.CharSequence) "U0023                                            66666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...\\61\\61\\61\\61\\U0023     ...", 440, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39529");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...00160000000016000000001600000000160000000016000000001600000000160000000016000000001", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U0032\\U0032\\U0032\\U0032\\U0032\\U003");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                            ccccccc      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test39532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023", "400u\\00U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39533");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\u0063", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("#61#6161\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#61#6161\n\n\n\n\n\n\n" + "'", str1, "#61#6161\n\n\n\n\n\n\n");
    }

    @Test
    public void test39535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("001!ih01", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001!ih01" + "'", str2, "001!ih01");
    }

    @Test
    public void test39536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39536");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...023\\U0023\\U00237575757575757575757575757575757575757", "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("\\", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("   u61    ", strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          ", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10hi!100" + "'", str12, "10hi!100");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          " + "'", str14, "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          ");
    }

    @Test
    public void test39537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                               555555555555555           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39538");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u000d");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39539");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                             aaa", "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 480);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test39540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39540");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "cccccccccccccccccccccccccccccccccc\n     ", "                                                                                                                                                                                                                                                              \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test39541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39541");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("UUUUUU 6\\\\U0020 6\\\\U0020 6");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'U' + "'", char1 == 'U');
    }

    @Test
    public void test39542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("3200u\\3200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u\\3200" + "'", str1, "3200u\\3200");
    }

    @Test
    public void test39543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                    23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23", "u 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u\\u0023\\uuuuuuuuuuuu 3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu...", "aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu..." + "'", str2, "   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu...");
    }

    @Test
    public void test39545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39545");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     ", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39546");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aa        75                                          ", "...6666666666666666666666666666666666666666666", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r..." + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r...");
    }

    @Test
    public void test39548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh....................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...................................................................................................." + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh....................................................................................................");
    }

    @Test
    public void test39549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str1, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test39550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("            2", 30, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".................            2" + "'", str3, ".................            2");
    }

    @Test
    public void test39551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("616161616161616161616161616161616161616161616161616161616161u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023", "...6666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "616161616161616161616161616161616161616161616161616161616161u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023" + "'", str2, "616161616161616161616161616161616161616161616161616161616161u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023");
    }

    @Test
    public void test39552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39552");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\\\u0023\\", (java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "               " + "'", str4, "               ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test39553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39553");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "6\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\6161\\61\\61\\61\\61\\616\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0", (java.lang.CharSequence) "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "6\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\6161\\61\\61\\61\\61\\616\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0" + "'", charSequence2, "6\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\6161\\61\\61\\61\\61\\616\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0");
    }

    @Test
    public void test39554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("5555555                     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555                     ..." + "'", str1, "5555555                     ...");
    }

    @Test
    public void test39555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 729, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "77777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6", '0');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0075", 51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAA\\20uuu\\20uuu\\20uuu\\                                               uuuuuuuuuuuu2" + "'", str1, "AAAAAAAAAAAAA\\20uuu\\20uuu\\20uuu\\                                               uuuuuuuuuuuu2");
    }

    @Test
    public void test39560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("5555555                     ..", "\\u0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555                     .." + "'", str2, "5555555                     ..");
    }

    @Test
    public void test39561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("57575757575757575757575757575757575757575757575757575757575757575757575757575757575757575757575757575757575757571        61        615C    61        61        61", "6161616161616161616161616");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("2...........................................................................................................................................................................................................................................................................................................................................................", "    61        61 ...II\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023       AAAAAAAIIII\\U0023\\U0023\\U0023\\U0023\\U0023\\U0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39563");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00", 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39564");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!1", "1                                                 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39565");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0023AAAAAAAAAAAAA", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\\u002066666666666666666666666666666666666666", 101, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "u61                                         ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39568");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test39569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "61\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39570");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("u 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..", "777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777", 213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu" + "'", str1, "57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu");
    }

    @Test
    public void test39572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39572");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\\\", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r" + "'", str1, "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test39574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39574");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\32\\U0068", "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", 0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...u32u32u32u32u32u32u32u...u32u32u32u32u32u328" + "'", str5, "...u32u32u32u32u32u32u32u...u32u32u32u32u32u328");
    }

    @Test
    public void test39575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("u0023                                                                             hi!hi!hi!", "aa        75                                          aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "U6");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAA     \\u0041                                                                                           ", "AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39577");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u   2UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                             11111", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39578");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u", 29, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39579");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi" + "'", str1, "###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi");
    }

    @Test
    public void test39580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39580");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\ 61\\61", 280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                               \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n", (int) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n#########################################" + "'", str3, "                               \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n#########################################");
    }

    @Test
    public void test39582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39582");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("161\\ 61\\ 6161\\ 61\\ 6161\\ ", "1\\ ");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666" + "'", str5, "                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
    }

    @Test
    public void test39583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39583");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", ".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 183, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6       ", "3000u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6       " + "'", str2, "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6       ");
    }

    @Test
    public void test39586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("  \\     \\     \\     \\     \\     ", "000000000000000000000000000000...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\     \\     \\     \\     \\     " + "'", str2, "  \\     \\     \\     \\     \\     ");
    }

    @Test
    public void test39587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39587");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("  \\\\0020                                                                                 ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test39588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U0023\\u0... U", 107);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\u0... U                                                                                              " + "'", str2, "U0023\\u0... U                                                                                              ");
    }

    @Test
    public void test39589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39589");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("777777777777777777777777777777777777777777    61    7777777777777777777777777777777777777777777", (int) '6', 370);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                          4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test39591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU   " + "'", str1, "  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU   ");
    }

    @Test
    public void test39592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006", "            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39593");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...", "61                                                300U\\                                                300Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39594");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u", 93, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\uuAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "\\uuAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39595");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 23", "11111111111111..", 20);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("\n     ", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " 23" + "'", str8, " 23");
    }

    @Test
    public void test39596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39596");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                         U0023\\U002U0023\\U002U0023\\U002U0", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ", (int) 'h');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("aa        75                                          ", strArray1, strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aa        75                                          " + "'", str7, "aa        75                                          ");
    }

    @Test
    public void test39597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39597");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("10hi!10010hi!161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U10hi!10010hi!1", "3333333333333333333333333333333333                                                                             6u623\\U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39598");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("       ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00       ", "1111111111111111111111111111111111111113\\u1111111111111111111111111111111111111111111116111111111111111111111111111111111111111", "...AAAA      UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39599");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("3333361                                    ", " 61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39600");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray7, strArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("\r", strArray7, strArray15);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", "a");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray7, strArray20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.concatWith("\\\\2\\\\\\\\\\2\\\\\\ 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r" + "'", str17, "\r");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    " + "'", str21, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str22, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10hi!100" + "'", str24, "10hi!100");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10hi!100" + "'", str27, "10hi!100");
    }

    @Test
    public void test39601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39601");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                              11111                             ", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39602");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "   a                             ", "3\\u0...", 635);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test39603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39603");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("AAA51AAAA", (java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("    3    ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00", strArray4, strArray7);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str8, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test39604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "uUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "61UUUUUUUUUUUUHI!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61UUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  ......  \\u00410023\\U0023\\U0023\\U0023\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ", 85);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  ......  \\u00410023\\U0023\\U0023\\U0023\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str4, "  ......  \\u00410023\\U0023\\U0023\\U0023\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test39607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111", "                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111" + "'", str2, "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111");
    }

    @Test
    public void test39608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6" + "'", str2, "161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
    }

    @Test
    public void test39609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", 349, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test39610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\", "20\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa" + "'", str2, "UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa");
    }

    @Test
    public void test39611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39611");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023", "                                                                                                    ", (int) (byte) 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0020", strArray4, strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "uuuuuuuuuaaaaaaa       32\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111\\U003");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\u0020" + "'", str10, "\\u0020");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\u0023" + "'", str13, "\\u0023");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0023" + "'", str14, "\\u0023");
    }

    @Test
    public void test39612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39612");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39613");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "222222222222222222222222222222222222222222222u6                                          ", 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                   0041\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4", "                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39615");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "H61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1\\U0030uUu\\", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                         " + "'", str2, "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                         ");
    }

    @Test
    public void test39617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test39618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuu..." + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test39619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39619");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("iiiiiiiiiiiiiiiiiiiii...uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiii", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    44444444444444444444", "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................61aaaaaaaaaaaaaaaaaa", 203);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iiiiiiiiiiiiiiiiiiiii...uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiii" + "'", str4, "iiiiiiiiiiiiiiiiiiiii...uuuuuuuuuuiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test39620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39620");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39621");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39622");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a000u\\", "    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006", "555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("               3200", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023u666", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "3200U\\3200U\\\\i\\3200U\\3200U\\3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39625");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ UUU", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   ", 70, 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39628");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("11111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("222222222222222222222222222222222222222222222u                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222222222222222222222222222222222222222222u                                           " + "'", str1, "222222222222222222222222222222222222222222222u                                           ");
    }

    @Test
    public void test39631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("161\\161\\161\\161\\161\\161\\u6                      \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n", "55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\161\\161\\161\\161\\161\\u6                      \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n" + "'", str2, "61\\161\\161\\161\\161\\161\\u6                      \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test39633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39633");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("11111111111111.");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("iiiiiiii\\u", strArray3);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", strArray3, strArray5);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         " + "'", str6, "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test39634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61" + "'", str2, "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
    }

    @Test
    public void test39636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ", "aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 16");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("##############################################.16 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################.16" + "'", str1, "##############################################.16");
    }

    @Test
    public void test39638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39638");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                   20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39639");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                 \\u0036                                                                 ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUU...", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test39640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39640");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...000000000000000000000000000000000000000000000000000000000000...", "1111U0023#U0023#U0023#U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                                      ", "61uuuuuuuuuuuuhi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61uuuuuuuuuuuuu", 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                      " + "'", str3, "                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test39642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39642");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61        61        61        61        61        61        61        61        61        61        61        61        61   ", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                    \n\n1", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray12);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test39643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61" + "'", str1, "61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61");
    }

    @Test
    public void test39644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39644");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\U0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61HI!", (java.lang.CharSequence) "aaaaaaaaaaaaa...000200002000020000200002000020000200002000020...\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test39646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39646");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\n\n\n\n\n", 26, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("111111111111111111111u6111111111111111111111", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                        U0023\\U002U0023\\U002U0023\\U002U0                                                                                                                                                                         ", "8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu003u0023u0023u0023u0023u0023u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55", 288);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu003u0023u0023u0023u0023u0023u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55" + "'", str2, "5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu003u0023u0023u0023u0023u0023u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55");
    }

    @Test
    public void test39650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39650");
        char[] charArray6 = new char[] { ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("A...\\61\\61\\61\\61\\U0023     ...A", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test39651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\" + "'", str2, "6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
    }

    @Test
    public void test39652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006" + "'", str1, "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
    }

    @Test
    public void test39653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39653");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU", 189, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "555555555555555555555555555555555555555555666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU" + "'", str3, "555555555555555555555555555555555555555555666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39654");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("           \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  ......  77777777777777777777777777777777777777777777777777777777777777777777777", 667, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII  ......  77777777777777777777777777777777777777777777777777777777777777777777777IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII  ......  77777777777777777777777777777777777777777777777777777777777777777777777IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test39656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111\\u0023\\u0023 6u\\161\\161\\161\\161\\161\\161" + "'", str1, "1111111111111111111111111111\\u0023\\u0023 6u\\161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test39657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39657");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ", "616161616161616161616161616161616161616161616161616161616161", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 616161616161616161616161616161616161616161616161616161616161\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ " + "'", str3, "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 616161616161616161616161616161616161616161616161616161616161\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ");
    }

    @Test
    public void test39658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39658");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222", "\\4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39659");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\u0055                   23\\u0023\\u0023        75023\\u0023\\u001111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa222222222222222222222222222222222222222222222u6                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39661");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                  \\U0023\\U00\\u0041\\U                                   ", "a\\U0023AAAAAAAAAAAAAA000U\\", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39662");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str4, "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test39663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39663");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", " 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray8, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray8);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "   u61    ");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", strArray3, strArray17);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, '6', 192, 164);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str14, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002" + "'", str19, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test39664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " 61\\ 61\\ 61...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0... 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "a11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" 61\\ 6161\\ 61\\ 6161\\ ", "U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 6161\\ 61\\ 6161\\ " + "'", str2, " 61\\ 6161\\ 61\\ 6161\\ ");
    }

    @Test
    public void test39667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("3\\U", "002300230023002300230023002300230a000u\\002300230023002300230023002300230");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\U" + "'", str2, "3\\U");
    }

    @Test
    public void test39668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("75 ", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n666U3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\326");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "75 " + "'", str2, "75 ");
    }

    @Test
    public void test39669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39669");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("222222222222222222222222222222222222222222222u      7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\222222222222222222222222222222222222222222222u      ", "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 358, 12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "22222222222261\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str4, "22222222222261\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39670");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39671");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...", "...u0023\\u\\4003u0023\\u0023\\u0##########u0023u0023\\u00...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 71, "3");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33333333333AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA333333333333" + "'", str3, "33333333333AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA333333333333");
    }

    @Test
    public void test39673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39673");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("11111111111111...", "   2 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ", 50, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 " + "'", str3, "16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ");
    }

    @Test
    public void test39675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", "A\\u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A\\u0023AAAAAAAAAAAAA" + "'", str2, "A\\u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test39676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39676");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "\\ 61\\ 61\\61u 61\\ 61\\61002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39677");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("023\\u0023\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\321\\ u1\\ 1\\ 1\\ 1\\ 1\\  1\\ u1\\ 1\\ 1\\ 1\\ 1\\", (int) '3');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39678");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c\\u00", "U61", (int) 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "       ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", strArray5, strArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", strArray5);
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str11, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str12, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test39679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("h                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h                                                                " + "'", str1, "h                                                                ");
    }

    @Test
    public void test39680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\\\2\\\\\\\\\\2\\\\\\56156156156156156156156uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39681");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0023 hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39682");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "iiiiiaaaaaa                             iiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiaaaaaa                             iiiiii" + "'", str1, "iiiiiaaaaaa                             iiiiii");
    }

    @Test
    public void test39684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39684");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("u661616161", 11, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\4   ", "  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("      3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu61uuuuuuuuuuuuuuuuuu3\\u0...\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU61UUUUUUUUUUUUUUUUUU3\\U0...\\U00" + "'", str1, "      3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU61UUUUUUUUUUUUUUUUUU3\\U0...\\U00");
    }

    @Test
    public void test39687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39687");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......", (int) (byte) -1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "61\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str5, "61\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "61\\aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str6, "61\\aa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23\\Uaa23 ...61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39688");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                           U", (java.lang.CharSequence) "016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                           U" + "'", charSequence2, "                                                                                           U");
    }

    @Test
    public void test39689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\r\r\r\r\r\r", (int) ' ', 173);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r" + "'", str3, "\r\r\r\r\r\r");
    }

    @Test
    public void test39690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) 'A', 22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39691");
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1111111", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ih", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test39692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39692");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("23                                               ...", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0055", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                     ", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", charArray14);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 14 + "'", int22 == 14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test39693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                   0041\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4", 234, 191);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "i!        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 28, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444...023\\U0023\\U0023757");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaauuuuuuuuu 023\\u0023", "\n\n\n\n\n\n\n\n\n\n\n\n                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaauuuuuuuuu 023\\u0023" + "'", str2, "aaaaaaauuuuuuuuu 023\\u0023");
    }

    @Test
    public void test39698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39698");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("6666666666666666666", "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39699");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("300000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "300000" + "'", str3, "300000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "300000" + "'", str4, "300000");
    }

    @Test
    public void test39700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("u003aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u003aaaaaa" + "'", str1, "u003aaaaaa");
    }

    @Test
    public void test39701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       100023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023100                       " + "'", str1, "                       100023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023100                       ");
    }

    @Test
    public void test39702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                ", "161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016", "                                                                                                                                                                                                           3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\300U\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                " + "'", str3, "                ");
    }

    @Test
    public void test39703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("       11111111111111..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111.." + "'", str1, "11111111111111..");
    }

    @Test
    public void test39704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                    ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39705");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\U0023\\U002", "...uuuuuuuuuu", 25);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test39706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39706");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    uuuuuuuuuuuuuuuuu                                                                                      3200U\\1400\\00U\\3200U\\uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    uuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    uuuuuuuuuuuuuuuuu                                                                                      3200U\\1400\\00U\\3200U\\uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    uuuuuuuuuuuuuuuuuu" + "'", str1, "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    uuuuuuuuuuuuuuuuu                                                                                      3200U\\1400\\00U\\3200U\\uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    uuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6..." + "'", str1, "AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...");
    }

    @Test
    public void test39708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0000000000000000000000000000000000000000000000000000000", 80, '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n0000000000000000000000000000000000000000000000000000000\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n0000000000000000000000000000000000000000000000000000000\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test39709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39709");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test39710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39710");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                              23au0023au0023au0023au0023au0023au0023au0023au0023au002", (int) '2');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test39711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        \\UUU                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "        \\UUU                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39712");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "5c11111111111111111111111111 61\\ 1111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("u661616161", "3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "a                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u661616161" + "'", str3, "u661616161");
    }

    @Test
    public void test39714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("1\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66" + "'", str1, "1\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
    }

    @Test
    public void test39716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39716");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39717");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                    ", (java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 356 + "'", int2 == 356);
    }

    @Test
    public void test39718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39718");
        char[] charArray17 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray17);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    ", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAaaaaaaaaaaaaaaaa...023\\u0061\\u0061\\u0 61 \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray17);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", charArray17);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test39719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39719");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                             136u66136u", "... 61uuuuuuuuuuuuuuuuuuuuu   u61");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("       ...\r", '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...\r" + "'", str2, "       ...\r");
    }

    @Test
    public void test39721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39721");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a000u\\", 'h');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith(" 61UUUUUUUUUU", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a000u\\" + "'", str4, "a000u\\");
    }

    @Test
    public void test39722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39722");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str3, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
    }

    @Test
    public void test39723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333", 147);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333                              " + "'", str2, "                              001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333                              ");
    }

    @Test
    public void test39724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39724");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ ", 181, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39725");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033                   ", "aaaaaaaaa 61aaaaaaaaaaaaa5555555                                             ...aaaaaaaaa 61aaaaaaaaaaaaa", (int) (short) 100);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                     ");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                              ", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 39 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test39726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39726");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111", "I");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '6', 102, 57);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                               ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111" + "'", str8, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test39727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA1111111111111111111111111111111111111111111111                                            5500U\\AAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA1111111111111111111111111111111111111111111111                                            5500U\\AAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA1111111111111111111111111111111111111111111111                                            5500U\\AAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", (int) (short) -1, 129);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test39729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39730");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16", (java.lang.CharSequence) "                                23\\u0023\\u0023\\u00236                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 613\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16" + "'", charSequence2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16");
    }

    @Test
    public void test39731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39731");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39732");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("65                                  5a5757575757575757575757575757575757575757575751115757575757575757575757575757575757575757575751115", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39733");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "   2     ...                                ...    \\U002", 237);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39734");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                            ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test39735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39735");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                    16uAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "002300230023002300230023002300230A000U\\002300230023002300230023002300230");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39737");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                 a                                                  ", (java.lang.CharSequence) "161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39738");
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "00u\\3200u\\3200u\\3200u\\3200u\\3200", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test39739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("1hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test39740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39740");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaa...", "1111111111111111111111111111111111111111111113\\u0003\\u0111111111111111111111111111111111111111111111", 729);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6", " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...AAA                                             AAA       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39742");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61uuu", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U0\\0023\\0023\\0023\\0023\\0023\\0023\\0023...", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test39743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39743");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("111111111111111111111111                                                                      ", 191, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh111111111111111111111111                                                                      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh111111111111111111111111                                                                      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test39744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("uuuuuuuuuuuu 320011\\\\", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuu 320011\\\\" + "'", str2, "uuuuuuuuuuuu 320011\\\\");
    }

    @Test
    public void test39745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "....................................................................................................                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39746");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...                                    ", 'c');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16U \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test39747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r8", "                                                                                                                                                                                                         Aaaaaaaaaaa...      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                ", 108);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39748");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "2............111111111111111111111111111111111111111111111..............................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39749");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'u' + "'", char1 == 'u');
    }

    @Test
    public void test39750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39750");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test39751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39751");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "U002322222                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0000000000000000000000000000000000000000000000000\\u0037", "####AU", "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000\\u0037" + "'", str3, "0000000000000000000000000000000000000000000000000\\u0037");
    }

    @Test
    public void test39753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            " + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ");
    }

    @Test
    public void test39754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39754");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'A');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 227, 173);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test39755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("     8", "1\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     8" + "'", str2, "     8");
    }

    @Test
    public void test39756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39756");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u0000230023", 183, 685);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ", 440, 110);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    " + "'", str3, "...h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
    }

    @Test
    public void test39758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("61\n                       ", "7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str2, "7575757575757575757575757575757575757575757573200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test39759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39759");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "6...0000000000000000000000000000000", (int) '6', 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0023\\u06...0000000000000000000000000000000\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, "\\u0023\\u06...0000000000000000000000000000000\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39760");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", 60);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u   2", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str6, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test39761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39761");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "23002300230023002300230023002300230023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023    ", "\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023    " + "'", str3, "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023    ");
    }

    @Test
    public void test39763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39763");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('4', 205);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test39764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...     32", 26, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUU...     32" + "'", str3, "UUUUUUUUUUUUUUUU...     32");
    }

    @Test
    public void test39765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "          11111111111u6111111111111111111111          ", "###\n##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("   2", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                           4300u\\", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           4300u\\" + "'", str2, "                                           4300u\\");
    }

    @Test
    public void test39768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39768");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("uuu  6  6  6  6  6  ", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  555555", "23                                               ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test39769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhh" + "'", str1, "UUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhh");
    }

    @Test
    public void test39770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\n\n\n\n\n\n\n\n\n\n", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39771");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "11111111111111111111111111111...", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\U0055", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test39772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("1111111      ", "i!                                                                                   U0023", 156);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111      " + "'", str3, "1111111      ");
    }

    @Test
    public void test39773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39773");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               555555555555555           ...11111111113\\u0...", "\\U0023\\U...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII 6\\\\U0020IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test39775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 'i', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39777");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1", 440);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("55          aaaaaaa       ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39779");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                          23\\U0023\\U                                          ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39780");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...3\\u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111...3\\u...                                   ", "AAAA...", 108);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39781");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                 \\uhi!hi!hi!                        ", "     \\U0023\\U00\\u0041\\U0023     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'I', "                  \\\\\\aaaaaaaaaaaaa\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39783");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111", "\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test39784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 83, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str3, "0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test39785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61.##############################################", " 61.####################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61.##############################################" + "'", str2, "61.##############################################");
    }

    @Test
    public void test39786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39786");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...H31\\H31\\H31\\H31\\H31\\H31\\H31\\H..." + "'", str1, "...H31\\H31\\H31\\H31\\H31\\H31\\H31\\H...");
    }

    @Test
    public void test39788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39788");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...............................................................................\\u0034", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "8     8     8     8     8     8     8     8  8     8     8     8     8     8     8    ", charArray16);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 84 + "'", int25 == 84);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test39789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39789");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("U61", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ", "0023\\u0023\\u0023\\u0023\\uAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         U####AU####AU####AU####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  " + "'", str2, "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ");
    }

    @Test
    public void test39791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39791");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("U0023#U0023#U0023#U0023#U0023#U0023#U0023      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39792");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A\\U0023AAAAAAAAAAAAAA000U\\", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AUAAAAAAAAAAAAAAU" + "'", str3, "AUAAAAAAAAAAAAAAU");
    }

    @Test
    public void test39793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39793");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            0uUu\\u3200uUu\\u3200uUu\\..." + "'", str2, "                                            0uUu\\u3200uUu\\u3200uUu\\...");
    }

    @Test
    public void test39795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                  75", ".16 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  75" + "'", str2, "                                                  75");
    }

    @Test
    public void test39796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39796");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002361\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                                                                                               !ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39797");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                300u\\", 685, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                300u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                300u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39798");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("2\\", "  \\U005C  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u", (java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2" + "'", str4, "2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test39799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "11111                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test39801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "\\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\u003 \\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\1111111111111111111111111111u11111111111111111111111111110020", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39803");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U", 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39805");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("UUUUUUUUUUUUUUUUUU\\4555555555555555555555555");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'U' + "'", char1 == 'U');
    }

    @Test
    public void test39806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39806");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " \\u003 ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U0006", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u\\3200u\\32", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test39807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUU\\4555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39808");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r8", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ", 112);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hhhhhhhhhhhhhhhhhh   U61    ", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...11111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhh   U61    " + "'", str2, "hhhhhhhhhhhhhhhhhh   U61    ");
    }

    @Test
    public void test39810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39810");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                  ...", 118, 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", "AAAA15AAAA", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39812");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u002", 202, 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39813");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                        ...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39814");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\n\n\n\n\n1");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("0023\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test39815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39815");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "61.####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39816");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu" + "'", str5, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 48, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "777777777777777777777777777777777777777777777777" + "'", str3, "777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test39818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39818");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\U0033", "333333333333333333333333333333333333333333333333333333333333333333333333333333310HI!100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\\U0061\\U0061\\U\\U0023\\U0061\\U0061\\U0                              ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0061\\U0061\\U\\U0023\\U0061\\U0061\\U0                              " + "'", str2, "\\U0061\\U0061\\U\\U0023\\U0061\\U0061\\U0                              ");
    }

    @Test
    public void test39820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39820");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("6U665CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6666666666666666666", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\  \\\\0020                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\nu002                                         \n\n1                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u002                                         \n\n1" + "'", str1, "u002                                         \n\n1");
    }

    @Test
    public void test39822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0023\\0023\\0023\\ U", "uuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\0023\\0023\\ U" + "'", str2, "0023\\0023\\0023\\ U");
    }

    @Test
    public void test39824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                         \\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         \\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "                                                         \\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test39825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39825");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("575\\u0037200U\\", 449);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "22222A2AAUA  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39828");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("UU", "           ...000000000000000000000000000000000000000000000000000000000000...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39829");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("55555555555555555555555555555555555555555555555#####4", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39830");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\U0023AAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39831");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("616161616161616161616161616161616161616161616161616161616161", "u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau0", "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002", 178);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "616161616161616161616161616161616161616161616161616161616161" + "'", str4, "616161616161616161616161616161616161616161616161616161616161");
    }

    @Test
    public void test39832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39832");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  UUU", 'A');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39833");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555             U0023\\U002U0023\\U002U0023\\U002U0555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "iii", 288);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U" + "'", str1, "11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U");
    }

    @Test
    public void test39835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39835");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("c5", "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#####aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa#####", 456);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa#####" + "'", str2, "#####aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa#####");
    }

    @Test
    public void test39837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39837");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                        ", "u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39838");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HcuuuuuuUUUUUUUUUUUUUUUUUU\\4555555555555555555555555", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" 6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6              ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, " 6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\02" + "'", str1, "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\02");
    }

    @Test
    public void test39841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39841");
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61\\\\u002", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "23\\u0023\\u...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test39842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39842");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hi!", (int) ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach(" 61", strArray8, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("\\", strArray3, strArray8);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " 61" + "'", str13, " 61");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\" + "'", str14, "\\");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\u0061" + "'", str15, "\\u0061");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test39843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0041\\u0", "\\61\\61\\61\\61\\u0023     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0041\\u0" + "'", str2, "0041\\u0");
    }

    @Test
    public void test39844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39844");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39845");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" \\u003 ", 'h');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \\u003 " + "'", str3, " \\u003 ");
    }

    @Test
    public void test39846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39846");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39847");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1110023", "U0023", 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "6                                     6    11111111111116                                     6     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test39849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaa", 260);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                aaa                                                                                                                                 " + "'", str2, "                                                                                                                                aaa                                                                                                                                 ");
    }

    @Test
    public void test39850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39850");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555             U0023\\U002U0023\\U002U0023\\U002U0555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "          11111111111u6111111111111111111111          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 73, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39852");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("u0020u0020u0020u0020u0020u00\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\ru0020u0020u0020u0020u0020u0", "001\\u00", 729);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39854");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u", "111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111", 137);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39855");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("   ...", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" 61.####################################################################################################", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test39856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39856");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("        75");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", strArray2, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", str9, "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "        75" + "'", str10, "        75");
    }

    @Test
    public void test39857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("111111116 \\16 \\16 \\16 \\16 \\16", "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16U \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39858");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###u\\32                                                                             ", "        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        753333333333333333333333333        75");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6              ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("uuuuuuuuuuU6uuuuuuuuuuu                        ##############################################################################################################################################################################################", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###uuuuuuuuuuuU6uuuuuuuuuuu                        ##############################################################################################################################################################################################" + "'", str6, "u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###uuuuuuuuuuuU6uuuuuuuuuuu                        ##############################################################################################################################################################################################");
    }

    @Test
    public void test39859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39859");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaa");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("    61        61        61        61        61        61        61        61        61        61        61        61        61   ", "AAA51AAAA", 11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                      61\\ 61\\61", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test39860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4", (-1), 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test39861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39861");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test39862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaa", 0, 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa" + "'", str3, "aaaaaa");
    }

    @Test
    public void test39864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39864");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ", "3200U\\3200U\\3200\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test39866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\" + "'", str2, "u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
    }

    @Test
    public void test39867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39867");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61\\Aaaaaaaaaaaaa\\\\\\ ...", (java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test39868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ", "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("616161616161616161616161\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\n\n\n\n\n\n\n\n\n\n\n\\\\i\\                       61\n                       ", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032" + "'", str8, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\\\\i\\                       61\n                       " + "'", str10, "\n\n\n\n\n\n\n\n\n\n\n\\\\i\\                       61\n                       ");
    }

    @Test
    public void test39869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39869");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test39870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39870");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaa", "\n\n1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a", "                             7777777777777777777");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a");
    }

    @Test
    public void test39872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222", "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222" + "'", str2, "u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222u002322222");
    }

    @Test
    public void test39873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ", 234, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, " \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test39874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                       ", 354);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test39875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39875");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ", "...00160000000016000000001600000000160000000016000000001600000000160000000016000000001", "                                            3200");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaa   u  2 u  2 u  2 u  2 u  2 u  2 u  2 u  2 u  2           " + "'", str3, "aaaaaaaaaaaaa   u  2 u  2 u  2 u  2 u  2 u  2 u  2 u  2 u  2           ");
    }

    @Test
    public void test39877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61                                                                             6u666                                                                  ", "23     ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39878");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100", '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100" + "'", str2, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100");
    }

    @Test
    public void test39880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                             6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0", '\n', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                             6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0" + "'", str3, " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                             6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0");
    }

    @Test
    public void test39881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("23", (int) '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39882");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("6                                     6    11111111111116                                     6     ", "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39883");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, " 61.");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023", strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("16U", strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("UUUUUUUUUUU6UUUUUUUUUUU", strArray10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test39884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39884");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('A', 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test39885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39885");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 117 + "'", int1 == 117);
    }

    @Test
    public void test39886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaa                            ", "  \\\\0020                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa                            " + "'", str2, "aaaaaa                            ");
    }

    @Test
    public void test39887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                AAAA15AAAA                 ", 82, 118);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                AAAA15AAAA                 " + "'", str3, "                AAAA15AAAA                 ");
    }

    @Test
    public void test39888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0200iui\\", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0200iui\\                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "0200iui\\                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test39889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                                                      6u666", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                      6u666" + "'", str2, "                                                                                                                      6u666");
    }

    @Test
    public void test39890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39890");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 203);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 203 + "'", int2 == 203);
    }

    @Test
    public void test39891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "A     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu", 433, "16        16        16        16        16        16        16        16        16        16        16        16        16");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "16        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16  uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu" + "'", str3, "16        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16        16        16        16        1616        16        16        16        16        16        16        16        16  uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("111111111111111 61..", "                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111 61.." + "'", str2, "111111111111111 61..");
    }

    @Test
    public void test39894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39894");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuu...", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                            ", "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\1111111111111111111111111111\\u0023\\u0023                                              6u\\161\\161\\161\\161\\161\\16120\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ", 126);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                            " + "'", str3, "                                                            ");
    }

    @Test
    public void test39896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39896");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " ##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39897");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" \\u003 ", "u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39898");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39899");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                   ", "    61    ", (int) (short) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny(".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test39900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("21", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "21" + "'", str2, "21");
    }

    @Test
    public void test39901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "1\\u00234                                      \\u0023\\u00\\U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "hAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         " + "'", str1, "                                         ");
    }

    @Test
    public void test39903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39903");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u002066666666666666666666666666666666666666", "001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333", 6);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\u", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\u" + "'", str2, "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\u");
    }

    @Test
    public void test39905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39905");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023", 480);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666" + "'", str4, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCu6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
    }

    @Test
    public void test39906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("i!                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0023\\u00 61\\ 61\\61\n\n\n\n\n\n\n\n", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39907");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39908");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("   ", "10hi!100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39909");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00000000", 497);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39911");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                                      200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32              ", (java.lang.CharSequence) "...\\61\\61\\61\\61\\u0023     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test39912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39912");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "00000000    2222222222222222222222222222222220000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000    2222222222222222222222222222222220000000" + "'", str1, "00000000    2222222222222222222222222222222220000000");
    }

    @Test
    public void test39913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                    ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100", strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test39914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUUUUUUUUUUUUUUUUUUUUU", (int) 'u', 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "61Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39916");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0030\\\\\\\\", "hi!hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0030\\\\\\\\" + "'", str3, "\\u0030\\\\\\\\");
    }

    @Test
    public void test39917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39917");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     ", 358);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\u0061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061" + "'", str1, "\\u0061");
    }

    @Test
    public void test39919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39919");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("16161616161616161616161616", 0, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaa", "u6      61        61        61        61      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test39921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\", '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\" + "'", str2, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\");
    }

    @Test
    public void test39922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39922");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                       aaaaaaaaaaaaa\\\\", (int) '0', 31);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0075", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", 0);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "hi!", (int) ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach(" 61", strArray14, strArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray14);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split("I!", "61.");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray14, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####", strArray3, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 11 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " 61" + "'", str19, " 61");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str24, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39923");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u", '5');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                    \n                     ", strArray3, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                    \n                     " + "'", str7, "                    \n                     ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u" + "'", str9, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A\\u");
    }

    @Test
    public void test39924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39924");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "666666666666666666666666666666666666666666666666666666666aaa", (java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAA...", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAA...                                                                                                                " + "'", str2, "AAAAAAAAAAAAAAAAAAAAAA...                                                                                                                ");
    }

    @Test
    public void test39927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U");
    }

    @Test
    public void test39928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39928");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("UUUU61UUUU                              23u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUU61UUUU                              23u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U00" + "'", str1, "UUUU61UUUU                              23u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U0023u0023\\u0023\\u\\4003u0023\\u0023\\u0##########U00");
    }

    @Test
    public void test39929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                  ...", 192);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  ..." + "'", str2, "                  ...");
    }

    @Test
    public void test39930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...0000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                 \\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! \\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! \\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39932");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("uu03uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 9, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uu03uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uu03uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test39933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39933");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a         ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '5');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23hi!hi!hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test39934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39934");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'u', (int) '5', 7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhh", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("\\U0023\\U00\\u0041\\U                                   ", strArray3, strArray12);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\U0023\\U00\\u0041\\U                                   " + "'", str14, "\\U0023\\U00\\u0041\\U                                   ");
    }

    @Test
    public void test39935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39935");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test39936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '.', "61                                         \n\n1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61", "       UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test39938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39938");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\4\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\4" + "'", str1, "\\4");
    }

    @Test
    public void test39939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39939");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "  ......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test39941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D...", 296);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D..." + "'", str2, "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D...");
    }

    @Test
    public void test39942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "61\\ 61\\ ...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444uuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39943");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test39944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0" + "'", str1, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0");
    }

    @Test
    public void test39945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39945");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test39946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39946");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaa                             hhhhhhhhhhhhhhhhh", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 29, 48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaa                       \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rhhhh" + "'", str4, "aaaaaa                       \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rhhhh");
    }

    @Test
    public void test39947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39947");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAAA      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "Aaaaaaaaaaaaa\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("5C", "                                       aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5C" + "'", str2, "5C");
    }

    @Test
    public void test39950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39950");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200", "!ih!ih!i", "                                                                                                                                                                                                                     3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test39952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\U0032\\U0032\\U0032\\U0032\\U0032\\U0032");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0032\\U0032\\U0032\\U0032\\U0032\\U0032" + "'", str1, "\\U0032\\U0032\\U0032\\U0032\\U0032\\U0032");
    }

    @Test
    public void test39954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u", 183);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "02u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u" + "'", str2, "02u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u");
    }

    @Test
    public void test39955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...                         " + "'", str2, "                         61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...                         ");
    }

    @Test
    public void test39956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                             U23", 136, 245);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test39957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39957");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("02u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test39958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39959");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    ", "6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ", 137);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39960");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) ' ', 'C');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test39961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...0000000000000000000000000000000", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39962");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                300u\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'a' + "'", char2 == 'a');
    }

    @Test
    public void test39963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39963");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "66666666666666666666666666666666666666666666666666666       22222\\u0023\\u00\\u0041\\u002322222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 191, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\", '\r', '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, "0023\\U0023\\U0023\\U0023\\U0023\\U004444444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test39966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39966");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0032\\40032\\40032\\40032\\40032\\40032\\40032\\4003");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test39967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U" + "'", str2, "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
    }

    @Test
    public void test39968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 367, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test39969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39969");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0063", "61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39970");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuuuuuuuuuu 3200u           ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U003 111 ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test39971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "23Au0023Au0023Au0023Au0023Au0023Au0023Au0023uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                              2                                                                                2                                                                                2                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39972");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###" + "'", str1, "23\\U###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0###");
    }

    @Test
    public void test39974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39974");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                   h", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 93);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test39975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\" + "'", str1, "\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\");
    }

    @Test
    public void test39976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("777777777777777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777" + "'", str1, "777777777777777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test39977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...", "    \n     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu..." + "'", str2, " 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test39978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("55555555555                                  ", "2\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39979");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002", "161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", 189);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444...", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                          4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002" + "'", str7, "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002");
    }

    @Test
    public void test39980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39980");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\                                                                                                                                                                 ", (java.lang.CharSequence) "       5C111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39981");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...      3...      3...      3...      3...      3...      3...      3...      aaaaaaaa...      3...      3...      3...      3...      3...      3...      3...      3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test39982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39982");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...111111111111111111111111111111111111111111111" + "'", str1, "...111111111111111111111111111111111111111111111");
    }

    @Test
    public void test39983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39983");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test39984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                    16AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                    16AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                                                                                    16AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test39985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39986");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                              11111                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              11111                                " + "'", str1, "                              11111                                ");
    }

    @Test
    public void test39987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39987");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0026666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 161 + "'", int1 == 161);
    }

    @Test
    public void test39988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("0023\\00023\\00023\\ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\00023\\00023\\" + "'", str1, "0023\\00023\\00023\\");
    }

    @Test
    public void test39989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39989");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("U0023\\U00\\u0041\\U00232222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0023\\U00\\u0041\\U00232222" + "'", str1, "U0023\\U00\\u0041\\U00232222");
    }

    @Test
    public void test39990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test39991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39991");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0023\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", "                AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                                 AAAA15AAAA                 ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test39992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\n\n......\n\n", 234, '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\n\n......\n\n0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\n\n......\n\n0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test39993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39993");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00", "3333333333333333333333333333333aaaaaaaaa 61aaaaaaaaaaaaa5555555                                             ...aaaaaaaaa 61aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test39994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39994");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "aaaaaaaa", "                                                                                                                                                                                                                                                                      ", 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, "                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test39995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII  ......  77777777777777777777777777777777777777777777777777777777777777777777777IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII  ......  77777777777777777777777777777777777777777777777777777777777777777777777IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII  ......  77777777777777777777777777777777777777777777777777777777777777777777777IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test39996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                           ...                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test39997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39997");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'h', (int) '1', 3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test39998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                            AAAAAAA                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\                                                                                            AAAAAAA      ", "                                                                                                                                                                        u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            AAAAAAA                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\                                                                                            AAAAAAA" + "'", str2, "                                                                                            AAAAAAA                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\                                                                                            AAAAAAA");
    }

    @Test
    public void test39999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test39999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("23\\U0023\\U...", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test40000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest79.test40000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("3200U\\3200U\\u6623\\u6623\\u6623\\u6623\\u6623\\u6623U6663200U\\3200U\\3", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U\\3200U\\u6623\\u6623\\u6623\\u6623\\u6623\\u6623U6663200U\\3200U\\3                  " + "'", str2, "3200U\\3200U\\u6623\\u6623\\u6623\\u6623\\u6623\\u6623U6663200U\\3200U\\3                  ");
    }
}

