import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest71 {

    public static boolean debug = false;

    @Test
    public void test35501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "     \\u0023\\u00\\U0041\\u0023     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35503");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\400u\\00U\\3200U\\", "\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("            23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003" + "'", str2, "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003");
    }

    @Test
    public void test35505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h..." + "'", str1, "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
    }

    @Test
    public void test35506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35506");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("......A000u\\");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test35507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                  I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test35508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35508");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ..." + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
    }

    @Test
    public void test35509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\u002e", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u002e" + "'", str2, "u002e");
    }

    @Test
    public void test35510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35510");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("3");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 6", strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35511");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "U002322222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35512");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", "\\U0023\\U00\\u0041\\U                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###\n\\u002                                         \n\n1", "#11#1111\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test35515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str1, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test35516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "           A\\u0023AAAAAAAAAAAAA                                      1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35517");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n...", "                                                                                            ccccccc      ", 173);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111" + "'", str1, "11111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111211111111111u6111111111111111111111");
    }

    @Test
    public void test35519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", "u002#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#23U0023\\U0023\\U\\4003U0023\\U0023\\U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    " + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ");
    }

    @Test
    public void test35520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35520");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("A\\u0023AAAAAAAAAAAAA", "iiiiiiiiiiiiiiiiiiiiiiiiiiiU775Ciiiiiiiiiiiiiiiiiiiiiiiiiiii7777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35521");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.substringsBetween("", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "                                                                                                        aaaaaaa    ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U005C", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("U0023\\U00\\u0041\\U002322222", strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("\\4003211111111111111111111111111111111111111", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test35522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35522");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa\\u0023\\u0023\\", "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023", "\\U00C\\U00");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'i');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'A');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r77777777777777777777777777", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 536 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "23i23i23i23iui31i23i23i23i23" + "'", str8, "23i23i23i23iui31i23i23i23i23");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "23A23A23A23AuA31A23A23A23A23" + "'", str10, "23A23A23A23AuA31A23A23A23A23");
    }

    @Test
    public void test35523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35523");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" 61\\ ", "5");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32          aaaaaaa       u61\\61\\61\\61\\61\\", "2  U  2  U  2  U  2  U  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......", "\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\ \\61\\aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......" + "'", str2, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......");
    }

    @Test
    public void test35527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", "61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test35528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35528");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                              23\\u0023\\u0023\\u0023\\U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                   \\u0033");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35531");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray12 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih!ih!ih", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...UUUUUUUUUU", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test35532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", "\\u0033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000000000000000000000000000000000000000000000000000000000000" + "'", str1, "000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test35535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35535");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...", (java.lang.CharSequence) "00000000000000000000... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU..." + "'", charSequence2, "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test35536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("61uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuu", "         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35537");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 84);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444" + "'", str1, "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
    }

    @Test
    public void test35539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\\\\\\\\\\\\\...", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\..." + "'", str2, "\\\\\\\\\\\\\\...");
    }

    @Test
    public void test35541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35541");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("             u0023\\u002u0023\\u002u0023\\u002u0", "                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35542");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray16 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                     ", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "41", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("A\\U0023AAAAAAAAAAAAAA000U\\", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test35543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                 \\u0030\\\\\\\\                                      ", 99, 440);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 \\u0030\\\\\\\\                                      " + "'", str3, "                 \\u0030\\\\\\\\                                      ");
    }

    @Test
    public void test35544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("23\\U                                                                                             ", 53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###0\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005c", "777777777777777777777777777777777777777777    61    7777777777777777777777777777777777777777777", "    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###0\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005c" + "'", str3, "###0\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005c");
    }

    @Test
    public void test35546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35546");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I", "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
    }

    @Test
    public void test35547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35547");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1110023", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111", 0, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111");
    }

    @Test
    public void test35549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...AAAA      ", 255);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...AAAA      " + "'", str2, "...AAAA      ");
    }

    @Test
    public void test35550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("            ", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          " + "'", str2, "                                          ");
    }

    @Test
    public void test35551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35551");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                               UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...", "3AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\13AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("6\\\\u0020                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6\\\\u0020                                                                     " + "'", str1, "6\\\\u0020                                                                     ");
    }

    @Test
    public void test35553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h", 60, "        \\u0033 AAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h" + "'", str3, "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h");
    }

    @Test
    public void test35554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", "                                      \\u0023\\u00\\u0041\\u0023", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6U665CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6666666666666666666" + "'", str3, "6U665CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6666666666666666666");
    }

    @Test
    public void test35555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", 18, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61..." + "'", str3, "...6161\\ 61\\ 6161\\ 61\\ 6161\\ 61...");
    }

    @Test
    public void test35556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35556");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("    \n", "            1HI!1             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test35557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35557");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("U\\32                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 135);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                   " + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                   ");
    }

    @Test
    public void test35559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                   h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test35560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("     1111111........................................................................................", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570..." + "'", str2, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...");
    }

    @Test
    public void test35562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\" + "'", str1, "0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\");
    }

    @Test
    public void test35563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                         ", "...h    h...                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                         " + "'", str2, "                         a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075                         ");
    }

    @Test
    public void test35564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                       23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35566");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("222222222222...020u0020u0020u0020u0020u0020u0020u0020...        ", '2');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35567");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("\\                                                u                                                005                                                c", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("iii", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iii" + "'", str2, "iii");
    }

    @Test
    public void test35569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\161\\161\\161\\161\\161\\161\\u6                                 ", "61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35570");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...3\\u23\\u23U6              ", "002300230023002300230023002300230a000u\\002300230023002300230023002300230");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35571");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\0033", "                                                                                                                                                             \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\" + "'", str1, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\");
    }

    @Test
    public void test35573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0" + "'", str1, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
    }

    @Test
    public void test35574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068" + "'", str1, "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068");
    }

    @Test
    public void test35575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1000, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test35576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "5555555                                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555                                             ..." + "'", str1, "5555555                                             ...");
    }

    @Test
    public void test35577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35577");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", (java.lang.CharSequence) "...3\\u23\\u23U6              c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test35578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35578");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###\nu002                                         \n\n1", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("   U61    ", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3205761\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61\\ 61\\ ", "...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   U61    " + "'", str3, "   U61    ");
    }

    @Test
    public void test35580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35580");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("6\\\\u0020                                                                                     ", "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35581");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                                                                                                                            aaaaaaa      ", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35582");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\", (int) '\r');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("UUUUUUUUUUUUUUUUUUUUUUUUU...", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str6, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test35583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ii\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaaii", "57");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                            ccccccc      ", "u002311111                             u002311111                             u002311111                             u002311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u002311111                             u002311111                             u002311111                             u002311111                             u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            ccccccc      " + "'", str2, "                                                                                            ccccccc      ");
    }

    @Test
    public void test35586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35586");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("            1HI!1             ", "       111111111111111111111  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", "                                                                                                                                                                                                                                                                                                                                                                          61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35588");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("1111111111111111111111111111111111111111111113\\u0...", 'h');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("111111U1111111", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test35589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35589");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                   0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...                    ", "        \\u0033 AAAAAAA      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "222222222222222222222222222222222222222222222222222222222222U   66666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35591");
        char[] charArray14 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                     ", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "41", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("A\\U0023AAAAAAAAAAAAAA000U\\", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                           ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test35592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str1, "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test35593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...                           ...0023h\\hh0023h\\hh0023h                            ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                           ...0023h\\hh0023h\\hh0023h                            ..." + "'", str1, "...                           ...0023h\\hh0023h\\hh0023h                            ...");
    }

    @Test
    public void test35594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35594");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("23                                               ...", "222222222222222222222222222222222\\UUU02\\...2222222222222222222222222222222222", 404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35595");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 270 + "'", int1 == 270);
    }

    @Test
    public void test35596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35596");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...        75                                                                                                                              ", "                                                                                                                                                                                                                           ...                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35598");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                              5c             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35599");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", 262, 300);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00" + "'", str4, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
    }

    @Test
    public void test35600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35600");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35602");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "\n\n\n\n\n\n\n\n\n\n\n\n                                           aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35603");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61616161616161616161616161", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("     1\n\n                                                    1\n\n                                         ", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray16);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test35604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35604");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...    ...", "             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", 0);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                    16uAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test35605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35605");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("222223200U\\1400u\\00U\\3200U\\22222", "\n     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35606");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 59, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35607");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("23\\U                                                                                      ", "                                                                                                                                                                                                                                                                                                                                   ...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...                                                                                                                                                                                                                                                                                                                                   ", 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("3333333333333333333333333333333333                                                                             6u623\\U", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35609");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("55555555555                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55555555555                                  " + "'", str1, "55555555555                                  ");
    }

    @Test
    public void test35610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35610");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35611");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00", "                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16u\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u" + "'", str1, "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16u\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u");
    }

    @Test
    public void test35613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                     u003                    ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                     u003                    " + "'", str2, "                                                                                                                                                                                                                     u003                    ");
    }

    @Test
    public void test35614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35614");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("11111111111111111111111111222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6", 340, 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6" + "'", str4, "1111111123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6");
    }

    @Test
    public void test35615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35615");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...3\\U0##########333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", 0, 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35616");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", "\\U005C                                                                                                                                                           ", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ 61\\61u 61\\ 61\\610020\\ 61\\ ", (int) '.');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\" + "'", str4, "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\");
    }

    @Test
    public void test35617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("22222a2aaUa  ", "U00230023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222a2aaUa  " + "'", str2, "22222a2aaUa  ");
    }

    @Test
    public void test35618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35618");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test35619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6" + "'", str1, "23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6");
    }

    @Test
    public void test35620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35620");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("    2222222222222222222222222222222222", "23     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35621");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!                                                                                   U0023                          ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("00u\\0200u\\0200u\\0200u\\02", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test35622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("2  U  2  U  2  U  2  U  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2U2U2U2U" + "'", str1, "2U2U2U2U");
    }

    @Test
    public void test35623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35623");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###", "666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35624");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                  61", 'i');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35625");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35626");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u                                                ", 'A');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u                                                " + "'", str3, "u                                                ");
    }

    @Test
    public void test35627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35627");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                         \n\n1                                         ", "...10020\\...", (int) 'A');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35629");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                             \\u0069", 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str1, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test35631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35631");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("1\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\", "u0023\\u002u0023\\u002u0023\\u002u0                                                          ", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "61  \\\\0020                                                                                 \\  \\\\0020                                                                                 uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\n\n\n\n\n                                                                                                                             0uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u32057                                                                                                                             1", 135, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n                                                                                                                             0uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u32057                                                                                                                             1" + "'", str3, "\n\n\n\n\n                                                                                                                             0uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u3200uuu\\u32057                                                                                                                             1");
    }

    @Test
    public void test35634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r  \n\n1                                         ", "222222222222222222222222222222222222222222222222222222222222u   66666666666666666666666666666666666", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r  \n\n1                                         " + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r  \n\n1                                         ");
    }

    @Test
    public void test35635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35635");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11111111111u0023#u0023#u0023#u0023#u0023#u0023#u", "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11111111111u0023#u0023#u0023#u0023#u0023#u0023#" + "'", str2, "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11111111111u0023#u0023#u0023#u0023#u0023#u0023#");
    }

    @Test
    public void test35637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35637");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("   2     ...                                ...    \\U0023", "c");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\\\", "                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                 \\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                     666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35639");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u005c\\u00", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                         \n\n1                                                    \n\n1                                  61\\", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61\\ 61\\61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray14);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 41 + "'", int22 == 41);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test35640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35641");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444", "\\u0020\\u0020\\u0020\\u0020\\u0020\\u...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002", 104, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002                                                          " + "'", str3, "U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002                                                          ");
    }

    @Test
    public void test35643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35644");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35645");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'U', 90, 5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                             0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35646");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "uuuuuuuuuuuu 320011\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35647");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                             U002322222                                             ", "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u0055                                            1111111111111111111111111111111111111111111111aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaa", 288);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35648");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("222222222222222222222222222222222222222222222U6                                          aaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                       iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii###########U005cu0u005cu0u0023Uu005cu0u005cu0###########");
    }

    @Test
    public void test35650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35650");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", "                   \\U0033                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test35651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35651");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "   ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35652");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test35653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35653");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("75", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "75" + "'", str4, "75");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "75" + "'", str5, "75");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "75" + "'", str6, "75");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "75" + "'", str7, "75");
    }

    @Test
    public void test35654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35654");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "61########61########61########61########61########61########61########61########61########61########61########61########61###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "333333333333333333333333333333333333333333333333333333333333333333333333333333310HI!100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35656");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "IUI0020\\4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ", "         UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU..." + "'", str2, "       UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test35658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35658");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hi!hi!", "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35659");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002", (int) '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "\\u003\\u0023\\u0023\\u0023\\");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                        AAAAAAA    ", "        75");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###\n\\u003\\u0023\\u0023\\u0023\\###" + "'", str6, "###\n\\u003\\u0023\\u0023\\u0023\\###");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test35660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35660");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("UUUUUU61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                       ...HH...", 268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("575\\u0037200U\\", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "575\\u0037200U\\" + "'", str2, "575\\u0037200U\\");
    }

    @Test
    public void test35662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35663");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                             23\\u###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...........................................\\u0023 hi!hi!hi!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                      \\U0023\\U00\\u0041\\U002AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35665");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\U0023", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", (int) '\r');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test35666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35666");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                              \\u0032", '.');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test35667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u");
    }

    @Test
    public void test35668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", 270, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35669");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###", "77777777777777777777777777777777777777777777777777uuuuuuuuuaaaaaaa       3200u\\320");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "6                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6                                    " + "'", str1, "6                                    ");
    }

    @Test
    public void test35671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35671");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                     3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                                                                                                                                                                                                                     ", (java.lang.CharSequence) "                                             U002322222                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 380 + "'", int2 == 380);
    }

    @Test
    public void test35672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("iiiiiiiiiiiiiiiii23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "                   0041\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4", "u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###u\\32                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiii23uu0023uu0023uu0023uu0023uu0023uu0023uu0023" + "'", str3, "iiiiiiiiiiiiiiiii23uu0023uu0023uu0023uu0023uu0023uu0023uu0023");
    }

    @Test
    public void test35674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35674");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test35675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35675");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("i!U0023", "U0023\\", 358);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35676");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("3333361                                         \n\n1                                         ", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35677");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("11111111111", "  \n\n1                                         ", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test35678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35678");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0034                                                                                          ", 26, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35679");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35680");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("51", "0023\\U0023\\U0023\\U0023\\U0023\\U00");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057                                                                                                                             1\\u0030UuU\\");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test35681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("        61        61        61   55555555555555555555555555555555555", "33333333        753333333333333333333333333", "1\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        61        61        61   55555555555555555555555555555555555" + "'", str3, "        61        61        61   55555555555555555555555555555555555");
    }

    @Test
    public void test35682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("21                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "21" + "'", str1, "21");
    }

    @Test
    public void test35683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                     HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test35684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\u23\\u23\\u23\\u23\\u23\\u23\\u23", "u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u0000230023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u23\\u23\\u23\\u23\\u23\\u23\\u23" + "'", str2, "\\u23\\u23\\u23\\u23\\u23\\u23\\u23");
    }

    @Test
    public void test35685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1111111111111...", "U0023\\u0... U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111..." + "'", str2, "1111111111111...");
    }

    @Test
    public void test35686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\u0041", 54, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0041" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0041");
    }

    @Test
    public void test35688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35688");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35689");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             3\\u002                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "                                  \\U0023\\U00\\u0041\\U                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35690");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0020                                         61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "3\\u0023\\u0023\\u0023");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("   2     ...                                ...    ", "...\\61\\61\\61\\61\\U0023     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...\\61\\61\\61\\61\\U0023     ..." + "'", str2, "...\\61\\61\\61\\61\\U0023     ...");
    }

    @Test
    public void test35692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35692");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "3333361                                         \n\n133323\\u                                                                                             3333361                                         \n\n1333");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35694");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\aa\\a", 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test35695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35695");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                        41                                                                                                                                                                         ", "\\U003 111", 5);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                      \\u0023\\u00\\U0041\\u0023", 122, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      \\u0023\\u00\\U0041\\u0023##############################################################" + "'", str3, "                                      \\u0023\\u00\\U0041\\u0023##############################################################");
    }

    @Test
    public void test35697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35698");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "222222222222222222222222222222222222222222222222222222222222U   66666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("2............................................................................................................................................................................................................................................................................................................................................................", "61uuu");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'h');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2............................................................................................................................................................................................................................................................................................................................................................" + "'", str6, "2............................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test35700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("61UUUUUUUUUU", 33, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61UUUUUUUUUU" + "'", str3, "61UUUUUUUUUU");
    }

    @Test
    public void test35701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35701");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("    UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35702");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "\\U0023\\U00\\u0041\\U                                   1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35703");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'h', (int) '1', 3);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555", strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "c");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test35704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\" + "'", str2, "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\");
    }

    @Test
    public void test35705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35705");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              23\\u0023\\u0023\\u002   ", 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35706");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("1\\6", "...U0020U0020U0020U0020U0020U0020U0020U0020U0020...", "           A\\u0023AAAAAAAAAAAAA  u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu           A\\u0023AAAAAAAAAAAAA   ", 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1\\6" + "'", str4, "1\\6");
    }

    @Test
    public void test35707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("23     ...", "       ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("               hi!hi!hi!", "                                                 a                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35709");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\u003\\u0023                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35710");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......", (java.lang.CharSequence) "                                      \\U0023\\U00\\u0041\\U00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaa\\\\" + "'", str1, "Aaaaaaaaaaaaa\\\\");
    }

    @Test
    public void test35712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAAAAAAAAAAA32u\\A                                 ", "40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35714");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35715");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", 89, "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
    }

    @Test
    public void test35717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                    \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u", 562, 255);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35718");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35719");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                   ", "", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35720");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\4aaa", "   2  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35721");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0200\\\\", (java.lang.CharSequence) "hCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35722");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test35723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("23\\u                                                                                      ", 46, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u                                                                                      " + "'", str3, "23\\u                                                                                      ");
    }

    @Test
    public void test35724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test35725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35725");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "1111111111111                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35726");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("       111111111111111111111", "222223200U\\  ", 268);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35727");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                   \\u0033                   ", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("      61        61        61        61        61        61        61        61        61        61        61        61   ", "  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35729");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u006");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "                                                                                                        AAAAAAA     ");
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10hi!100" + "'", str11, "10hi!100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10hi!100" + "'", str12, "10hi!100");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10hi!100" + "'", str14, "10hi!100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10hi!100" + "'", str16, "10hi!100");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161" + "'", str18, "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161");
    }

    @Test
    public void test35730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                               5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", 886, (int) 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35731");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "11111                             ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str1, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
    }

    @Test
    public void test35733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "222222222222222222222222222222222222222222222222222222222222U   66666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("        0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057", 268);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057" + "'", str2, "        0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057");
    }

    @Test
    public void test35735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35735");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\", ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35736");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                   200u\\3200u\\3200u\\                   ", 53, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("###0\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005c", "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111", " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35738");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaa                                                 ", "                        \\U0023\\U00\\u0041\\U0023", 69);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6", "u003aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6" + "'", str2, "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6");
    }

    @Test
    public void test35740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\U", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test35742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35742");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35743");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("2", "", 100);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        ", strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230200\\\\", strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2" + "'", str6, "2");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test35744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35744");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'A');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test35745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11161UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.11111111111111.1111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u0030\\\\\\\\", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaAAAAAAAA75aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0030\\\\\\\\" + "'", str2, "\\u0030\\\\\\\\");
    }

    @Test
    public void test35747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35747");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '0', 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
    }

    @Test
    public void test35748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35748");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "0U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("666u6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666u6" + "'", str1, "666u6");
    }

    @Test
    public void test35750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35750");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                           4300u\\", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                           4300u\\" + "'", str4, "                                                                                           4300u\\");
    }

    @Test
    public void test35751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35751");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "u003                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                         \n\n1                                         ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 96);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "11111111111111111111111111111111111111111111123\\u0023\\u11111111111111111111111111111111111111111111161");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "6                                     6    11111111111116                                     6     ", 117, 66);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test35753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35753");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0032", "                                   ", "A000u\\000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("555555555555555", 17, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35755");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35756");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("    61    ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35757");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...    ...", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach(" 61\\", strArray3, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 61\\" + "'", str9, " 61\\");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test35758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aa                                          ", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa                                          " + "'", str2, "aa                                          ");
    }

    @Test
    public void test35759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\U0023\\U00\\u0041\\U                                   ", 476, "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  5555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\        \\U0023\\U00\\u0041\\U                                   5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\         " + "'", str3, "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\        \\U0023\\U00\\u0041\\U                                   5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\         ");
    }

    @Test
    public void test35760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35760");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '\n', (int) (short) 10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u0061", strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test35761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35761");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("60u0UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0U060\\\\0u000200U060\\\\0u000200U06", "                                                                                      3200U\\1400\\00U\\3200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0\\u0020\\u000\\u0020\\u000\\u0020161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0\\u0020\\u000\\u0020\\u000\\u0020161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161" + "'", str1, "0\\u0020\\u000\\u0020\\u000\\u0020161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test35763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AAA6516AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA6516AAA" + "'", str1, "AAA6516AAA");
    }

    @Test
    public void test35764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35764");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("      \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "1\\6 ", 173);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35765");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                A\\u0023AAAAAAAAAAAAAa000u\\                                 ", "uuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35766");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                     U6623\\U6623\\U6623\\U6623\\U6623\\U6623U666", "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35767");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "\\3200u\\3200u\\3200u\\300u\\", 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("\\i\\", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\" + "'", str2, "\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\");
    }

    @Test
    public void test35769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35769");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "23\\U0023\\U0023\\U0023\\U0023\\U0023", 566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35770");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray6, strArray8);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("\r", strArray6, strArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", strArray14);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "i!");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, ' ');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "                                                                                    222222222222222222222222222222222");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\r" + "'", str16, "\r");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10hi!100" + "'", str19, "10hi!100");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10hi!100" + "'", str21, "10hi!100");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10hi!100" + "'", str23, "10hi!100");
    }

    @Test
    public void test35771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\", "u###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###u\\32                                                                             ", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "666666666666666666666666666666666666666\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\AAAAAAAAAAAAA   " + "'", str3, "666666666666666666666666666666666666666\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\AAAAAAAAAAAAA   ");
    }

    @Test
    public void test35772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\400326666666666666666666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\40032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("UUUUUUUUUUu6UUUUUUUUUUU                        ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUu6UUUUUUUUUUU" + "'", str2, "UUUUUUUUUUu6UUUUUUUUUUU");
    }

    @Test
    public void test35774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" ...", 'U', 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ..." + "'", str3, " ...");
    }

    @Test
    public void test35775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           \\61\\61\\61\\61\\61\\61", 80, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           \\61\\61\\61\\61\\61\\61" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           \\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test35776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35776");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1\\61\\6161\\61\\6161\\61\\6161\\", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35777");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0020\\u0020\\u0020\\u0020\\u0020\\u...", "\\u0031", 20);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35778");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test35779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35779");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...                                    ", 'c');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16U \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "22222222222222222222222222222222222222222222222222222222222222222223\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35781");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray19);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray19);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray19);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray19);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   2  ", charArray19);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\1111111111111111111111111111u11111111111111111111111111110020", charArray19);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("   ...", charArray19);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ", charArray19);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3261\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", charArray19);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray19);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray19);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " U   6", charArray19);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test35782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35782");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3261\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", "U00234                                      \\U0023\\U00\\u0                    ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35783");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  ......  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  ......  " + "'", str4, "  ......  ");
    }

    @Test
    public void test35784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35784");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaa    6aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00..." + "'", str1, "...U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U00...");
    }

    @Test
    public void test35786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35786");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", "                                                                                                     hi!hi!hi!", "                  uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35787");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                ...hhhhhhhhh", "Aaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("uuu6  6  6  6  6", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35789");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ", "...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str2, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test35791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61\\ 61\\", "57575757575757575757575757575757575757575757575757575757575757575757575757575757575757575757575757575757575757571        61        615C    61        61        61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\" + "'", str2, "61\\ 61\\");
    }

    @Test
    public void test35792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35792");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ccccccccccccccccccccccccccccca000u\\ccccccccccccccccccccccccccccc", "                                                                                                                                                                                                      \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......                        ", "1111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......                        " + "'", str2, "                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......                        ");
    }

    @Test
    public void test35794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str2, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test35795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                               \\u00                                                                                                    61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\610023\\u0061\\u0061\\u0                                  ", (int) '1', 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                               ..." + "'", str3, "...                                                               ...");
    }

    @Test
    public void test35796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000" + "'", str1, "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
    }

    @Test
    public void test35797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35797");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuu...", " \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\020016\\16 \\16 u16\\16 \\16 \\...6 \\66 \\6 \\66 \\6 \\66 \\6 \\6");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6" + "'", str1, "55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6");
    }

    @Test
    public void test35799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35799");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                     HHHHHHHHHHHHHHHHH", 635, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35800");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("U61", " 61", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("AAAAAAAAAAAAAAAAAAAAAAAAA      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test35801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35802");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuu", "", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35803");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 31, 181);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("A\\u0023AAAAAAAAAAAAA", 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A\\u0023AAAAAAAAAAAAA" + "'", str2, "A\\u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test35805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35805");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("................U0023                                            ................", 'C');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '1');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "................U0023                                            ................" + "'", str4, "................U0023                                            ................");
    }

    @Test
    public void test35806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test35807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35807");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777" + "'", str2, "7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test35809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35809");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           \\u005c77777777777777777777777777777777777777777777", "...\r", 113);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35810");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence4, charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61                                         \n\n1", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test35811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35811");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u003                                                ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("u003            0023         ", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35813");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1\\6 u0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "222222222222222222222222222222222", (java.lang.CharSequence) "u003                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35815");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35816");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\r\r\r\r\r\r666661666661666U6666666661666661666\r\r\r\r\r\r\r", "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu    222222222222222222222222222222222\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35817");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35818");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6u666u", '1');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U" + "'", str2, "61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
    }

    @Test
    public void test35820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444", 563);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi61iAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6..." + "'", str2, "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6...");
    }

    @Test
    public void test35822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35822");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaa\\\\\\", "...            3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaa      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35823");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                            16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa", "                              11111                                ...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35824");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", "3200U\\1400u\\00U\\3200U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35825");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU... 61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161########61########61########61########61########61########61########61########61########61########61########61########61###61#####", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35826");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", 17, 367);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00" + "'", str3, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
    }

    @Test
    public void test35827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35827");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...                                    ", 'c');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...00...             ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test35828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35828");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("u0023\\U0023\\U\\4003U0023\\U0023\\U0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 147);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35829");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35830");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test35831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0034", "23\\u0023\\u0023        75023\\u0023\\u002");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test35832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "aaaac1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test35833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("5u", "                       \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5u" + "'", str2, "5u");
    }

    @Test
    public void test35834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35834");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!ih!ih!i", 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "16\\5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str1, "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test35837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35837");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                       AAAAAAAAAAAAA3200u\\A                                      ", "hhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35838");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\4  ", 122, "2U2U2U2U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\4  2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U" + "'", str3, "\\4  2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U");
    }

    @Test
    public void test35839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35839");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 90);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35840");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("          ...", "4141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35841");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii 6\\\\u0020iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAAAAA HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA HHHHHHHHHHHHHHHHH" + "'", str1, "AAAAAA HHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test35843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35843");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35844");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", (java.lang.CharSequence) "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                                                                             6u666u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             6u666u" + "'", str2, "                                                                             6u666u");
    }

    @Test
    public void test35846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "............................                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 " + "'", str1, "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ");
    }

    @Test
    public void test35848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...1...                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("             200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32                        1\n\n                                         ", 930, 130);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35851");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6       ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh" + "'", str2, "      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test35853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35853");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", "100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100", "                             6  6  6  6  6  uuu                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ..." + "'", str3, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
    }

    @Test
    public void test35854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", '3', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6" + "'", str3, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6");
    }

    @Test
    public void test35855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35855");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "004", 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35856");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", '6');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\u1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1" + "'", str3, "1\\u1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1\\1");
    }

    @Test
    public void test35857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000", 46, '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa00000000");
    }

    @Test
    public void test35858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test35859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                         \n\n1                                                    \n\n", 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         \n\n1                                                    \n\n" + "'", str2, "                                         \n\n1                                                    \n\n");
    }

    @Test
    public void test35860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ", 93);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35861");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35862");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                         \\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 532, 227);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35864");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0023\\u0023\\u0023\\u0023\\u004444444444444 6A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35865");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                   ", "    61    ", (int) (short) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '3');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test35866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35866");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "            1hi!1             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("2222222222222222222222222222222222222222222222222\r", 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2222222222222222222222222222222222222222222222222\r" + "'", str2, "2222222222222222222222222222222222222222222222222\r");
    }

    @Test
    public void test35868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35868");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("            23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u003", "\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35869");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 6");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005c", 543, 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc" + "'", str3, "777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                           \\6005ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
    }

    @Test
    public void test35871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35871");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuu                                  3200u", "5555555555555555aa        75                                          ", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35872");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "3200U\\3200U\\3200\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200", 930, 30);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test35873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u", "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U", "iiiiii                                                            iiiiii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r6u");
    }

    @Test
    public void test35874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35874");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "                                                                                                        aaaaaaa", 4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("1\\hi!hi!hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0035", strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "23                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str9, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test35875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35875");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("11111111111111uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\111111111111111", "                                            3200", 380);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35877");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0033", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002\\\\\\\\", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 104 + "'", int15 == 104);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test35878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...1\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\\\\\\\\\\\61\\\\\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35879");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("u003                    ", "3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test35880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35880");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "                                                         #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", "111111111aaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hCUUUUUUUU", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test35881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("               AAAAAAAAAAAAA3200\\A                                 ", (int) 'A');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35882");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...", 476, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 80, "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str3, "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0061\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test35884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35884");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                   ", (java.lang.CharSequence) "111111111111111111111u61111111111111111111111123\\U");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                   " + "'", charSequence2, "                                   ");
    }

    @Test
    public void test35885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h" + "'", str1, "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h");
    }

    @Test
    public void test35886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35886");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                    61\\ 6161\\ 61\\ 6161\\ ", "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                    61\\ 6161\\ 61\\ 6161\\ " + "'", str3, "                                                                                    61\\ 6161\\ 61\\ 6161\\ ");
    }

    @Test
    public void test35887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35887");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'U', '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'U' + "'", char2 == 'U');
    }

    @Test
    public void test35888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35888");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002", "hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("111111111111111111111U6111111111111111111111", "ccccccccccccc\\U0068cccccc");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111U6111111111111111111111" + "'", str2, "111111111111111111111U6111111111111111111111");
    }

    @Test
    public void test35890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0023", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0000000000000000000000000000000000000000000uUu0u3200uUu0u3200uUu0u3200uUu0u3200uUu0u32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6u   6...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", 192, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  " + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  ");
    }

    @Test
    public void test35892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                ##0U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n###                                 ", "                    3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00                     ", "000000000000000000000000000000.....");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000" + "'", str3, "00000000000000000000000000000000##0U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U00000U0\n###000000000000000000000000000000000");
    }

    @Test
    public void test35894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\161\\161\\161\\161\\161\\161\\u6                                 ", "6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35895");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111", "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", "u004", 685);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test35896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("23\\U", "aaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\U" + "'", str2, "23\\U");
    }

    @Test
    public void test35897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("uuuuuuuuuuuuuuuuuuuuuuuuuu16\\16 \\16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16");
    }

    @Test
    public void test35898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                 6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6" + "'", str1, "6 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6");
    }

    @Test
    public void test35899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35899");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test35900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6" + "'", str2, "U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6U   6");
    }

    @Test
    public void test35901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35901");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                        aaaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        aaaaaaa" + "'", str2, "                                                                                                        aaaaaaa");
    }

    @Test
    public void test35902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35902");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray11, strArray16);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("61", strArray11, strArray19);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061");
        boolean boolean24 = org.apache.commons.lang3.StringUtils.startsWithAny("U61", strArray23);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray19, strArray23);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23, 'h');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray23);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.endsWithAny("   23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                                          ", strArray23);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23, '5');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str17, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "61" + "'", str20, "61");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str25, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\u0061" + "'", str27, "\\u0061");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\u0061" + "'", str31, "\\u0061");
    }

    @Test
    public void test35903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("3300Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3300Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "3300Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35904");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0020\\u0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35905");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("3\\u003\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3\\u003\\" + "'", str1, "3\\u003\\");
    }

    @Test
    public void test35906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "3\\U0023\\U0023\\U0023\\U0023\\U00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35907");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 404 + "'", int1 == 404);
    }

    @Test
    public void test35908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       61\n                       ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", 19);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35909");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u003\\u003\\u0                                         1                                                    1    ", 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35910");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1\\61\\61\\61\\61", "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35911");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u000a                                        \\U0023\\U0023\\U0023");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35912");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'u', 92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test35913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("             u0023\\u002u0023\\u002u0023\\u002u0", "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             u0023\\u002u0023\\u002u0023\\u002u0" + "'", str2, "             u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test35914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35914");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("111111111111111111111111", "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u   6aaaaaaaaaaaaa", "                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "111111111111111111111111" + "'", str4, "111111111111111111111111");
    }

    @Test
    public void test35915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("              ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U" + "'", str2, "                          ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
    }

    @Test
    public void test35916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35916");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 202, (int) '7');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "00u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35918");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c\\u0", "a         ", 92);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "\\");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u", strArray6, strArray18);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) (short) 1);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.endsWithAny("    61        61        61        61        61        61        61        61        61        61        61        61        61   ", strArray25);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.split("3000u\\3111111111111111111111111111111111111111111111", '6');
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.split("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEach("23\\u", strArray30, strArray32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray25, strArray32);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("0020                                                                                     ", strArray6, strArray32);
        java.lang.String[] strArray38 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", " 61\\\\u002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16u\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u", strArray32, strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 105");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str14, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str15, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "23\\u0023\\u" + "'", str19, "23\\u0023\\u");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "23\\u" + "'", str33, "23\\u");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0020                                                                                     " + "'", str35, "0020                                                                                     ");
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test35919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35919");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ", "002300230023002300230023002300230a000u\\002300230023002...", 543);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu ", 358);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35921");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1\\U0030uUu\\", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35922");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "AAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAAAAuAAA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61        61        61        61        61        61        61        61        61        61        61        61        61" + "'", str1, "61        61        61        61        61        61        61        61        61        61        61        61        61");
    }

    @Test
    public void test35924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("\r\r\r\r\r\r666661666661666U6666666661666661666\r\r\r\r\r\r\r", "AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r666661666661666U6666666661666661666\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r666661666661666U6666666661666661666\r\r\r\r\r\r\r");
    }

    @Test
    public void test35925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               ", (int) ' ', 635);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               " + "'", str3, "                                               ");
    }

    @Test
    public void test35926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35926");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("023\\u0023aaaaaaa", "                                   ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("61\n", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ", "23\\u U   6");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35928");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih!ih!ih   2    2    2  ...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test35929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                      61\\ 61\\61", " ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35930");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuuuuuuuuuuu 3200", "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35931");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('#', (int) 'h');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test35932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35932");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("                                                             \\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test35933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35933");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                   ######", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35934");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("\\u0023\\", "                                                                                                    \\u0023                                                                                     hi!hi!hi!                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...111111111111111111111111111111111111111111111" + "'", str1, "...111111111111111111111111111111111111111111111");
    }

    @Test
    public void test35936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35936");
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u005c\\u00", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                         \n\n1                                                    \n\n", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 41 + "'", int25 == 41);
    }

    @Test
    public void test35937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35937");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 42, "                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test35938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35938");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35939");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("i!", 260, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35940");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...", "3\\u0003\\u0111111111111111111111111111111111111111111111\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui0020\\iui");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h..." + "'", str2, "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
    }

    @Test
    public void test35942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35942");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "23aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 1623");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 1623" + "'", str1, "23aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 1623");
    }

    @Test
    public void test35944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a000u\\                                                                                                                                                              ", "  ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              " + "'", str2, "                                                              ");
    }

    @Test
    public void test35946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35946");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35947");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                      u003                    ", "61UUUUUUUUUU", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35948");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "cccccccccc###\n\\u002                                         \n\n1           aaaaaaaaaaacccccccccc");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35949");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           \\\\U005C005c", "20\\u0020\\u0020\\u0020\\u00");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("000000000000000000000000000000000000000000000000000000000000", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test35950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35950");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "#", 97);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35951");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("u005CU0U005CU0U0023uU005CU0U005CU0", "\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35953");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6", "                                                                                                                                                                                                                     u003                    ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                        AAAAAAA    ", "        75");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("2  ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 124 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                        AAAAAAA    " + "'", str8, "                                                                                                        AAAAAAA    ");
    }

    @Test
    public void test35954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...", (int) (short) 1, '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51..." + "'", str3, "...\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51\\ 51...");
    }

    @Test
    public void test35955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "1uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test35956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35956");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuu", "...001600000000160000000016000000001600000000160000000016000000001600000000160000000016");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35957");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 'I', '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\" + "'", str3, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\");
    }

    @Test
    public void test35958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh", (int) 'i', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh" + "'", str3, "AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test35959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35959");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "IIIIIIIIII0023\\u0...IIIIIIIIIII", (java.lang.CharSequence) "u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "IIIIIIIIII0023\\u0...IIIIIIIIIII" + "'", charSequence2, "IIIIIIIIII0023\\u0...IIIIIIIIIII");
    }

    @Test
    public void test35960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", 92, "                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\" + "'", str3, "                                                     23aaaaaaaaaaaaAAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test35961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\ 23\\U### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", "aaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35962");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("5c", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'A', 104, (int) (byte) 0);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                        A0u0023AAAAAAAAAAAAA                                       ", strArray5);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                hi!", strArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "      " + "'", str13, "      ");
    }

    @Test
    public void test35963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("55          aaaaaaa       CCCCCCCCCCCCCCCC", "\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "55          aaaaaaa       CCCCCCCCCCCCCCCC" + "'", str2, "55          aaaaaaa       CCCCCCCCCCCCCCCC");
    }

    @Test
    public void test35964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35964");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("uuu  \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\  \\\\0020                                                            ", 40);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  " + "'", str1, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
    }

    @Test
    public void test35966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35966");
        char[] charArray10 = new char[] { 'u', '#', 'a', '\\', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "u61", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5C", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                           uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032                                                                                                                                                            ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                               ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "u#a\\a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "u#a\\a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[u, #, a, \\, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 155 + "'", int14 == 155);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test35967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35967");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                   \\u0033                   ", 227, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "                   \\u0033                   UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test35968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "    u0034                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                   ", 0, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n" + "'", str3, "\n\n\n\n\n\n\n");
    }

    @Test
    public void test35970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35970");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                        0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023    ...                                                           ", "IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35971");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", '5');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100", strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", strArray3, strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str12, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666" + "'", str14, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
    }

    @Test
    public void test35972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35972");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("222222222222222222222222222222222222222222222222222222222222U   66666666666666666666666666666666666", "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\" + "'", str1, "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\");
    }

    @Test
    public void test35975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35975");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...", "                                         \n\n                                                     \n\n                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\U003 111", "222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U003 111" + "'", str2, "\\U003 111");
    }

    @Test
    public void test35977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16U \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", (int) (byte) 100, "22222222222222222222                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16U \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16U \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test35978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35978");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '2' + "'", char1 == '2');
    }

    @Test
    public void test35979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35979");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\4003266666666666666666", (java.lang.CharSequence) "UUUUUU 6\\\\U0020 6\\\\U0020 6              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35980");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('2', 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test35981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35981");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...020u0020u0020u0020u0020u0020u0020u0020...        ", "1616161616161616161161611616161616161616161", 91);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35982");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61", '1');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6");
    }

    @Test
    public void test35983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("U5C", 107, "...AAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...U5C...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA..." + "'", str3, "...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...U5C...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...AAAA...");
    }

    @Test
    public void test35984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                   0041\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 61\\ 61\\ 61\\ 61\\ 61\\ ..." + "'", str1, "\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
    }

    @Test
    public void test35986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35986");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 23", "11111111111111..", 20);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test35987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35987");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("33333333333333333333333333333333333333333333", "222222222222222222222222222222222\\UUU02\\...2222222222222222222222222222222222", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\        \\U0023\\U00\\u0041\\U                                   5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\        \\U0023\\U00\\u0041\\U                                   5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\         " + "'", str1, "5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\        \\U0023\\U00\\u0041\\U                                   5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\         ");
    }

    @Test
    public void test35989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35989");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "UUUUUUUUUU...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uUUUUUUUUU..." + "'", str1, "uUUUUUUUUU...");
    }

    @Test
    public void test35990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35990");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   U61   ", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1616161616161616161161611616161616161616161");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaa            ", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test35991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ UUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu");
    }

    @Test
    public void test35993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test35994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35994");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("5500\r\\", "U0023\\U00\\u0041\\U002322222", "                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35995");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh", "\\6005c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("uuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuu..." + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuu...");
    }

    @Test
    public void test35997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35997");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuuuuu\\4", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35998");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111       ", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061..." + "'", str2, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...");
    }

    @Test
    public void test36000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test36000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", '\r', 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       " + "'", str3, "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
    }
}

