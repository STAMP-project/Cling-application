import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest101 {

    public static boolean debug = false;

    @Test
    public void test50501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 4, 266);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test50502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                               ", 169, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####                                                                                                                                                               #####" + "'", str3, "#####                                                                                                                                                               #####");
    }

    @Test
    public void test50503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50503");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444..." + "'", str6, "4444444...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444..." + "'", str8, "4444444...");
    }

    @Test
    public void test50504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50504");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                              a0a                                                                                                                                                                                                                                                                                                                                              ", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0" + "'", str1, "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
    }

    @Test
    public void test50506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50506");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("   A    44                                                                                            A    44", 145, 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("H!ih!h!ih!", "...             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!h!ih!" + "'", str2, "H!ih!h!ih!");
    }

    @Test
    public void test50508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...444444444444444440true-1.0097...444444444444444444444444", ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test50509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50509");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 400, (float) 99L, (float) 147L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 99.0f + "'", float3 == 99.0f);
    }

    @Test
    public void test50510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("444444444444444  444444444444444", 414);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                               444444444444444  444444444444444                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                               444444444444444  444444444444444                                                                                                                                                                                               ");
    }

    @Test
    public void test50511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50511");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...4a444hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44", 670, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0true-1.0              ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0              ..." + "'", str1, "0true-1.0              ...");
    }

    @Test
    public void test50513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50513");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("     ...         aaaa0aaaaa44444", "0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA", 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50514");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "         ......00.7900.1-eurt00.79......aaaa", 585);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50515");
        char[] charArray13 = new char[] { '4', '4', ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                      ...                                                     ", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "true-1.  97", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "            444444444444444  444444444444444             ..", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                     100.0                                                     aaaa", charArray13);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37 + "'", int22 == 37);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test50516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50516");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50517");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true", "                                                                                     0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ", 149, "444444444444444444 0444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ");
    }

    @Test
    public void test50519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50519");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444", "                                                          444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .AAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444440444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444440444" + "'", str2, "444440444");
    }

    @Test
    public void test50521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...44444...4444444...4...AAAAAA...", 131, "...444444444444444444444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444444444444444444444444444444444444444444444444444444440true-1.009744444444444444444444444...44444...4444444...4...AAAAAA..." + "'", str3, "...444444444444444444444444444444444444444444444444444444444440true-1.009744444444444444444444444...44444...4444444...4...AAAAAA...");
    }

    @Test
    public void test50522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("h", "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..." + "'", str2, "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
    }

    @Test
    public void test50523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                  0aaaa                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0aaaa" + "'", str1, "0aaaa");
    }

    @Test
    public void test50524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("############################################# # #############################################", "...40true-1.0097.04444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################# # #############################################" + "'", str2, "############################################# # #############################################");
    }

    @Test
    public void test50525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50525");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.00-1.0097.04444444444444444444444444444444444444444444", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    a   HI!HI!", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test50526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("44444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str1, "44444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097. A 4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test50527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50527");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 359, 578.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 578.0d + "'", double3 == 578.0d);
    }

    @Test
    public void test50528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50528");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                     AAAA0AAAAA              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50529");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.04444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".04444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("##########################################################", "A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1000                                                     aaaa", "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444" + "'", str2, "A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test50533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50533");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                          4444444...4444444...4444444...4...", 533);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 533 + "'", int2 == 533);
    }

    @Test
    public void test50534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50534");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################44444444400    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", "A A A A ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################44444444400    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A" + "'", str3, "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################44444444400    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
    }

    @Test
    public void test50535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...AAAA0AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAA0AAAA" + "'", str1, "...AAAA0AAAA");
    }

    @Test
    public void test50537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50537");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                ...444444", (int) (short) 44, 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50538");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 0, true, (-1.0d), 0L, 97.0d };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat(objArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(objArray5, '4', 403, 667);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 403");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[0, true, -1.0, 0, 97.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[0, true, -1.0, 0, 97.0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0true-1.0097.0" + "'", str6, "0true-1.0097.0");
    }

    @Test
    public void test50539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440true");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440true" + "'", str4, "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440true");
    }

    @Test
    public void test50540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50540");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...", "a A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ..." + "'", str2, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                           ...");
    }

    @Test
    public void test50542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#################################", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################" + "'", str3, "#################################");
    }

    @Test
    public void test50543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50543");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...", "    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50544");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4 ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test50545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50545");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.", "a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0      A         A         A         A         A         A         A         A         A         A         A         A         A         A", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444440true-140097", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444444444440true-140097" + "'", str8, "44444444444444444444444444444444440true-140097");
    }

    @Test
    public void test50546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                             ", "4true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                          rue-1.0097.0", "AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA0.7900.1-EURT0#4AAAAA0AAAA     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaa...44444", 638, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa...44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaa...44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", 93, 181);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A..." + "'", str3, "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
    }

    @Test
    public void test50551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50551");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0000000000000000000000000000000000000000000", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50552");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test50553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50553");
        float[] floatArray1 = new float[] { 58.0f };
        float float2 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[58.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 58.0f + "'", float2 == 58.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 58.0f + "'", float3 == 58.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 58.0f + "'", float4 == 58.0f);
    }

    @Test
    public void test50554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50554");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("0097.", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!" + "'", str5, "HI!");
    }

    @Test
    public void test50555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50555");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "444444444444444444444444...7900.1-eurt044444444444444444", 91);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....", strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                      ", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 24 + "'", int7 == 24);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test50556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50556");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test50557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE97TRUE9444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50558");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009", "                                                     ...                                     aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50559");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE97TRUE97aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##############################################################4true4-4449744#######################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50560");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA 0true-1.00-1.0097.0444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test50561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50561");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", (int) (short) 100);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 608, 22);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test50562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test50563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40", 96, "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40" + "'", str3, "0true-1.00                                           true-1.97.                                                                                           04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4        04true4-414.40");
    }

    @Test
    public void test50564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0TRUE-1.00-1.0097.0                                           ", 657);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("true                                         TRUE-1                                                                                                  44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true                                         TRUE-1                                                                                                  AAA" + "'", str2, "true                                         TRUE-1                                                                                                  AAA");
    }

    @Test
    public void test50568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "Hi4!", "aaaa0aaaaa ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test50569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   A    44                                                                                            A    44", "0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   A    44                                                                                            A    44" + "'", str2, "   A    44                                                                                            A    44");
    }

    @Test
    public void test50570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str2, "4444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test50571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50571");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test50572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50572");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                         ", "a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4" + "'", str1, "4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4");
    }

    @Test
    public void test50575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50575");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...40TRUE-1.0097.04444444444444444444444444444444444...a a a a", "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50576");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444", "", 24);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concatWith("0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.Object[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 'a');
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("0true-1.0097.0444444444444444444444444444444444444444444", strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, ' ');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("                 4444a44444                  ", strArray6, strArray17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444" + "'", str8, "7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str16, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                 4444a44444                  " + "'", str18, "                 4444a44444                  ");
    }

    @Test
    public void test50577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                ", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                " + "'", str2, "                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                ");
    }

    @Test
    public void test50578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                            ###    A   hi!hi!.                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###    A   hi!hi!." + "'", str1, "###    A   hi!hi!.");
    }

    @Test
    public void test50579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("......4444444...4444444...4444444.....", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "......4444444...4444444...4444444....." + "'", str4, "......4444444...4444444...4444444.....");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "......4444444...4444444...4444444....." + "'", str7, "......4444444...4444444...4444444.....");
    }

    @Test
    public void test50580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                            0TRUE-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             " + "'", str1, "                                                                                                                                                                                                                                                            0TRUE-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test50581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50581");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                     0.001                            A      A  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "###################################    a   HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.044", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("000         ih!ih!ih!ih!ih!ih!ih!ih!ih A4 444444444444444444444444440 7900 1-eurt0!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A", 75, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000         ih!ih!ih!ih!ih!ih!ih!ih!ih A4 444444444444444444444444440 7900 1-eurt0!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A" + "'", str3, "000         ih!ih!ih!ih!ih!ih!ih!ih!ih A4 444444444444444444444444440 7900 1-eurt0!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A");
    }

    @Test
    public void test50585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0097...##########################################0##############################################0097...#############################################################################################0097...#############################################################################################0097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI0097...##########################################0##############################################0097...######################################################################.0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50586");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI", "true-1.       ...97true-1.       ...97");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                         ...", 638, (int) 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test50587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50587");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("7900.1-eurt0444100.0A00       000       000       0A00       000 ", "                                                                                                AAAA", 506);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50588");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444440TRUE-1.0097...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test50589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a###ahi!hi!...###ahi!hi!...###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a###ahi!hi!...###ahi!hi!...###" + "'", str1, "a###ahi!hi!...###ahi!hi!...###");
    }

    @Test
    public void test50591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50591");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".0097.00true-1.0097.00true-1.0097.00tr", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                     aaah                     aaa", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AA", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 128 + "'", int17 == 128);
    }

    @Test
    public void test50592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                         AAAA0AAAAA", 467, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         AAAA0AAAAA44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "                                         AAAA0AAAAA44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test50593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                 444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr                                                                                                                                                                                                                                                                 ", 635);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                 444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr                                                                                                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                                                                                                 444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test50594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50594");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a.........a....0001.....................................................a.........a");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50595");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0TRUE-1.0097.0", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".............................................", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a A 1000 A A", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test50596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt044444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 826, 600);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test50597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                            0097.                                                 ", "", 140);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                            0097.                                                 " + "'", str3, "                                                                            0097.                                                 ");
    }

    @Test
    public void test50598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50598");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", "aHI!HI!...trueaHI!HI!...-aHI!HI!...aHI!HI!...aHI!HI!...97aHI!HI!...aHI!HI!...", "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.7900.1-eurt0444444444444444444444444444444444444444444444    A   ..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.7900.1-eurt0444444444444444444444444444444444444444444444    A   ...");
    }

    @Test
    public void test50599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50599");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("############################################# # #############################################", "######################################################################################################################################################################################################################################                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", ".0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################# # #############################################" + "'", str3, "############################################# # #############################################");
    }

    @Test
    public void test50601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50601");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test50602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50602");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0true-", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...79hi!hi!hi!hi!hi!hi!.1-EURThi!hi!hi!4444444444444444444444444444444444...444444444444444444444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test50603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50603");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaa...", "True-1.  97", 274, 402);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaa...True-1.  97" + "'", str4, "aaaaaaaaaaaa...True-1.  97");
    }

    @Test
    public void test50604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50604");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10L, (float) 123L, (float) 385);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 385.0f + "'", float3 == 385.0f);
    }

    @Test
    public void test50605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".44444444444444444444444444444444a    4######00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.44444444444444444444444444444444a    4######00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.44444444444444444444444444444444a    4######00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.44444444444444444444444444444444a    4######00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.44444444444444444444444444444444a    4######00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.44444444444444444444444444444444a    4######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50606");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "RT00 7900 1-EURT00 7900 1-EURT00 7900 1-EURT0", (java.lang.CharSequence) "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50607");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 589, (double) 589, (double) 668);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 668.0d + "'", double3 == 668.0d);
    }

    @Test
    public void test50608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50608");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh###############################################################################", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 664 + "'", int2 == 664);
    }

    @Test
    public void test50609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("1.0097.04444444444444444444444444", "#########################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50610");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 819, (double) 4.44444443E11f, (double) 146L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.44444442624E11d + "'", double3 == 4.44444442624E11d);
    }

    @Test
    public void test50611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                           aaaaaaaaaaaaaaaaa                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                           aaaaaaaaaaaaaaaaa                                                            " + "'", str1, "                                                           aaaaaaaaaaaaaaaaa                                                            ");
    }

    @Test
    public void test50612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50612");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097", 403, 465);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50614");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a   HI!HI!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (long) 461);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 461L + "'", long2 == 461L);
    }

    @Test
    public void test50615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "44444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444440TRUE-1.0097." + "'", str1, "44444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test50616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50616");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a0a", "                                                                               ...0...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("00aaaaaaaaaaaaa...", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test50617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50617");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test50618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("RUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRa0T...AAA", "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50619");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                                    4                                                 100.0                                                                             aaaa0aaaaa       ...                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50620");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444", 216, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50621");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4             ", "444...44444444444444444444444444444444440TRUE-1.0097...44", 96);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "              " + "'", str5, "              ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test50622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50622");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) ".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50623");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50624");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497", "                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-444" + "'", str2, "a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-444");
    }

    @Test
    public void test50626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50626");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...40true-1.0097.04444444444444444444444444444444444", "                                             A    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                    444444444444", 61, 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test50628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50628");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                           aaaa0aaaaa                  4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50629");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ", (java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h!ih!h!ih!HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa" + "'", str4, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test50630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                     aaaaa0aaaa                     ", "                                     aaaa0aaaaa                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ", (int) (short) 44);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50631");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4');
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "4444444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!" + "'", str12, "hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!4hi4!");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test50632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("A A A A", 95, 655);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A A A A" + "'", str3, "A A A A");
    }

    @Test
    public void test50633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50633");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            100.0", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "1000", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test50634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50634");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(548, 424, 608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 608 + "'", int3 == 608);
    }

    @Test
    public void test50635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50635");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "                                             ...", "                                                                                                                                     ", 144);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test50636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50636");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
    }

    @Test
    public void test50637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50637");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("900.1-EURT0444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "900.1-EURT0444444444444444444444444444" + "'", str2, "900.1-EURT0444444444444444444444444444");
    }

    @Test
    public void test50639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50639");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(224L, (long) 69, 269L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 269L + "'", long3 == 269L);
    }

    @Test
    public void test50640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50640");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#true-#.", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.79A.1-EURTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50641");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(537.0d, 28.0d, (double) 257L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 537.0d + "'", double3 == 537.0d);
    }

    @Test
    public void test50642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50642");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 68, (long) 668, 31L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 31L + "'", long3 == 31L);
    }

    @Test
    public void test50643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50643");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("a4444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                           0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0", "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                           0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0" + "'", str3, "                                                                                                                                           0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
    }

    @Test
    public void test50645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444E-1.0         0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50646");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", (java.lang.CharSequence) "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50647");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 267 + "'", int9 == 267);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 267 + "'", int12 == 267);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 267 + "'", int14 == 267);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 267 + "'", int15 == 267);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 267 + "'", int17 == 267);
    }

    @Test
    public void test50648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50648");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "97 TRUE-1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50649");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                        ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50650");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "..####################################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50651");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444...", "...                 ", "AAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test50652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50652");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 64, (long) 202, (long) 229);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 64L + "'", long3 == 64L);
    }

    @Test
    public void test50653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50653");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50654");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50655");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("true-1.0097.0444444444444444444", "#########.");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", "####################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444...4444444...4444444...4444444...4444444...", "444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50659");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                       ##44444444444444444444#...#444444444444444444444444444444444444444444444", "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       ##44444444444444444444#...#444444444444444444444444444444444444444444444" + "'", str2, "                       ##44444444444444444444#...#444444444444444444444444444444444444444444444");
    }

    @Test
    public void test50661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50661");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50662");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("444444444444444444444444a444444444444444444444444a444444444444444444444444a44444  A    444444444444444444444444a444444444444444444444444a444444444444444444444444a44444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444a444444444444444444444444a444444444444444444444444a44444  A    444444444444444444444444a444444444444444444444444a444444444444444444444444a44444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" true - 1 . 97 . ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " true - 1 . 97 . " + "'", str1, " true - 1 . 97 . ");
    }

    @Test
    public void test50664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097 ", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097 " + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097 ");
    }

    @Test
    public void test50665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     AAAAAAAAAAAAAAAAAA", "AA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test50666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50666");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                       ##44444444444444444444#...#444444444444444444444444444444444444444444444", "A         A                                                     100.0    A         A0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a4444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("true444...444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true444...444444444444444444444" + "'", str2, "true444...444444444444444444444");
    }

    @Test
    public void test50668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50668");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test50669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50669");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(95L, 655L, 907L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 95L + "'", long3 == 95L);
    }

    @Test
    public void test50670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("rT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E", " true 1.  97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E" + "'", str2, "rT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
    }

    @Test
    public void test50671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50671");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt04444444444444444444444444444444444444444444", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          " + "'", str2, "                                          ");
    }

    @Test
    public void test50673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444...4444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444...4444" + "'", str2, "44444...4444");
    }

    @Test
    public void test50674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50674");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1000");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1000.0f + "'", float1 == 1000.0f);
    }

    @Test
    public void test50675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a44444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a44444" + "'", str1, "a44444");
    }

    @Test
    public void test50676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                   rt00.7900.                   ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   rt00.7900.                   ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "                   rt00.7900.                   ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test50677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50677");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test50678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       ...4               ######", 4444444, 523);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test50679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50679");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                              ...0TRUE-1.0097...                                                                 ", strArray4, strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ...", strArray8);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "", 959, 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                              ...0TRUE-1.0097...                                                                 " + "'", str10, "                                              ...0TRUE-1.0097...                                                                 ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test50680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50680");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("444444A44444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444A44444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50681");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ahi#!#hi#!#hi#!#haaaaaaaaaaaaaaa#44444#aaaaaaaaaaaaaaaaaaaaaaaa", "                       A                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...44444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444..", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444.." + "'", str3, "...44444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444..");
    }

    @Test
    public void test50683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaa", "...                 ...444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50684");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444a444444444444444444444444", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                      100.0                                                     ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 38 + "'", int13 == 38);
    }

    @Test
    public void test50685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50685");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test50686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50686");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                 ", (java.lang.CharSequence) "0TRUE-1.0097.044444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                 " + "'", charSequence2, "                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                 ");
    }

    @Test
    public void test50687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50687");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", (java.lang.CharSequence) "0097...##########################################0444##############################################4444444444444...###########################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 448 + "'", int2 == 448);
    }

    @Test
    public void test50688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50688");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test50689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50689");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...##############################################...", "4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50690");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.0444444444444444444444444444", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.0" + "'", str3, "0true-1.0097.0");
    }

    @Test
    public void test50691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50691");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test50692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a0aaaaa              0true-1.0097.00true-1.0097.00trAaaaaaaaaaa4444444...4444444...4444444...4a0aaaaa              0true-1.0097.00true-1.0097.00tr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0aaaaa              0true-1.0097.00true-1.0097.00trAaaaaaaaaaa4444444...4444444...4444444...4a0aaaaa              0true-1.0097.00true-1.0097.00tr\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00", "..####0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00" + "'", str2, "4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00");
    }

    @Test
    public void test50695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50695");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444A   hi!hi!hi!h####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     " + "'", str1, "    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     ");
    }

    @Test
    public void test50697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa", "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50698");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                         4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "97.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0A" + "'", str1, "97.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0A");
    }

    @Test
    public void test50700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50700");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                      100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAA", 62, "4444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444440TRAAAAAAAAAAAAAAAAA" + "'", str3, "4444444444444444444444444444444444444444440TRAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test50702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50702");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 812, 368);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str4, "                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test50703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50703");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "4444444444444444444444444444444444444444444 true-1. 97. 444444444444444444444444444444444444444444", 741);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50704");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" TRU...UE-1.0097.044444444444444444444444444444444...4444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " TRU...UE-1.0097.044444444444444444444444444444444...4444" + "'", str2, " TRU...UE-1.0097.044444444444444444444444444444444...4444");
    }

    @Test
    public void test50706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50706");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0...", "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                  Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test50707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4 0true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 0true-1.0097.044444444444444444444444444" + "'", str1, "4 0true-1.0097.044444444444444444444444444");
    }

    @Test
    public void test50708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa", "    a   HI!HI!HI!HI!HI!HI!H", "44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa" + "'", str3, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444...44444444444444444444", "                                                                                                                                                                                                                                                                                                                                                      hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444...44444444444444444444" + "'", str2, "4444444444444444444...44444444444444444444");
    }

    @Test
    public void test50710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50710");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("100.0                                                     4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.04444" + "'", str1, "100.04444");
    }

    @Test
    public void test50711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50711");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444", "     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", (int) '#', 656);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ..." + "'", str3, "...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ...");
    }

    @Test
    public void test50713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50713");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.", "...                                                                                                                                               ", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50714");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4A4 4rt4004.479004.414-4eurt4004.4744444444444444444444444444444444444444444444444", "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444A A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50715");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("TRUETRUE                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", 181, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50716");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1.0097.04444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50717");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                        ...0TRUE-1.0097...                            ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test50718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50718");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                  0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 40, 982);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50719");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".1-eurt00.7900.1-eurt", "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", 363);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                     ", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50721");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50722");
        char[] charArray18 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray18);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray18);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray18);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray18);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray18);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray18);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444", charArray18);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", charArray18);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", charArray18);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", charArray18);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0aaaa                                                                                                                                  A                                                                                                                                  0aaaa", charArray18);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA4444444444444444444444444444444444444A0AAAAA       AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444", charArray18);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 45 + "'", int22 == 45);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test50723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                10000#####10000###", 131);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AAAA0AAAAA0AAAA0AAAAA0AAAA0AAAAA0AAAA0A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50725");
        long[] longArray1 = new long[] { (short) 100 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[100]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test50726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("   a   HI!HI!                                                                                      ", "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   a   HI!HI!                                                                                      " + "'", str2, "   a   HI!HI!                                                                                      ");
    }

    @Test
    public void test50727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50727");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".0097.00true-1.00", ".0097.00TR");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test50728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-444", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50729");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 4.4444042E9f, (double) 451, 39.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.444404224E9d + "'", double3 == 4.444404224E9d);
    }

    @Test
    public void test50730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50730");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444...", 144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50731");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                  " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                  ");
    }

    @Test
    public void test50732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50732");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) ".0097.00true-1.00", (java.lang.CharSequence) "                                      100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + ".0097.00true-1.00" + "'", charSequence2, ".0097.00true-1.00");
    }

    @Test
    public void test50733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50733");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test50734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                          #...#4#a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#...#4#a#" + "'", str1, "#...#4#a#");
    }

    @Test
    public void test50735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50735");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...", (long) 140);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 140L + "'", long2 == 140L);
    }

    @Test
    public void test50736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50736");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                   ...                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50737");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test50738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str2, "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test50739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50741");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   #################################################", 292);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 292 + "'", int2 == 292);
    }

    @Test
    public void test50742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50742");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444440true-1.0097.", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 542);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50743");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI                                                                                                                                  0AAAA                                                                                                                                  " + "'", str1, "HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI4!HI                                                                                                                                  0AAAA                                                                                                                                  ");
    }

    @Test
    public void test50744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50744");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                            ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 670);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 98, 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test50745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50745");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50746");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A1.00HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A.0HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A AA   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50747");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 545);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50748");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                                                                                                                                                                                                                                                                                                                                                                             4444A44444", "...                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444A44444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                             4444A44444");
    }

    @Test
    public void test50750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("           A", "                                                                                                                                                                                                                                                                                                                   a                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           A" + "'", str2, "           A");
    }

    @Test
    public void test50751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                       ", "                                         ...                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50752");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH", "                                                                                                                                                                            ...", 232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50753");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", (long) 623);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 623L + "'", long2 == 623L);
    }

    @Test
    public void test50754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50754");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(33, 0, 551);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 551 + "'", int3 == 551);
    }

    @Test
    public void test50755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1" + "'", str2, "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1");
    }

    @Test
    public void test50756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("a004444444000444444400044444440a004444444000444444400044444440a004444444000444444400044444440a0044");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a004444444000444444400044444440a004444444000444444400044444440a004444444000444444400044444440a0044" + "'", str1, "a004444444000444444400044444440a004444444000444444400044444440a004444444000444444400044444440a0044");
    }

    @Test
    public void test50757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50757");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("      #a######################...##############################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50758");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50759");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                              0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr    A     0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr", 46, 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 177 + "'", int3 == 177);
    }

    @Test
    public void test50760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa", "444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("   A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", "true4-4449744                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str2, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
    }

    @Test
    public void test50762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("######################################################################   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 131);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ", "0097...##########################################0##############################################0097...#############################################################################################0097...#############################################################################################0097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI0097...##########################################0##############################################0097...######################################################################.0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4");
    }

    @Test
    public void test50764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               A A A A                        a                                                                                              ", 26, "#############################################    A         A         A  A         A        rue-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     #############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               A A A A                        a                                                                                              " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               A A A A                        a                                                                                              ");
    }

    @Test
    public void test50765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50765");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT", (double) 267L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 267.0d + "'", double2 == 267.0d);
    }

    @Test
    public void test50766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50766");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...444444444444444444444444440.7...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test50767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50768");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "...                                                               ...", (java.lang.CharSequence) "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...                                                               ..." + "'", charSequence2, "...                                                               ...");
    }

    @Test
    public void test50769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                           0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "...444444444444444444444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test50770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4a4444444444444444444444...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                             4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                             4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                             4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test50772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...A..", 950);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A.." + "'", str2, "...A..");
    }

    @Test
    public void test50773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50773");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("###0.001##", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".............................................", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test50774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50774");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "", 116);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                            ", "    ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test50775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA" + "'", str2, "HI!H4444404444HI!HI.A A A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAA");
    }

    @Test
    public void test50776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50776");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "       ...      a         a         a         a         a0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50777");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ...", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test50778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50778");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                   ", 47);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                           ...      ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5, strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str6, "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str10, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50779");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444", 144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50780");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "###########################################true-1.97.############################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 253, 975);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 253");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50781");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444A44444", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14 + "'", int17 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test50782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50782");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a", "True-1.  97", 657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.", "#A#44444444444444444444#...#444444444444444444444444444444444444444444444     ", "a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.");
    }

    @Test
    public void test50784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "                                                                                                                                                                                                                                                                                                            0TRUE-1.0097.044444444444444444444444444 ...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA0.001...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50785");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAA...", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "04444444444444444444444444444444444444444444", 131, 102);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test50786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#...#4#a#", 267);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#...#4#a#" + "'", str2, "#...#4#a#");
    }

    @Test
    public void test50787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50787");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444", 165, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("044444444444444444444444444", 657, 123);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test50789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50789");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test50790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50790");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...0TRUE-1.0097...######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.######################################################################################################444444444444444440true-1.0097...444444444444444444444444                                                                                        100.###########################################", "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                       A0                                                                                                                                                                                       ", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                       A0                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                       A0                                                                                                                                                                                       ");
    }

    @Test
    public void test50792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50792");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444444444444444444444444444444444444UUUUUUUUUUU444444444444444444444444444444444444444444444UUUUU4UUUU444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50793");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 734, 167.0d, (double) 133);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 734.0d + "'", double3 == 734.0d);
    }

    @Test
    public void test50794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50794");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                      100.0                                                      ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...A..", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 38 + "'", int15 == 38);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test50795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa a HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 261, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                     " + "'", str3, "                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test50797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50797");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                 HH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHrt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     A                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50798");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("         ", "###################################################44444444444444444444444", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444      #a#####################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50800");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 44, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test50801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#", 848, "AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0t#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0t" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0t#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0t");
    }

    @Test
    public void test50802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50802");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  A      A                            100.0                                                     aaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.00true-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 468);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...A     ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...A     .." + "'", str1, "...A     ..");
    }

    @Test
    public void test50804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50804");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr...tr..A    4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test50805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                             10000#####10000###", "#A#44444444444444444444#...#44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("    aaaaa0aaaa                                                                         ", "4444...44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50807");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("7900.1-eurt0444100.0");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("a004444444000444444400044444440a004444444000444444400044444440a004444444000444444400044444440a0044", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50808");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test50809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" 4...7900.1-EURT04444444444444444444444444444444444...4440", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 4...7900.1-EURT04444444444444444444444444444444444...4440" + "'", str2, " 4...7900.1-EURT04444444444444444444444444444444444...4440");
    }

    @Test
    public void test50810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50810");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!... is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50811");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                     aaah                     aaa", 69, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     aaah                     aaa44444444444444444444" + "'", str3, "                     aaah                     aaa44444444444444444444");
    }

    @Test
    public void test50812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444                                           ", "                                                       4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444a####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444##############4true-1.4497.4444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444###################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                0 true - 1 .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444##############4true-1.4497.4444" + "'", str3, "4444444##############4true-1.4497.4444");
    }

    @Test
    public void test50814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50814");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.aa97.a44444444444444444444444444a.............................................###a.aa1##.............................................aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...A     ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50815");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 44);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 44 + "'", short2 == (short) 44);
    }

    @Test
    public void test50816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("      00", "...44444444444444444444444444444444440true-1.0097...A...444444444          aaaatrue-1.0097...A...44444444444444444444444444444444440true-1.0097...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      00" + "'", str2, "      00");
    }

    @Test
    public void test50817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...", "                          100.0                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...");
    }

    @Test
    public void test50818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaa" + "'", str1, "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaa");
    }

    @Test
    public void test50819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50819");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#############################################################################################################################################################################################################TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR########################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("A   0  00                                                                                                     ", "UE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50821");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 445, (double) 99L, (double) 38);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38.0d + "'", double3 == 38.0d);
    }

    @Test
    public void test50822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50822");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", "4...44444444444444444444a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str2, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
    }

    @Test
    public void test50824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50824");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                               TRUE  ", "..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50825");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###################################################################################################################################################################################################################################################444444444444444444444440.7900.1-eurt0aaaa                                                     0.001###################################################################################################################################################################################################################################################", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test50826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...900.1-EURT04444444444444444444444444444444444444444444", "    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50827");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                        a    44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50828");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 267 + "'", int6 == 267);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
    }

    @Test
    public void test50829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50829");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test50830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50830");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444   !    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                                                                                                       0aaaa                                                                                                                                  A                                                                                                                                  0aaaa                                                                                                                                      ", 168, 363);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50831");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50832");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("           00#######000#######000#######0011                    ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test50833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("        a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       4444444444444444444444444444444444444444444...4444444.79...4444444.1-EURT...44444444444444444444444444444444444444444444444444       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50834");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "00", (java.lang.CharSequence) "                       A                                 ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "00" + "'", charSequence2, "00");
    }

    @Test
    public void test50835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                            ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                            ..." + "'", str1, "                                                                                                                                                                            ...");
    }

    @Test
    public void test50836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50836");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                 !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH                                                                                                                                                                                                                                                                                                                                                                                                                 ", 179, 314);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50838");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa0aaaaa", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " true-1.  97. ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444...                       a                       a                       a                       a                       a                       a  ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test50839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50839");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa", "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", 435);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50840");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("......4444444...4444444...4444444.....", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                          100.0                                                ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi....", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("...A ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test50841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50841");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#################################################################################################################################################A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......", "aAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test50843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50843");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 275, (double) 841.0f, (double) 21L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.0d + "'", double3 == 21.0d);
    }

    @Test
    public void test50844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50844");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAtrueAA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50845");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("    4444444444444444444444444444   ", 951);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50846");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0...AAA0AAAAAAAAA0AAAAAAAAA0AAAA44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50847");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A    4", "                                      100.0                                                     ", 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("                    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0", strArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("true-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h############################...", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A    4" + "'", str7, "A    4");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test50848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50849");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(548, 0, 502);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 548 + "'", int3 == 548);
    }

    @Test
    public void test50850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50850");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 149, (double) 94, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 149.0d + "'", double3 == 149.0d);
    }

    @Test
    public void test50851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(".00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".00" + "'", str1, ".00");
    }

    @Test
    public void test50852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test50853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50853");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...0...", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaa444444444444444440true-1a0097aaa444444444444444444444444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
    }

    @Test
    public void test50854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444");
    }

    @Test
    public void test50855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50855");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray18, strArray21);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray18);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray13, strArray18);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (java.lang.Object[]) strArray18);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440TRUE-1.0097.0", strArray6, strArray18);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAAAAAAAAAAAA", strArray18);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.concatWith("  A      A                            100.0                                                     aaaa", (java.lang.Object[]) strArray18);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.stripAll(strArray30, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean33 = org.apache.commons.lang3.StringUtils.startsWithAny("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray30, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "    A     " + "'", str7, "    A     ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "    A     " + "'", str8, "    A     ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100.0" + "'", str22, "100.0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str25, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.0" + "'", str27, "44444444444444444444444444444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test50856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0true-1.0097", 451, "##################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################################################################################################################################################0true-1.0097############################################################################################################################################################################################################################" + "'", str3, "###########################################################################################################################################################################################################################0true-1.0097############################################################################################################################################################################################################################");
    }

    @Test
    public void test50857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50857");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test50858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaa444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###444444##444440true-1.0097...4444444444444444444440true-1#0097###44...444##444440true-1.0097...4444444444444444444440true-1#0097###44aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50859");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 638, 671);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 671 + "'", int3 == 671);
    }

    @Test
    public void test50860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50860");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444 4", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50861");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50862");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 267 + "'", int9 == 267);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test50863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50863");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...44444444444......", "...........................................................................................0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test50864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50864");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test50865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test50866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50866");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50867");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4 ", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0000400004...                  4...4...97.4...true-1.4...", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test50868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50868");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test50869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50869");
        double[] doubleArray5 = new double[] { 0, 53, 10.0d, 0.0f, 1.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 53.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 53.0d + "'", double7 == 53.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 53.0d + "'", double11 == 53.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test50870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##100.0###0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 479);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test50872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...", "100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0##RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0#100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50873");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A                                                                        ", "0       000       00790       000       000       00-0       00EURT0       00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test50875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444444444444444444444444444444444444444444444444444444444444444444 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4444444444444444444444444444444444444444444444444444444444444444444444  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50876");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A         A                                  ", "                                                                                                  ", 216);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("a004444444000444444400044444440", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             a     ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A         A                                  " + "'", str5, "A         A                                  ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A         A                                  " + "'", str6, "A         A                                  ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str10, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A         A                                  " + "'", str11, "A         A                                  ");
    }

    @Test
    public void test50877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                      A0", 982);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                       0aaa                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0aaa" + "'", str1, "0aaa");
    }

    @Test
    public void test50879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50879");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("..........................................", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".........................................." + "'", str3, "..........................................");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".........................................." + "'", str4, "..........................................");
    }

    @Test
    public void test50880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAhI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("true-1971", 461);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1971" + "'", str2, "true-1971");
    }

    @Test
    public void test50882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50882");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test50883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50883");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50884");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test50885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50885");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("rT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaa...00.7900.1-eurt00.79...aaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test50886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50887");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("A44444444444444444444aaa4444                       A44444444444444444444aaa444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A44444444444444444444aaa4444                       A44444444444444444444aaa444" + "'", str1, "A44444444444444444444aaa4444                       A44444444444444444444aaa444");
    }

    @Test
    public void test50889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50889");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                      100.0                                                     aaaa100100.0                                                     aaaa.100.0                                                     aaaa0100.0                                                     aaaa                                                ", (double) 463.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 463.0d + "'", double2 == 463.0d);
    }

    @Test
    public void test50890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50890");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444...44444...7900.1-EURT04444444444444444444444444444444444...444                                       ", (java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       true-1.0097.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 615 + "'", int2 == 615);
    }

    @Test
    public void test50891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaa", 49, 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444" + "'", str3, "40true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444");
    }

    @Test
    public void test50892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#######04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 #######", "                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                   ", "                                                0.001                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 #######" + "'", str3, "#######04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 #######");
    }

    @Test
    public void test50893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50893");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 231, 61L, 168L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 231L + "'", long3 == 231L);
    }

    @Test
    public void test50894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744     4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44", "UE-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50895");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...          rt00.7900.", (java.lang.CharSequence) "true-97true-97true-97true-97true-97true-97true-97true-97true-97trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test50896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(".1-EURT00.7900.1-EURT", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1-EURT00.7900.1-EURT" + "'", str2, "1-EURT00.7900.1-EURT");
    }

    @Test
    public void test50897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50897");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...", 734, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ..." + "'", str3, "44444444444444444444444444444444444444444444444444AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
    }

    @Test
    public void test50898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50898");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[1, 10, -1, 10, 10]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test50899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50899");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                               444444444444444  444444444444444                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50900");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("Aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50902");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      100.0                ...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUETRUE", 26);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                      100.0                ..." + "'", str4, "                                      100.0                ...");
    }

    @Test
    public void test50903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                  0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", "4 .44444444444444444444444444444444A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50905");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa", "7900.1-eurt0444100.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......" + "'", str2, "A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......");
    }

    @Test
    public void test50907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50907");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("1");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test50908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi       " + "'", str1, "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi       ");
    }

    @Test
    public void test50909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50909");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray6, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray6);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444a444444444444444444444444", strArray6);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.endsWithAny("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", strArray6);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "...44444444444...");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str12, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test50910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("        a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       4444444444444444444444444444444444444444444...4444444.79...4444444.1-EURT...44444444444444444444444444444444444444444444444444       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       ", 139);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       4444444444444444444444444444444444444444444...4444444.79...4444444.1-EURT...44444444444444444444444444444444444444444444444444       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       " + "'", str2, "        a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       4444444444444444444444444444444444444444444...4444444.79...4444444.1-EURT...44444444444444444444444444444444444444444444444444       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       ");
    }

    @Test
    public void test50911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50911");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(229.0d, (double) 578, (double) 49L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 578.0d + "'", double3 == 578.0d);
    }

    @Test
    public void test50912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.79A.1-EURTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                 ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.79A.1-EURTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                 " + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.79A.1-EURTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                 ");
    }

    @Test
    public void test50913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.", 2, 430);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097." + "'", str3, ".         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.");
    }

    @Test
    public void test50914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                      100.0", "    A      40.. 47eurt.                                                 A      40.. 47eurt.                       A   40.. 47eurt.                                           ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 39, 826);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50915");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a#4#...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50916");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440AAAAA    4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "   HI!HI!...a    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50918");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.00###########################################################################################################################################################################################################################", "0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 84);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0true-1.00###########################################################################################################################################################################################################################" + "'", str5, "0true-1.00###########################################################################################################################################################################################################################");
    }

    @Test
    public void test50919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50919");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("......4444444...4444444...4444444.....", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "......4444444...4444444...4444444....." + "'", str5, "......4444444...4444444...4444444.....");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test50920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50920");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
    }

    @Test
    public void test50921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0......true-1....97....0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...", "                                       A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111                                                                                                                             4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", "a.7900.1-eurt0444444444444444444444444444444444444444444444a.7900.1-eurt04444444444444444444a.7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0......true-1....97....0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0..." + "'", str3, "0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0......true-1....97....0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...0TRUE-1.0097...0...");
    }

    @Test
    public void test50922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50922");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("true444...44444444444444444444444444444444440TRUE-1.0097...44                                                                                        ", 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "a0aaaaa0true-1.0097.0444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 651);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                        0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                        0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test50925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("    a   HI!HI!..", "444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    a   HI!HI!.." + "'", str2, "    a   HI!HI!..");
    }

    @Test
    public void test50926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50926");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("true-1....97true-1....97", "a         a    0001");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "            A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test50929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("444                                                   ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test50930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50930");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     a...", 523);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str2, "A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test50932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50932");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("000         ih!ih!ih!ih!ih!ih!ih!ih!ih A4 444444444444444444444444440 7900 1-eurt0!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"000         ih!ih!ih!ih!ih!ih!ih!ih!ih A4 444444444444444444444444440 7900 1-eurt0!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50933");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(656, 734, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 734 + "'", int3 == 734);
    }

    @Test
    public void test50934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50934");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.00###########################################################################################################################################################################################################################", "44444aaaaa", 265);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50935");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50936");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ", 0, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50937");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                          a                             ###    a   HI!HI!...###    a   HI!HI!...###", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50938");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50939");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test50940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444444" + "'", str1, "0true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test50941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50941");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444444440TRUE-1.0097.4444444444444444444444444444444444444444444440TRUE-1.0097.4444444444444444444444444444444444444444444440TRUE-1.0097.4444444444444444444444444444444444444444444440TRUE-1.0097.4444444444444444444444444444    A   hi!hi!..                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50942");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!H...", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test50943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50943");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaaa00       000       000       00aa  A      A                            100.0                                                     aaaa", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", 84, 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a00       0000TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...   00aa  A      A                            100.0                                                     aaaa" + "'", str4, "a00       0000TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...   00aa  A      A                            100.0                                                     aaaa");
    }

    @Test
    public void test50944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50944");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "TRUETRUE", (java.lang.CharSequence) "444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50945");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                  4                   ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50946");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0       000       00790       000       000       00-0       00EURT0       00", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test50947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50947");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                               0aaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0aaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444", "atruea-a1aaaaaa4444444444444", 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ueatruea-a1aaaaaa44444444444444" + "'", str3, "Ueatruea-a1aaaaaa44444444444444");
    }

    @Test
    public void test50949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50949");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444440true-1.0097.0100.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test50950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50950");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444440true-1.0097.0100.0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50951");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 975.0f, (double) 734L, 721.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 721.0d + "'", double3 == 721.0d);
    }

    @Test
    public void test50952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50952");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(30, 632, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 632 + "'", int3 == 632);
    }

    @Test
    public void test50953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...0TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaTRUE-1.  97.aa", "44444444444444444444444444444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test50955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50955");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaa      a         a         a         a         aaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "a a a a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50957");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("A    44444444444444444444444444444444444444444440true-1.0097.0", "44444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A    44444444444444444444444444444444444444444440true-1.0097.0" + "'", str2, "A    44444444444444444444444444444444444444444440true-1.0097.0");
    }

    @Test
    public void test50959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...                                                                             ......                                                                             ......                                                                             ......                                                                             ......                                                                             ......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50960");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50961");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAA" + "'", str1, "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.AAA");
    }

    @Test
    public void test50963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50963");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097", "444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ... a", "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ... a" + "'", str3, "a HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ! HI ... a");
    }

    @Test
    public void test50965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444440097...##########################################0444##############################################4444444444444...###########################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A", "...44444444444...");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test50966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "#A#44444444444444444444#...#44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50968");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50969");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ue-144444444444444444444444444444444########################################################################################1444444444444444444444444444444444444444444444444444444", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test50970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4                       " + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4                       ");
    }

    @Test
    public void test50972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50972");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaa.", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!#######################################################################################################################################################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test50973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50973");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1aaaaaaaaaaa4444444...4444444...44...aaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...44                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "44444444444444444444444444444444444444444444444444...TRUE");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test50976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50976");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test50977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50977");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 00");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test50978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50978");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440aaaaa4a4A4A4A4A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440                                             100.0                                                     aaaa                                                                                                                                                                                                                                                                                   0                                         ", "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50979");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "...####################################...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test50980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                             ...0TRUE-1.0097...                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             ...0TRUE-1.0097...                            " + "'", str1, "                             ...0TRUE-1.0097...                            ");
    }

    @Test
    public void test50981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50981");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...      ", "true-1.97.", 131);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...      " + "'", str4, "     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...      ");
    }

    @Test
    public void test50982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50982");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "T00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "T00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT" + "'", str1, "T00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
    }

    @Test
    public void test50983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H", "                               ", "0true-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H" + "'", str3, "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H");
    }

    @Test
    public void test50984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...##############################################......##############################################...AE444444444444444444444", "", "                                                             a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...##############################################......##############################################...AE444444444444444444444" + "'", str3, "...##############################################......##############################################...AE444444444444444444444");
    }

    @Test
    public void test50985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50985");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...44                             ", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test50986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    ", 551);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "7.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    " + "'", str2, "7.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790                    ");
    }

    @Test
    public void test50987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50987");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                             04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4", 14);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test50988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50988");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test50989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50989");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) ".0097.00true-1.000true-1.0                                    ", (java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test50990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50990");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "        art           tra                            ", (java.lang.CharSequence) "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test50991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444..0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi", "44444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test50992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50992");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...!hi!hi!hi!hi!hi!hi! ", "", 385);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test50993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50993");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50994");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("A444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", 667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test50995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50995");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(" HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                 HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                 HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                 HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                 HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "aaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test50996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50996");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("A         A                  ", 314, "A.7900.1-eurt0444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.A         A                  A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7" + "'", str3, "A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.A         A                  A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7900.1-eurt0444444444444444444...A.7");
    }

    @Test
    public void test50997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444444444444444A   hi!hi!hi!h####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test50998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("true-1. 97", "                               0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1. 97" + "'", str2, "true-1. 97");
    }

    @Test
    public void test50999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test50999");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("  aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa" + "'", str1, "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa");
    }

    @Test
    public void test51000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest101.test51000");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, (long) 201, 444L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }
}

