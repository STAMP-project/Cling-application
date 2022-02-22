import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest72 {

    public static boolean debug = false;

    @Test
    public void test36001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36001");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "7");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66", '2');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "                                           \\u005c");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66" + "'", str11, "6\\ 66\\ 6\\ 66\\ 6\\ 6         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66");
    }

    @Test
    public void test36002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                    16uAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                         \n\n1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36003");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...                          ...", "", (int) '\n');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...", "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "       22222\\U0023\\U00\\u0041\\U002322222", (int) '\r');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0", strArray8, strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                    16aaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0" + "'", str13, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0");
    }

    @Test
    public void test36004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", (int) 'C', (int) 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...", "6\\ 6\\6uuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000..." + "'", str2, "000000000000000000000000000000...                                                         000000000000000000000000000000...                                                         000000000000000000000000000000...");
    }

    @Test
    public void test36006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36006");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaa16aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36007");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaac11111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaac11111111111111111111111111111111111111111" + "'", str1, "Aaaac11111111111111111111111111111111111111111");
    }

    @Test
    public void test36008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36008");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36009");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("UUUUUU 6\\\\U0020 6\\\\U0020 6              ", "\\\\0020        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u002u0023\\u002u0             u0023\\u002u0023\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...uuuuuuuuuu", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...uuuuuuuuuu" + "'", str2, "...uuuuuuuuuu");
    }

    @Test
    public void test36012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36012");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                                                                hi!hi!hi!                 \\U003 111AAAAAAAA\\ \\61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002" + "'", str1, "2361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u0  6\\\\u002");
    }

    @Test
    public void test36014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36014");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......", "\\u005c");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "000000000000000000000000000000...             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36016");
        char[] charArray11 = new char[] { ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("\\U0023\\U0023\\U0023\\U0023\\U002", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test36017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAA     \\u0041           \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                         ", "\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...0u005cu0", "                                                                                   16u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0u005cu0" + "'", str2, "...0u005cu0");
    }

    @Test
    public void test36019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u" + "'", str1, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u002AAAAAAAAAAAAAa000u\\                                                                 A\\u");
    }

    @Test
    public void test36020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36020");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "...23\\0023\\002375757575757575757575757575757575757575757575757575757575", 566);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36021");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222\\u0032", "1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36022");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("\\u005c");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("23                                                                                     hi!hi!hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\u005c" + "'", str6, "\\u005c");
    }

    @Test
    public void test36023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36023");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\r", "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6", 339);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'c');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r" + "'", str6, "\r");
    }

    @Test
    public void test36024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("uuuuuuuuuuuu 3200u           ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36025");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("  \n\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", '\r');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test36026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAAAA...0U\\3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ..." + "'", str1, "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 ...");
    }

    @Test
    public void test36029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("6666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6666" + "'", str1, "6666");
    }

    @Test
    public void test36030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  \n\\u0020\\\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0" + "'", str2, "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0");
    }

    @Test
    public void test36031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("6666666666666666666666666666666666666666666663\\u0...", "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2", "..                    0u\\00U\\3200U\\                                      43200U\\1                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6666666666666666666666666666666666666666666663 ....." + "'", str3, "6666666666666666666666666666666666666666666663 .....");
    }

    @Test
    public void test36032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36032");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("..................6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU..55          aaaaaaa       CCCCCCCCCCCCCCCC");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36033");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "000000000000000000000000000000", "3\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36034");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", (java.lang.CharSequence) "...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\16uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h    h...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", charSequence2, "6                                     61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
    }

    @Test
    public void test36035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                   U\\1400u\\00U\\3200U\\", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36036");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '6', 139);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test36037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("AAAA51AAAA", "u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00\rUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu61\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61" + "'", str1, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...\r\r\r\r\r\r\r\r\r\r\r\r\r61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
    }

    @Test
    public void test36039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36039");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36040");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("           \n\n", "222223200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36041");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                          \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0 AAAAA", "", 566);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36042");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" 61.##############################################", "        75");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36043");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 121, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36044");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAi61iAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("        5c11111111111111111111111111 61\\ 1111111111111111111111", "23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023u6                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" ...                         ", "61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                  61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\6\n\n\n\n\n\n\n\n\n\n\\U0055                                            \n\n\n\n\n\n\n\n\n\n\\U0055                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test36049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36049");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444   ...4444444444444444444444444444444444444", "hi!", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" 61..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61.." + "'", str1, "61..");
    }

    @Test
    public void test36051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test36052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       \\                                                                              \\                                       61                                       \\                                       AAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36053");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("777777777777777777777777777777777777777777777\\u002e777777777777777777777777777777777777777777777hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '7' + "'", char1 == '7');
    }

    @Test
    public void test36054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaU00010U00010U00010U00010U00010U0001");
    }

    @Test
    public void test36055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36055");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\32iiU\\UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36056");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("0000000000000000U00232222200000000000000000", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####A000U\\", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\U0023\\U00\\u0041\\U", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "20\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test36057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("uUUUUUUUUU...", "iiiiiaaaaaa                             iiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36058");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAA\\\\\\\\\\\\\\\\\\\\\\", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A16 \\16 \\16 \\16 \\16 \\16 16 \\16 \\16 \\16 \\16 \\U000A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\" + "'", str1, "A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\ 61\\ 61\\ 61\\ 61\\ 61 61\\ 61\\ 61\\ 61\\ 61\\ 61A000U\\");
    }

    @Test
    public void test36060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36060");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U3200UUU\\U32057                                                                                                                             1", "...02...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAAAAAAAAAAAAAhhhhhhhhhhhhhuuuuuuuAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaHHHHHHHHHHHHHUUUUUUUaaaaaaaaaaaaaa");
    }

    @Test
    public void test36062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                             7777777777777777777", "A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232\\u005A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3232");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             7777777777777777777" + "'", str2, "                             7777777777777777777");
    }

    @Test
    public void test36063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("\\iui2\\4\n\n                                                                                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...", 110, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu0u\\ 2 5700u\\ 2 5700u\\ 2 570...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36065");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU", '7', 'u');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU" + "'", str3, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                                                                                                             0UuU");
    }

    @Test
    public void test36066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36066");
        char[] charArray19 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray19);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray19);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray19);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray19);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "u61\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00", charArray19);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161", charArray19);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa", charArray19);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111113\\u0...", charArray19);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ", charArray19);
        boolean boolean30 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", charArray19);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                        aaaaaaa     ", charArray19);
        boolean boolean32 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", charArray19);
        boolean boolean33 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\", charArray19);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test36067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   2", (int) '\r');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            2" + "'", str2, "            2");
    }

    @Test
    public void test36068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36068");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "1.61.6161.61.6161.61.6161.6", (java.lang.CharSequence) "                                                                                                                            ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126 + "'", int2 == 126);
    }

    @Test
    public void test36069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36069");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '7', 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test36070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36070");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) '7', '7');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '7' + "'", char2 == '7');
    }

    @Test
    public void test36071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ", "iii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  " + "'", str2, " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
    }

    @Test
    public void test36072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u" + "'", str2, "                                                      00u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n16u");
    }

    @Test
    public void test36073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36073");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0023", "AAAA51AAAAAAAA51AAAAAAA1\\U23\\u0023\\u...AAAAAA51AAAAAAA", 227);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36074");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aa        75", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36075");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "22222222222222222222uuu0023                                            222222222222222222222", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAA 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61   AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "22222222222222222222uuu0023                                            222222222222222222222" + "'", charSequence2, "22222222222222222222uuu0023                                            222222222222222222222");
    }

    @Test
    public void test36076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("cccccccccccccccccccccccccccccccccc\n     ", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 cccccccccccccccccccccccccccccccccc\n     " + "'", str2, "                                                 cccccccccccccccccccccccccccccccccc\n     ");
    }

    @Test
    public void test36077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("3200U", 189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U" + "'", str2, "3200U");
    }

    @Test
    public void test36078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                 ...", 480);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................", "                AAAA15AAAA                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1................." + "'", str2, "...............6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................");
    }

    @Test
    public void test36080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("1!h1", "0u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\ 2 5700u\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1!h1" + "'", str2, "1!h1");
    }

    @Test
    public void test36081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) ' ', "                                            0uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u32057                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36082");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("61\\\\u002", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36083");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0030", 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36084");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  aaaaaaaaaaaaaaaaaaaaaaaa", 0, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36085");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                         ", "u61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "u  ......  \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\u002");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                         " + "'", str3, "                                                                                                                                                         ");
    }

    @Test
    public void test36086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36086");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\", "AAA51AAAA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '3');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\" + "'", str4, "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
    }

    @Test
    public void test36087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ", 268, "...         1 61 6161 61 6161 61 6161 6...         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 616" + "'", str3, "...h61\\h61\\h61\\h61\\h61\\h61\\h61\\h... ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 6161 61 6161 6...         ...         1 61 6161 61 616");
    }

    @Test
    public void test36088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36088");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("23\\U0023\\U002", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "   23\\U23\\U23\\U23\\U23\\U23\\U23\\U23U6                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("\\u0035", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test36091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\Uii23\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36093");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...023\\U0023\\U00237575757575757575757575757575757575757");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                         \n\n1    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36095");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "22222222222222222222uuu0023                                            222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(" uuuuuuuuuuU6uuuuuuuuuuu                         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " uuuuuuuuuuU6uuuuuuuuuuu                         " + "'", str2, " uuuuuuuuuuU6uuuuuuuuuuu                         ");
    }

    @Test
    public void test36097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "23");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6                                       23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6                                       23\\U23\\U23\\U23\\U23\\U23\\U23\\U23u6                                       ", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\                 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\n\n\n\n\n\n\n\n\n\n\n\n                                           aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                   \n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "aUaa5CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36100");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                        AAAAAAA     ", "222222222222...020u0020u0020u0020u0020u0020u0020u0020...        ", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   ...6\\66\\6\\66\\6\\66\\6\\6                             A\\0023AAAAAAAAAAAAA                            uuuuuuuuuu...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1111111...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("\\\\0020        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        0200\\\\" + "'", str1, "        0200\\\\");
    }

    @Test
    public void test36104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("33333333333333333333333333333333333333333333", (-1), "                                                                                                  I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33333333333333333333333333333333333333333333" + "'", str3, "33333333333333333333333333333333333333333333");
    }

    @Test
    public void test36105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36105");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("IIIIIIIIIIIII...AAAA      ", (int) (byte) 10, 930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36106");
        char[] charArray8 = new char[] { ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "uuuuuuuuuuuuuuu0023uuuuuuuuuuuuuuuu", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaa      ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...11111111111111111111111111111111111111111111111111111111", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("333333333333333333333333333333333333333333u61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test36107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61" + "'", str2, "61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61");
    }

    @Test
    public void test36108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("5544u4", 349, 'U');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str3, "5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36109");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("###\n\\u002                                         \n\n1", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    AAAAAAAAAAAAAAAAAAAAAAAAA                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "000u\\ 61\\ 61\\ 61\\ 61\\ 61 61\\  61\\ 61\\ 61\\ 61\\ 61A000u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36112");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", "          \\U0023\\U00\\U0041\\U          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6", "1111111111111111111111111111111111111111111113\\U0003\\U01111111111111111111111111111111111111111111111111111111111111111111111111111111111111111113\\U0003\\U01111111111111111111111111111111111111111111111111111111111111111111111111111111111111111113\\U0003\\U01111111111111111111111111111111111111111111111111111111111111111111111111111111111111111113\\U0003\\U01111111111111111111111111111111111111111111111111111111111111111111111111111111111111111113\\U0003\\U011111111111111111111111111111111111111111111111111111111111161\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023...", 532);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023..." + "'", str2, "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023...");
    }

    @Test
    public void test36115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u" + "'", str1, "u0023\\u002u0023\\u002u0023\\u002u00u0023u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u0u0023\\u002u0023\\u002u0023\\u002u");
    }

    @Test
    public void test36116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36116");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("...                                                               ...");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '.' + "'", char1 == '.');
    }

    @Test
    public void test36117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 834, "...1...                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  " + "'", str3, "...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                     ...1...                  ");
    }

    @Test
    public void test36118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36118");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("023\\u0023\\u0023", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61", 90, 288);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "023\\u0023\\u002361\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61" + "'", str4, "023\\u0023\\u002361\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\U61");
    }

    @Test
    public void test36119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                         75                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test36120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  2  UUUUU", "61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("77777777777777777777700000000000000000000777777777777777777777", (int) 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36122");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  \\\\0020                                                                                 3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0020\\u0##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36123");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('1', (int) '\r');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36124");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa", (java.lang.CharSequence) "                                  AAAAAAAAAAAAA3200u");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa" + "'", charSequence2, "5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16                                  5500u\\aaaaaaaaaa                                            5500u\\aaaaaaaaaa");
    }

    @Test
    public void test36125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36125");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", (int) (byte) 0);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\\");
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("   u61    ", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "\\u61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61  \n\\3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", 296, 354);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 296");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str8, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test36126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("U61\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", "U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023UUUU");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U61\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00" + "'", str2, "U61\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00");
    }

    @Test
    public void test36127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36127");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('i', 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test36128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36128");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                              2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                2                                                                                261aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "  023\\u0023       aaaaaaa                             61\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 682 + "'", int2 == 682);
    }

    @Test
    public void test36129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36129");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("u0023\\u002", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 476);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "aaaaaaaaaaaaaaa16 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test36132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36132");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'u', 117);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117 + "'", int2 == 117);
    }

    @Test
    public void test36133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u", "\\U0023\\U00\\U0041\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u" + "'", str2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                a\\u0023aaaaaaaaaaaaaa000u\\                                                                 a\\u");
    }

    @Test
    public void test36134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36134");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test36135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36135");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ", 164, 262);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444443200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36137");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) '#', 147);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 147 + "'", int2 == 147);
    }

    @Test
    public void test36138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36138");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("23\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002", "UUUUUUUUUUu6UUUUUUUUUUU");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    ...");
    }

    @Test
    public void test36140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36140");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("  \n\n1                                         ", 'u');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test36141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36141");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   U   ", 63, 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("11111111111u6111111111111111111111   2 11111111UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u611111111111111111111", "                                  AAAAAAAAAAAAA3200u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111111111u6111111111111111111111   2 11111111UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u611111111111111111111" + "'", str2, "11111111111u6111111111111111111111   2 11111111UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u6111111111111111111111   2 11111111111u611111111111111111111");
    }

    @Test
    public void test36143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) " 6UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\U0020 6\\\\U0020 6              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0200\\\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36145");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                    \\u0020\\u0020\\u0020\\u0020\\u0020\\u...                     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test36146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1", "1\\u00234                                      \\u0023\\u00\\U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1" + "'", str2, "6\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\1");
    }

    @Test
    public void test36147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36147");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36148");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 'a');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("5c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", strArray1, strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '1');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023" + "'", str7, "                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str9, "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36149");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 104, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          ", ".\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1                                       aaaaaaaaaaaaa\\\\.\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\16 .\\1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          " + "'", str2, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u          ");
    }

    @Test
    public void test36151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36151");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                          23\\U0023\\U                                          ", 20, "0023\\u0023\\u0023\\ U020\\u0020\\u0020\\u00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          23\\U0023\\U                                          " + "'", str3, "                                          23\\U0023\\U                                          ");
    }

    @Test
    public void test36152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36152");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   ...                                                                                           ", "\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n...", (int) 'i');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6 ", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("                       \\U0023\\U00\\u0041\\U                        ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test36153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36153");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\2uuuuuuuuuuuu                                               \\uuu02\\uuu02\\uuu02\\AAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("       ...", "                                         ...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\         u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36155");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  \n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0", "\\IUI0020\\4\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36156");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111123i23i23i23iui31i23i23i23i23111111", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test36157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa             3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\", "c500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36158");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...0u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\hi!", "\\u0043");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("11111...U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\16U\\1400u\\00U\\3200U\\", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test36159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("\\ 61\\ 61\\61u 61\\ 61\\610020", 118);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\ 61\\ 61\\61u 61\\ 61\\610020" + "'", str2, "\\ 61\\ 61\\61u 61\\ 61\\610020");
    }

    @Test
    public void test36160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("1111111111111111111111111111111111111111111110uhi!hi!hi!3000uhi!hi!hi!3111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111110uhi!hi!hi!3000uhi!hi!hi!3111111111111111111111111111111111111111111111" + "'", str1, "1111111111111111111111111111111111111111111110uhi!hi!hi!3000uhi!hi!hi!3111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36161");
        char[] charArray10 = new char[] { ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "61\\6      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa1\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("Aaaaaaa      ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6\\ 6", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "66666666666666666666666666666666666666666666666666666       22222\\U0023\\U0\\u0068", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test36162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36162");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("33333333333333333333", "   ...3\\u23\\u23U6    ", 178);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ", "\\u003\\u0023\\u0023\\u0023\\  UUUUUUUUUUUUUUUUUU\\4555555555555555555555555                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test36164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023...", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu\\\\\\AAAAAAAAAAAAAuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36165");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                               #u\n\n###u\n\n###u\n\n###aaaaaaaaaaaaa###                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1!0h01", "                                                                                                                                                                        41                                                                                                                                                                         ", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36167");
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
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                      ", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test36168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36168");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("3333333333333333333333333333333333                                                                             6u623\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3333333333333333333333333333333333                                                                             6u623\\U" + "'", str1, "3333333333333333333333333333333333                                                                             6u623\\U");
    }

    @Test
    public void test36169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                             aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa" + "'", str1, "aaa");
    }

    @Test
    public void test36170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("   ...", "111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ..." + "'", str2, "   ...");
    }

    @Test
    public void test36171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36171");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6...", "I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36172");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("5                                                                                                ", "..................6 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1.................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36173");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\4003266666666666666666", "14", 682, 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666614" + "'", str4, "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\u61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\\\400326666666666666666614");
    }

    @Test
    public void test36174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36174");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\U000D", "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002375757575757575757575757575757575757575757575757575757575", (int) '\\');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\u0023AAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023AAAAAAAAAAAAA" + "'", str1, "\\U0023AAAAAAAAAAAAA");
    }

    @Test
    public void test36176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36176");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00230023", 861, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("U 32  U 32", "AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U 32  U 32" + "'", str2, "U 32  U 32");
    }

    @Test
    public void test36178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("3200u\\3200u\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200u\\3200u\\3200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200U\\3200U\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200U\\3200U\\3200" + "'", str1, "3200U\\3200U\\3200\\U003\\U0023\\U0023\\U0023\\U0023\\U0023\\U00233200U\\3200U\\3200");
    }

    @Test
    public void test36179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36179");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\ ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                     ......  77777777777777777777777777777777777777777777777777777777777777777777777", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                     ......  7777777777777777777777777777777777777777777777777777777777777777777777761\\                     ......  77777777777777777777777777777777777777777777777777777777777777777777777" + "'", str5, "                     ......  7777777777777777777777777777777777777777777777777777777777777777777777761\\                     ......  77777777777777777777777777777777777777777777777777777777777777777777777");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U" + "'", str6, "A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U61\\A000U 61 61 61 61 61 61 61 61 61 61 61A000U 61 61 61 61 61 61 61 61 61 61 61A000U");
    }

    @Test
    public void test36180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36180");
        char char2 = org.apache.commons.lang3.CharUtils.toChar("2 2 2 2 4444444444444 1 1", 'h');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '2' + "'", char2 == '2');
    }

    @Test
    public void test36181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36181");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                      \\U0023\\U00\\u0041\\U0023", "uuuuuuuuuaaaaaaa       3200u\\320", 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ", "  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   " + "'", str2, "                   55555555556UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU62626                   ");
    }

    @Test
    public void test36183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36183");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) " u   6", (java.lang.CharSequence) "                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36184");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U" + "'", str1, "\\U0023                                                                                     HI!HI!HI!\\U0023                                   \\U0068\\U0023                                                                                     HI!HI!HI!\\U");
    }

    @Test
    public void test36185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0", 31, "                                        \\0033                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0" + "'", str3, "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0");
    }

    @Test
    public void test36186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "\\4  2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U2U");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36187");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               !ih!ih!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "  uuuuuuuuuuuu 3200u           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36188");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("3333361                                    ", "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3333361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, "3333361uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "   ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("    \\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006" + "'", str2, "061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U0061\\U006");
    }

    @Test
    public void test36191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                 ", 682);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test36192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36192");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'U', 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test36193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaau00", 'u');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaa" + "'", str2, "00u003aaaaaau003aaaaaau003aaaaaau0...                          ...u003aaaaaau003aaaaaau003aaaaaa");
    }

    @Test
    public void test36194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36194");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                              23\\u0023\\u0023\\u002                                                       ", "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("\\u0033", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36196");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa261", '1');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa26" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa26");
    }

    @Test
    public void test36197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("1\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36198");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("u003            0023         ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                ...hhhhhhhhh", "u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u000023001\\u00\\001\\u00u001\\u0000230023");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", "00U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\0200U\\\n16U");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str2, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test36201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "55555555556 UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6     2  6     2  6                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36202");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAA3200\\A                             6\\6\\66\\6\\66\\6\\66\\6...", 130);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36203");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                        aaaaaaa     ", "     \\U0023\\U00\\u0041\\U0023     ", 97);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu                                  3200u", (java.lang.Object[]) strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("####AU", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.concatWith("       ...", (java.lang.Object[]) strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '7');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str7, "                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str9, "                                                                                                        aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                        aaaaaaa     " + "'", str11, "                                                                                                        aaaaaaa     ");
    }

    @Test
    public void test36204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\66666666666666666666666666666666666666666666666666666622222\\U0023\\U0\\u0068\\...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA111111111111111111111u6111111111111111111111AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ", 263, '\n');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  " + "'", str3, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
    }

    @Test
    public void test36206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36206");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                         ", 29, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          " + "'", str3, "                          ");
    }

    @Test
    public void test36208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36208");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("\r\r\r\r\r\r\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0\r\r\r\r\r\r\r", "AAA51AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161                                                                                          ", "                                                                                                                                                                                                                                                                                                                                                      3                                                                                                                                                                                                                                                                                                                                                      ", "3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\u3200uUu\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333" + "'", str3, "161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
    }

    @Test
    public void test36210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36210");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("\\4\n\n\n", "\\u0023                                                                                     hi!hi!hi!                                                                                                         ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaa  aaaaaaaaaaaaaaaaaaaaaaaa\\u0032\\u0032\\u0032\\u0032\\u0032\\u003", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test36211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                  3200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  3200" + "'", str1, "                                  3200");
    }

    @Test
    public void test36212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36212");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'U', '2');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA 61AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36214");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161\\161333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333", "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111", 164);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36215");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                                                                                                  I");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test36216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n.....................................................", "230U00230U00230U00230U00230U00230U00230U00230U00230U002");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................." + "'", str2, "I0I0020\\4\n\n.............................................................................I0I0020\\4\n\n....................................................u\\uI0I0020\\4\n\n.............................................................................I0I0020\\4\n\n.....................................................");
    }

    @Test
    public void test36217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("\\4  ", "", "UUUUUUUUUUU6UUUUUUUUUUU                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\4  " + "'", str3, "\\4  ");
    }

    @Test
    public void test36218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36218");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " 61\\\\u002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                           1\\U00234                                      \\U0023\\U00\\u0           ...", '2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           1\\U0034                                      \\U003\\U00\\u0           ..." + "'", str2, "                           1\\U0034                                      \\U003\\U00\\u0           ...");
    }

    @Test
    public void test36220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36220");
        char char2 = org.apache.commons.lang3.CharUtils.toChar(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", 'a');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ' ' + "'", char2 == ' ');
    }

    @Test
    public void test36221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36221");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "2222222222222222222222", (java.lang.CharSequence) "                                                                                                  I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36222");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "U 61.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "U 61." + "'", str1, "U 61.");
    }

    @Test
    public void test36223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36223");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "\\U", (java.lang.CharSequence) "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 91 + "'", int2 == 91);
    }

    @Test
    public void test36224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                       AAAAAAAAAAAAA3200u\\A                                      ", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ..." + "'", str2, "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\            ...");
    }

    @Test
    public void test36225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36225");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("2  U  2  U  2  U  2  U  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                           1\\U00234                                      \\U0023\\U00\\u0                    .", " 61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           1\\U00234                                      \\U0023\\U00\\u0                    ." + "'", str2, "                           1\\U00234                                      \\U0023\\U00\\u0                    .");
    }

    @Test
    public void test36227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36227");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("66666666666666666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", "", (int) 'i');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...                   \n\n1", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test36228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.", 24, '1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61." + "'", str3, "61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.61.");
    }

    @Test
    public void test36229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36229");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", 518, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36230");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "U0023\\U00\\u0041\\U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36231");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("33333333", "....................................................................................................", 563);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       " + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6                                       ");
    }

    @Test
    public void test36233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "111111111111111111111111111111111111111111111111111111111111111111111111111111111111..." + "'", str2, "111111111111111111111111111111111111111111111111111111111111111111111111111111111111...");
    }

    @Test
    public void test36234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1616161616161616161161611616161616161616161", 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1616161616161616161161611616161616161616161" + "'", str2, "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1616161616161616161161611616161616161616161");
    }

    @Test
    public void test36235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36235");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0020\\0", '3');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00" + "'", str1, "023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
    }

    @Test
    public void test36237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36237");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("H", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36238");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("11111111111u0023#u0023#u0023#u0023#u0023#u0023#u");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36239");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1\\ 61\\ 6 ", "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("\n\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "\\U61\\ U61\\ 61\\ 61\\ 61\\ 61\\AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("    ", "023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test36243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa061");
    }

    @Test
    public void test36244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36244");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "222222222222222222222222222222222222222222222222222222222222222222222222222222 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              2222222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", 138, 237);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         " + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
    }

    @Test
    public void test36246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36246");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\u");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36247");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("22222222222222222222uuu0023                                            222222222222222222222cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc", "                                                  3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\300u\\", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36248");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("222222U0023#U0023#U0023#U0023#U0023#U0023#U0023      222222", "                    \n                     ", 358);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36249");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                       AAAAAAAAAAAAA3200u\\A                                      ", "...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666", 243, (int) 'U');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666" + "'", str4, "                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
    }

    @Test
    public void test36250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       6161UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       \\61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa        61UUUUUUUUUUUUUUUUUUUUUUUU55          aaaaaaa       61", "AA                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      " + "'", str2, "3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U32      3000u\\31111111111111111111111111111111111111111111110U3004\\U\\3200U\\3200U3200u##########0U\\3200U\\3200U3004\\U\\3200U\\3200U3200u#      ");
    }

    @Test
    public void test36252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36252");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36253");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray15 = new char[] { '4', ' ', ' ', ' ', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10hi!100", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0061", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence5, charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0023                                                                                     ", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0037", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "5", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u00220\\u0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                ", charArray15);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test36254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                    ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36255");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ", 38, "aaaaaaa    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              " + "'", str3, "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6              ");
    }

    @Test
    public void test36256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36256");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("61UUUUUUUUUUUUUUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...61UUUUUUUUUUUUUU", "61aaaaaaaaaaaaaaaaaaaaaaaaaaa33333333333333333333", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36257");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "023\\u0023aaaaaaa2222222222222222222222222222222222222222222222222222222222222222222222222222");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36258");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#11#1111\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#11#1111" + "'", str1, "#11#1111");
    }

    @Test
    public void test36259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075", 112, 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36260");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("001!IH013333333333333333333333333333333333333333333333333333333333333333333333333333333", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0200iui\\", "333333333333333333333333333333333333333333333333333333333   ...333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0200iui\\" + "'", str2, "0200iui\\");
    }

    @Test
    public void test36262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "61Uaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36263");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("5544u4UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", 367, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36265");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...    ...\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\", "6666aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36266");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 61 61 61 61 61 61 61 6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 73);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "111111111111111111111U6111111111111\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("UUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16", (int) 'c', '\r');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16" + "'", str3, "\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\rUUUUUUUUUUUUUUUUUUUUUUUUUU16\\16 \\16");
    }

    @Test
    public void test36269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023................................", "...3\\U0##########333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36270");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 64 64 64 64 64 64 64 6uuuuuuuuuuuuuuuuuu...", "61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61......61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61\\61", 97);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "\\u0023\\");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\" + "'", str1, "\\u0023\\");
    }

    @Test
    public void test36272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU" + "'", str1, "\\u0023\\u00\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U002UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }

    @Test
    public void test36273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36273");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h", "HHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36274");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("\\u000d", 167, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36275");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("u......\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00", 936, 76);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00" + "'", str3, "...u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u004\\u00");
    }

    @Test
    public void test36276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                               !ih!ih!ih", "               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                !ih!ih!ih" + "'", str2, "                                                                                !ih!ih!ih");
    }

    @Test
    public void test36277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36277");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("    \n", "...3\\U0##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36278");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue('a', 71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test36279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!                                                                                   U0023                          ", 695, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61i!                                                                                   U0023                          " + "'", str3, " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\  61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61i!                                                                                   U0023                          ");
    }

    @Test
    public void test36280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u                                                          ", "23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u                                                          " + "'", str2, "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u                                                          ");
    }

    @Test
    public void test36281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36281");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u0023\\U\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u005", (java.lang.CharSequence) "  uuuuuuu                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "3200u\\3200u\\3200\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u00233200u\\3200u\\3200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                 A\\u0023AAAAAAAAAAAAA                                  ", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 A\\u0023AAAAAAAAAAAAA                      ..." + "'", str2, "                                 A\\u0023AAAAAAAAAAAAA                      ...");
    }

    @Test
    public void test36284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36284");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...... \\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u0041\\u004 61\\\\uu ...... \\u0041\\u0041\\u00u61\\u0020\\u0020\\u0020\\u0020\\u0020\\u00");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("UUUUUU 6\\\\U0020 6\\\\U0020 6              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UUUUUU 6\\\\U0020 6\\\\U0020 6" + "'", str1, "UUUUUU 6\\\\U0020 6\\\\U0020 6");
    }

    @Test
    public void test36286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36286");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                             11111111111111111111111111111111111                                                                             ", "61AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 46);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "\\4  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ", "u003                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     " + "'", str2, "\\u003\\u003\\u0                                         \n\n1                                                    \n\n1     ");
    }

    @Test
    public void test36289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   \\u003 ", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                        \\u003 " + "'", str2, "                                                        \\u003 ");
    }

    @Test
    public void test36290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36290");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                         \n\n1                 AAAA   61 AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 260, (int) 'u');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36291");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u200U\\u261\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36292");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAA51AAAAAAAA51AAAAAAA1\\U23\\u0023\\u...AAAAAA51AAAAAAA", "...U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U61\\U0023\\U00\\u0041\\U...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36293");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111      ", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("H                                                                ", 'c');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                                                                " + "'", str2, "H                                                                ");
    }

    @Test
    public void test36295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36295");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                             ...", "\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002         ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61\\U0023\\U0023\\U0023\\U0023\\U002\\U0023\\U0023\\U0023\\U0023\\U002            ...h    h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36296");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                            AAAAAAAAAAAAA3200u\\A  ...", (java.lang.CharSequence) "...\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36297");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\n\n1", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", 86);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("A000U\\", "aaaa                                                ", 96);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach(" 61\\", strArray5, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\4\n\n", "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                     ", strArray9, strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "23\\0023\\0023\\0023\\0023\\0023\\0023\\0023");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " 61\\" + "'", str10, " 61\\");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                     " + "'", str15, "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\4\n\n" + "'", str17, "\\4\n\n");
    }

    @Test
    public void test36298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                      \\u0023\\u00\\u0041\\u0023", "                                                                                              ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      \\u0023\\u00\\u0041\\u0023" + "'", str2, "                                      \\u0023\\u00\\u0041\\u0023");
    }

    @Test
    public void test36299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36299");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "        \\u0034         ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36300");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061...", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36301");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "5c11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       22222\\U0023\\U00\\u0041\\U00232222", " ...", "         0000000000000000000000000000000000000000000000000\\u0037         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       22222\\U0023\\U00\\u0041\\U00232222" + "'", str3, "       22222\\U0023\\U00\\u0041\\U00232222");
    }

    @Test
    public void test36303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36303");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "23\\u0023\\u0023\\u0023\\u0023\\u0023");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                        \\uhi!hi!hi!                         ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 \\uhi!hi!hi!                         " + "'", str2, "                 \\uhi!hi!hi!                         ");
    }

    @Test
    public void test36305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("       11111111111111..", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36306");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36307");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       AAAAAAAAAAAAA3200u\\A                          ...6666666666666666661aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa666666666666666666666666666666");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau623\\u23\\u23\\u2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36309");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61", "                                  AAAAAAAAAAAAA3200u\\A                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36310");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\U0023", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u0075", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test36311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\", "                                                                                                                                                                                    16AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\" + "'", str2, "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\U61\\61\\61\\61\\61\\61\\U61\\61\\61\\61\\61\\");
    }

    @Test
    public void test36312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36312");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("uuu \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36313");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", (java.lang.CharSequence) "1111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test36314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("u003aaaaaa", "\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n1\n\n\n\n\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u003aaaaaa" + "'", str2, "u003aaaaaa");
    }

    @Test
    public void test36315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36315");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("61\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\6161\\61\\61", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36316");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "...uuuuuuuuuu");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36317");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\                   \\U0033                    61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\", 'C');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \\u0032");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36319");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ", 237, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36320");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("UUUUUUUUUUUUUUUU ...                         UUUUUUUUUUUUUUUU", (int) '\\', 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36321");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36322");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "0023", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032\\40032", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test36323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "533333333333333333333333333333\\40032333333333333333333333333333333C");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36324");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("###########U005cu0u005cu0u0023Uu005cu0u005cu0###########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36325");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023", "61UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU                                  3200U          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test36326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "66666666666666666666666666666666666666666666666666666       22222\\u0023\\u00\\u0041\\u002322222", "U\\32");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "20\\U0020\\U0020\\U0020\\U00   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20\\U0020\\U0020\\U0020\\U00   " + "'", str1, "20\\U0020\\U0020\\U0020\\U00   ");
    }

    @Test
    public void test36328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("1161\\", "   u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\2u\\\n16u    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1161\\" + "'", str2, "1161\\");
    }

    @Test
    public void test36329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("555555555555555", "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u   2");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("\\U002066666666666666666666666666666666666666");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U002066666666666666666666666666666666666666" + "'", str1, "\\U002066666666666666666666666666666666666666");
    }

    @Test
    public void test36331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36331");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "    61        61        61        61        61        61        61        61        61        61        61        61        61   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 129 + "'", int1 == 129);
    }

    @Test
    public void test36332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36332");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36333");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaa...u0020u0020u0020u0020u0020u0020u0020u0020u0020...        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36334");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "\\", (int) '\r');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("UUUUUUUUUUUUUUUUUUUUUUUUU...", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str8, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh", 300, "\\u0068");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00" + "'", str3, "\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00");
    }

    @Test
    public void test36336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("u061u061061u0061u061u061u061u061", "...023\\U0023\\U00237575757575757575757575757575757575757");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u061u061061u0061u061u061u061u061" + "'", str2, "u061u061061u0061u061u061u061u061");
    }

    @Test
    public void test36337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U", "\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\iiiiiiii\\u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U" + "'", str2, " 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
    }

    @Test
    public void test36338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36338");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("\\u005c\\u00", "023\\u0023       aaaaaaauuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36339");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i                                                                                                           ", "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test36340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "111111111111111111111111111111111111111111111...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("11111111111U0023#U0023#U0023#U0023#U0023#U0023#U0023", "!ih16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16U\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16\\16   \n\n\n\n\n");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("\\U003", (java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "u002311111                             u002311111                             u002311111                             u002311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u0011111                             311111                             u002311111                             u002311111                             u002311111                             u002311111                             u", 268, 120);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023" + "'", str4, "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test36342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...001600000000160000000016000000001600000000160000000016000000001600000000160000000016", "                                 \\U0023\\U00\\u0041\\U                                   1\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 6                                                                                                                                                                                                                                                                       ", "0023\\u0023\\u0023\\ U");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test36343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "\\u003\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '2', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test36345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36345");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "   2     ...                                ...    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "3\\U002375757575757575757575757575757575757575757570U\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test36346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36346");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AAAAAAAAAAAAAAUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU3200UAAAAAAAAAAAAAA", "\\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\16 \\1616 \\16 \\1616 \\16 \\1616 \\16 \\1", "1\\ 61\\ ...                                A\\u2AAAAAAAAAAAAAau\\                                                                 A\\u");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36347");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                         \n\n1                                                    \n\n", "6666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", 155);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36348");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\u005c\\u0\\u005c\\u0\\u0023\\U\\u005c\\u0\\u005c\\u0\\u005", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                 U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  ", 107);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75        75");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36351");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                 A\\u0023AAAAAAAAAAAAAa000u\\                                 3", "111575757575757575757575757575757575757575757575757575757573200##0U##0\\##03200##0U##0\\##0320##0...", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36352");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ", " 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\", "20\\u0020\\u0020\\u0020\\u00    \\U002322222\\U002322222\\U002322222\\U002322222\\U002322222\\U002322222", 49);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("\\u0034666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 49");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test36353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("23\\u U   6", "161\\161\\161\\161\\161\\161\\u0023                                              6u\\u0023\\1111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36354");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("\\u0055                   23\\u0023\\u0023        75023\\u0023\\u001111111111111111111111111", "23\\u0023\\u0023\\u0023\\u0023\\u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\" + "'", str1, "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ U61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
    }

    @Test
    public void test36356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36356");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                            uuuuuuuuuuuuuuuuuu", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36357");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  5757575757575757575757575757575757575757575757575757575732U\\32U\\32U\\32U\\32U\\32U\\32U\\", "    2222222222222222222222222222222222UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUUUU...UUUUUUUUUUUUUUUUUUUUUUU");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...                                 ...", "\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0020\\u0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                 ..." + "'", str2, "...                                 ...");
    }

    @Test
    public void test36359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36359");
        char char1 = org.apache.commons.lang3.CharUtils.toChar(" 3hi!hi!hi!                                                                          ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test36360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36360");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161", "                                         \n\n1                                        ", 183, 110);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        " + "'", str4, "11111111111111111111111111111111111111111111123\\U0023\\U11111111111111111111111111111111111111111111161                                         \n\n1                                        ");
    }

    @Test
    public void test36361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "\\U0075\\U0075\\U0075\\U0075\\U0075\\U00\\U0023\\U00\\u0041\\U0023                         \\U0075\\U0075\\U0075\\U0075\\U0075\\U007");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA", "\\U000AAAAAAAAAAAAAA3200U\\A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu0023                  \\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023", '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu23                  \\U23\\U23\\U23\\U23\\U23\\U23\\U23" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu23                  \\U23\\U23\\U23\\U23\\U23\\U23\\U23");
    }

    @Test
    public void test36364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36364");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u", 108, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\u");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str3, "u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\uu0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test36365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36365");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ", '\\');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '7');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                              ...\r                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  " + "'", str4, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  " + "'", str6, "5555555555555555555555555555555555555555555555555555555555555555555555555555555555  ......  ");
    }

    @Test
    public void test36366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36366");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("\\ u61\\ 61\\ 61\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36367");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "1h!1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023" + "'", str1, "\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023");
    }

    @Test
    public void test36369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36370");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuc500u\\0u\\0200u\\0200u\\0200u\\0200u\\0200u\\\n###55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str1, "55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555###\n\\u0020\\u0020\\u0020\\u0020\\u0020\\u0\\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u", 358, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000" + "'", str3, "\\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................33333333333333333330000000000000000000000000000000000000000000000000000000000000000000000000000000000000000............................3333333333333333333000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test36372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36372");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("\\4003211111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\4003211111111111111111111111111111111111111" + "'", str1, "\\4003211111111111111111111111111111111111111");
    }

    @Test
    public void test36373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                       23  hh23  hh23  hh23  hh23  hh23  hh23  hh23  hh23                                                                       ", "1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...hh...1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 1\\6 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             " + "'", str2, "                                                                                                                                             0023\\0023\\0023\\\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nU\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                                                             ");
    }

    @Test
    public void test36375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36375");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                  6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...                                A\\u0023AAAAAAAAAAAAAa000u\\                                                                 A");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36376");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("6");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36377");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu003u0023u0023u0023u0023u0023u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36378");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("23\\u23\\u23\\u23\\u23\\u23\\u23\\u23U6                                       ", "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType(".....");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAA", strArray10, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "6");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AAAAAAA" + "'", str13, "AAAAAAA");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str16, "6666AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aaaaaaa      " + "'", str18, "aaaaaaa      ");
    }

    @Test
    public void test36379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "            2");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36381");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("3\\u003\\", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhAAAAAAAhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        ", "... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        " + "'", str2, "1111111111111111111111111111111111111111111113\\u0...aaaaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhh3200u\\3200u\\3200u\\3200u\\3200u\\                        ");
    }

    @Test
    public void test36383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36383");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh", "                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                                      \\U0023\\U00\\u0           ...                           1\\U00234                       ...HH...", "...02...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh" + "'", str3, "AAAA...aaaaaahhhhhhhhhhhhhhhhhaaaaaahhhhhhhhhhhhhhhh");
    }

    @Test
    public void test36384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("A", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test36385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u0023\\U\\u005                                                                                          \\u0\\u005                                                                                          \\u0\\u005");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36386");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("5555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555                                                                                                55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa61 aaaaaaaaaaaaaaaaaaaaaaaa", 74);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36387");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("U62 \\U00220\\u0020\\u0020\\u0020\\u00    U62 \\U002                                                          ", "                                                                                                                \\3200u\\3200u\\3200u\\300u\\");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36388");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "111111111111111111111U6111111111111111111111", "\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                      3200U\\1400u\\00U\\3200U\\", "#################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################" + "'", str2, "#################");
    }

    @Test
    public void test36390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36390");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("  575\\u0037200U\\", "6\\ 6\\ 66\\ 6\\ 66\\ 6\\ 66\\ 6...\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ 61\\61U 61\\ 61\\610020\\ 61\\ ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36391");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###\n\\u003\\u0023\\u0023\\u0023\\###", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36392");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau6000000000000000000", "111111111aaaa\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\\\U0023\\U0023\\U0023\\U0023\\U0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36393");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ uuu", "#################################################\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                         u0023\\u002u0023\\u002u0023\\u002u0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36395");
        char[] charArray7 = new char[] { ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "10hi!100", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "\\U0023", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                            aaaaaaaaaaaaa3200\\a                                ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "222222222222222222222222222222222222222222222U6                                          aaaaaaaaaaaaaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test36396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36396");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36397");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("5\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nu003u0023u0023u0023u0023u0023u0023AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA55", "51", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  \\005C                                                                                                                                                                      ", "...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r\r", "                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \\005C                                                                                                                                                                      " + "'", str3, "  \\005C                                                                                                                                                                      ");
    }

    @Test
    public void test36399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\", "  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUU                                                         u0023\\u002u0023\\u002u0023\\u002u0  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU  2  UUUUU", "UUUUUUUUUUUUUUUUUUUUUUUUUUUU...11111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\" + "'", str3, "H          AAAAAA\\U000D\\U000D\\U000D\\U000D\\U000D\\U000A\\U0023AAAAAAAAAAAAAA000U\\");
    }

    @Test
    public void test36400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36400");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("23\\u0023\\u0023323\\u0023\\u0023                                                               ", "4444444444444444444444444444444444444   ...4444444444444444444444444444444444444", 92);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '5');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "23\\u0023\\u0023323\\u0023\\u0023                                                               " + "'", str5, "23\\u0023\\u0023323\\u0023\\u0023                                                               ");
    }

    @Test
    public void test36401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 339);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r" + "'", str2, "6\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r");
    }

    @Test
    public void test36402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36402");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "    u0034                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("533333333333333333333333333333\\40032333333333333333333333333333333C", "75 ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test36405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", "1hi!hi!hi!00000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h" + "'", str2, "                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h");
    }

    @Test
    public void test36406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                        ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61...... 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ...", 76, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61\\ 61\\ ..." + "'", str3, " 61\\ 61\\ ...");
    }

    @Test
    public void test36408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36408");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("      c1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111      ", "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCChhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUhhhhhhhhhhhhhUUUUUUUCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC", 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36409");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" 61..11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00", 11, 241);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, " 61..11111123U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u00111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test36410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36410");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\...0U\\3200U\\3...", "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\naaa\n\n   2");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002" + "'", str1, "23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002");
    }

    @Test
    public void test36412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36412");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("\\u0035", "...h    h...", (int) '1');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi!100", "10hi!100", (int) (short) 100);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061", strArray10, strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("\\u0061");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("61", strArray10, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", strArray5, strArray10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061" + "'", str16, "\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061\\u0061");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "61" + "'", str19, "61");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str20, "61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\u0035" + "'", str21, "\\u0035");
    }

    @Test
    public void test36413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36413");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "1\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...3\\U0023\\U0023\\i\\\\U0023\\U0023    3\\U0023\\U0023\\i\\\\U0023\\U0023...", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str2, "61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA61AAAAAAAA6uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("2..........................................\\U003 .................................................................................................................................................................................................................................................................", "500u\\0u\\                                                                                          500u\\0u\\           6\\6\\66\\6\\66\\6\\66\\6...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a" + "'", str1, "5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...a");
    }

    @Test
    public void test36417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36417");
        char char2 = org.apache.commons.lang3.CharUtils.toChar((java.lang.Character) 'I', '1');
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'I' + "'", char2 == 'I');
    }

    @Test
    public void test36418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36418");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "\\u005c", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023    3    ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                         U0023\\U002U0023\\U002U0023\\U002U0", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "1111111...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test36419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36419");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "\\u0023                                                                                                                                                  hi!hi!hi", (java.lang.CharSequence) "                                                                                                                               i!                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "\\u0023                                                                                                                                                  hi!hi!hi" + "'", charSequence2, "\\u0023                                                                                                                                                  hi!hi!hi");
    }

    @Test
    public void test36420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36420");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aa......aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test36421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u", "23\\u                100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002310023\\u                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36422");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaa...555555555555555555555555555555555555555555555555", "61\\ 61\\ 61");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36423");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test36424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                         \n\n1                                                    \n\n1                                  61\\");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61aaaaaaaaaaaaaaaaaaaaaaaaaaaaIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test36425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36425");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", 18, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" + "'", str3, " 61uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
    }

    @Test
    public void test36426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("3200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A8", 120, "000000000000000000000000000000...                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000000000000000000000000000003200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A800000000000000000000000000000" + "'", str3, "000000000000000000000000000003200U\\3200U\\3200U\\...0U\\3200U\\3200U\\3200U\\3200U\\3200U\\32\\u00A800000000000000000000000000000");
    }

    @Test
    public void test36427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36427");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\61", 91);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '7', 0, 54);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "77777777777777777777777777777777777777777777777777777" + "'", str7, "77777777777777777777777777777777777777777777777777777");
    }

    @Test
    public void test36428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAA      ", (int) '.', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "AAAAAAA      hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test36429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222", "6u666u");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222" + "'", str2, "55555555555555555555555555555555555555555555555555555555555555555555555555555522222\\U0023\\U00\\u0041\\U002322222");
    }

    @Test
    public void test36430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...\\U");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...\\U" + "'", str1, "...\\U");
    }

    @Test
    public void test36431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36431");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "  \\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                    ", 369);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test36432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36432");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", "3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3261\\u61\\61\\61\\61\\61\\61\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36433");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111c5U", "2", 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36434");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...001600000000160000000016000000001600000000160000000016000000001600000000160000000016", '7');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36435");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("\\U005CUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU", "aaaaaaaaaaaaa   uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", "       11111111111111..");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test36436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...3\\u0023\\u00231\\40032", "61\\161\\161\\161\\161\\161\\U6                                          161\\161\\161\\161\\161\\161");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...3\\u0023\\u00231\\40032" + "'", str2, "...3\\u0023\\u00231\\40032");
    }

    @Test
    public void test36437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference(" 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61", "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0" + "'", str2, "23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0");
    }

    @Test
    public void test36438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36438");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                     61\\ 61\\61                                                                                                                                                                     ", '\\');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00", 19, "\\u0023\\u\\");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00" + "'", str3, "\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00AAAA...aaaaaa                             hhhhhhhhhhhhhhhhhaaaaaa                             hhhhhh\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u0068\\u00");
    }

    @Test
    public void test36440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36440");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("6666\r\r\r\r\r\r\rAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test36441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36441");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("U0023\\U002375757575757575757575757575757575757575757575757575757575", "...3\\U0023\\U0023\\U0023\\U0023\\U0023UUUUUUUUUUUU...", 26);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36442");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("\\U0023", "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", (int) '\r');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '5');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 61\\\\U0020 61\\\\U0020 61\\\\U0020 6 61\\\\U0020 61\\\\U0020 61\\\\U0020 61", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test36443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36443");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("11111111111111111111 111111111111111111111", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("\\u0023                                                                                                                                                  hi!hi!hi!", "u11UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu1\\\\100u0u1\\\\100u0u1uuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\u0023                                                                                                                                                  hi!hi!hi!" + "'", str2, "\\u0023                                                                                                                                                  hi!hi!hi!");
    }

    @Test
    public void test36445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("222222222222222222222222222222222222222222222u                                           ", 'I');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "222222222222222222222222222222222222222222222u                                           " + "'", str2, "222222222222222222222222222222222222222222222u                                           ");
    }

    @Test
    public void test36446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaa\\u0055                                            1111111111111111111111111111111111111111111111aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!", 118, " 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 6");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!" + "'", str3, "###AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU####################################################AU######                                hi!");
    }

    @Test
    public void test36448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36448");
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "\\u0061", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "      ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("\\u0023                                                                                     hi!hi!hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "11111", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U00", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       5c111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111...", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  ......  \\u00410023\\U0023\\U0023\\U0023\\U0023\\U001\\u0041\\u00", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test36449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                         \n\n1                                        ", "\\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16u \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 \\16 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36450");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###\n###    61        61        615c    61        61        61");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         61\\ u61\\ 61\\ 61\\ 61\\ 61\\  61\\ u61\\ 61\\ 61\\ 61\\ 61\\ ", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36452");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...0000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36453");
        int int2 = org.apache.commons.lang3.CharUtils.toIntValue((java.lang.Character) 'a', 480);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 480 + "'", int2 == 480);
    }

    @Test
    public void test36454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                            3200u                            aaaaaaaaaaaaa3200\\a                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3200u                            aaaaaaaaaaaaa3200\\a" + "'", str1, "3200u                            aaaaaaaaaaaaa3200\\a");
    }

    @Test
    public void test36455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36455");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u00", "                                                                                      3200U\\1400u\\00U\\3200U\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaau61\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36457");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!IH!IH!IH", "   2     ...                                ...    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36458");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u002323\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023U6...####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####AU####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36459");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      ", "\\u0023", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 61\\");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3\\u0020666666666U0023\\U0023\\U0023\\U0023\\U0023\\U0023\\U0023                                                  iii", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "U003                                                ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa      " + "'", str5, "aaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaa      " + "'", str6, "aaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaaaaa      " + "'", str13, "aaaaaaa      ");
    }

    @Test
    public void test36460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAAAAAA3AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023", 'A', 'h');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023" + "'", str3, "0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023");
    }

    @Test
    public void test36462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36462");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "4  h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h\\huh0023h                                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36463");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   ", (java.lang.CharSequence) "\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\ 1\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("..                       100023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023100                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  .....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                            ", "", "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuAAAAAAAAAAAAA\\\\\\uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            " + "'", str3, "                            ");
    }

    @Test
    public void test36466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36466");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                \\u0023\\u0023\\u0023\\u0023\\u0023\\u0...6666666666666666666666666666666666666666666\r\r\r\r\r\r\r                                                 ", "                                                                                                     6U3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\32", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test36467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu", "             U0023\\U002U0023\\U002U0023\\U002U0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu" + "'", str2, "u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66u 6666u 66uu");
    }

    @Test
    public void test36468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36468");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                           \\u0061\\u0061\\u\\U0023\\u0061\\u0061\\u0                                 ", '6');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "555555555555555");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaa\\20UUU\\20UUU\\20UUU\\                                               ", "61u1UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU1 161\\\\1u100201 161\\\\1u100201 16");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36471");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u005c", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023                                                                                           \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu", (int) (byte) 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ......  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test36472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("U61\nUUUUUUUUUUUUUUU", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36473");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "\\u003\\u0023                                        ", "      23U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4003U0023\\U0023\\U0##########u0023U0023\\U0023\\U\\4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test36474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("\\U002066666666666666666666666666666666666666", "61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\U");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("\\u0023\\u0023\\u0023\\u0023\\u0023\\16", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          " + "'", str2, "                          \\u0023\\u0023\\u0023\\u0023\\u0023\\16                          ");
    }

    @Test
    public void test36476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36476");
        char char1 = org.apache.commons.lang3.CharUtils.toChar("                 \\ 0030                  ");
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + ' ' + "'", char1 == ' ');
    }

    @Test
    public void test36477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r\r", 349);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test36478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36478");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                 ...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111...11111111111111111111111111111111111111111111111111111111", "  2     2     2     2     4444444444444  1    1 ", 148);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36479");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("3\\u0003\\u0111111111111111111111111111111111111111111111", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36480");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1111111123\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u623\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023u6", 31, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa2aaaaaaaaaaaaaaaaaaaaaaa", "U6663\\u6623\\u6623\\u6623\\u6623\\u6623UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUu662");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test36482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...0023h\\huh0023h\\huh0023h                            ...", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0023h\\huh0023h\\huh0023h                            ...            " + "'", str2, "...0023h\\huh0023h\\huh0023h                            ...            ");
    }

    @Test
    public void test36483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "i!                                                                                   U002");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test36484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36484");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaac5aaaaaaaaaaaaaaaaaaaaaaa", "6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "3\\U                      ", 886, 566);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test36485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "6161");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test36486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36486");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                                                           U", "3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u\\3200u", 6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("\\u0075", "\n");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("23\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023U6", strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\   2  5700u\\");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61", strArray5, strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "0023\\u0023\\u0023\\u0023\\u0023\\u0044444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                       ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61" + "'", str13, "61\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 6161\\ 61\\ 61");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test36487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36487");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023#\\U0030023", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36488");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("\\u0023\\u0023\\u0023\\u0023\\u0023", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test36489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36489");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                         A\\3200U\\323200U\\3200U\\3200U\\3200U\\3200U\\3200U\\3200U\\323200U\\320075                         ", 66, 122);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36490");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                       ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 61                                          ...h    h", "...1...                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ", " 6uUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU 6\\\\u0020 6\\\\u0020 6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36492");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("23                                                                                     hi!hi!hi!", "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023       aaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023\\u0023 \\u005cuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("23", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test36493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "i!                                                                                   U0023");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("              ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U", 'C');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U" + "'", str2, "              ###########U005cu0u005cu0u0023Uu005cu0u005cu023\\U");
    }

    @Test
    public void test36495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36495");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "11111111111111111111111111111111111", (java.lang.CharSequence) "                                                                                                                                                                                                                                                     666666666666666666666666666666666666666                                       aaaaaaaaaaaaa\\\\\\");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test36496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36496");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("cccccccccccccccccccccccccccccccccccccccccccc\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\cccccccccccccccccccccccccccccccccccccccccccc", "", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test36497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  2   ", "1hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11hi!11h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test36498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  " + "'", str1, " 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u0020 6\\\\u\r\r\r\r\r...  ");
    }

    @Test
    public void test36499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ", "61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ u61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ 61\\ ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 " + "'", str2, "0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6                                                             16 \\16 \\16 \\16 \\16  \\16 16 \\16 \\16 \\16 \\16 AAAAAAAAAAAAAAAAAAAAAAA5CAAAAAAAAAAAAAAAAAAAAAAA0U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 0200U\\\\6 ");
    }

    @Test
    public void test36500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest72.test36500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020" + "'", str2, "U61\n\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020\\U0020");
    }
}

