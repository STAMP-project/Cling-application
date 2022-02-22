import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest49 {

    public static boolean debug = false;

    @Test
    public void test24501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h..." + "'", str1, "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
    }

    @Test
    public void test24502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24502");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 105, 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########" + "'", str1, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                       U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
    }

    @Test
    public void test24504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", 127, "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023" + "'", str3, "### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u00230023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test24505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24505");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " 61\\\\u0020", (java.lang.CharSequence) "111111111111111111111U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test24506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24506");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "aaaaaaaaaaaaaa\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24507");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" ...                         ", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                               \\u0035");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("5", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5" + "'", str2, "5");
    }

    @Test
    public void test24510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                            3200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24511");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray7, strArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("\r", strArray7, strArray15);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ", "a");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray7, strArray20);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", '6');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                           ", strArray7, strArray25);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray25, 'c', 31, (int) '\n');
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10hi!100" + "'", str10, "10hi!100");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r" + "'", str17, "\r");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    " + "'", str21, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str22, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                                                                           " + "'", str26, "                                                                                           ");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test24512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24512");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaaaaaaaaaaaaaa...");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                             0uUu", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "      \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                       " + "'", str9, "                                                       ");
    }

    @Test
    public void test24513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test24514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24515");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("65 5a5757575757575757575757575757575757575757575751115757575757575757575757575757575757575757575751115", 78);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24516");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", "                                23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                         \n\n                                                     \n\n                                      ", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         \n\n                                                     \n\n                                      " + "'", str2, "                                         \n\n                                                     \n\n                                      ");
    }

    @Test
    public void test24518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r" + "'", str2, "\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test24519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6", "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6" + "'", str2, " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
    }

    @Test
    public void test24520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24520");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "", "u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test24521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24521");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111                                            5500u\\aaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24523");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", "\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u022222\\U0023\\U00\\u0041\\U002322222\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u0023\\u002\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24524");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "020\\u0020\\u00" + "'", str1, "020\\u0020\\u00");
    }

    @Test
    public void test24525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\u61", "555555555555555555555555555555555555555555555555555555  ......  61555555555555555555555555555555555555555555555555555555  ......  \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24526");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '0');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("  2  UUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUU  2  " + "'", str1, "UUUUU  2  ");
    }

    @Test
    public void test24528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24528");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("023\\u0023\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a2222222222222222222222222222222222222222222222222222222222222222222222222222", "                                              \\u0032", "61\\ 61\\ ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test24529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24529");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("uuuu61uuuu", 'u');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'u' + "'", char2 == 'u');
    }

    @Test
    public void test24530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24530");
        char[] charArray14 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u005c\\u00", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                         \n\n1                                                    \n\n1                                  61\\", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666", charArray14);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test24531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ", 0, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\" + "'", str3, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
    }

    @Test
    public void test24532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24532");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6116", (java.lang.CharSequence) "1\\hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6116" + "'", charSequence2, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6116");
    }

    @Test
    public void test24533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24533");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('I');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24535");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", "\r");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "\\61\\61\\61\\61\\61\\61");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'U', (int) '7', 245);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test24536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24537");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                            \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                             ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 161 + "'", int2 == 161);
    }

    @Test
    public void test24538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24538");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAA                                             ", "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u1111111111111111111111111111111111111...", 936);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444444444", "AAAAAA                             HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test24540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("2                                                                                                                    ", "\\aa\\a", "i!                                                                                   U0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2                                                                                                                    " + "'", str3, "2                                                                                                                    ");
    }

    @Test
    public void test24541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   ", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   " + "'", str2, "U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   ");
    }

    @Test
    public void test24542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "......\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test24543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24543");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test24544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24544");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("u", "   ...                             ", (int) '\\');
        java.lang.String[] strArray8 = new java.lang.String[] {};
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0061", strArray8);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '2', 100, (int) '3');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ", strArray4, strArray8);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    " + "'", str16, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "u" + "'", str17, "u");
    }

    @Test
    public void test24545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("U0023", "   2  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023" + "'", str2, "U0023");
    }

    @Test
    public void test24546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24546");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("U0023#U0023#U0023#U0023#U0023#U0023#U0023      ", "       aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24549");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                           \\\\U005C005c", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\U002322222", "                                                                                                                                                                                                                                                                                                                                             \\u0069                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U002322222" + "'", str2, "U002322222");
    }

    @Test
    public void test24551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA" + "'", str2, "AAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAAAAAA15AAAA");
    }

    @Test
    public void test24552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24552");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii                                 ", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24553");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("A\\u0023AAAAAAAAAAAAA", "...0u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("u0023\\u002u0023\\u002u0023\\u002u0                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u002u0023\\u002u0023\\u002u0" + "'", str1, "u0023\\u002u0023\\u002u0023\\u002u0");
    }

    @Test
    public void test24555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   .." + "'", str1, "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..");
    }

    @Test
    public void test24556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "00U\\3200U\\3200U\\3200U\\3200U\\3200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24558");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '6');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str3, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str4, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str5, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str7, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
    }

    @Test
    public void test24559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test24560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24560");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..                                                                                                                 ", "                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24561");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "\\4\n\n\n", (int) 'U');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U002               20\\U0");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test24562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24562");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" ...                         ", "                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi61iAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi61iAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi61iAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test24564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24564");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUU0023UUUUUUUUUUUUUUUU", "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111       ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\", 11, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\" + "'", str3, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\");
    }

    @Test
    public void test24566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24566");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                        ...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\u002e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u002e" + "'", str1, "\\u002e");
    }

    @Test
    public void test24568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24568");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "111111111aaaa", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                           1\\U00234                                      \\U0023\\U00\\u0                    ..", "ii\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaaii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ii\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaaii" + "'", str2, "ii\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaaii");
    }

    @Test
    public void test24570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24570");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                        \\0033                                         ", 'c');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                   \\u0037                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                        \\0033                                         " + "'", str4, "                                        \\0033                                         ");
    }

    @Test
    public void test24571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24571");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24572");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("16u");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2, strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24573");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "\\");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) '3', 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", strArray1, strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str9, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str10, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str18, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test24574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24574");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24575");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "H", (int) '7');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '\\', 94, (int) '#');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test24576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24576");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\32\\U0068", 30);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24578");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "U003aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) " u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\...", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24581");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "1111111111..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0\\u0020\\u00", "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3", "aa        75                                          aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0\\u0020\\u00" + "'", str3, "0\\u0020\\u00");
    }

    @Test
    public void test24583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("2", (int) 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2" + "'", str2, "2");
    }

    @Test
    public void test24585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24585");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("555555555555555555555555555555555555555555555555555555  ......  61555555555555555555555555555555555555555555555555555555  ......  \n", "........................................................................................1111111     ", "\\16 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24586");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "5555555555", (java.lang.CharSequence) "aaaaaaaaaaaaa    6aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24587");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                              ", "...h    h...aaaaaaa                            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", 95);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24588");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ", "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24589");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   ...                             ", "\\u0075");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24590");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("6", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
    }

    @Test
    public void test24591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("a                        ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test24592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\61\\61\\61\\61\\61\\61aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   ", "\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\61\\61\\61\\61\\61\\61aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   " + "'", str2, "\\61\\61\\61\\61\\61\\61aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   ");
    }

    @Test
    public void test24593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u   6aaaaaaaaaaaaa", "61uuuuuuuuuuuuhi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61uuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61uuuuuuuuuuuuhi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61uuuuuuuuuuuuu" + "'", str2, "61uuuuuuuuuuuuhi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61uuuuuuuuuuuuu");
    }

    @Test
    public void test24594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       " + "'", str1, "                                       ");
    }

    @Test
    public void test24595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" 23", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 23" + "'", str2, " 23");
    }

    @Test
    public void test24596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24596");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("uuuuuuuuuuuu 3200u           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("   23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                                          ", "", "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24599");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("u61");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u61" + "'", str2, "u61");
    }

    @Test
    public void test24600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\" + "'", str1, "666666666666666666666666666666666666666                                       AAAAAAAAAAAAA\\\\\\");
    }

    @Test
    public void test24601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                   0041", 340, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   0041hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "                   0041hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test24602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24602");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                               002300230023002300230023002300230a000u\\002300230023002300230023002300230", "c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", 76);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24603");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "\\u000d");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str4, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test24604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24604");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24605");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaa                             ", "  2   ", 104);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test24606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24606");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a000u\\       ", "                        \\uhi!hi!hi!                         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24607");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u000a", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("23\\u                                                 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test24608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24608");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\U0061\\U0061\\U\\U0023\\U0061\\U0061\\U0                              ", (java.lang.CharSequence) "                              #                               ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\U0061\\U0061\\U\\U0023\\U0061\\U0061\\U0                              " + "'", charSequence2, "\\U0061\\U0061\\U\\U0023\\U0061\\U0061\\U0                              ");
    }

    @Test
    public void test24609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24609");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002", "    222222222222222222222222222222222", 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24610");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u", 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                             U\\32", "A\\u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1111U0023#U0023#U0023#U", "2");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24613");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("          aaaaaaa       ", "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24614");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a000u\\", "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", 667);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24615");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '4', 146);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test24616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24616");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666iiiiiiiiiii", "aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "aaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test24618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24618");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23\\u                                        ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...", 89, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6..." + "'", str3, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...");
    }

    @Test
    public void test24620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24620");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", '#', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
    }

    @Test
    public void test24622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                              23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AAAAAA                             HHHHHHHHHHHHHHHHH", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023u666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAA                             HHHHHHHHHHHHHHHHH" + "'", str2, "AAAAAA                             HHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test24625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24625");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                    16aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24626");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444444   ...4444444444444444444444444444444444444", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ", 93, 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        " + "'", str4, "4  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
    }

    @Test
    public void test24627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\U6                      \n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24628");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u002066666666666666666666666666666666666666", "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", 7);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("...11111111111111111111111111111111111111111111111111111111", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\u002066666666666666666666666666666666666666" + "'", str7, "\\u002066666666666666666666666666666666666666");
    }

    @Test
    public void test24629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                        AAAAAAA     ", "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000", "    3    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                        AAAAAAA     " + "'", str3, "                                                                                                        AAAAAAA     ");
    }

    @Test
    public void test24630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24630");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023", '\n');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", 88, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...UUUUUUUUUUUUUUUUU                   " + "'", str3, "...UUUUUUUUUUUUUUUUU                   ");
    }

    @Test
    public void test24633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24633");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "                                                                                   16u", "                   \\u0037                    ", 433);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str4, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test24634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...23\\0023\\002375757575757575757575757575757575757575757575757575757575" + "'", str2, "...23\\0023\\002375757575757575757575757575757575757575757575757575757575");
    }

    @Test
    public void test24635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24635");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray5, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '\r');
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                        ...", strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test24636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24636");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test24637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 57, "                                           \\u005c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         " + "'", str3, "                                                         ");
    }

    @Test
    public void test24638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "           \n\n161\\ 61\\ 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24640");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U61", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 104);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                      \\U0023\\U00\\u0041\\U0023", strArray3, strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "           161\\161\\161\\161\\161\\16177777777777777777777777777");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, "\\u002                                         \n\n1", 69, 56);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                      \\U0023\\U00\\u0041\\U0023" + "'", str13, "                                      \\U0023\\U00\\u0041\\U0023");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test24641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "61uuuuuuuuuuuuhi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61uuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24642");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24644");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "u003aaaaaa                                             ", (java.lang.CharSequence) "0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "u003aaaaaa                                             " + "'", charSequence2, "u003aaaaaa                                             ");
    }

    @Test
    public void test24645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("23\\u0023\\u0023323\\u0023\\u0023", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u0023\\u0023323\\u0023\\u0023" + "'", str2, "23\\u0023\\u0023323\\u0023\\u0023");
    }

    @Test
    public void test24646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   2  ", 267);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                        2  " + "'", str2, "                                                                                                                                                                                                                                                                        2  ");
    }

    @Test
    public void test24647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\u005c\\u00666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100666666666666666666666100023\\u0023", "           \n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24648");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\n', 95);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test24649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61", "......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61");
    }

    @Test
    public void test24650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24650");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                        Aauaa23AAAAAAAAAAAAA                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24651");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "Iaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Iaaaaaaaaaaaa" + "'", str2, "Iaaaaaaaaaaaa");
    }

    @Test
    public void test24653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("3200U\\3200U\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\3200" + "'", str1, "3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\3200");
    }

    @Test
    public void test24654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("3\\U                      ", "                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 " + "'", str2, "                                                 ");
    }

    @Test
    public void test24655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24655");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'h', (int) '6', 23);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test24656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24656");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("000000000000000000000000000000...                                                         ", "            ", 929);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test24657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002" + "'", str1, "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
    }

    @Test
    public void test24658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "000u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24659");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", "                                                                                                                                                                                                                                                                 ####au");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2", (int) 'U', 306);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2" + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2");
    }

    @Test
    public void test24661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24661");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24662");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('2', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test24663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24663");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061" + "'", str2, "\\u0061");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061" + "'", str3, "\\u0061");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test24664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#################################################", 268);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\16", 'U');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\16" + "'", str2, "\\16");
    }

    @Test
    public void test24666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                     61aaaaaaaaaaaaaaaaaaaaaa...", "23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("####AU", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####AU" + "'", str2, "####AU");
    }

    @Test
    public void test24668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575" + "'", str1, "...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
    }

    @Test
    public void test24669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("u6      61        61        61        61                                                            ", 25, 95);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   61        61                                                       " + "'", str3, "   61        61                                                       ");
    }

    @Test
    public void test24670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777", 243, "hhhhhhhhhhhhhuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh" + "'", str3, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh");
    }

    @Test
    public void test24671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24671");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................", 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test24672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24672");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a");
    }

    @Test
    public void test24674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("3\\U                      ", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3\\U                      " + "'", str2, "3\\U                      ");
    }

    @Test
    public void test24675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24675");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaa 61\\ 61\\61aaaaaaaa", "", "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test24676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24676");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61" + "'", str1, "                                                                                                                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test24678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                      u\\32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24679");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u", "\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ ...", 263);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24680");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ", "0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24681");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ", 95);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24682");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA             ", "      61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24683");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ", 104);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test24684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24684");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1\\U00234                                      \\U0023\\U00\\u", "3200");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24685");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("3200U\\1400u\\00U\\3200U\\", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test24686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U" + "'", str2, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U");
    }

    @Test
    public void test24687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("C", "###\nu002                                         \n\n1                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C" + "'", str2, "C");
    }

    @Test
    public void test24688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24688");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAA51AAAAAAAA51AAAAAAA1\\U23\\u0023\\u...AAAAAA51AAAAAAA", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test24689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24689");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!", 78);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test24691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24691");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'h');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("333333333333333333333333333333333333333333u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "333333333333333333333333333333333333333333u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "333333333333333333333333333333333333333333u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test24693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24693");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                        ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 100);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                   ", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                        " + "'", str6, "                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                        " + "'", str8, "                                                                                                        ");
    }

    @Test
    public void test24694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24694");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####au");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24695");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\u0023\\u\\", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA", "\\U0023\\U0023\\U0023\\U0023\\U002.......................................................................", "                       c5                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA" + "'", str3, "AAAA51AAAAAAAA51AAAAAAA1               AAAAAA51AAAAAAA");
    }

    @Test
    public void test24697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("     1\n\n                                                    1\n\n                                         ", "0\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ", 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     1\n\n                                                    1\n\n                                         " + "'", str3, "     1\n\n                                                    1\n\n                                         ");
    }

    @Test
    public void test24698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24698");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\u0055                                            1111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0055                                            1111111111111111111111111111111111111111111111" + "'", str1, "\\u0055                                            1111111111111111111111111111111111111111111111");
    }

    @Test
    public void test24699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24699");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\\u002066666666666666666666666666666666666666", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test24700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261", '1');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "777777777777777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test24701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24701");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 191);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24702");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...", 340);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'i', 460, 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test24703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24703");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAsciiControl('C');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U", "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U" + "'", str2, "U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U");
    }

    @Test
    public void test24705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24705");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...11111111111111111111111111111111111111111111111111111111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...11111111111111111111111111111111111111111111111111111111" + "'", str2, "...11111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test24706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24706");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                       AAAAAAAAAAAAA3200u\\A                                      ", "                                        a0u0023aaaaaaaaaaaaa                                        ", 98);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                           1400u\\", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test24707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "1111111111..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111.." + "'", str1, "1111111111..");
    }

    @Test
    public void test24708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24708");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24709");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                              23\\u0023\\u0023\\u002   ", "1\\U00234                                      \\U0023\\U00\\u0                    ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24710");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\", "       22222\\U0023\\U00\\u0041\\U002322222", 64);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24711");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u00", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("A", "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10HI!100", 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10HI!100" + "'", str2, "10HI!100");
    }

    @Test
    public void test24714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24714");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                 \\u0036                                                                 ", "                                                                                                  i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24715");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '3', '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '3' + "'", char2 == '3');
    }

    @Test
    public void test24716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test24717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24717");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\iui0020", "16        16        16        16        16        16        16        16        16        16        16        16        16", "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 60);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\iui0020" + "'", str4, "\\iui0020");
    }

    @Test
    public void test24718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u00", 20, "i!                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u00" + "'", str3, "0\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u000\\u0020\\u00");
    }

    @Test
    public void test24719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\61\\61\\61\\61\\u0023     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24720");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU20\\u0020\\u0020\\u0020\\u00    20\\u0020\\u0020\\u0020\\");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test24721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\" + "'", str2, "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000U\\");
    }

    @Test
    public void test24723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...0u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0u\\3111111111111111111111111111111111111111111111" + "'", str1, "...0u\\3111111111111111111111111111111111111111111111");
    }

    @Test
    public void test24724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24724");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ", "111111111        ", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24725");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA", "200U\\3", 115, 77);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA200U\\3" + "'", str4, "AAAAAAAAA23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              AAAAAAAAA200U\\3");
    }

    @Test
    public void test24726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00" + "'", str1, "u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00");
    }

    @Test
    public void test24727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "\\4003211111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str2, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test24728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("\\4003", "iii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24729");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", " 61\\ 61\\ ", (int) '7');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24730");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U\\" + "'", str1, "U\\");
    }

    @Test
    public void test24731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24731");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "11111111111111..", (java.lang.CharSequence) "40032\\40032");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "11111111111111.." + "'", charSequence2, "11111111111111..");
    }

    @Test
    public void test24732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                       23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23                                                                       ", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023u6                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                       23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23                                                                       " + "'", str2, "                                                                       23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23                                                                       ");
    }

    @Test
    public void test24733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24733");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("10hi!10010hi!10010h\\400310hi!10010hi!10010hi", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24734");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("uuuuuuuuuuuuuuuuuu\\4555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuu\\4555555555555555555555555" + "'", str1, "uuuuuuuuuuuuuuuuuu\\4555555555555555555555555");
    }

    @Test
    public void test24736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24736");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24737");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0023         ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test24738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "2..........................................\\U003 .................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24740");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test24741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("6uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24742");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                          ", "23\\U                                       ", 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\U                                       " + "'", str4, "23\\U                                       ");
    }

    @Test
    public void test24743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24744");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("u0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU", 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'u' + "'", char2 == 'u');
    }

    @Test
    public void test24745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24745");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                        u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test24746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24746");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                          ", "66666666666666666666666666666666666666666666666666666       22222\\u0023\\u00\\u0041\\u002322222", 100);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test24748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\u5c");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24749");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666", 936);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24750");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test24751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ", '6', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h... " + "'", str3, "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h... ");
    }

    @Test
    public void test24752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u003                                                u0023u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                                                                                             hi!hi!hi!", "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", 161);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24753");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\U                                                                                      ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ", 161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24754");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "61.##############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\u0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\" + "'", str1, "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
    }

    @Test
    public void test24757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", "                                       aaaaaaaaaaaaa\\\\\\", 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      " + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ");
    }

    @Test
    public void test24758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                           ...                                                                                                                                                                                                                          ", "iiiiiiiiiiiiiiiiiiiiiiiiiiiU775Ciiiiiiiiiiiiiiiiiiiiiiiiiiii7777777777777777777777777777777777", "!ih!ih!ih   2    2    2  ...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                           ...                                                                                                                                                                                                                          " + "'", str3, "                                                                                                                                                                                                                           ...                                                                                                                                                                                                                          ");
    }

    @Test
    public void test24760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("\\u0055                   23\\u0023\\u0023        75023\\u0023\\u001111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111      " + "'", str1, "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111      ");
    }

    @Test
    public void test24762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24762");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "i!11111111111111111111111111111111111111111111111111111111111111111111111111111111111U000011111111111111111111111111", (java.lang.CharSequence) "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa                                                ", "                                      \\u0023\\u00\\u0041\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24764");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ", "aaaaaaaaaaaaa    6aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test24765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24765");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444" + "'", str1, "UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444");
    }

    @Test
    public void test24766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24766");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("####A000U\\", "  2   ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###\n\\u002                                         \n\n1", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###\n\\u002                                         \n\n1" + "'", str2, "###\n\\u002                                         \n\n1");
    }

    @Test
    public void test24768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U", 30, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U" + "'", str3, "###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
    }

    @Test
    public void test24769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24769");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", "", 68);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24770");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'A', '5');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'A' + "'", char2 == 'A');
    }

    @Test
    public void test24771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24771");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\05c0000000000000000000000000000000000000000000000000", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                             0uUu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24772");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("       5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24773");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "\\u0069");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24774");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                    \n\n1", "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", (-1), (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1" + "'", str4, "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1");
    }

    @Test
    public void test24775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24775");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "          23\\u0023\\u0023          3    23\\u0023\\u0023      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59 + "'", int1 == 59);
    }

    @Test
    public void test24776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...            3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaa", "2222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24778");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "iiiiiiiiiiiiiiiii23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test24779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0041\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00u\\1400" + "'", str1, "00u\\1400");
    }

    @Test
    public void test24780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24780");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "aaaaaaauuuuuuuuu 023\\u0023", 433, 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaauuuuuuuuu 023\\u0023" + "'", str4, "aaaaaaauuuuuuuuu 023\\u0023");
    }

    @Test
    public void test24781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA" + "'", str1, "AAAAAAA");
    }

    @Test
    public void test24782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24782");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u", "                                                                     ", (int) '\n');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002", "\\0u00020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002" + "'", str2, "2u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002u\\U002");
    }

    @Test
    public void test24784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\               " + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\               ");
    }

    @Test
    public void test24785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\1400u\\00U\\3200U\\" + "'", str1, "3200U\\1400u\\00U\\3200U\\");
    }

    @Test
    public void test24786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 82, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test24787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\U0033                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0033                   " + "'", str1, "\\U0033                   ");
    }

    @Test
    public void test24789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24789");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", "C", 98);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24790");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24791");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                    \n                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAAAAAAAAAAAAAAAAAAAAAA2AAAAAAAAAAAAAAAAAAAAAAA", "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA2AAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAA2AAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test24793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24793");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("u003                    ", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      u003                    " + "'", str2, "                                                                      u003                    ");
    }

    @Test
    public void test24795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("61..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61.." + "'", str1, "61..");
    }

    @Test
    public void test24796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", (java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24797");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "0", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00", 20, "                                                                                                         \\U0023\\U00\\u0041\\U                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test24799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24799");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("   U61   ", "...                                      57", 153);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("             23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", 96, "I!                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!                          23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             " + "'", str3, "I!                          23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ");
    }

    @Test
    public void test24801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                 ####AU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                 ####au" + "'", str1, "                                                                                                                                                                                                                                                                 ####au");
    }

    @Test
    public void test24802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24803");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("AAAAAA                             HHHHHHHHHHHHHHHHH", "###AU#################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24804");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("###\n\\u002                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\n\\u002                                      " + "'", str1, "###\n\\u002                                      ");
    }

    @Test
    public void test24805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24805");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16", "111111111111111111111111111111111111111111", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test24807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAAAAAAAAAAA32u\\A                                 ", "  \\\\0020");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAA32u\\A                                 " + "'", str2, "AAAAAAAAAAAAA32u\\A                                 ");
    }

    @Test
    public void test24808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                        \\U0023\\U00\\u0041\\U0023                         ", "                                                                                                        \\u0023\\u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U00\\u0041\\U" + "'", str2, "U0023\\U00\\u0041\\U");
    }

    @Test
    public void test24809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24809");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "\\U0023 HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa", "\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa" + "'", str2, "0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa");
    }

    @Test
    public void test24811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24811");
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
        int int30 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23, "                                                                                                                                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61", 11, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test24812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24812");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1\\U00234                                      \\U0023\\U00\\u0                    ..", "aaaaaaa23\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaa", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24813");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test24814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("1\\U00234                                      \\U0023\\U00\\u0", "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\U00234                                      \\U0023\\U00\\u0" + "'", str2, "1\\U00234                                      \\U0023\\U00\\u0");
    }

    @Test
    public void test24815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24815");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("        \\u0034         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24816");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("222222U0023#U0023#U0023#U0023#U0023#U0023", "iiiiiii0##", (int) '5');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("               aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               AAAAAAAAAAAAA3200\\A                                 " + "'", str1, "               AAAAAAAAAAAAA3200\\A                                 ");
    }

    @Test
    public void test24818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "3\\U00237575757575757575757575757575757575757575757");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023AAAAAAAAAAAAA" + "'", str1, "\\u0023AAAAAAAAAAAAA");
    }

    @Test
    public void test24820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24820");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                                                                                  61", "\\u005c", 4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0023", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) 'u', (int) (byte) 10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray6);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test24821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 61, 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test24822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24822");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h", "61########61########61########61########61########61########61########61########61########61########61########61########61###", 24);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24823");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Iaaaaaaaaaaaa", "00000000    2222222222222222222222222222222220000000", 47);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("i!                                                                                   U0023                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                                                                                   U0023" + "'", str1, "i!                                                                                   U0023");
    }

    @Test
    public void test24825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24825");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "6...0000000000000000000000000000000", "      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u0023\\U\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u005", "i!                                                                                   U0023                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6              " + "'", str1, " 6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6              ");
    }

    @Test
    public void test24828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24828");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "222222222222222222222222222222222222222222222U6                                          ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 47 + "'", int13 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test24829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###", 886, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test24830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AAAAAAA     \\u0041                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAA     \\u0041                                                                                           " + "'", str1, "aAAAAAA     \\u0041                                                                                           ");
    }

    @Test
    public void test24831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24831");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0033", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "777777777777777777777777777777777777777777777777777777777777777777777777777777777", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hhhhhhhhhhhhhuuuuuuu", charArray11);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test24832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24832");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24833");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\16177777777777777777777777777", "AAAAAAAAA...0u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24834");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaa", "\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) 'A');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "\\u002066666666666666666666666666666666666666", 250, 108);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "U   6");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaa" + "'", str9, "aaaa");
    }

    @Test
    public void test24835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "22222a2aaUa  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "22222a2aaUa  " + "'", str1, "22222a2aaUa  ");
    }

    @Test
    public void test24836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24836");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "61aaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24837");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("5c");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "33333333333333333333333333333\\40032333333333333333333333333333333");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("Uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "533333333333333333333333333333\\40032333333333333333333333333333333c" + "'", str4, "533333333333333333333333333333\\40032333333333333333333333333333333c");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test24838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24838");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2" + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2");
    }

    @Test
    public void test24840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\U0023\\U0023\\U0023\\U0023\\U002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8", "61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\U0023\\U0023\\U0023\\U0023\\U002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8" + "'", str2, "8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\U0023\\U0023\\U0023\\U0023\\U002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8");
    }

    @Test
    public void test24841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24841");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...UUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24842");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                      u003                    ", 28, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                      u003                    " + "'", str3, "                                                                      u003                    ");
    }

    @Test
    public void test24843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24843");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "c            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24844");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('U', 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test24845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24845");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", "aaaaaaaaaaaaaaaaaaaaaaaaaa3aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test24846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA" + "'", str1, "\\      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAA");
    }

    @Test
    public void test24847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24847");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...0u\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24848");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("000000000000000000000000000000000000000000000\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0000000000000000000000000000000000000000000000", "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccc");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                        ...", 41, 81);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 41");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24849");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002hi23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24850");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         \n\n1                                         ", "                                       aaaaaaaaaaaaa\\\\\\", 2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a         ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("u6      61        61        61        61", strArray4, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "u6      61        61        61        61" + "'", str8, "u6      61        61        61        61");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                         \n\n1                                         " + "'", str9, "                                         \n\n1                                         ");
    }

    @Test
    public void test24851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24851");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\...", '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\\' + "'", char2 == '\\');
    }

    @Test
    public void test24852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24852");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055", "\\                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  \\                               \\U0061\\U0061\\U\\u0023\\U0061\\U0061\\U0                                  \\", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24854");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("    61    ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("aaaa                            ", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    61    " + "'", str4, "    61    ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test24855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24855");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("22223200U\\1400u\\00U\\3200U", "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test24856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24856");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......                        ", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                               ", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                               " + "'", str2, "                               61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                               ");
    }

    @Test
    public void test24858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24858");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...    ...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'h');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                        Aauaa23AAAAAAAAAAAAA                                        ", 95, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h    h..." + "'", str3, "...h    h...");
    }

    @Test
    public void test24859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\u005", "\\16 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "23");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24861");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "1h!1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24864");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("##U###\n####U###\n####U###\n####U###\n####U###\n##57                                                                                                                             1", "aaaaaaaaaaaaa...000200002000020000200002000020000200002000020...\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                 \\u0030\\\\\\\\                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666" + "'", str1, "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666");
    }

    @Test
    public void test24867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061", "1\\U00234\\U0023\\U00\\u0..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061" + "'", str2, "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061");
    }

    @Test
    public void test24869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1", "222222222222222222222222222222222222222222222222222111111111aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1" + "'", str2, "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1");
    }

    @Test
    public void test24870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24870");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 'A');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          ", '7', 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test24872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                                                                                                 " + "'", str1, "\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                                                                                                 ");
    }

    @Test
    public void test24873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24873");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                            AAAAAAA                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\                                                                                            AAAAAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24874");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24875");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("22222\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...", 81);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24876");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...0023h\\huh0023h\\huh0023h                            ...", 189);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24877");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                       u0023\\u002u0023\\u002u0023\\u002u0", 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str1, "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test24879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                       aaaaaaaaaaaaa\\\\", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       aaaaaaaaaaaaa\\\\" + "'", str2, "                                       aaaaaaaaaaaaa\\\\");
    }

    @Test
    public void test24880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24880");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", 936, 263);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test24881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24881");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" u   6", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24882");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                      u003                    ", "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      u003                    " + "'", str2, "                                                                      u003                    ");
    }

    @Test
    public void test24884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24884");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("23\\u0023\\u0023323\\u0023\\u0023                                                               ", "4444444444444444444444444444444444444   ...4444444444444444444444444444444444444", 92);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test24885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24885");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777", "\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test24886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                              " + "'", str2, "                                                                                                              ");
    }

    @Test
    public void test24887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23", "U0023\\U00\\u0041\\U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23" + "'", str2, "23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23");
    }

    @Test
    public void test24888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "000000000000000000000000000000000000000000000000016 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24889");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...aaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "             ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...aaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24890");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                     ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u000d", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test24891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24892");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test24893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24893");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24894");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161                                                                                          ", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...                                    111111111111111111111111111111...", "...1\\61\\61\\61\\   2     ...                                ...    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 23, (int) 'I');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test24897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("2                                                                                                                    ", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 6);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test24898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24898");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("U61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24899");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u0068");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test24900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24900");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\" + "'", str1, "\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\\\i\\");
    }

    @Test
    public void test24901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("\\4003211111111111111111111111111111111111111", "\\U0032\\U0032\\U0032\\U0032\\U0032\\U0032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\4003211111111111111111111111111111111111111" + "'", str2, "\\4003211111111111111111111111111111111111111");
    }

    @Test
    public void test24902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("1111111     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111" + "'", str1, "1111111");
    }

    @Test
    public void test24903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...                          ...", "0023\\u00 61\\ 61\\61\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222" + "'", str1, "222222u0023#u0023#u0023#u0023#u0023#u0023#u0023      222222");
    }

    @Test
    public void test24905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24905");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  16        16        16        16        16        16        16        16        16", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0032");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("i!         ", " 61\\Aaaaaaaaaaaaa\\\\\\ ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!         " + "'", str2, "i!         ");
    }

    @Test
    public void test24907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("61\n", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\n" + "'", str2, "61\n");
    }

    @Test
    public void test24908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                        \\0033                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        \\0033                                         " + "'", str1, "                                        \\0033                                         ");
    }

    @Test
    public void test24909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "       aaaaaaa          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24910");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "iiiiiiii\\u");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test24911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                             6u666u", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 91, "8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     \\U0023\\U0023\\U0023\\U0023\\U002     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8     8");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8   " + "'", str3, "8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8   ");
    }

    @Test
    public void test24913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h..." + "'", str1, "Ih01001!ih01ih010...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h...");
    }

    @Test
    public void test24914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u002" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u002");
    }

    @Test
    public void test24915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  6  6  6  6  6  UUU", (int) '\\', 86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  6  6  6  6  6  UUU" + "'", str3, "  6  6  6  6  6  UUU");
    }

    @Test
    public void test24916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24916");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("00U\\3200U\\3200U\\3200U\\3200U\\3200");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hhhh   ...                             hhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24919");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test24920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("111111111        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111111        " + "'", str1, "111111111        ");
    }

    @Test
    public void test24921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24921");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r8", "\\u0036");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24922");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'a' + "'", char1 == 'a');
    }

    @Test
    public void test24923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24923");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa16", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("3200u\\3200u\\3200u\\3200u\\3200u\\", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test24924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("000u", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000u" + "'", str2, "000u");
    }

    @Test
    public void test24925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###\n\\u002                                         \n\n1           ", 75, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###\n\\u002                                         \n\n1           aaaaaaaaaaa" + "'", str3, "###\n\\u002                                         \n\n1           aaaaaaaaaaa");
    }

    @Test
    public void test24926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24926");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 66 + "'", int1 == 66);
    }

    @Test
    public void test24927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("555555555555555555555555555555555555555555555555555555  ......  ", "                                                                                      ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "555555555555555555555555555555555555555555555555555555  ......  " + "'", str2, "555555555555555555555555555555555555555555555555555555  ......  ");
    }

    @Test
    public void test24928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24928");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("30\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30\\\\\\\\" + "'", str1, "30\\\\\\\\");
    }

    @Test
    public void test24929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24929");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24930");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("14");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test24931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24931");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '2', 'c');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void test24932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24933");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("23\\U                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U" + "'", str1, "23\\U");
    }

    @Test
    public void test24935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str2, "UUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test24936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24936");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...AAAA      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("2", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2222222222222222222222" + "'", str2, "2222222222222222222222");
    }

    @Test
    public void test24938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24938");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r", "7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777                                                                                                 A7777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24939");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                           ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24940");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ", "\\U000AAAAAAAAAAAAAA3200U\\A", 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24941");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "4444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test24942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24942");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                     61\\ 61\\61                                                                                                                                                                     ", "\\4003266666666666666666666666666666666666... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u3\\u0023\\u0023\\u0023\\u0023\\u00231\\40032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                     61\\ 61\\61                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                     61\\ 61\\61                                                                                                                                                                     ");
    }

    @Test
    public void test24944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24944");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test24946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24946");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'I');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The character I is not in the range '0' - '9'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24947");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", "1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24948");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("u003                                                u0023u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                u003                                                                                                                             hi!hi!hi!", "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", 1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24949");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\", "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("A000\r\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\", "                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                           a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000\r\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\" + "'", str2, "A000\r\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000\r\\");
    }

    @Test
    public void test24951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24951");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "2............................................................................................................................................................................................................................................................................................................................................................", (java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaaaaa061aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str1, "u00230023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test24953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24954");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "   2");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test24955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24955");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" 61\\\\50020", 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" ...                         ", 61, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU");
    }

    @Test
    public void test24957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24957");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test24958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24958");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccc", "                              60\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u0060\\u006", 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccc" + "'", str3, "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61cccccccc61ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccUccccccccccccc");
    }

    @Test
    public void test24960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24960");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\6005c");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test24961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("61u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", "\\u0069                                           \\6005c\\u0069");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test24962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24962");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU", "23\\u                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24963");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaa3200U\\a                                 ", "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ", "                                             ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaa3200U\\a                                 " + "'", str3, "aaaaaaaaaaaaa3200U\\a                                 ");
    }

    @Test
    public void test24966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "U0023                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24967");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                             6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "11111111111111.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111." + "'", str1, "11111111111111.");
    }

    @Test
    public void test24969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24969");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                              ", "11111111111111.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24970");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", 834, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  \r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  \r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test24971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24971");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("16...23\\U0023\\U002375757575757575757575757575757575757575757575757575757575 ", "1AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test24972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u" + "'", str1, "000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u");
    }

    @Test
    public void test24973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24973");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "7");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  \\U005C  ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", strArray4, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "                                        \\0033                                         ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2" + "'", str9, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                          \\0033                                         \\                                        \\0033                                         U                                        \\0033                                         005                                        \\0033                                         C                                        \\0033                                           " + "'", str11, "                                          \\0033                                         \\                                        \\0033                                         U                                        \\0033                                         005                                        \\0033                                         C                                        \\0033                                           ");
    }

    @Test
    public void test24974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24974");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                 U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", "10hi!10010hi!10010h\\400310hi!10010hi!10010hi");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test24975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020..." + "'", str1, "aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
    }

    @Test
    public void test24976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       2" + "'", str2, "                                       2");
    }

    @Test
    public void test24977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test24978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                      3200U\\1400\\00U\\3200U\\", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test24979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24979");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa", "\\U005C", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24980");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  16        16        16        16        16        16        16        16        16", "222222222222222222222222222222222222222222222u6       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24981");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                          ", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test24982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24982");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                          23\\U0023\\U                                          ", (int) 'u', 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24983");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...023\\U0023\\U00237575757575757575757575757575757575757");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '3', '6');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test24986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", 0, '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057" + "'", str3, "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
    }

    @Test
    public void test24987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24987");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test24988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("UUUUUUUUUUUUUUU0023UUUUUUUUUUUUUUUU", "161\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUU0023UUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUU0023UUUUUUUUUUUUUUUU");
    }

    @Test
    public void test24989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "iiiiiii0##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test24990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test24991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       uuuuuuu", "UU03UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       uuuuuuu" + "'", str2, "\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3\\u00                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...3       uuuuuuu");
    }

    @Test
    public void test24992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24992");
        boolean boolean1 = org.apache.commons.lang3.CharUtils.isAscii('I');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test24993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\n\n\n\n\n\n\n\n\n\n\\u0055                                            ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24994");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A\\u0023AAAAAAAAAAAAAa000u\\", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test24995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24995");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                         U0023\\U002U0023\\U002U0023\\U002U0", "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ", (int) 'h');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111                                                                   ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 161 + "'", int5 == 161);
    }

    @Test
    public void test24996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24996");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", (java.lang.CharSequence) "                                                                             6u666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82 + "'", int2 == 82);
    }

    @Test
    public void test24997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24997");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  2  ", "..                                                                                                                 ", (int) '5');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test24998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("3232323232323                                                  ", "55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test24999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", " 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  " + "'", str2, " 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  ");
    }

    @Test
    public void test25000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest49.test25000");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                   \\u0037                   ", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAaaaaaaaaaaaaaaaa...023\\u0061\\u0061\\u0 61 \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }
}

