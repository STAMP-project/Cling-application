import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest73 {

    public static boolean debug = false;

    @Test
    public void test36501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "uuuu61uuuu                              23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0000000000000000000000000000002255                                            0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..0   ..", "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36503");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("U002322222", "                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "U002322222" + "'", str4, "U002322222");
    }

    @Test
    public void test36504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36504");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                             6u666u", (java.lang.CharSequence) " 61\\\\U0020");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36505");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaa...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa222222222222222222222222222222222222222222222u6                                          ", 173);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA", 479);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                   AAAAAA                             HHHHHHHHHHHHHHHHHAAAAAAAA");
    }

    @Test
    public void test36507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                   \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "000u\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test36508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("001!ih01", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 98);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36509");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.", "i!                                                                                   U002", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36510");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444uuuuu", 167, 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36511");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                      ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaa u   6aaaaaaaaaaaa", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa..." + "'", str2, "aaaaaaaa...");
    }

    @Test
    public void test36513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("66666666666666666666666666666666666666666666666...", "1111111111111111111111111111111111111111110uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 234, 635);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36515");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                              6u666", " ...                         ", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................", 0, "A...\\61\\61\\61\\61\\U0023     ...A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................" + "'", str3, ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................");
    }

    @Test
    public void test36517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "      AAAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("u6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "1uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test36520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36520");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
    }

    @Test
    public void test36521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36521");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("161\\161\\161\\161\\161\\16177777777777777777777777777");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36522");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                            000000000000000000000000000000...             ", (java.lang.CharSequence) "...h31\\h31\\h31\\h31\\h31\\h31\\h31\\h...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0023\\u00 61\\ 61\\61\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n" + "'", str1, "0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test36524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("61uuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuu", "               3300uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("61\\61\\61", (int) '\n');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  61\\61\\61" + "'", str2, "  61\\61\\61");
    }

    @Test
    public void test36527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                          ", "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36528");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("2", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36529");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("UU03UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU033UUU03UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36530");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaa", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaa" + "'", str4, "aaa");
    }

    @Test
    public void test36531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36531");
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("\\u005c", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "uuuuuuuuu23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6uuuuuuuuu", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4   4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4,  ,  ,  , 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test36532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("       h", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       h" + "'", str2, "       h");
    }

    @Test
    public void test36533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36533");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("61        61", "###AU", 51);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36534");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\\U0023\\U00\\u0041\\U                                   ", "77777###\n\\u002                                         \n\n1           aaaaaaaaaaa77777", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005", 78);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\U0023\\U00\\u0041\\U                                   " + "'", str4, "\\U0023\\U00\\u0041\\U                                   ");
    }

    @Test
    public void test36535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("75                                                          ", 0, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "75                                                          " + "'", str3, "75                                                          ");
    }

    @Test
    public void test36536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36536");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "IUI0020\\4\n\n.............................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36537");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...u0020u0020u0020u0020u0020u0020u0020u0020u0020...", "..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36538");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                             \\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0", ' ');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("u003            0023         ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test36539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36539");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "       22222\\U0023\\U00\\u0041\\U00232222");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test36540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36540");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                              ", 'h');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("023\\u0023       aaaaaaa", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "023\\u0023       aaaaaaa" + "'", str8, "023\\u0023       aaaaaaa");
    }

    @Test
    public void test36541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("023\\U0023AAAAAAA", "i!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", 153);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "023\\U0023AAAAAAA" + "'", str3, "023\\U0023AAAAAAA");
    }

    @Test
    public void test36542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("61616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161" + "'", str2, "61616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161");
    }

    @Test
    public void test36543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", 460, "111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaau61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00" + "'", str3, "111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa111111111111111111111111111111111111111111111\\u0...aaaaaaaaaaaaaaaaaaaaau61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
    }

    @Test
    public void test36544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36544");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666", 27, 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36545");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '7', 'i');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '7' + "'", char2 == '7');
    }

    @Test
    public void test36546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66                                                                            ", 543);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66                                                                            " + "'", str2, "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66                                                                            ");
    }

    @Test
    public void test36547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...0000000000000000000000000000000", "020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "666666666666666666666100023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023100" + "'", str1, "666666666666666666666100023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023100");
    }

    @Test
    public void test36549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ", 191, 183);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        " + "'", str3, "  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
    }

    @Test
    public void test36550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36550");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("22222222222222222222                                           \\6005c                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 'u');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("23\\U0023\\U...                                   ", 245);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\" + "'", str2, "700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
    }

    @Test
    public void test36553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "                                  3200 61\\ 61\\ 61", "AAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36554");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020                       ", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\u0023                                                                                                                                                  hi!hi!hi!61\\61\\61\\61\\61      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test36555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36555");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "iiiiiiii\\u", (java.lang.CharSequence) "23\\u0023\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test36556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", 267);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str2, "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test36557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("6\\\\U0020", "000000000U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\\\U0020" + "'", str2, "6\\\\U0020");
    }

    @Test
    public void test36558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36558");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                  3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 51);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray4, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, 'a', (-1), 479);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str12, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000UUUUUUUUUUUUUUUUUUUUUUUUU...000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test36559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("3333361                                         \n\n1                                         ", "61uuuuuuuuuuuuhi!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61uuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3333361                                         \n\n1                                         " + "'", str2, "3333361                                         \n\n1                                         ");
    }

    @Test
    public void test36560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n" + "'", str2, "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n");
    }

    @Test
    public void test36561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36561");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                           1111111111111111111111111111111111111111111111       64\n\n0U                                                                                                                                                            ", 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36563");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 157);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                     ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "...3\\U0##########333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str2, "1\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test36566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test36567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("U0023", 181);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023                                                                                                                                                                                " + "'", str2, "U0023                                                                                                                                                                                ");
    }

    @Test
    public void test36568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36568");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       aaaaaaaaaaaaa3200u\\a                                      ", '\r');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36569");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "\\U000aaaaaaaaaaaaaa3200U\\", 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("111111111111111111111111", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111                                                                      " + "'", str2, "111111111111111111111111                                                                      ");
    }

    @Test
    public void test36571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\161\\161\\161\\161\\161\\161\\u6                                 ", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("22H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H22222222222222222222222222222222222222222222222222222", 164, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36573");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '\r', 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test36574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test36575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36575");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\  \\\\0020                                                            ", "000000000000000000000000000000000000000000000000016 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0034");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36577");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("..............................", "                       000u                       ", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u\\1600u1111111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "......  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36579");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...H    H...", "\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\u0055                                            \n\n\n\n\n\n\n\n\n\n\\u0055                                   ", 31);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                                      3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test36580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36580");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1111123i23i23i23iui31i23i23i23i23111111", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) 'i', "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                23\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test36583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36583");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "2                                        uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \n\n1                                                                                                                               ", (java.lang.CharSequence) "61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36584");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36585");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaac500\\0\\0200\\0200\\0200\\0200\\0200\\\n###");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36586");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###\nu002                                         \n\n1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'I', 0, 440);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36587");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "........6 \\1616 \\16 \\1616 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016" + "'", str1, "161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016101610161016");
    }

    @Test
    public void test36589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061" + "'", str1, "\\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061                                    \\U0061\\U0061\\U0061\\U0061\\   u61    1\\U0061\\U0061\\U0061\\U0061");
    }

    @Test
    public void test36590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36590");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("55                                            u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..u 61..", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36591");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "3AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\13AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA0023AAAA51AAAA00233AAAA51AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", "                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006", 476, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
    }

    @Test
    public void test36594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36594");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ", "23\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u002223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223\\u0023\\u0023\\u00223", 178);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    " + "'", str3, "            00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u    ");
    }

    @Test
    public void test36595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                 \\uhi!hi!hi!                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 \\uhi!hi!hi!                        " + "'", str1, "                 \\uhi!hi!hi!                        ");
    }

    @Test
    public void test36596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36596");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("222222222222222222222222222222222222222222222u6                                          ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU30\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", (int) '.');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36597");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("1111111111111111111111111111", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test36598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36598");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "\\4\n\n\n", (int) 'U');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u6u64444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116" + "'", str1, " 11111111111111111111111111111111111111111111123\\u0023\\u1111111111111111111111111111111111111111111116");
    }

    @Test
    public void test36600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36600");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test36601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36601");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("11111111111", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36602");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1!0h01aaaaUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "\\\\hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "3\\U", (java.lang.CharSequence) "                                                                    U61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAA51AAAAAAAA51AAAAAAA1\\U23\\U0023\\U...AAAAAA51AAAAAAA", "1111111111111                 \\u0030\\\\\\\\                                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36605");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1\\U00234                                      \\U0023\\U00\\u0                    ..", 77, "\\u005");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1\\U00234                                      \\U0023\\U00\\u0                    .." + "'", str3, "1\\U00234                                      \\U0023\\U00\\u0                    ..");
    }

    @Test
    public void test36606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36606");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuu6cuuuu", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36607");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 260);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaa                                             ", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII 6\\\\U0020IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36609");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("20\\u0020\\u0020\\u0020\\u00", "61\\ U61\\ 61\\ 61\\ 61\\ 61\\  61\\ U61\\ 61\\ 61\\ 61\\ 61\\");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'C');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "20u0020u0020u0020u00" + "'", str4, "20u0020u0020u0020u00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "20Cu0020Cu0020Cu0020Cu00" + "'", str6, "20Cu0020Cu0020Cu0020Cu00");
    }

    @Test
    public void test36610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  \n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\u", "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u                                  3200\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\u00u61\\u005c\\uccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36611");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuu3200", "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA", (int) (short) -1);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("................U0023       ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    ................U0023                                           " + "'", str2, "                                    ................U0023                                           ");
    }

    @Test
    public void test36613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36613");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(" uuuuuuuuuuU6uuuuuuuuuuu                         ", "1111111111111                 \\u0030\\\\\\\\                                      ", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "..111111116 \\16 \\16 \\16 \\16 \\16");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36615");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36616");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ", 21, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36617");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("002u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########", "000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Aaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36619");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36620");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("IiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiIiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "\\\\0020                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36621");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666", "U0023\\u0...\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUU000u                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36622");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A\\U0023AAAAAAAAAAAAAA000U\\", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu   ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '.', 8, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test36623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36623");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ", 6);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '6', 72, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 72");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test36624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36624");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                             U\\32", "i!                                                                                   U002");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "161\\ 61\\ 6", 300);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("6116116116116116116116116116116116116116116116116116116116116116", "5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6116116116116116116116116116116116116116116116116116116116116116" + "'", str2, "6116116116116116116116116116116116116116116116116116116116116116");
    }

    @Test
    public void test36627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005" + "'", str1, "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
    }

    @Test
    public void test36628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36629");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                              5c");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '\\', 117, 101);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test36630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...3\\u23\\u23U6              ", "\\\\0020 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 59);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U", "3\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...061                                         \n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U" + "'", str2, "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U");
    }

    @Test
    public void test36633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "... 16 16 16 16 16 16 16 16 16                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36634");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1111111111111111111111111111111111111111111111111111", "                                                                                                                                                                                                                                                                                                                                                                          61        61        61        61        61        61        61        61        61        61        61        61                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36635");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\61\\61\\61\\61\\61\\61", (int) 'C');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36636");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("###\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0##", "\\U0055", 130);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36637");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', 566);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 566 + "'", int2 == 566);
    }

    @Test
    public void test36638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("66666666666666666666666666666666666666666666666666666666666666666666666666666666666666575757575757575757575757575757575757575757575757575111666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36639");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\0u00020", "                                      ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0  \nu0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0020u0", 667, 380);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test36640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36640");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                     u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666" + "'", str1, "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
    }

    @Test
    public void test36641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36641");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  2  UUUUU", "000000000000000000000000000000...             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36642");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                 aa" + "'", str7, "                                                                                                 aa");
    }

    @Test
    public void test36643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36643");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\n\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\", 288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36644");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " 61\\ 61\\ ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test36645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36645");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "...0##0230##\\0##U0##00230##\\0##U0##002375757575757575757575757575757575757575757575757575757575111", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...H    H...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36646");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iiiiiiiiiiiiiiiii23uu0023uu0023uu0023uu0023uu0023uu0023uu0023", "AAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                             0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", "6U665CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU6666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36648");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   ", "533333333333333333333333333333\\40032333333333333333333333333333333c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str3, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test36649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36649");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "55          aaaaaaa       ", 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36650");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "111111111111111111111111111111111111111111111...", 89);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36651");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("61\\61\\61\\61\\6161\\61\\61\\61\\61\\61                                                                                                                                                                                                                                                                          ", "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222      61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61    ", "                                        \\0033                                         ", 113);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61\\61\\61\\61\\6161\\61\\61\\61\\61\\61                                                                                                                                                                                                                                                                          " + "'", str4, "61\\61\\61\\61\\6161\\61\\61\\61\\61\\61                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test36652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D..." + "'", str2, "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D...");
    }

    @Test
    public void test36653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU ", "h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\222223200U\\1400u\\00U\\3200U\\22222", "c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...uuuuuuuuuu                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...uuuuuuuuuu                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...   " + "'", str1, "...uuuuuuuuuu                            AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...   ");
    }

    @Test
    public void test36657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36657");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U0023                                   ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("75", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36658");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ", (java.lang.CharSequence) "0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        " + "'", charSequence2, "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
    }

    @Test
    public void test36659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36659");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("     \\u0023\\u00\\U0041\\u0023     ", "0023\\u0023\\u0023\\u0023\\u00", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36660");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" 61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36661");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "uuu0023                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               " + "'", str1, "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u               ");
    }

    @Test
    public void test36663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
    }

    @Test
    public void test36664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("222222222222222222222222222222222\\UUU02\\...222222222222222222222222222222222", "                                        Aauaa23AAAAAAAAAAAAA                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        Aauaa23AAAAAAAAAAAAA                                        " + "'", str2, "                                        Aauaa23AAAAAAAAAAAAA                                        ");
    }

    @Test
    public void test36665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", '2', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str3, "                                                                                                                  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test36666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0200iui\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0200iui\\" + "'", str1, "0200iui\\");
    }

    @Test
    public void test36667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36667");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("##############################################.16 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36668");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36669");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 A", strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "\\u000d", 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\u0023                                                                                     hi!hi!hi!", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("41AAAAAAAA", strArray4, strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "41AAAAAAAA" + "'", str14, "41AAAAAAAA");
    }

    @Test
    public void test36670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36670");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...HH...", 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36671");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\IUI0020\\4\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36672");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("2", " ", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("0\\\\\\\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("\\IUI0020\\4\n\n", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("2  U  2  U  2  U  2  U  ", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0\\\\\\\\  U  0\\\\\\\\  U  0\\\\\\\\  U  0\\\\\\\\  U  " + "'", str10, "0\\\\\\\\  U  0\\\\\\\\  U  0\\\\\\\\  U  0\\\\\\\\  U  ");
    }

    @Test
    public void test36673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36673");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("6161...", "...0U\\3...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36674");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", "61UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\U007  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075\\U0075");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u007  \n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0  \n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075" + "'", str1, "\\u007  \n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0  \n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075");
    }

    @Test
    public void test36676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", 'i');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36677");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("000000000000000000000000000000...                                                         ", '2');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '0' + "'", char2 == '0');
    }

    @Test
    public void test36678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36678");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u200u\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\", "                                                61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U                                               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUU..." + "'", str2, "U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUU...");
    }

    @Test
    public void test36680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "   61        61                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36681");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", "\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", " 11111111111111111111111111111111111111111111123\\u0023\\u111111111111111111111111", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\ 61\\ 61\\ 61\\ 61\\ 61\\ ..." + "'", str3, "\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...");
    }

    @Test
    public void test36683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36683");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("20\\u0020\\u0020\\u0020\\u00  ", "666666666666666666666100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36684");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "\\U0023\\U00\\U0041\\U", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36686");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", "623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U666", (int) '2');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032\\u0032", strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("                                           \\u005c", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("uuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test36687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36688");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ......16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ......16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\" + "'", str1, "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ......16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\");
    }

    @Test
    public void test36689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36689");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("23i23i23i23iui31i23i23i23i23", "\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23i23i23i23iui31i23i23i23i23" + "'", str2, "23i23i23i23iui31i23i23i23i23");
    }

    @Test
    public void test36691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("222222222222222222222222222222222\\UUU02\\...2222222222222222222222222222222222", 685);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36692");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("111111111111111111111", "23                                                                                     hi!hi!hi!", 393, 339);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11111111111111111111123                                                                                     hi!hi!hi!" + "'", str4, "11111111111111111111123                                                                                     hi!hi!hi!");
    }

    @Test
    public void test36693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau613200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uU", "aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test36694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36694");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, 'i');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61" + "'", str1, "61\\6aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
    }

    @Test
    public void test36696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("5", "\\U003 111 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36697");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("222223200U\\1400u\\00U\\3200U\\22222       66666666666666666666666666666666666666666666666666666", 108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36698");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray13 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023                                                                                     ", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("161\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test36699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36699");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('u', 120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 120 + "'", int2 == 120);
    }

    @Test
    public void test36700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36700");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                         u0023\\u002u0023\\u002u0023\\u002u0", 8, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    " + "'", str1, "        #######    61        61        615c    61        61        61                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test36702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36702");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u007  \n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0  \n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075\\u0075");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36703");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u0023", "###\n\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n2\nu\n###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\U000D", "u6623\\u6623\\u6623\\u6623\\u6623\\u6623U666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36705");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test36706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                  ...261\\261\\261\\261\\261\\261\\261\\2...", "                                          \n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36707");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "23\\U0023\\U002");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("00234                                      \\U0023\\U00\\u0                    ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6\\6\\66\\6\\66\\6\\66\\6..." + "'", str3, "6\\6\\66\\6\\66\\6\\66\\6...");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test36708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!IH!IH!IH", (int) '\\');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         !IH!IH!IH                                          " + "'", str2, "                                         !IH!IH!IH                                          ");
    }

    @Test
    public void test36709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36709");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "  61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36710");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36711");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...0##0230##\\0##U0##00230##\\0##U0##002375757575757575757575757575757575757575757575757575757575111", (java.lang.CharSequence) "\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\400326666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...0##0230##\\0##U0##00230##\\0##U0##002375757575757575757575757575757575757575757575757575757575111" + "'", charSequence2, "...0##0230##\\0##U0##00230##\\0##U0##002375757575757575757575757575757575757575757575757575757575111");
    }

    @Test
    public void test36712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36712");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("hhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\", 'h');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test36713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\", "11111111111111uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu...111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\" + "'", str2, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\");
    }

    @Test
    public void test36714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36714");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaa51", 861, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36715");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1II1", "u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\U23\\U23\\U2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666" + "'", str2, "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u002066666666666666666666666666666666666666");
    }

    @Test
    public void test36717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36717");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("       11111111111111..", "hhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36718");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 64, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36719");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   u   ", "51AAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("          23\\u0023\\u0023          3    23\\u0023\\u0023      ", (int) (short) 0, 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          23\\u0023\\u0023          3    23\\u0023\\u0023      " + "'", str3, "          23\\u0023\\u0023          3    23\\u0023\\u0023      ");
    }

    @Test
    public void test36721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36721");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 563, "u003aaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str3, "u003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaaaaau003aaa\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test36722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             " + "'", str1, "             ");
    }

    @Test
    public void test36723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36723");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "...3\\U0023\\U0...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36724");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("        #######    61        61        615c    61        61        61", " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 834);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                    ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test36725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36725");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("1111111111111111111111111111", "                 \\u0030\\\\\\\\                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("U\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U\\" + "'", str1, "U\\");
    }

    @Test
    public void test36727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36727");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u61uuuu3200", "u   6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00" + "'", str3, "      3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu61uuuuuuuuuuuuuuuuuu3\\u0...\\U00");
    }

    @Test
    public void test36728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36728");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "u0032\\u0032\\u0032\\u0032\\u0032\\u0032", (java.lang.CharSequence) "                                        61\\ 61\\61hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36729");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               ", "\\u005c");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("      ", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("\\", (java.lang.Object[]) strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "               " + "'", str7, "               ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "               " + "'", str8, "               ");
    }

    @Test
    public void test36730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                       000u                       ", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       000u                       " + "'", str2, "                       000u                       ");
    }

    @Test
    public void test36731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "2222222222222222222222222222222222    2222222222222222222222222222222222    22222222...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaa", "\n\n\n\n\n\n\n\n\n\n\n\n                                           \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36734");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "h61\\ 61\\ 6161\\ 61\\ 6161\\ 6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36735");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 508, 0);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("                   2                              ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test36736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", "23\\u0023\\u...                                   UUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          " + "'", str2, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
    }

    @Test
    public void test36737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36737");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 39);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test36738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36739");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU02\\UUU02\\UUU02\\AAAAAAAAAAAAA  ......  \\u00410023\\U0023\\U0023\\U002", "                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 168, 88);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "  ......  \\u00410023\\U0023\\U0023\\U002                                               \\UUU                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 126);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                     61\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36741");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................", "2............111111111111111111111111111111111111111111111..............................................................................................................................................................", "AAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ", 268, 456);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36743");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("61\\61\\61", ' ');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0055                                            1111111111111111111111111111111111111111111111");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test36744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                        uuuuu61uuuuuuuuuuuuu\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020", 354, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020" + "'", str3, "...\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
    }

    @Test
    public void test36745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test36746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36746");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\U005C                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("                                                 ...", (java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0041", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005" + "'", str4, "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test36748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36748");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("61\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61" + "'", str1, "61");
    }

    @Test
    public void test36749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("6161616161616161616161616");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("u005CU0U005CU0U0023uU005CU0U005CU0", "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16", "61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u005CU0U005CU0U0023uU005CU0U005CU0" + "'", str3, "u005CU0U005CU0U0023uU005CU0U005CU0");
    }

    @Test
    public void test36751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36751");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuuuuuuuuuuuuuuu3\\u0...\\U00", "21                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("....................................................................................................                                    ", " 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ ", 87);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "161\\161\\161\\161\\161\\161\\u6                                              3200u\\3200u\\1111111111111111111111111111");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "....................................................................................................                                    " + "'", str5, "....................................................................................................                                    ");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test36753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "...      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" 61\\\\50020");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\\\50020" + "'", str1, "61\\\\50020");
    }

    @Test
    public void test36755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r \r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\r61\r\r\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##############################################.16 ", "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".16 " + "'", str2, ".16 ");
    }

    @Test
    public void test36757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36757");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666................U0023                                            ................", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                           ", "6                                     6    11111111111116                                     6     6                                     6    11111111111116                 10hi!10010hi!10010h\\400310hi!10010hi!10010hi6                                     6    11111111111116                                     6     6                                     6    11111111111116                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str2, "u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test36759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36759");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\I!\\61aaaaaaaaaaaaaaaaaaaaaaaa", "3200", 116);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36760");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36761");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                 \\u0030\\\\\\\\                                      ", (java.lang.CharSequence) "  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                 \\u0030\\\\\\\\                                      " + "'", charSequence2, "                 \\u0030\\\\\\\\                                      ");
    }

    @Test
    public void test36762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("1h!1", "                            AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAA                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1h!1" + "'", str2, "1h!1");
    }

    @Test
    public void test36763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("22222222222222222222uuu0023                                            222222222222222222222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "22222222222222222222uuu0023                                            222222222222222222222" + "'", str1, "22222222222222222222uuu0023                                            222222222222222222222");
    }

    @Test
    public void test36764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa                                            ");
    }

    @Test
    public void test36765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...", '7', '.');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ..." + "'", str3, "Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...                    ...");
    }

    @Test
    public void test36766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  .." + "'", str1, "                  ..");
    }

    @Test
    public void test36767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36767");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "61                                         \n\n1", (java.lang.CharSequence) "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36768");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("6\\\\u0020");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\u0063", 68);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("\\U0023\\U00\\u0041\\U                                   ", "aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6aaaaaaaaaa\\u0055                                            aaaaaaaaaa\\u0055");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U00\\u0041\\U                                   " + "'", str2, "\\U0023\\U00\\u0041\\U                                   ");
    }

    @Test
    public void test36771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36771");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...UUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###\nu002", "aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               ", (int) 'i');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36773");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\", (java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu23                  \\U23\\U23\\U23\\U23\\U23\\U23\\U23");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\" + "'", charSequence2, "5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\");
    }

    @Test
    public void test36774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36774");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...    ...");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("40032", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ", 34, '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          " + "'", str3, "6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
    }

    @Test
    public void test36776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###\n###", 45, "                            AAAAAAAAAAAAA3200\\A                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            AAAAAAAAAA###\n###" + "'", str3, "                            AAAAAAAAAA###\n###");
    }

    @Test
    public void test36777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36777");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777" + "'", str2, "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777");
    }

    @Test
    public void test36778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\", "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3u61\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U", 139);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3u61\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U" + "'", str2, " 61\\ 61\\ 61\\ 61\\ u61\\  61\\ 61\\ 61\\ 61\\ 61\\ u61\\3u61\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U\\3u00U");
    }

    @Test
    public void test36780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                   h", 125);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                 a                                                                                                                                              ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 a                                                                                                                                              " + "'", str2, "                                                 a                                                                                                                                              ");
    }

    @Test
    public void test36782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36782");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u", 404);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0UuU");
    }

    @Test
    public void test36784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("....................u0023\\u002.....................", "                                                                                                                                                           uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....................u0023\\u002....................." + "'", str2, "....................u0023\\u002.....................");
    }

    @Test
    public void test36785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36785");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "i!        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36786");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("10hi!100");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("\\u000d", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                     ", (java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("1111111     ", strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                        AAAAAAA     ");
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                        A0u0023AAAAAAAAAAAAA                                        ");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10hi!100" + "'", str6, "10hi!100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10hi!100" + "'", str7, "10hi!100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10hi!100" + "'", str8, "10hi!100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!100" + "'", str9, "10hi!100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10hi!100" + "'", str11, "10hi!100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10hi!100" + "'", str13, "10hi!100");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10hi!1" + "'", str17, "10hi!1");
    }

    @Test
    public void test36787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36787");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\uhi!hi!hi!", (java.lang.CharSequence) "6U3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test36788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "6116116116116116116116116116116116116116116116116116116116116116");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36789");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "1\\U00234                                      \\U0023\\U00\\u0", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", 156);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66" + "'", str4, "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
    }

    @Test
    public void test36790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               " + "'", str1, "                                               ");
    }

    @Test
    public void test36792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36792");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\U0032\\U0032\\U0032\\U0032\\U0032\\U0032", ".....................\\u000d\\u000d\\u000d\\u000d\\u000d\\u000A\\u0023AAAAAAAAAAAAAa000u\\......................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("3200U", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0030");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U" + "'", str2, "3200U");
    }

    @Test
    public void test36794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           " + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ");
    }

    @Test
    public void test36795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                 3200u", "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ " + "'", str3, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
    }

    @Test
    public void test36796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                    ", 'i');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                    " + "'", str2, "                                                                                                                    ");
    }

    @Test
    public void test36797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36797");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6              ", "\\      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaa", 339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("i!                                                                                   U002", "                                                                                                                                                                     61\\ 61\\61                                                                                                                                                                     ", "                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!                                                                                   U002" + "'", str3, "i!                                                                                   U002");
    }

    @Test
    public void test36799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa", "4444444444444444440023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61\\4444444444444444444444444444444444443200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3\\u002066666666666666666666666666666666666666", "0041\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa" + "'", str3, " 61\\ 61\\61023\\u0023       aaaaaaa023\\u0023       aaaaaaa");
    }

    @Test
    public void test36800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("u6      61        61        61        61                                                            ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36801");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test36802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36802");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ", 14, "                                      \\u0023\\u00\\U0041\\u0023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      " + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAA16 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA      ");
    }

    @Test
    public void test36803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0     " + "'", str2, "      \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0     ");
    }

    @Test
    public void test36804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36804");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaa \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\16 16", 99, 440);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test36805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36805");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161616161", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36806");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'h', (int) '1', 3);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("5555555                                               \\UUU02\\UUU02\\UUU02\\aaaaaaaaaaaaa\\\\\\                  55555555", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6...");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("3333333333333333333333333", " \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00237575757575757575757575757575757575757575757");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("6666", strArray11, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6666" + "'", str15, "6666");
    }

    @Test
    public void test36807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("2 2 2 2 4444444444444 1 1", 50, 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36808");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                           4300u\\", "                                                        ..        ", 36);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36809");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", " 0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023 ...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111       ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                 61\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           u005cu0u005cu0u0023Uu005cu0u005cu0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36811");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) (byte) 0, "\\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA \\ AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36812");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("3200U", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...777777777777777777777777777777777777777777hhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhhhhhuuuuuuuhhhhhhhhhh", "..................6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3200U" + "'", str3, "3200U");
    }

    @Test
    public void test36813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36813");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("22222\\U0023\\U00\\u0041\\U002322222", "          aaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22222\\U0023\\U00\\u0041\\U002322222" + "'", str2, "22222\\U0023\\U00\\u0041\\U002322222");
    }

    @Test
    public void test36815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36815");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###\n\\u002                                         \n\n1", "a             u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", 14);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "61UUUUUUUUUUUUHI!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n61UUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test36816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36816");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                                       ", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  ", strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0023", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) -1);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("\\61\\61\\61\\61\\61\\61", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", strArray9, strArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.endsWithAny("3\\u0023\\u0023\\u0023                               ", strArray9);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "A0u0023AAAAAAAAAAAAA");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa", strArray9, strArray20);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny("uu", strArray9);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6" + "'", str16, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa" + "'", str21, "0UUU\\U3200UUU\\U3200UU023\\u0023       aaaaaaa");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test36817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("u003            0023         ", "1111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AA        75                                          AAAAAAAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36820");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("\r\r\r\r\r\r\r...                                      57", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36821");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ", "iii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                            ");
    }

    @Test
    public void test36823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36823");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u0020                                        ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...", 245, 3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test36824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...h ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...h...3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...h " + "'", str1, "...h...3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\...h ");
    }

    @Test
    public void test36825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36825");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\c111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ", '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 " + "'", str2, "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u00                                 ");
    }

    @Test
    public void test36827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("i!11111111111111111111111111111111111111111111111111111111111111111111111111111111111U000011111111111111111111111111", "                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!11111111111111111111111111111111111111111111111111111111111111111111111111111111111U000011111111111111111111111111" + "'", str2, "i!11111111111111111111111111111111111111111111111111111111111111111111111111111111111U000011111111111111111111111111");
    }

    @Test
    public void test36828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023" + "'", str2, "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023");
    }

    @Test
    public void test36829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36829");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('A', 89);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 89 + "'", int2 == 89);
    }

    @Test
    public void test36830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("11111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111111111" + "'", str1, "11111111111111111111111111111111111");
    }

    @Test
    public void test36831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  uuu", "                  Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!aaaaaaaaaaa", "\\ 23\\U### \\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!aaaaaaaaaaa" + "'", str2, "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666\\U0023                                                                                     HI!HI!HI!aaaaaaaaaaa");
    }

    @Test
    public void test36833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36833");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                               ", "\n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n", 268, 306);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                               \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n" + "'", str4, "                               \n\n\n\n\n\n\n\n\n\n\n\\U005C\n\n\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test36834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36834");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("uuuuu61uuuuuuuuuuuuuuuu44444444444444444444423\\u0023\\u444444444444444444444", "                           1\\u00234                                      \\u0023\\u00\\U0                    ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "uuuu61uuuu", "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36836");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "i!                                                                                   U0023                           ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " 0023\\U0023\\U0023\\U0023\\0023\\U0023 ...11111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n", "      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n" + "'", str2, "0023\\U00 61\\ 61\\61\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test36839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".\\16", "      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".\\16" + "'", str2, ".\\16");
    }

    @Test
    public void test36840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36840");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   a                             ", "                            AAAAAAAAAAAAA3200u\\A  ...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("u002311111                             u002311111                             u002311111                             u002311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u002311111                             u002311111                             u002311111                             u002311111                             u", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\", "\\u0034", "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu" + "'", str3, "57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu   2  57AAAu");
    }

    @Test
    public void test36842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36842");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaauuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "c5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c5" + "'", str1, "c5");
    }

    @Test
    public void test36844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36844");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###\n\\u002                                         \n\n1           aaaaaaaaaaa", 'U');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222", '5');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222" + "'", str2, "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222");
    }

    @Test
    public void test36846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36846");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 92 + "'", int1 == 92);
    }

    @Test
    public void test36847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36847");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("u002322222", "0", 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("          11111111111u6111111111111111111111          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          1111111111111111111116u11111111111          " + "'", str1, "          1111111111111111111116u11111111111          ");
    }

    @Test
    public void test36849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36849");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                        ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("cccccccccccccccccccccccccccccccccccccccccccccccccccccc", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36851");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("00U\\3200U\\3200U\\3200U\\3200U\\3200", "                                                                                                                                                                                                                                                  0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61                                                                                                                                                                                                                                                   ", 63);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36853");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                         75                          ", "555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555U0023\\U002U0023\\U002U0023\\U002U0", 202);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36854");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("3");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3" + "'", str2, "3");
    }

    @Test
    public void test36855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36855");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...                                ", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...                                " + "'", charSequence2, "                0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...                                ");
    }

    @Test
    public void test36856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("00000000aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaA", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61i!                                                                                   U0023                          ", "uuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu 61uuuuuuuuuuuuuuuuuuuuu   u61");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaA" + "'", str3, "00000000aaaaaaaaaaaaaaaaaaaaaaa5caaaaaaaaaaaaaaaaaaaaaaA");
    }

    @Test
    public void test36857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36857");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                  ...", (java.lang.CharSequence) "u ...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                  ..." + "'", charSequence2, "                                                  ...");
    }

    @Test
    public void test36858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "\n\n\n\n\n\n\n\n\n\n\n\n                                           aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                   0##                                                  ", " ...                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   0##                                                  " + "'", str2, "                                                   0##                                                  ");
    }

    @Test
    public void test36861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "A\\u0061\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\3AAAAAAAAAAAAAa000u\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A\\u0061\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\3AAAAAAAAAAAAAa000u\\" + "'", str1, "A\\u0061\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\3AAAAAAAAAAAAAa000u\\");
    }

    @Test
    public void test36862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36862");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00", "...U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36863");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "75 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "75 ..." + "'", str1, "75 ...");
    }

    @Test
    public void test36864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                ...hhhhhhhhh", "   ...                   3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200  \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36865");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "uuuuuuuuuuuuuuuuu3\\u0...\\U00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("uuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuu61", "3200u\\3200u\\32    3          3200u\\3200u\\32");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36867");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("h          aaaaaaa       ", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                        u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36869");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("16        16        16        16        16        16        16        16        16", "                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36870");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("####au", 88, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36871");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("u61uuuuuuu\\u0023AAAAAAA...", "22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222aaaaaaaaaaaaa u   6aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36872");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("61        61        615c    61        61        61", (int) '3', 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36873");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!", "  \\U005C  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '\\');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!" + "'", str4, "I!");
    }

    @Test
    public void test36874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36874");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", 2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36875");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAA     u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36876");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                          ");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test36877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36877");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36878");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...                                hi!1111111...", "                                                  ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("IIIIIIIIIIIII...AAAA      ", "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61                                                             6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\6161\\61\\61\\61\\61\\616\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0" + "'", str1, "6\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\6161\\61\\61\\61\\61\\616\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u00206\\\\u0");
    }

    @Test
    public void test36882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36882");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("111111116 \\16 \\16 \\16 \\16 \\16", "                                         ...0023h\\hh0023h\\hh0023h                            ...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("      61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\16", 44, (int) '\\');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\" + "'", str3, "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\");
    }

    @Test
    public void test36885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36885");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "23AU0023AU0023AU0023AU0023AU0023AU0023AU0023UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "23AU0023AU0023AU0023AU0023AU0023AU0023AU0023UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", charSequence2, "23AU0023AU0023AU0023AU0023AU0023AU0023AU0023UAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      " + "'", str2, "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ");
    }

    @Test
    public void test36887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36887");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ 666666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068\\ ...", "...1111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("161\\ 61\\ 6161\\ 61\\ 6161\\ 6", "0023\\u0023\\u0023\\ U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "161\\ 61\\ 6161\\ 61\\ 6161\\ 6" + "'", str2, "161\\ 61\\ 6161\\ 61\\ 6161\\ 6");
    }

    @Test
    public void test36889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "1.61.6161.61.6161.61.6161.6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "A0u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36891");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36892");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", 75);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test36893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36893");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000", "      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii", 354, "..                    0u\\00U\\3200U\\                                      43200U\\1                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..                    0u\\00U\\3200U\\                                      43200U\\1                                         ..                    0u\\iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii..                    0u\\00U\\3200U\\                                      43200U\\1                                         ..                    0u\\" + "'", str3, "..                    0u\\00U\\3200U\\                                      43200U\\1                                         ..                    0u\\iiiiiiiiiiiiiiiiiiiiiiiiiiiU005Ciiiiiiiiiiiiiiiiiiiiiiiiiiii..                    0u\\00U\\3200U\\                                      43200U\\1                                         ..                    0u\\");
    }

    @Test
    public void test36895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1\\6 u0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU", "C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\6 u0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU" + "'", str2, "1\\6 u0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU");
    }

    @Test
    public void test36896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36896");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36897");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ", (java.lang.CharSequence) "U                 61        61        61        61        61        61        61        61        61        61        61        61        61                                                                                              U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "        61        61        6");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36899");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "2                                         \n\n1", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "222223200U\\  ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                     ", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test36900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36900");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ", '.');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  " + "'", str2, "1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                     1                  ");
    }

    @Test
    public void test36902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075", 66, "\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075" + "'", str3, "a\\3200u\\323200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\323200u\\320075");
    }

    @Test
    public void test36903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str1, "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test36904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36904");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("400u\\00U\\3200U\\", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 20);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "400u\\00U\\3200U\\" + "'", str4, "400u\\00U\\3200U\\");
    }

    @Test
    public void test36905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", "                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66" + "'", str2, "1\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
    }

    @Test
    public void test36906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("222222222222222222222222222222222222222222U6                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("555555555555555...", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "555555555555555..." + "'", str2, "555555555555555...");
    }

    @Test
    public void test36908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36909");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("....................................................................................................                                    ", "66666666666666666666         66666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                               \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0020\\u0020\\u0020\\u0020\\u0020\\u...", "61uuuuuuuuuu...00160000000016000000001600000000160000000016000000001600000000160000000016000000001", "                                            ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36913");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("u 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36915");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aa        75                                          ", "ih01001!ih01      AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36916");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                            23\\u0023\\u0023        75023\\u0023\\u002                                                                             ", "\\U0023                                                                                     HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36917");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                                                                                                                                                                           ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test36918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36918");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("3322u\\3322u\\3322u\\...2u\\3322u\\3322u\\3322u\\3322u\\3322u\\33\\u22A8", "                                                                                                                                                                         UUUUU61UUUUUUUUUUUUUUUU44444444444444444444423\\U0023\\U444444444444444444444                                                                                                                                                                                                                                                                                                                                  ", 116);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("u  ......  \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", 75, 'c');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u  ......  \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00" + "'", str3, "u  ......  \\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00");
    }

    @Test
    public void test36920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36920");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("...0U\\3...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test36921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003", 60, "...\\61\\61\\61\\61\\U0023     ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003" + "'", str3, "u0023                                                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u003");
    }

    @Test
    public void test36922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "222223200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA400uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA00Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA3200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA22222");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "222223200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA400uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA00Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA3200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA22222" + "'", str1, "222223200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA400uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA00Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA3200Uhhhhhh                             aaaaaahhhhhhhhhhhhhhhhh                             aaaaaa...AAAA22222");
    }

    @Test
    public void test36923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U" + "'", str1, "d\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U000D\\U");
    }

    @Test
    public void test36924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36924");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                           \\u005c77777777777777777777777777777777777777777777", 103, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAA     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 95, 'i');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAA     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAA     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36926");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", (int) 'c', (int) 'c');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test36927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                           1\\U00234                                      \\U0023\\U00\\u0           ...", (int) '4', 300);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     \\U0023\\U00\\u0           ..." + "'", str3, "                     \\U0023\\U00\\u0           ...");
    }

    @Test
    public void test36928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36928");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36929");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("2222222222222222222222222222222222222222222222222\r", "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r                                        3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u000000000\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "61                                         \n\n1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                              20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002" + "'", str1, "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u002");
    }

    @Test
    public void test36932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36932");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                 h23h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh002h                                                                                                                                                                                                                                                                                                                  ", "uuuuuuuuuuuu 3200", 127);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36933");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6166666666666666666666666666666666666");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                           61\n                       ", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("i!11111111111111111111111111111111111111111111111111111111111111111111111111111111111U000011111111111111111111111111", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test36934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("16\\5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555" + "'", str1, "16\\555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
    }

    @Test
    public void test36935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36935");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "11\\\\0020111111111111111111111111111111111111111111111111111111111111111111111111111111111", (int) 'h');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36936");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "\\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36937");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                         \n\n1                        23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002             ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36938");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("u                                                ", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111" + "'", str1, "1111111111111111111111111111111111111111111113\\U0003\\U0111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                            AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAA                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAA                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAA" + "'", str1, "                            AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAA                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAAAAAAAA3200\\A                                                             AAAAAAA");
    }

    @Test
    public void test36941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36941");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1111111111111111111111111111111111111111110uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057", "33333333        753333333333333333333333333", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...000000000000000000000000000000000000000000000000000000000000...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...000000000000000000000000000000000000000000000000000000000000..." + "'", str1, "...000000000000000000000000000000000000000000000000000000000000...");
    }

    @Test
    public void test36943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("u61", "                      75");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u61" + "'", str2, "u61");
    }

    @Test
    public void test36944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36944");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("U61\nUUUUUUUUUUUUUUU", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\4003", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                  iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", charArray10);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test36945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36945");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36946");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ua61a\na\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua00" + "'", str4, "ua61a\na\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua0020a\\aua00");
    }

    @Test
    public void test36947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36947");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("23A23A23A23AuA31A23A23A23A23", "5C11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\0023\\0023\\0023\\0023\\0023\\0023\\0023\\0...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36949");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "3\\u0023\\u0023\\u0023                               ", "1\\ ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36950");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36951");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u004444444444444 61\\ u61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0", "3200u\\3200u\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200u\\3200u\\3200");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0" + "'", str2, "uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA uAAAAAA\\u005c\\u0");
    }

    @Test
    public void test36953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("22H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H22222222222222222222222222222222222222222222222222222", "\\u0034");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "22H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H22222222222222222222222222222222222222222222222222222" + "'", str2, "22H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H\\HUH0023H22222222222222222222222222222222222222222222222222222");
    }

    @Test
    public void test36954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36954");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("6  6  6  6  6", "\\u0023\\u00   ..\\u0023\\u00", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36955");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "2", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "6161616161616161616161616", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61uuuuuuuuuuuuuuuuuu3\\u0...\\U0023\\U0##########", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test36956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36956");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1h!1020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   020\\u0020\\u0020\\u0020\\u0020\\u002", "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36957");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ 6161\\ 61\\ 6161\\ 00u\\0200u\\\n16u    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36959");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "75", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                 ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("   2 ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test36960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36960");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA", "    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\\u0020");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test36961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023          ", "  2   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("23aU0023aU0023aU0023aU0023aU0023aU0023aU0023Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23Au0023Au0023Au0023Au0023Au0023Au0023Au0023uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                              2                                                                                2                                                                                2                                            " + "'", str1, "23Au0023Au0023Au0023Au0023Au0023Au0023Au0023uAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                              2                                                                                2                                                                                2                                            ");
    }

    @Test
    public void test36963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36963");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "", (int) 'h');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("2                                         \n\n1                                                                                                                               ", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "a61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("                                \\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ", strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a', 234, 26);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test36964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36964");
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023                                                                                     hi!hi!hi!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "11111", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6                                       ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###\n###", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test36965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36965");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'C');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str4, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
    }

    @Test
    public void test36966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36966");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", "61616161616161616161616161", 139);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test36967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36967");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" 6...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 6..." + "'", str1, " 6...");
    }

    @Test
    public void test36968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("2\\UUUUUUUU", 270);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36969");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 139 + "'", int1 == 139);
    }

    @Test
    public void test36970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36970");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6", "###\n\\u002                                      ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                      \\U0023\\U00\\u0041\\U002AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ......", " 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36972");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(" U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6 U   6", "3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 936);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36973");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\", "                                               \\uuu02\\uuu02\\uuu02\\aaaaaaaaaaaaa\\\\\\                 ", 268);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\ \\61\\aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36975");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", '3');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'u' + "'", char2 == 'u');
    }

    @Test
    public void test36976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("###########U005cu0u005cu0u0023Uu005cu0u005cu0###########", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########U005cu0u005cu0u0023Uu005cu0u005cu0###########" + "'", str2, "###########U005cu0u005cu0u0023Uu005cu0u005cu0###########");
    }

    @Test
    public void test36977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36977");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("UUU6 6 6 6 6", 370);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...h...3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...hUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "5544u4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36979");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("......  u00410023U0023U0023U0023", "u002#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0#23U0023\\U0023\\U\\4003U0023\\U0023\\U0", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36980");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("\\4   ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\\' + "'", char1 == '\\');
    }

    @Test
    public void test36981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36981");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAA     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\\61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#61#6161", 0, 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#61#6161" + "'", str3, "#61#6161");
    }

    @Test
    public void test36983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...1111111" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...1111111");
    }

    @Test
    public void test36984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36985");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U                                            ", "    2222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test36986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36986");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0061");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("U61", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("2", "", 100);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6, strArray11);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("ChUUUUUUUUUUUUUUUUUUUhCUUUUUUuuuuuuuuuuuuuuuuuu\\4555555555555555555555555", strArray2, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 271 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str12, "                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test36987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36987");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("61.", "uuuuuuuuuuuuuuuuuuuuuuuuuu16\\16 \\16", "33333333", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61." + "'", str4, "61.");
    }

    @Test
    public void test36988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36988");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                               ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" 66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6666666666666666666666666666663", "                                                                             23\\u###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###u", "                                                                             6u623\\U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6666666666666666666666666666663" + "'", str3, " 66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa6666666666666666666666666666663");
    }

    @Test
    public void test36990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\\u0041                                                                                           ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0041                                                                                           " + "'", str2, "\\u0041                                                                                           ");
    }

    @Test
    public void test36991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 51, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   " + "'", str3, "                                                   ");
    }

    @Test
    public void test36992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("3200U\\3200U\\3200\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200", "hCUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U\\3200U\\3200\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200" + "'", str2, "3200U\\3200U\\3200\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200U\\3200U\\3200");
    }

    @Test
    public void test36993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa64aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("\\u0023\\u0023\\u0023\\u0023\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u0023\\u0023\\u0023\\u0023\\u", "                                     23\\u0023\\u0023          3    23\\u0023\\u0023UuU\\U3200UuU\\U3200UuU\\U3200UuU\\U32057");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00." + "'", str2, ".3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.3\\u00.");
    }

    @Test
    public void test36995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "111111111111111111111111111111111111111111111111111", "                                                                             23\\U###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###U                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36996");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555510hi!10", "\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 0, 74);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\55555555555555555555510hi!10" + "'", str4, "\\\\00203200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\55555555555555555555510hi!10");
    }

    @Test
    public void test36997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu..." + "'", str2, "   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu...");
    }

    @Test
    public void test36998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36998");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                           uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu       \\40032                                                                                                                                                            ", "\\4\n\n", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test36999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068", "666666666666666666666666666666666666666666666666666666666aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068" + "'", str2, "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068");
    }

    @Test
    public void test37000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest73.test37000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                              41                                                                                                                                                                         ", "0\\u0020\\u00", "u 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61..hu 61.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                              41                                                                                                                                                                         " + "'", str3, "                                                                                                                              41                                                                                                                                                                         ");
    }
}

