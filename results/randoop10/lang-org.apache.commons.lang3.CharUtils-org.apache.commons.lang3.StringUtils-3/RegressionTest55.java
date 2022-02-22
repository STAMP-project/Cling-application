import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest55 {

    public static boolean debug = false;

    @Test
    public void test27501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27501");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61########61########61########61########61########61########61########61########61########61########61########61########61###", "61                                         \n\n1", (int) '1');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666" + "'", str1, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666");
    }

    @Test
    public void test27503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27503");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   u61    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU  ", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002361\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str6, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002361\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test27504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27504");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                     61aaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "\\                                                         \\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA                        23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27505");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                      61\\ 61\\61");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test27506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27506");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" 6\\\\u0020", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str1, "iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test27508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, " 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                    \n                     ", (int) 'h', 183);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test27509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "UUUUUUUUUUu6UUUUUUUUUUU                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test27510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h", "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 53, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002\\\\\\\\" + "'", str3, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002\\\\\\\\");
    }

    @Test
    public void test27513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27513");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("u003                                               ", 81, " 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3261\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61" + "'", str3, " 61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test27515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("A\\u0023AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A\\u0023AAAAAAAAAAAAAa000u\\" + "'", str1, "A\\u0023AAAAAAAAAAAAAa000u\\");
    }

    @Test
    public void test27516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                          AAAAAAA      ", "\\u0031");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("10hi!100", "0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             1", "U0023\\U0023\\U\\4003U0023\\U0023\\U0##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10hi!100" + "'", str3, "10hi!100");
    }

    @Test
    public void test27519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020", "... 3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020" + "'", str2, "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u0020");
    }

    @Test
    public void test27520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27521");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                               i!                                                                                                                                                                                                                  ", " ...                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("323\\U00\\u0041\\U002\\U00266666666666666666666666666666666666666666666666666666       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U62\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00                                                                                                        aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27524");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "UUUUUUUUUUUUUUUUUUUUUUUUU...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...0u\\314...0u\\311", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0u\\3114...0u\\31" + "'", str2, "...0u\\3114...0u\\31");
    }

    @Test
    public void test27526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005");
    }

    @Test
    public void test27527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27527");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023002", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH..." + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...HH...");
    }

    @Test
    public void test27529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27529");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n666U3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\326", (java.lang.CharSequence) "610000000000000000000000000000000000000000000000000                                  0auu0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n666U3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\326" + "'", charSequence2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n666U3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\326");
    }

    @Test
    public void test27530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("       11111111111111..", "                                                                                                 ...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       11111111111111.." + "'", str2, "       11111111111111..");
    }

    @Test
    public void test27531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...", (int) (byte) -1, "!i16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ..." + "'", str3, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...");
    }

    @Test
    public void test27532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("22222222222222222222222222222222222222241AAAAAAAA", 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222222222222222222222222222222222222241" + "'", str2, "22222222222222222222222222222222222222241");
    }

    @Test
    public void test27533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "                           1\\U00234                                      \\U0023\\U00\\u0                    ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           1\\U00234                                      \\U0023\\U00\\u0                    .." + "'", str2, "                           1\\U00234                                      \\U0023\\U00\\u0                    ..");
    }

    @Test
    public void test27534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27534");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\r\r\r\r\r\r\r...                                      57", '3');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r...                                      57" + "'", str2, "\r\r\r\r\r\r\r...                                      57");
    }

    @Test
    public void test27536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111U" + "'", str1, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111U");
    }

    @Test
    public void test27537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U00061U0006");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u0006" + "'", str1, "u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u00061u0006");
    }

    @Test
    public void test27538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111\\U003", "023\\U0023\\U0023\\U0023    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111" + "'", str2, "\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111");
    }

    @Test
    public void test27539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27539");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'U');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '.' + "'", char2 == '.');
    }

    @Test
    public void test27540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test27541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27541");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'C', '\\');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test27542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27542");
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                         75                                                          ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1\\u00234                                      \\u0023\\u00\\U0", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test27543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27543");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("111111111111111111111U6111111111111111111111", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "111111111111111111111U6111111111111111111111" + "'", str3, "111111111111111111111U6111111111111111111111");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test27544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27544");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27545");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                       AAAAAAAAAAAAA3200u\\A                                      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test27546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0 u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0 u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0" + "'", str1, "U0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0 u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0");
    }

    @Test
    public void test27547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27547");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "....................................................................................................                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
    }

    @Test
    public void test27549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......", '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......" + "'", str2, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......");
    }

    @Test
    public void test27550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27550");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("23                                                                                     hi!hi!hi!", "...111111111111111111111111111111111111111111111111111111111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23                                                                                     hi!hi!hi!" + "'", str3, "23                                                                                     hi!hi!hi!");
    }

    @Test
    public void test27551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("111111U1111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111U1111111" + "'", str1, "111111U1111111");
    }

    @Test
    public void test27552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161" + "'", str1, "3\\u11111111111111111111111111111111161\\161\\161\\161\\161\\161\\U6161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test27553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27553");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u00", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...3\\u23\\u23U6              ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023AAAAAAA...", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test27554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27554");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 562);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...\r                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27556");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu", 85, 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27557");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                        a0u0023aaaaaaaaaaaaa                                        ", 161, '7');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7777777777777777777777777777777777777777777777777777777777777                                        a0u0023aaaaaaaaaaaaa                                        " + "'", str3, "7777777777777777777777777777777777777777777777777777777777777                                        a0u0023aaaaaaaaaaaaa                                        ");
    }

    @Test
    public void test27559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27559");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       " + "'", str2, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
    }

    @Test
    public void test27560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111\\U003", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111\\U003" + "'", str2, "\\U003 111\\U003 111\\U003 111\\U00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  ......\\U003 111\\U003 111\\U003 111\\U003");
    }

    @Test
    public void test27561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27561");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU" + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU");
    }

    @Test
    public void test27562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27562");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", (java.lang.CharSequence) "66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27563");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("\\", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("   u61    ", strArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("    61    ", strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("u61", 'U');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("      ", strArray13, strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", strArray6, strArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "                                             ");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23, "", 94, (int) ' ');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     ", strArray6, strArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "          \\U0023\\U00\\U0041\\U          ", 17, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "      " + "'", str18, "      ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00" + "'", str19, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     " + "'", str28, "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u###                     ");
    }

    @Test
    public void test27564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27564");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0041", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27565");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "22222222222222222222uuu0023                                            222222222222222222222", (java.lang.CharSequence) "  \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "22222222222222222222uuu0023                                            222222222222222222222" + "'", charSequence2, "22222222222222222222uuu0023                                            222222222222222222222");
    }

    @Test
    public void test27566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                          57");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                          57" + "'", str1, "                                                          57");
    }

    @Test
    public void test27567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27567");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(" u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u     u   ", "AAAA51AAAAAAAA51AAAAAAA1\\U00234                                      \\U0023\\U00\\u0AAAA51AAAAAAAA51AAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27569");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                      u\\32");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061", "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061");
    }

    @Test
    public void test27571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "1111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27572");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                  61", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", (int) '2');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                    \\u0023                                                                                     hi!hi!hi!                                                                                                    ", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test27573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27573");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 3200U", 0, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27574");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U" + "'", str4, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023U");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test27575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27575");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("14", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", (int) 'i');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757\\iui0020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757\\iui0020" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757\\iui0020");
    }

    @Test
    public void test27577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27578");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'u', 834);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 834 + "'", int2 == 834);
    }

    @Test
    public void test27579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27579");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '0', 'u');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
    }

    @Test
    public void test27580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U", "                                                                                                                        uuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                                                                                                        ", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032", "AAAAAAAAAAAAA32u\\A", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              555555555555555555555555555555555555555555555555555555  ......  61555555");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032" + "'", str3, "222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032");
    }

    @Test
    public void test27582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27582");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                    \n                     ", "000000000000000000000000000000000000000000000\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0000000000000000000000000000000000000000000000", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27583");
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                  I", "\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "   u61    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034", "                                                                             6u666u", "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\u" };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test27584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27584");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###\n\\u002                                         \n\n1           aaaaaaaaaaa", (java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\40032");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27585");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27586");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType(".....");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAA", strArray11, strArray13);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "6");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray5, strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny("55                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..", strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaa      " + "'", str6, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AAAAAAA" + "'", str14, "AAAAAAA");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str17, "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test27587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27587");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "16        16        16        16        16        16        16        16        16");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27589");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa      ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test27590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27590");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "2", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
    }

    @Test
    public void test27591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27591");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "    2222222222222222222222222222222222UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27592");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '6', 61);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test27593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27593");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII 6\\\\U0020IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27594");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0030", "UUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27595");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                         \n\n1                                         ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '.');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 135, (int) 'u');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test27596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test27597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27597");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'i', 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test27598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...hhhhhhhhh", "AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hhhhhhhhh" + "'", str2, "...hhhhhhhhh");
    }

    @Test
    public void test27599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("3333361                                         \n\n1                                         ", (int) (short) 100, 124);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002" + "'", str1, "iiiiiiiiiii666666666666666666666666666666666666660200u\\3\\U0023\\U0023\\U002");
    }

    @Test
    public void test27601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27601");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("3333361                                         \n\n133323\\U                                                                                             3333361                                         \n\n1333", "u6      61        61        61        61      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27602");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "11111111111111uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27604");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3" + "'", str1, "U00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3");
    }

    @Test
    public void test27605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27605");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("2..........................................\\U003 .................................................................................................................................................................................................................................................................", " 61.##########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27606");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0200iui\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27607");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh", 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...111111111111111111111111111111111111111111111", 47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27609");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\  \\\\0020                                                            ", "uuuuuuuuuaaaaaaa       3200u\\320");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", 479, '5');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555561\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", str3, "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555561\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test27611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\U0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61HI!" + "'", str1, "\\U0023                                 61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61HI!");
    }

    @Test
    public void test27612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27612");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###\n\\u002                                         \n\n1", "                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA", 161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111111111111111111111111111111111111111111" + "'", str1, "111111111111111111111111111111111111111111");
    }

    @Test
    public void test27615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27615");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("u003aaaaaa                                             ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test27616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27616");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\u0023\\u00\\U0041\\u", (java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27617");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27618");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", " 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(".................1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6..................", "...23\\0023\\002375757575757575757575757575757575757575757575757575757575", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAAAAAAAAA\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuu1u 61u 6161u 61u 6161u 61u 6161u 6uuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuu1u 61u 6161u 61u 6161u 61u 6161u 6uuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test27620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27620");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                 A\\u0023AAAAAAAAAAAAA                                  ", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 A\\u0023AAAAAAAAAAAAA                                  " + "'", str2, "                                 A\\u0023AAAAAAAAAAAAA                                  ");
    }

    @Test
    public void test27622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27622");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\61\\61\\61\\61\\61\\61", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUaaaaaaaaaaaaa\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("    16        16        16        16        16        16        16        16        16        16        16        16        16    ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 130 + "'", int4 == 130);
    }

    @Test
    public void test27623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27623");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("uuuuuuuuuuuu 3200u           ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test27624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27624");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", "\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0\\u003 \\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\u0031\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00", 929, 189);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("UUUUUUUUUU...", "  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUU..." + "'", str2, "UUUUUUUUUU...");
    }

    @Test
    public void test27627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6", 20, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0020\\u0##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6" + "'", str3, "55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6");
    }

    @Test
    public void test27628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaa23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6              aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "          \\U0023\\U00\\U0041\\U          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          \\U0023\\U00\\U0041\\U          " + "'", str1, "          \\U0023\\U00\\U0041\\U          ");
    }

    @Test
    public void test27630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27630");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (int) '\\');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                     ", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("A\\u0023AAAAAAAAAAAAAa000u\\", strArray6);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray15, strArray20);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("61", strArray15, strArray23);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray15);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny("                0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...                                ", strArray26);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6, strArray26);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str9, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str21, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "61" + "'", str24, "61");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str28, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27631");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1\\U00234                                      \\U0023\\U00\\u00");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27633");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "555555555555555555555555555555555555555555555555555555  ......  61555555", (java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84 + "'", int2 == 84);
    }

    @Test
    public void test27634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27635");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###\n\\u002                                         \n\n1", '\r');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......a");
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test27636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27636");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "33", "\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str3, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test27638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27638");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700", (java.lang.CharSequence) "1111U0023#U0023#U0023#U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test27639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27639");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "ii\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaaii");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27640");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("h          aaaaaaa       ", "\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\", 71, 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h          aaaaaa\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\" + "'", str4, "h          aaaaaa\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\");
    }

    @Test
    public void test27641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U", "                                                                                                                                                                                                                                                                                                                                             \\u0069");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U" + "'", str2, "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U");
    }

    @Test
    public void test27642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ", "61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                         \n\n1    ", (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         \n\n1    " + "'", str2, "                                         \n\n1    ");
    }

    @Test
    public void test27644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A000u\\", 87, '0');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A000u\\000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "A000u\\000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test27645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                            AAAAAAAAAAAAA3200\\A                                 AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\n\n\n\n\n\n\n\n\n\n\\u0055                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            AAAAAAAAAAAAA3200\\A                                 AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                            AAAAAAAAAAAAA3200\\A                                 AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27646");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", 110, 30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test27647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaa                                                ", 112, 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test27648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("           161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161\\161\\161\\161\\161\\16177777777777777777777777777" + "'", str1, "161\\161\\161\\161\\161\\16177777777777777777777777777");
    }

    @Test
    public void test27649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27649");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("1\\hi!hi!hi!", "\\U0030uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u320570uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "16U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\hi!hi!hi!" + "'", str3, "1\\hi!hi!hi!");
    }

    @Test
    public void test27651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27651");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                      61\\\\u002                      ", 191, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27652");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("        75                                                                                                           ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                            AAAAAAAAAAAAA3200u\\A                                 ", "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            AAAAAAAAAAAAA3200u\\A                                 " + "'", str2, "                            AAAAAAAAAAAAA3200u\\A                                 ");
    }

    @Test
    public void test27654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27654");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('\\', 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test27655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27655");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\U0023\\U0023\\U0023\\U0023\\U002", "aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  ......................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U002" + "'", str3, "\\U0023\\U0023\\U0023\\U0023\\U002");
    }

    @Test
    public void test27657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27658");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("61uuu");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'A', 0, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27659");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("U6663\\u6623\\u6623\\u6623\\u6623\\u6623UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu662", "61\\ 61\\61");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '5');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U535u5235u5235u5235u5235u523UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu52" + "'", str4, "U535u5235u5235u5235u5235u523UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu52");
    }

    @Test
    public void test27660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                                                                                                                                                 ####AU", "AAAA51AAAAAAAA51AAAAAAA1\\U23\\u0023\\u...AAAAAA51AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                 ####AU" + "'", str2, "                                                                                                                                                                                                                                                                 ####AU");
    }

    @Test
    public void test27661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27661");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("57                                                  ", "    61        61 ...", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27662");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ccccccccccccc\\U0068ccccccccccccc", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                              0U\\1600U\\1600U\\3200U\\U\\1600U\\1600U\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                        a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA061");
    }

    @Test
    public void test27666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "Iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test27667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27667");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test27668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27668");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (java.lang.CharSequence) "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("###\n###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###\n##" + "'", str1, "###\n##");
    }

    @Test
    public void test27670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("\\u003\\u0023                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u003\\u0023                                        " + "'", str1, "\\u003\\u0023                                        ");
    }

    @Test
    public void test27671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27671");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                         \n\n1    ", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27672");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                     ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                     " + "'", str4, "                                                                                                                     ");
    }

    @Test
    public void test27673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27674");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("5555555                     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5555555                     .." + "'", str1, "5555555                     ..");
    }

    @Test
    public void test27676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0", "                       \\u0036                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
    }

    @Test
    public void test27677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("..                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "                                                                                                        aaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27678");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27679");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', 146);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 146 + "'", int2 == 146);
    }

    @Test
    public void test27680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27680");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("000000000000000000000000000000...", "6\\\\u0020                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u" + "'", str1, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u");
    }

    @Test
    public void test27682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27682");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                               ", 118, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", 834);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              " + "'", str2, "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
    }

    @Test
    public void test27684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27685");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "aaaaaaaaaaaaaaaaaaa", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                   \\u0033                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   \\u0033                   " + "'", str1, "                   \\u0033                   ");
    }

    @Test
    public void test27687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("uu03uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu033uuu03uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                        ...uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 288);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "5555555\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r", 63, 339);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 63");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27688");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '6', 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test27689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27689");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("23\\u0023\\u...                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....", 354);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27690");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                      u\\32", "AAAA                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U0023\\U0##########", 460, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...3\\U0##########" + "'", str3, "...3\\U0##########");
    }

    @Test
    public void test27692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0061", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27693");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U", "U       aaaaaaa       aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27694");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...0023h\\huh0023h\\huh0023h...", "\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023\\20023                                                   ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("33333333", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...", "\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33333333" + "'", str3, "33333333");
    }

    @Test
    public void test27696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27696");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U005C", "a000u\\       UUUUUUUUUUUUUUUUUUU", (int) 'C');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111", 99, "                  uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                  uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111" + "'", str3, "111\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575111");
    }

    @Test
    public void test27698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27698");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("023\\u0023", "                   \\u0037                    ", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", "...3\\u23\\u23U6\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  \\UUU02\\UUU02\\UUU02\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666" + "'", str2, "66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
    }

    @Test
    public void test27700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                            AAAAAAA                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\                                                                                            AAAAAAA      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                            AAAAAAA                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\                                                                                            AAAAAAA      " + "'", str1, "                                                                                            AAAAAAA                                                        3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\                                                                                            AAAAAAA      ");
    }

    @Test
    public void test27701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27701");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", (java.lang.CharSequence) "                                                                                                                                                                                    16AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                         A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075                         ", "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075                         " + "'", str2, "                         A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075                         ");
    }

    @Test
    public void test27703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27703");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("d", "23\\u");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27704");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str2, "c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test27706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u" + "'", str2, "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u");
    }

    @Test
    public void test27707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAA51AAA", "1111111111111                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA51AAA" + "'", str2, "AAA51AAA");
    }

    @Test
    public void test27708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 52, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test27709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27709");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "h61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\", (java.lang.CharSequence) "\\4003");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 358 + "'", int2 == 358);
    }

    @Test
    public void test27710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                 a                                                  ", 23, 'A');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 a                                                  " + "'", str3, "                                                 a                                                  ");
    }

    @Test
    public void test27711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27711");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27712");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27715");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("uuuuuuuuuuuuuuuuuu\\4a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32000\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\32\\", 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      " + "'", str1, "      ");
    }

    @Test
    public void test27718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                              41                                                                                                                                                                         ", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              ..." + "'", str2, "                                                                                              ...");
    }

    @Test
    public void test27719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27719");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U  ", '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test27720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("a0U0023aaaaaaaaaaaaa", "\\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\", "a                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test27721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("11111                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111                             " + "'", str1, "11111                             ");
    }

    @Test
    public void test27722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27722");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                         u6      61        61        61        61                         ", "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27723");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                  i!", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27724");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\U0023AAAAAAAAAAAAAA000U\\", "\\ 23\\U### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0..." + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...");
    }

    @Test
    public void test27726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("20\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\u0020\\u0020\\u0020\\u00" + "'", str1, "20\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test27727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27727");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'C', 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'C' + "'", char2 == 'C');
    }

    @Test
    public void test27728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27728");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "#################", (java.lang.CharSequence) "\\U002322222");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "#################" + "'", charSequence2, "#################");
    }

    @Test
    public void test27729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aa                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                             7777777777777777777");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27732");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", "55555555555");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27733");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!1", "u ...... \\u004...", "uuuuuuuuuuuu");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27734");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                                                                                    \\u0023                                                                                     hi!hi!hi!                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                              ", "A000u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27736");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "222222222222222222222222222222222222222222222u6");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222222222222222222222222222222222222222222222u6" + "'", str1, "222222222222222222222222222222222222222222222u6");
    }

    @Test
    public void test27737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                            ccccccc      ", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            ccccccc      " + "'", str2, "                                                                                            ccccccc      ");
    }

    @Test
    public void test27738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "3\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("5C11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test27740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("5...", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5..." + "'", str2, "5...");
    }

    @Test
    public void test27741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      " + "'", str2, "                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                            \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ");
    }

    @Test
    public void test27742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27742");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("61u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27743");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                      75", "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27744");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("U0023\\U0023\\U\\4003U0023\\U0023\\U0", 358);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "65                                  5a5757575757575757575757575757575757575757575751115757575757575757575757575757575757575757575751115");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                      u\\32");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u\\32" + "'", str1, "u\\32");
    }

    @Test
    public void test27747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27747");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61" + "'", str1, "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
    }

    @Test
    public void test27748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "          \\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27750");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...hhhhhhhhh", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaa    6aaaaaaaaaaaaa", '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaa    6aaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaa    6aaaaaaaaaaaaa");
    }

    @Test
    public void test27752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("1\\6", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\6" + "'", str2, "1\\6");
    }

    @Test
    public void test27753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ", "\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        " + "'", str2, "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        ");
    }

    @Test
    public void test27754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27754");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0033", "\\u005c\\u001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27755");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("   u61    ");
        java.lang.String[] strArray3 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61..", strArray2, strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61.." + "'", str4, "61..");
    }

    @Test
    public void test27756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
    }

    @Test
    public void test27757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              " + "'", str3, "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ");
    }

    @Test
    public void test27758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27758");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("..                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".. 100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100" + "'", str1, ".. 100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
    }

    @Test
    public void test27759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111", 102, "111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "                                                             23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test27760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27760");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3\\u0023\\u3", 4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27761");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0023\\u0023\\u0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", (java.lang.CharSequence) "002300230023002300230023002300230a000u\\002300230023002...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test27762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("\\40032", "\n\n\n\n\n\n\n\n\n\n\n\n                                           aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\40032" + "'", str2, "\\40032");
    }

    @Test
    public void test27763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU", 'h', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU" + "'", str3, "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU");
    }

    @Test
    public void test27764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ", 1, 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 " + "'", str3, "23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ");
    }

    @Test
    public void test27765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "222222222222222222222222222261\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\612222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27766");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", 'U');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "23\\U0023\\U002");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\u0023\\u0023\\u0023\\u0023\\u002", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444");
    }

    @Test
    public void test27771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u", 6, '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u" + "'", str3, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
    }

    @Test
    public void test27772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                               i!                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27773");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...", 87, "11111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test27774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27774");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0023                                                   ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "  \n\n1                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 aaaaaaa                 a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27779");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                   0041", "1 1", 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27780");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("61\\ 61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27781");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("\n\n1                                                                                         ", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27782");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27783");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("555555555555555555555555555555555555555555555555555555  ......  61555555", "\\u0023                                                                                                                                                  hi!hi!hi!", "\\ 61\\61                                                                                                                                                                                                                                                                                                                                                                                                                                          ", (int) 'C');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "555555555555555555555555555555555555555555555555555555  ......  61555555" + "'", str4, "555555555555555555555555555555555555555555555555555555  ......  61555555");
    }

    @Test
    public void test27784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa", "\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61." + "'", str2, "\\u0055                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61.");
    }

    @Test
    public void test27785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002", "                             11111                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002" + "'", str2, "                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u002");
    }

    @Test
    public void test27786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "\\u0069                                           \\6005c\\u0069");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700", "", "                                                                                                                     61\\\\u0020                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700" + "'", str3, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700");
    }

    @Test
    public void test27788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27788");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         \n\n1                                         ", "                                       aaaaaaaaaaaaa\\\\\\", 2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a         ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("u6      61        61        61        61", strArray5, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "u6      61        61        61        61" + "'", str9, "u6      61        61        61        61");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test27789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                        ...", 667);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                        ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test27791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "0023", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                               ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test27792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61", 46, 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61" + "'", str3, "                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61                                                                                                  61");
    }

    @Test
    public void test27793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "61uuuuuuuuuuuuu23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U", (int) '1');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27794");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (byte) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test27795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("   2");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2" + "'", str1, "2");
    }

    @Test
    public void test27796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61");
    }

    @Test
    public void test27797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27797");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaa 61\\ 61\\61aaaaaaaa", "U002", "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test27798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" 623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666  ", "Aaaaaaaaaaa...      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 76, "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200" + "'", str3, "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200");
    }

    @Test
    public void test27800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 9);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test27801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("3\\u0023");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3\\u002" + "'", str1, "3\\u002");
    }

    @Test
    public void test27802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("u1111111111111111111111111111111111111111111116", "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u1111111111111111111111111111111111111111111116" + "'", str2, "u1111111111111111111111111111111111111111111116");
    }

    @Test
    public void test27803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................" + "'", str1, "001!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................");
    }

    @Test
    public void test27804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27804");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 51);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray4, strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str12, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\" + "'", str13, "                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
    }

    @Test
    public void test27805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27805");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaa\\\\\\", "i!", (int) (byte) 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u002361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0023", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaa\\\\\\" + "'", str6, "aaaaaaaaaaaaa\\\\\\");
    }

    @Test
    public void test27806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("    61        61        615c    61        61        61", "                                                                                                                u                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27807");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0U\\", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("61.####################################################################################################", "\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", " 0##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27810");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\4003211111111111111111111111111111111111111", (java.lang.CharSequence) "\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test27811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27811");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u005c");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '3');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\3u30053c" + "'", str6, "\\3u30053c");
    }

    @Test
    public void test27812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27812");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "        ###\n###    61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27813");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "###0u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\ ###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27815");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", "                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27816");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("1111111      ", "...    ...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("2U...", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '5');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111" + "'", str4, "1111111");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1111111" + "'", str6, "1111111");
    }

    @Test
    public void test27817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27818");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("0023\\U0023\\U0023\\U0023\\U0023\\U00", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 47);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "555555555555555...");
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              ", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test27819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27819");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", (java.lang.CharSequence) "                                                  75");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00" + "'", charSequence2, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
    }

    @Test
    public void test27820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...2\\162\\162\\162\\162\\162\\162\\162...                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27821");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", '\\');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("U61", 71, "                                                                                                 A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                    U61" + "'", str3, "                                                                    U61");
    }

    @Test
    public void test27823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                      u\\32", 48, "aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                      u\\32" + "'", str3, "                                                                                      u\\32");
    }

    @Test
    public void test27824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27824");
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666664300u\\", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                         \n\n1                                         ", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("!ih!ih!ih   2    2    2  ...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test27825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27825");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", "                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27826");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                         \n\n1    ", "\\400326666666666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         \n\n1    " + "'", str2, "                                         \n\n1    ");
    }

    @Test
    public void test27829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27829");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("5c", "uuuuuuuuuuuu                                  3200u", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27830");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("001\\u00", "AAAAAAA     ", 81);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   u61    ", '\r');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '\\');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '\r', 72, (int) (byte) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033", strArray4, strArray7);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "   u61    " + "'", str9, "   u61    ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "   u61    " + "'", str10, "   u61    ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033" + "'", str15, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAu0033");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test27831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27831");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("u 61.", 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27832");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test27833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032", "11111111111111.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27834");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...3200U\\3200U\\\\i\\3200U\\3200U\\3    3200U\\3200U\\\\i\\3200U\\3200U\\3...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AAAA51AAAAAAAA51AAAAAAA1\\U00234                                      \\U0023\\U00\\u0AAAA51AAAAAAAA51AAAAAAA", "\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA51AAAAAAAA51AAAAAAA1\\U00234                                      \\U0023\\U00\\u0AAAA51AAAAAAAA51AAAAAAA" + "'", str2, "AAAA51AAAAAAAA51AAAAAAA1\\U00234                                      \\U0023\\U00\\u0AAAA51AAAAAAAA51AAAAAAA");
    }

    @Test
    public void test27836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\16 ", 36, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\16 " + "'", str3, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\16 ");
    }

    @Test
    public void test27837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0", "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test27838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", "...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\32\\U0068");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27839");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27840");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "23                                               ...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test27841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27841");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00", (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test27842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16", "                                                                             6u623\\U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1" + "'", str2, "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1");
    }

    @Test
    public void test27843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27843");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("\\u0061\\u0061\\u\\u0023\\u0061\\u0061\\u0                              ", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061\\u0061\\u\\u0023\\u0061\\u0061\\u0                              " + "'", str2, "\\u0061\\u0061\\u\\u0023\\u0061\\u0061\\u0                              ");
    }

    @Test
    public void test27845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("8     8     8     8     8     8     8     8  8     8     8     8     8     8     8     8   ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           \\61\\61\\61\\61\\61\\61", 16);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", '2', '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            AAAAAAAAAAAAA3100\\A                             6\\6\\66\\6\\66\\6\\66\\6..." + "'", str3, "                            AAAAAAAAAAAAA3100\\A                             6\\6\\66\\6\\66\\6\\66\\6...");
    }

    @Test
    public void test27847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test27848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a", 43, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test27850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("66666666666666666666666666666666666666666...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "66666666666666666666666666666666666666666..." + "'", str1, "66666666666666666666666666666666666666666...");
    }

    @Test
    public void test27852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ", "\\u0055                                            1111111111111111111111111111111111111111111111", 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  " + "'", str3, "\\U0023\\U0023\\U0023\\aaaaaaaaaaaaa\\\\\\                  ");
    }

    @Test
    public void test27853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                        20\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................", "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1................." + "'", str2, "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................");
    }

    @Test
    public void test27855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27855");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "\\4003");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27856");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray3, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("...                          ...", strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "...020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str9, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test27857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27857");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (java.lang.CharSequence) "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", charSequence2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test27858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27858");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 61", strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'U', 92, 81);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                  61", strArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n3\\U                      ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "\\U0023\\U00", 73, 262);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 73");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10hi!100" + "'", str14, "10hi!100");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test27859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27859");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023", "                                                                                                    ", (int) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n210000000000000000000000000000000000000000000000000\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\0auu0", "##############################################.16");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################.16" + "'", str2, "##############################################.16");
    }

    @Test
    public void test27861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27861");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U0##" + "'", str2, "U0023\\U0##");
    }

    @Test
    public void test27863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27863");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("1\\ 61\\ 6 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1\\ 61\\ 6" + "'", str1, "1\\ 61\\ 6");
    }

    @Test
    public void test27864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27864");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\IIIIIIII\\U" + "'", str1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\IIIIIIII\\U");
    }

    @Test
    public void test27866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("A000U\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61A000U\\61\\61\\61\\61\\6161\\61\\61\\61\\61\\61A000U\\", 433);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                            ccccccc      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ccccccc" + "'", str1, "ccccccc");
    }

    @Test
    public void test27868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27868");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!100", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("10hi!100", strArray5, strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("10hi!100", "\\u000d", 1);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("2", strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("\r", strArray5, strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'A');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r" + "'", str15, "\r");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10hi!100" + "'", str17, "10hi!100");
    }

    @Test
    public void test27869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27869");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\", "                   0041\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4aaa\\4", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "\\U0075");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\" + "'", str2, "4444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test27871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27871");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("1111111      ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002361\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test27872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27872");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUChUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUCh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 370, "                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                            " + "'", str3, "23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                            ");
    }

    @Test
    public void test27874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                            \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8" + "'", str1, "3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8");
    }

    @Test
    public void test27876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                      3200U\\1400\\00U\\3200U\\", "61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      3200U\\1400\\00U\\3200U\\" + "'", str2, "                                                                                      3200U\\1400\\00U\\3200U\\");
    }

    @Test
    public void test27877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27877");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                         \n\n1    ", "...\r                                                                                                                                                                                                         ", 48);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27878");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27879");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27880");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\U6                      \n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161\\161\\161\\161\\161\\161\\U6                      \n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n" + "'", str1, "161\\161\\161\\161\\161\\161\\U6                      \n\n\n\n\n\n\n\n\n\n\n\\u005c\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test27881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test27882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27882");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("UU03UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "...232U00232U002375757575757575757575757575757575757575757575757575757575333333333333", 0, 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...232U00232U00237575757575757575757575757575757575757575757575757575757533333333333333UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str4, "...232U00232U00237575757575757575757575757575757575757575757575757575757533333333333333UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test27883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27883");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('C', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test27884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\u0020                                        ", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "AAAA                            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test27886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27887");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("UUUUUUUUUUUUUUUUUUUUUUUUUUUU..", "55          aaaaaaa       CCCCCCCCCCCCCCCC", 63, (int) 'u');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..55          aaaaaaa       CCCCCCCCCCCCCCCC" + "'", str4, "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..55          aaaaaaa       CCCCCCCCCCCCCCCC");
    }

    @Test
    public void test27888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU023\\u0023\\u0023", "\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032" + "'", str2, "\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032");
    }

    @Test
    public void test27889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                ", "33");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                " + "'", str2, "                                                                                ");
    }

    @Test
    public void test27890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\400326666666666666666666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00231\\4003266666666666666666666666666666666666666", (java.lang.CharSequence) "                                                          57");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...111111111111111111111111111111111111111111111111111111111111", "61 61 61 61 61 61 61 61 61 61 U61 61 61 61 61 61 61 61 61 61 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...111111111111111111111111111111111111111111111111111111111111" + "'", str2, "...111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test27892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27892");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...666    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\666666\r\r\r\r\r\r\r\r", "                                                                                           U", "", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...666    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\666666\r\r\r\r\r\r\r\r" + "'", str4, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0...666    2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\666666\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test27893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27893");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27894");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("6\\\\u0020                                                                     ", "161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test27895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1\\ 1\\ 1\\ 1\\ 1\\ 11111111", "22222222222222222\\22232\\\\\\\\222222222222222222222222222222222222222222222222222222222222222222222222222222222", "33333333        753333333333333333333333333    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15 15 15 15 15 11111111" + "'", str3, "15 15 15 15 15 11111111");
    }

    @Test
    public void test27896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5", "         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c5" + "'", str2, "c5");
    }

    @Test
    public void test27897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27897");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                        \\u0023\\u\\");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27898");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("UUUUUU61\\ 61\\ 6161\\ 61\\ 661\\161\\161\\161\\161\\161\\U6 161\\161\\161\\161\\161\\161", "u                                                ", 25);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27899");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\61\\61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "00000000000000000000... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27900");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023111111111111111111111111111111111111111111111111111111111111111", "000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27901");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\\U000D");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U000D" + "'", str1, "\\U000D");
    }

    @Test
    public void test27902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("A", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test27903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27903");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", "11111111111111uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\111111111111111", 55);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27905");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...111111111111111111111111111111111111111111111111111111111", (java.lang.CharSequence) "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...111111111111111111111111111111111111111111111111111111111" + "'", charSequence2, "...111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test27906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27906");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u6", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27907");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u0020");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "00000000", 34);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u003\\u0023\\u0023\\u0023\\", "\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", "10hi!1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10hh!10hh1!10hh1!10hh1!1" + "'", str3, "10hh!10hh1!10hh1!10hh1!1");
    }

    @Test
    public void test27910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27910");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                             ...", 1, 566);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                        0U\\                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                         \\U0                                                        " + "'", str1, "                                                         \\U0                                                        ");
    }

    @Test
    public void test27912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27912");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u00c\\u00", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", 306);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27913");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...", "Aaaaaaaaaaa...      61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                      ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("                              ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2                              \\2                              \\2                              \\2                              \\2                              \\2                              \\2                              \\2" + "'", str4, "2                              \\2                              \\2                              \\2                              \\2                              \\2                              \\2                              \\2");
    }

    @Test
    public void test27914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("61\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", "                                                                                           U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161" + "'", str2, "\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
    }

    @Test
    public void test27915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27915");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     \\U0023\\U00\\u0041\\U0023     ", "H                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27916");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                   ", "    61    ", (int) (short) 10);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\", "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A\\u0023AAAAAAAAAAAAA", strArray4, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A\\u0023AAAAAAAAAAAAA" + "'", str11, "A\\u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test27917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "                                        A0u0023AAAAAAAAAAAAA                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "###\n###    61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161" + "'", str2, "111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161");
    }

    @Test
    public void test27920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ", "......A000u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           " + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                                                                                                                                           ");
    }

    @Test
    public void test27921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27921");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                23\\u0023\\u0023\\u0023\\u0023\\u002", '.');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27922");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0023\\U0023\\U0023\\U0023\\U0023\\U00", 108, 'C');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC0023\\U0023\\U0023\\U0023\\U0023\\U00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" + "'", str3, "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC0023\\U0023\\U0023\\U0023\\U0023\\U00CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
    }

    @Test
    public void test27923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                          23\\U0023\\U                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                          23\\U0023\\U                                          " + "'", str1, "                                          23\\U0023\\U                                          ");
    }

    @Test
    public void test27924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", 306);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    @Test
    public void test27926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", (int) '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n1                        23\\u0023\\u0023\\u00..." + "'", str2, "\n\n1                        23\\u0023\\u0023\\u00...");
    }

    @Test
    public void test27927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "0023\\u0023\\u0023\\ U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("......A000u\\", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......A000u\\                                        " + "'", str2, "......A000u\\                                        ");
    }

    @Test
    public void test27930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27930");
        char[] charArray16 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0020", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   2  ", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\1111111111111111111111111111u11111111111111111111111111110020", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("   ...", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("U", charArray16);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test27931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27931");
        char[] charArray17 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray17);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           \\u005c", charArray17);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                       aaaaaaaaaaaaa\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray17);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "000000000000000000000000000000...                                                         ", charArray17);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\0023\\0023\\0023\\0023\\0023\\0023\\0023...", charArray17);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 43 + "'", int26 == 43);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 33 + "'", int28 == 33);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test27932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27932");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("c", "\\u0023                                                                                                                                                  hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27933");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray3, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("hi!", strArray3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "   u61    ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str9, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test27934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                 A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 A" + "'", str1, "                                                                                                 A");
    }

    @Test
    public void test27935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27935");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\U0023\\U00\\u0041\\U", "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '6');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U00\\u0041\\U" + "'", str4, "\\U0023\\U00\\u0041\\U");
    }

    @Test
    public void test27936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27936");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("111111111aaaa", "", 49);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "C");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "111111111aaaa" + "'", str4, "111111111aaaa");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test27937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                           ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27938");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("51");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '5' + "'", char1 == '5');
    }

    @Test
    public void test27939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27939");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", "aaaaaaaaaaaaa\\\\\\", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\4003");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str7, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test27940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27940");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("61aaaaaaaaaaaaaaaaaaaaaa...", 3, "     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61aaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "61aaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test27941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27941");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '\n', (int) (short) 10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("4", strArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("1111111      ", strArray8);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test27942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test27943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27943");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                       61\n                       ", (java.lang.CharSequence) "                                                                                                                                                                                                                          11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                       61\n                       " + "'", charSequence2, "                       61\n                       ");
    }

    @Test
    public void test27944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27944");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 69, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, "                                                                                                                                                                                                                                                 5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test27946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                        AAAAAAA    ", " \\u003 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        AAAAAAA    " + "'", str2, "                                                                                                        AAAAAAA    ");
    }

    @Test
    public void test27947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                   ", "0023\\u0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", 404);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                   " + "'", str3, "                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test27948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27948");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test27949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAA...AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAA                             HHHHHHHHHHHHHHHHH", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     HHHHHHHHHHHHHHHHH" + "'", str2, "                     HHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test27950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111161\\", "22H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H22222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111161\\" + "'", str2, "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111161\\");
    }

    @Test
    public void test27951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("          \\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          \\" + "'", str1, "          \\");
    }

    @Test
    public void test27952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("  16        16        16        16        16        16        16        16        16");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16        16        16        16        16        16        16        16        16" + "'", str1, "16        16        16        16        16        16        16        16        16");
    }

    @Test
    public void test27953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1", " 61\\ 61\\ 61\\ 61u003                                                61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test27954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A", 108);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ..." + "'", str2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ...");
    }

    @Test
    public void test27955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27955");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test27956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaa                            ", 76, 460);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa                            " + "'", str3, "aaaa                            ");
    }

    @Test
    public void test27957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                   ", "                                       \\                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                       \\                                                                              \\                                       61                                       \\                                       aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
    }

    @Test
    public void test27958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...u0020u0020u0020u0020u0020u0020u0020u0020u0020..." + "'", str1, "...u0020u0020u0020u0020u0020u0020u0020u0020u0020...");
    }

    @Test
    public void test27959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27959");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaa...000200002000020000200002000020000200002000020...\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa...000200002000020000200002000020000200002000020...\\\\\\\\\\\\\\" + "'", str1, "aaaaaaaaaaaaa...000200002000020000200002000020000200002000020...\\\\\\\\\\\\\\");
    }

    @Test
    public void test27960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27960");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...H    H...", "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ", 31);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...HH..." + "'", str4, "...HH...");
    }

    @Test
    public void test27961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27961");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u005c\\u0", "a         ", 92);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "\\");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u", strArray4, strArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str12, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str13, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "23\\u0023\\u" + "'", str17, "23\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str19, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test27962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "61\\ 61\\61uuuuuuuu                                                                             23\\u0023\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27963");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa162aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaa 61aaaaaaaaaaaaa5555555                                             ...aaaaaaaaa 61aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "                                         \n\n1                                                    \n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test27965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("61uuu", ' ', '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61uuu" + "'", str3, "61uuu");
    }

    @Test
    public void test27966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27966");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("\\                                                u                                                005                                                c");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test27967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27967");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0026666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test27968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str2, "aAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test27969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27969");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\U0033                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27971");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                          57", "61\\ 61\\ ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61        61        61        61        61        61        61        61        61        61        61        61        61" + "'", str1, "61        61        61        61        61        61        61        61        61        61        61        61        61");
    }

    @Test
    public void test27973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "           A\\u0023AAAAAAAAAAAAA                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27974");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 566, "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str3, "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004u61 \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test27976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27976");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u006\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27977");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0023\\U0023\\U0023\\U0023\\U0023\\U00", "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("       ...\r", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str6, "0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test27978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".\\16 ", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\16 " + "'", str2, "\\16 ");
    }

    @Test
    public void test27979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27979");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("i!U0023", "                \n\n\n\n\n\n\n\n\n\n\\u0055                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27980");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaa                                                uuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test27981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27981");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("  U6                                            ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27982");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("55555555555555555555555555555555555555555555555555555555555555555555555555555555\\u0036");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55555555555555555555555555555555555555555555555555555555555555555555555555555555\\u0036" + "'", str1, "55555555555555555555555555555555555555555555555555555555555555555555555555555555\\u0036");
    }

    @Test
    public void test27983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'C');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test27984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("1111111111123\\U                                        ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "U0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111123\\U                                        " + "'", str3, "1111111111123\\U                                        ");
    }

    @Test
    public void test27985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6" + "'", str2, "\\61\\61\\61\\61\\u0023     23\\u23\\u23\\u23\\u23\\u23\\u23\\u23u6");
    }

    @Test
    public void test27986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27986");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ih01001!ih01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih01001!ih0" + "'", str1, "ih01001!ih0");
    }

    @Test
    public void test27987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61" + "'", str2, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61");
    }

    @Test
    public void test27988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161\\", 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\\161\\161\\161\\161\\161\\U6      " + "'", str3, "161\\161\\161\\161\\161\\161\\U6      ");
    }

    @Test
    public void test27989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" 61\\ 6161\\ 61\\ 6161\\ ", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    61\\ 6161\\ 61\\ 6161\\ " + "'", str2, "                                                                                    61\\ 6161\\ 61\\ 6161\\ ");
    }

    @Test
    public void test27990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27990");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                            3200u", "....................................................................................................", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###" + "'", str1, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###");
    }

    @Test
    public void test27992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27992");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  \\U005C  ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("    u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00    ", "                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray7);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("75", ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1", strArray14, strArray17);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, " 61\\\\u0020");
        boolean boolean23 = org.apache.commons.lang3.StringUtils.endsWithAny("6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", strArray17);
        int int24 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("  2   ", strArray17);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\ \\61\\aaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray7, strArray17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "75" + "'", str19, "75");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "75" + "'", str22, "75");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\ \\61\\aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str25, "\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\ \\61\\aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test27993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27993");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                   \\u0037                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                   \\u0037                   " + "'", str1, "                   \\u0037                   ");
    }

    @Test
    public void test27994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27994");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002", 117);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "    ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("AAAA...", (java.lang.Object[]) strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666", 135, 7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaa" + "'", str7, "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test27995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                         u6      61        61        61        61                         ", "555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test27996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27996");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("333336                                         \n\n                                         ", "222222222222222222222222222222222222222222222u6                                          ", "      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "333336                                         \n\n                                         " + "'", str4, "333336                                         \n\n                                         ");
    }

    @Test
    public void test27997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27997");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\n\n1                        23\\u0023\\u0023\\u00...", 'C', '3');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n1                        23\\u0023\\u0023\\u00..." + "'", str3, "\n\n1                        23\\u0023\\u0023\\u00...");
    }

    @Test
    public void test27998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27998");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                            aaaaaaaaaaaaa3200\\a                                ", 161, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test27999");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "200U\\3", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                            AAAAAAAAAAAAA3200\\A                                               ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test28000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest55.test28000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...                                       ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00         ...", "61616161616161616161616161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                       ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00         ..." + "'", str2, "...                                       ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00                                                                                  ...2  \\2  \\2  \\2  \\2  \\2  \\2  \\2...3\\u00         ...");
    }
}

