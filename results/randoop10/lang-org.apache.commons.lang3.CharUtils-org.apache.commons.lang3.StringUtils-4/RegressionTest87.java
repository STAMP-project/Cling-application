import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest87 {

    public static boolean debug = false;

    @Test
    public void test43501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "2  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43503");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("3200u\\3200", 650);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...      61\n                       ", 40, 'D');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...      61\n                       DDDDD" + "'", str3, "...      61\n                       DDDDD");
    }

    @Test
    public void test43505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\r\r\r\r\r8", "...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("3...", "023\\u0023aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3..." + "'", str2, "3...");
    }

    @Test
    public void test43508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("111111111111111111111111                                                                      ", "aaaa                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111                                                                      " + "'", str2, "111111111111111111111111                                                                      ");
    }

    @Test
    public void test43509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43509");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                    3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                     ", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test43510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43510");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                     ", (java.lang.CharSequence) "23\\u...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                     " + "'", charSequence2, " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                     ");
    }

    @Test
    public void test43511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              " + "'", str1, "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ");
    }

    @Test
    public void test43512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "u0032\\U0032\\U0032\\U0032\\U0032\\U0032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43513");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...261\\261\\261\\261\\261\\261\\261\\2...3\\U00                                                   ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43514");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                              001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333                              ", "...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 354);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("2  ", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2  " + "'", str2, "2  ");
    }

    @Test
    public void test43516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43516");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("75", "a11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               !ih!ih!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "4444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUhCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!ih!ih!ihUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!ih!ih!ihUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test43518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "10HI!100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", "\n\n\n\n\n\n\n\n\n\n\n533333333333333333333333333333\\40032333333333333333333333333333333c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43520");
        java.lang.String str1 = org.apache.commons.lang3.CharUtils.unicodeEscaped('D');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0044" + "'", str1, "\\u0044");
    }

    @Test
    public void test43521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43521");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "       ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "u0023\\u002u0023\\u002u0023\\u002u0");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("300000", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str7, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str11, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str13, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test43522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43522");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "61        61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61        61" + "'", str1, "61        61");
    }

    @Test
    public void test43524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43524");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161" + "'", str3, "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test43525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA", "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA");
    }

    @Test
    public void test43526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43526");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (java.lang.CharSequence) "\\\\\\\\\\\\\\...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test43527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43527");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", "A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0", 404, 456);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0" + "'", str4, "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0A             U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0");
    }

    @Test
    public void test43528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43528");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\", "aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                   0200iui\\", 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA", "                                                                                                                     61\\\\u0020                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA" + "'", str2, "                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA");
    }

    @Test
    public void test43530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43530");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98 + "'", int1 == 98);
    }

    @Test
    public void test43531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61616161616161616161U6161616161616161616161" + "'", str1, "61616161616161616161U6161616161616161616161");
    }

    @Test
    public void test43532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43532");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061", 60);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "UUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test43533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  UUU6  6  6  6  6  ", "                       \\u0036                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43535");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...061                                         \n\n", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61...                          ...", 506);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43536");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '\\', 94, (int) '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test43537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43537");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("UUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhh", (int) '1');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43538");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H", "0200\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test43539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43539");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161", "AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 297);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test43540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43540");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43541");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("... U61\\ 61\\ 61\\ 61\\ 61", "...h    h...", "c200U\\1400u\\00U\\c200U\\");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test43542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43542");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0023\\u0023\\u0023\\ U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43543");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "6                                     6    11111111111116                                     6     ", "                                           \\u005                                            3200u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test43544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test43545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43545");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...3\\u0023\\u00231\\40032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...3\\u0023\\u00231\\40032" + "'", str2, "...3\\u0023\\u00231\\40032");
    }

    @Test
    public void test43546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43546");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "                        a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test43547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43547");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u1111111111111111111111111111111111111...", "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11111111111u0023#u0023#u0023#u0023#u0023#u0023#u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test43548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43548");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                 \\u0030\\\\\\\\                  ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#61#6161\n\n\n\n\n\n\n\n", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("\\u000a", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 17 + "'", int10 == 17);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test43549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("u003                    ", 111, 130);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test43551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43551");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       aaaaaaa", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       aaaaaaa" + "'", charSequence2, "\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       aaaaaaa");
    }

    @Test
    public void test43552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43552");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                        iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                        ", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("3200U\\3200U\\\\i\\3200U\\3200U\\3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\\\I\\3200U\\3200U\\3" + "'", str1, "3200U\\3200U\\\\I\\3200U\\3200U\\3");
    }

    @Test
    public void test43554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                               ", "6  6  6  6  6  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test43555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "20\\U0020\\U0020\\U0020\\U00                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "uuuuuuuuuuuuuuuuuu\\4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test43556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                 hi!hi!hi!                                                                                                         ", 191, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test43557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43557");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                           U", 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43558");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!ihAA\\AA\\AA\\AA\\AA\\AA\\AA\\AA\\AA\\AA\\AA\\AAU\\AA\\AA\\AA\\AA\\AA\\AA\\AA\\AA\\AA\\AA\\AA3200u\\", "aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003", 306);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43559");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("2............................................................................................................................................................................................................................................................................................................................................................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaa             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43560");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "222222222222222222222222222222222222222222222U6                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43562");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("200U\\3200U\\3200U", "A                                                                                                                                                                ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("uuuuuuuuuaaaaaaa3200u\\32", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test43563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43563");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16", "                                         AAAAAAA      ", (int) (byte) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("2U2U2U2U2U2U2U2U2U2", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test43564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                  \\U0023\\U00\\u0041\\U                                   ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0\r\r\r\r\r\r\r\raaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0\r\r\r\r\r\r\r\raaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "\\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0\r\r\r\r\r\r\r\raaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0\r\r\r\r\r\r\r\raaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test43566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '0', 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test43567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43567");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "77777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (java.lang.CharSequence) "33333333333333333333");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 519 + "'", int2 == 519);
    }

    @Test
    public void test43568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43568");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u003");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43569");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("20\\u0020\\u0020\\u0020\\u00", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '0');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "200000200000200000200000" + "'", str4, "200000200000200000200000");
    }

    @Test
    public void test43570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) " 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333", "3200U\\1400u\\00U\\3200U", "004");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test43572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43572");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("00U\\3200U\\3200U\\3200U\\3200U\\3200");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test43573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43573");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "\\");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray7);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                             ", "\n\n\n\n\n1");
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                        ", strArray7, strArray16);
        java.lang.String[] strArray21 = new java.lang.String[] {};
        int int22 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray21);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575", strArray16, strArray21);
        java.lang.Class<?> wildcardClass25 = strArray21.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str10, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str11, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str12, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                        " + "'", str18, "                        ");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575" + "'", str24, "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test43574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u0022361.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u0022361." + "'", str1, "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u0022361.");
    }

    @Test
    public void test43575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43575");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032", "U\\", 380);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu", "                          I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43577");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43578");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\", "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43579");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("UU03UUU03");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU03UUU03" + "'", str2, "UU03UUU03");
    }

    @Test
    public void test43580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                    0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                    " + "'", str1, "                                                                                                    0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                    ");
    }

    @Test
    public void test43581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43581");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r..." + "'", str1, "6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...");
    }

    @Test
    public void test43584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61\\uuuuuuuuuuuuuuuu6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                              001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   61        61                                                       ", 370);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                               61        61                                                       " + "'", str2, "                                                                                                                                                                                                                                                                                                               61        61                                                       ");
    }

    @Test
    public void test43586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43586");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 61", strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '\n');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
    }

    @Test
    public void test43587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("533333333333333333333333333333\\432333333333333333333333333333333c", "3333333333333333333333333333333333                                                                             6u623\\U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "533333333333333333333333333333\\432333333333333333333333333333333c" + "'", str2, "533333333333333333333333333333\\432333333333333333333333333333333c");
    }

    @Test
    public void test43588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43588");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\4\n\n\n", "40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\4003240032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032c111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "11111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11\n\n\n" + "'", str3, "11\n\n\n");
    }

    @Test
    public void test43589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("3660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066" + "'", str1, "3660...aaaaaaaaaaaaaaaaaaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r320066320066320066320066320066");
    }

    @Test
    public void test43590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43590");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          11111111111u6111111111111111111111          ", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "00000000000000000000", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test43591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43591");
        char[] charArray12 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                 \\u0036                                                                 ", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test43592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43592");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......", "3333u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ", 650);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A" + "'", str2, "\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
    }

    @Test
    public void test43594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43594");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", " 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test43595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43595");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHH023\\U0023       AAAAAAAUUUUUUUUUHHHHHHHHHHHHHH", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\U 1", 635);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\U 1" + "'", str2, " 1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\  1\\U 1");
    }

    @Test
    public void test43597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43598");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", 40, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("######", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43600");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  2   ", "61  \\\\0020                                                                                 \\  \\\\0020                                                                                 uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u" + "'", str1, "3200u");
    }

    @Test
    public void test43602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43602");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", '.');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test43603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43603");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "16u", (java.lang.CharSequence) "                   3300u\\                   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
    }

    @Test
    public void test43604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h..." + "'", str2, "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
    }

    @Test
    public void test43605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43605");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII              6 0200U\\\\6 0200U\\\\6 UUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii              6 0200u\\\\6 0200u\\\\6 uuuuuu" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii              6 0200u\\\\6 0200u\\\\6 uuuuuu");
    }

    @Test
    public void test43607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43608");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...3\\U0##########333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", 213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61i!                                                                                   U0023                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  \\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n                   " + "'", str2, "                  \\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n                   ");
    }

    @Test
    public void test43611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0030", 34, "0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0\\u0020\\u000\\u\\u00300\\u0020\\u000\\u" + "'", str3, "0\\u0020\\u000\\u\\u00300\\u0020\\u000\\u");
    }

    @Test
    public void test43612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6666" + "'", str2, "6666");
    }

    @Test
    public void test43613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("3200u\\3200", "                                                                                                                                                                                                                                                                                 HHHHHHHHHHHHHUUUUUUU61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200u\\3200" + "'", str2, "3200u\\3200");
    }

    @Test
    public void test43614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43614");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU... 61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161########61########61########61########61########61########61########61########61########61#####", "      AAAA...", 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43615");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                       ", "       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43617");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\\u0023 hi!hi!hi!", 89);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43618");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                      75", (java.lang.CharSequence) "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                      75" + "'", charSequence2, "                      75");
    }

    @Test
    public void test43619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43619");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                  3200", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43620");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0023\\u0023\\u002", "U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U002322222U0\\0023\\0023\\0023\\0023\\0023\\0023\\0023...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43621");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006", " 61UUUUUUUUUU", 92);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 64, 31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test43622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43622");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '5');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43623");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("u003");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...020u0020u0020u0020u0020u0020u0020u0020..." + "'", str1, "...020u0020u0020u0020u0020u0020u0020u0020...");
    }

    @Test
    public void test43625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43625");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "u002e", 460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "1hi!1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43627");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("CCC                              23\\u0023\\u0023\\u0023\\UCCCC", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333" + "'", str1, "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333");
    }

    @Test
    public void test43629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U", "1\\61\\6161\\61\\6161\\61\\6161\\6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U" + "'", str2, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U");
    }

    @Test
    public void test43630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43630");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("        ###\n###    61        61        615c    61        61        61", 424, 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43631");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                        aaaaaaa    ", "", (int) (byte) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAA...0U\\3111111111111111111111111111111111111111111111", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA" + "'", str9, "\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test43632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43632");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000uuuuuuuuuuuuuuuuuuuuuuuuu...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'i');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000uuuuuuuuuuuuuuuuuuuuuuuuu...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str4, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000uuuuuuuuuuuuuuuuuuuuuuuuu...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test43633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43633");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "261                                                                                                                    ", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43634");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ", "                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test43635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test43636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U0023\\U0##########", "23\\U                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43637");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...2\\162\\162\\162\\162\\162\\162\\162...                                                                                  ", 203);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43638");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00   ", (java.lang.CharSequence) "u23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "20\\u0020\\u0020\\u0020\\u00   " + "'", charSequence2, "20\\u0020\\u0020\\u0020\\u00   ");
    }

    @Test
    public void test43639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test43640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43640");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("11111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\", 'a', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\" + "'", str3, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\");
    }

    @Test
    public void test43642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("     ######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     ######" + "'", str1, "     ######");
    }

    @Test
    public void test43643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43643");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   u61    ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    " + "'", str3, "   aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ");
    }

    @Test
    public void test43644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                                                                   2", "161\\161\\161\\161\\161\\161\\U6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                   2" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                   2");
    }

    @Test
    public void test43645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333" + "'", str1, "u6     uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu16u333333333333333333333333333333333333333333");
    }

    @Test
    public void test43646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43646");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa", "    222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaa222222222222222222222222222222222222222222222222", 79, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test43648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43648");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('2', 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test43649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("41                                                                                        ", ".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43650");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("U003                                                ", "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                       aaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaa" + "'", str2, "                                       aaaaaaaaaaaaa");
    }

    @Test
    public void test43652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43652");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111                                                                   ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 449);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("51AAAA", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test43653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", "##############################################.16 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ " + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
    }

    @Test
    public void test43654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test43655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0023\\u0023\\u0023\\u0023\\u0023\\u00", "                                               HUUU02HUUU02HUUU02HAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\", (int) (byte) -1, 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61" + "'", str3, "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61");
    }

    @Test
    public void test43657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1\\U00234                                      \\U0023\\U00\\u00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  16                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43659");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\r", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                           ", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test43660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                      \\6005c\\u0069", 267);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                               \\6005c\\u0069" + "'", str2, "                                                                                                                                                                                                                                                               \\6005c\\u0069");
    }

    @Test
    public void test43661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test43662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43663");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaa                             hhhhhhhhhhhhhhhhh", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("........", 6, 460);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".." + "'", str3, "..");
    }

    @Test
    public void test43665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n...", "\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n..." + "'", str2, "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n...");
    }

    @Test
    public void test43666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43666");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       aaaaaaaaaaaaa\\\\\\", "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################" + "'", str1, "########################");
    }

    @Test
    public void test43668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u                                                          ", "                                                                                                                                                                                                                                                                                                                                                                                 U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", "a000u\\                                                                                                                                                              ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test43669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43669");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test43670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43670");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000\n\n......\n\n0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43671");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", "uuuu61uuuu                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43672");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("200U\\3200U\\3200U", "A                                                                                                                                                                ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "6  6  6  6  6  ", 177, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test43673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43673");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                         75                                      ...", 110, "        \\UUU                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         75                                      ...        \\U" + "'", str3, "                                                         75                                      ...        \\U");
    }

    @Test
    public void test43675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43675");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\n1", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", 86);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("A000U\\", "aaaa                                                ", 96);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach(" 61\\", strArray7, strArray11);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 10);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...", " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", strArray17, strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach(" 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", strArray7, strArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray7);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " 61\\" + "'", str12, " 61\\");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str22, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str23, " 61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\n\n1" + "'", str24, "\n\n1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test43676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43676");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6                                     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA1111111111111111111111111111111111111111111111                                            5500U\\AAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ " + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
    }

    @Test
    public void test43679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61    IUI0020\\4\n\nIUI0020\\4\n\nIUI0020\\4\n\nIUI002", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("         aaaaaa                       \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rhhhh          ", "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         aaaaaa                       \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rhhhh          " + "'", str2, "         aaaaaa                       \r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rhhhh          ");
    }

    @Test
    public void test43681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43681");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '.', 'h');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '.' + "'", char2 == '.');
    }

    @Test
    public void test43682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43682");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "           \n\n1", (java.lang.CharSequence) "            23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test43683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("UU##0uUU##0uUU##0uUaaaaaaaaaaaaaUUU\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          ..." + "'", str2, "          ...");
    }

    @Test
    public void test43684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###" + "'", str2, "                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###");
    }

    @Test
    public void test43685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 936);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43687");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "41                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test43688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43688");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    61        61        615c    61        61        61", "16\\5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!ih!ih!ihUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    61        61        615c    61        61        61" + "'", str4, "    61        61        615c    61        61        61");
    }

    @Test
    public void test43689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 181, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test43690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\16 \\16 \\16 \\16 \\16U \\16  \\16 \\16 \\16 \\16 \\16U \\16 4444444444" + "'", str1, "\\16 \\16 \\16 \\16 \\16U \\16  \\16 \\16 \\16 \\16 \\16U \\16 4444444444");
    }

    @Test
    public void test43691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43691");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 61\\", "\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43692");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "00000000    2222222222222222222222222222222220000000", "1111111111111111111111111111111111111111111113\\u0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("22222\\U0023\\U00\\u0041\\U002322222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "22222\\U0023\\U00\\u0041\\U002322222" + "'", str1, "22222\\U0023\\U00\\u0041\\U002322222");
    }

    @Test
    public void test43694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43694");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#61#6161\n\n\n\n\n\n\n\n", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("161\\161\\161\\161\\161\\161\\U6", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test43695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 61                  23\\\\23\\\\23\\\\23\\\\23\\\\23\\\\23\\\\ 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 612 61", "\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test43696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", "111111111111111111111111111111111111\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...11111111111111111111111111111111111111111U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43697");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "i                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43698");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43699");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0023", "                                                                                                                                                                                                                                                                                                                                                                                 U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", 543);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", "U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\" + "'", str2, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
    }

    @Test
    public void test43701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test43702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test43703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43703");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("########0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\\u005c\\u0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("22222222222222222222222222222222222222241AAAAAAAAcccccccccc", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222222222222222222222222222222222222241AAAAAAAAcccccccccc" + "'", str2, "22222222222222222222222222222222222222241AAAAAAAAcccccccccc");
    }

    @Test
    public void test43705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43705");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A\\u0023AAAAAAAAAAAAAa000u\\", 'i');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      ", "      ");
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.Object[]) strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("h", strArray4, strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A\\u0023AAAAAAAAAAAAAa000u\\" + "'", str5, "A\\u0023AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A\\u0023AAAAAAAAAAAAAa000u\\" + "'", str16, "A\\u0023AAAAAAAAAAAAAa000u\\");
    }

    @Test
    public void test43706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "222222222222222222222222222222uu55                                            2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..2   ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("... .hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... .hi!hi!hi!" + "'", str1, "... .hi!hi!hi!");
    }

    @Test
    public void test43708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43708");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", '5');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "23\\u                                                                                      ", 77, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test43709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43709");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!11111111111111111111111111111111111111111111111111111111111111111111111111111111111U000011111111111111111111111111", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43710");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                       AAAAAAAAAAAAA3200u\\A                                      ", "                                                                                                                                              #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test43711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", (int) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test43712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43712");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\61\\61\\61\\61\\u0023", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0", 104, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U05555555555555555555555555555555" + "'", str3, "\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U05555555555555555555555555555555");
    }

    @Test
    public void test43714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43714");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", "                                                                                                  61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                   ", 0, "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                   " + "'", str3, "                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test43716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 456);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test43717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "75                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75                                                          " + "'", str1, "75                                                          ");
    }

    @Test
    public void test43718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43718");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                             23\\u###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                             23\\u###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u" + "'", str1, "                                                                             23\\u###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u");
    }

    @Test
    public void test43719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43719");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str2, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test43721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43721");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "uUuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43722");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0\\\\\\\\  U  0\\\\\\\\  U  0\\\\\\\\  U  0\\\\\\\\  U  ", 'I');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "U0023                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43724");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "222222U0023#U0023#U0023#U0023#U0023#U0023#U0023      222222");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59 + "'", int1 == 59);
    }

    @Test
    public void test43725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006", '7');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006" + "'", str2, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006");
    }

    @Test
    public void test43726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\" + "'", str1, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\");
    }

    @Test
    public void test43727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43727");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                    222222222222222222222222222222222", 147, "\\u003\\u0023\\u0023\\u0023\\                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u003\\u0023\\u00                                                                                    222222222222222222222222222222222\\u003\\u0023\\u00" + "'", str3, "\\u003\\u0023\\u00                                                                                    222222222222222222222222222222222\\u003\\u0023\\u00");
    }

    @Test
    public void test43728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43728");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("30\\\\\\\\", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n", (int) '\\');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc", 508);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                              ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                              ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc                                                                                                                                                                                                                              ");
    }

    @Test
    public void test43730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43730");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6", "                                             ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43731");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 97, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43732");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("666666666666666666666666666666666666666iAAAAAAAAAAAAA\\\\\\", "                                                                                               555555555555555           ...", "aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test43733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.1111", "0000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test43734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u003\\u003\\u0                                         \n\n1                                                    \n\n1    ", "77777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43735");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("A000U\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61A000U\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61A000U\\", "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ", 296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43736");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '7', 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '7' + "'", char2 == '7');
    }

    @Test
    public void test43737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rAu", 177, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test43738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43738");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111     ", "1\\ ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   2     ...                                ...    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("6UUu002056UUu002056UUu002056UUu002056UUu\r\r\r\r\r\r\rU400326666666666666666666666666666666666666666666", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6UUu002056UUu002056UUu002056UUu002056UUu\r\r\r\r\r\r\rU400326666666666666666666666666666666666666666666" + "'", str2, "6UUu002056UUu002056UUu002056UUu002056UUu\r\r\r\r\r\r\rU400326666666666666666666666666666666666666666666");
    }

    @Test
    public void test43741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43741");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161                                                                                          ", "16u    \n   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\", 148);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaa                            ", "61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa                            " + "'", str2, "aaaaaa                            ");
    }

    @Test
    public void test43743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test43744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43744");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("u0023\\u002u0023\\u002u0023\\u002u0", "11111111111111111111123                                                                                     hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43745");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test43746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAA    HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 122);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     AAAAAAA    HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "                                     AAAAAAA    HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test43747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43747");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43748");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("20\\u0020\\u0020\\u0020\\u00    ", "A...\\61\\61\\61\\61\\U0023     ...A", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test43749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43749");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  ", 365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075                        " + "'", str1, "                         A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075                        ");
    }

    @Test
    public void test43751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("u\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "u\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test43752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43752");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test43753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43753");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61...", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43754");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ \\ 6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6", "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test43755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43755");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", "a");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("        75", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    " + "'", str6, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    " + "'", str7, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test43756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43756");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61\n61", "3333333333333333333333333", (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                                                                                                                                                                  ", "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U", 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test43759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43759");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\u0035");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5300u\\" + "'", str1, "5300u\\");
    }

    @Test
    public void test43761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...UUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...UUUUUUUUUUUUUUUUU" + "'", str1, "...UUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test43762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43762");
        char[] charArray11 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("0023", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                             ", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u0023\\u002u0023\\u002u0023\\u002u0", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                            AAAAAAAAAAAAA3200u\\A  ...\r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test43763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43763");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "uu03uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test43764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("UUUUUUUUUUU6UUUUUUUUUUU                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUU6UUUUUUUUUUU" + "'", str1, "UUUUUUUUUUU6UUUUUUUUUUU");
    }

    @Test
    public void test43765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43765");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii                                  ", "20\\u0020\\u0020\\u0020\\u00                            ", 550);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("###\n\\u003\\u0023\\u0023\\u0023\\###", "555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###\n\\u003\\u0023\\u0023\\u0023\\###" + "'", str2, "###\n\\u003\\u0023\\u0023\\u0023\\###");
    }

    @Test
    public void test43767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43767");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaa", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\C111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43770");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\U0023AAAAAAAAAAAAA", "u ...... \\u004...", 146, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u ...... \\u004..." + "'", str4, "u ...... \\u004...");
    }

    @Test
    public void test43771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43771");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                 ####au", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "                                         161\\161\\161\\161\\161\\16177777777777777777777777777IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", 1000);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43773");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "   ...                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43774");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                   uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test43775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...", "61\\61\\61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH..." + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...");
    }

    @Test
    public void test43776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43776");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "U002322222                                                              ", "4444444444 61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43777");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '.');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "3\\u003\\u");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  " + "'", str10, " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
    }

    @Test
    public void test43778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43778");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\n");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\u0069                                           \\6005c\\u0069", 0, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test43779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                        UUUUUUUUUUU6UUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "u 61..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("\n\n\n\n\n                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1" + "'", str2, "\n\n\n\n\n                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1");
    }

    @Test
    public void test43782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("h", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test43783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100, "\\0033");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\0033\\0033\\0033\\0033\\0" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\0033\\0033\\0033\\0033\\0");
    }

    @Test
    public void test43784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43784");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                         \n\n1                                         ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '.');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!100");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
    }

    @Test
    public void test43785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................61aaaaaaaaaaaaaaaaaa", "...HH...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................61aaaaaaaaaaaaaaaaaa" + "'", str2, "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................61aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test43786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43786");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u                                                                                      ", ' ');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test43787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43787");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0023\\u\\");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033 AAAAAAA      iiiii", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032" + "'", str1, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
    }

    @Test
    public void test43789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str1, "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test43790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43790");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43791");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("61\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", "", 103);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("5555555\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray11, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("... 16 16 16 16 16 16 16 16 16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray5, strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "61\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161" + "'", str6, "61\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10hi!100" + "'", str14, "10hi!100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "... 16 16 16 16 16 16 16 16 16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str16, "... 16 16 16 16 16 16 16 16 16AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test43792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43792");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16u\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43793");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61\\ 61\\61                                                                                                                                                  ", (java.lang.CharSequence) "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test43794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("U002322222", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002361\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U002322222" + "'", str2, "U002322222");
    }

    @Test
    public void test43795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43795");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("3AAAA51AAAA0023AAAA51AAAA0023", "3\\u0023u0023\\u0023\\u0023\\u0023\\u002", 119, 69);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3AAAA51AAAA0023AAAA51AAAA00233\\u0023u0023\\u0023\\u0023\\u0023\\u002" + "'", str4, "3AAAA51AAAA0023AAAA51AAAA00233\\u0023u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test43796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", " 11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u161u161u161u161u161u161uU6666666666666666666666666666666666666666666161u161u161u161u161u161" + "'", str3, "u161u161u161u161u161u161uU6666666666666666666666666666666666666666666161u161u161u161u161u161");
    }

    @Test
    public void test43797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43797");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                     ......  7777777777777777777777777777777777777777777777777777777777777777777777761\\                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Uuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("U UU", "aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U UU" + "'", str2, "U UU");
    }

    @Test
    public void test43800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43801");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 61\n                                                             ", "55          aaaaaaa       CCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("111111111111111111111u61111111111111111111111123\\U", "5500\r\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111u61111111111111111111111123\\U" + "'", str2, "111111111111111111111u61111111111111111111111123\\U");
    }

    @Test
    public void test43803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43803");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("###\n\\u002                                      ", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test43804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43804");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", " \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test43806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  \\\\\\aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\" + "'", str1, "                  \\\\\\aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\");
    }

    @Test
    public void test43807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Aaaaaaa       ", "6666uuuuuuuuuuuuuuuuuI6666uuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaa       " + "'", str2, "Aaaaaaa       ");
    }

    @Test
    public void test43808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43808");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                      u003                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ", 667);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     " + "'", str2, "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ");
    }

    @Test
    public void test43810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43810");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\n\n1                                                    \n\n1                                  61\\", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "... AAAA15AAAA AAAA15AAAA ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0023U6                                       u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\", 682);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023U6                                       u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\" + "'", str2, "0023U6                                       u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\");
    }

    @Test
    public void test43813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u002aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "3200U\\3200U\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u002aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u002aaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test43814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("1        61        615C    61        61        61", "\\U00685555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1        61        615C    61        61        61" + "'", str2, "1        61        615C    61        61        61");
    }

    @Test
    public void test43815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43815");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'c', 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
    }

    @Test
    public void test43816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaa                             hhhhhhhhhhhhhhhhh", "           A\\u0023AAAAAAAAAAAAA                                      1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa                             hhhhhhhhhhhhhhhhh" + "'", str2, "aaaaaa                             hhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test43817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test43818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43818");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test43819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43819");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "111111111        ", " 6\\\\u0020");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test43820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43820");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '1', '2');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '1' + "'", char2 == '1');
    }

    @Test
    public void test43821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43821");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43822");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                   55555555556uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu62626                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43823");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                       aaaaaaaaaaaaa\\\\\\", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43824");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u...                                   ", "          \n\n1");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u..." + "'", str3, "23\\u0023\\u...");
    }

    @Test
    public void test43825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43825");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("..................................................................................................................................................................................................................................................................................................................hhhhhhhhhhhhh023\\u0023       aaaaaaauuuuuuuuuhhhhhhhhhhhhhh", "###\n\\u002                                         \n\n1           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test43826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43826");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                            ccccccc      ", (java.lang.CharSequence) "                                                                                            AAAAAAA                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\                                                                                            AAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                            ccccccc      " + "'", charSequence2, "                                                                                            ccccccc      ");
    }

    @Test
    public void test43827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43827");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                   ######", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######" + "'", str2, "######");
    }

    @Test
    public void test43829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43829");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...\r                                                                                                                                                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43830");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    2222222222222222222222222222222222UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUU", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 289);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("23hi!hi!hi!                                                                          ", 263, 380);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23hi!hi!hi!                                                                          " + "'", str3, "23hi!hi!hi!                                                                          ");
    }

    @Test
    public void test43832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43832");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("           \n\n1", "                                 A\\u0023AAAAAAAAAAAAA                      ...", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43833");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!                                                                                   U0023                          ", "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!U0023" + "'", str3, "i!U0023");
    }

    @Test
    public void test43834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43834");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43835");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3", 'i');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43836");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA             ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43837");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...", "000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'u');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu..." + "'", str4, " 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test43838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43838");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", 0, "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str3, "61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test43839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43839");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "2", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                              23\\u0023\\u0023\\u002                                                       ", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                ", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                             61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1161\\\\1u100201161\\\\1u10020116", charArray9);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test43840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057                                                                                                                             1\\u0030UuU\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43841");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  ", "77777777777777777777777777");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test43842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43842");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test43844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43844");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "  ......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10hi!100" + "'", str6, "10hi!100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test43845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "U005cu0u005cu0u0023Uu005cu0u005cu0");
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("61UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU", strArray6, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "61UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU" + "'", str8, "61UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU");
    }

    @Test
    public void test43846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43846");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                   ######");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test43847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43847");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAaaaaaaaaaaaaaaaa...023\\u0061\\u0061\\u0 61 \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'D');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test43848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43848");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                        A0u0023AAAAAAAAAAAAA                                        ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      ", "      ");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("33333333333333333333333333333\\40032333333333333333333333333333333", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33333333333333333333333333333\\40032333333333333333333333333333333" + "'", str9, "33333333333333333333333333333\\40032333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test43849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\uuAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\uuAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "\\uuAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test43850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "23AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023AAAA51AAAA0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'i', '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test43852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test43853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa");
    }

    @Test
    public void test43854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43854");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("UUUUU  2  ", "0\\u0020\\u000\\u\\u00300\\u0020\\u000\\u", 15);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43855");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("51", "23\\u0023\\u0023          3    23\\u0023\\u0023      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test43856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 340);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test43857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43857");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", 55);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test43858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u", "75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", "\\61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u");
    }

    @Test
    public void test43859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43859");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('C', 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
    }

    @Test
    public void test43860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\n     ", 563, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n     11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "\n     11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test43861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43861");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                 \\u0030\\\\\\\\                  ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#61#6161\n\n\n\n\n\n\n\n", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...\\61\\61\\61\\61\\u0023     ...", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny(" 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0AAAAAAAAAAAAAAAAAAAAAAAC5AAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                             6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0020 6\\\\U0", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test43862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43862");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) '\\');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("61uuu", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test43863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43863");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                        2  ", "                                                                                                                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61", "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u c");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test43864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "...      \n\n1           ...                                                                                              ", 65);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test43865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "000000000000000000000000000000000000000000000\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43866");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("U6", (int) '\\', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test43867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("U00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", "u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3" + "'", str2, "U00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
    }

    @Test
    public void test43868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43868");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("U000A16 16 16 16 16 16 16 16 16 16 16 U000A16 16 16 16 16 16 16 16 16 16 16 U000A", "...\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...", "u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U000A16 16 16 16 16 16 16 16 16 16 16 U000A16 16 16 16 16 16 16 16 16 16 16 U000A" + "'", str3, "U000A16 16 16 16 16 16 16 16 16 16 16 U000A16 16 16 16 16 16 16 16 16 16 16 U000A");
    }

    @Test
    public void test43869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u" + "'", str1, "u");
    }

    @Test
    public void test43870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest87.test43870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", 68, 66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }
}

