import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "..HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444444444444444444444444444444440true-1.0097." + "'", str1, "4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.substringsBetween("", "    A     ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("0true-1.0097.0444444444444444444444444444444444444444444", (java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     aaaaa0aaaa                     ", "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...", 78);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaa0aaaaaaa", 444, 17);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("                                          ##100.0###                                           ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    A         A                                                     1000    A         A         ", 279, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                       a", 895, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "true444...44444444444444444444444444444444440TRUE-1.0097...44                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true444...44444444444444444444444444444444440TRUE-1.0097...44                                                                                        " + "'", str1, "true444...44444444444444444444444444444444440TRUE-1.0097...44                                                                                        ");
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444440true-1.0097...444444444444444444444444", 43, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444440true-1.0097...444444444444444444444444" + "'", str3, "444444444444444440true-1.0097...444444444444444444444444");
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str1, "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", "                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                     aaaa0aaaaa   ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaa0aaaaa   " + "'", str2, "                     aaaa0aaaaa   ");
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("##100.0###", (float) 545);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 545.0f + "'", float2 == 545.0f);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("TRUE", "  A    ", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", 545);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100.0 aaaa0true-1.0097.044444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0 aaaa0true-1.0097.044444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...    0true-1.0097.00true-1.0097.00true-1.0097.00tr", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("##########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################################################################################################################" + "'", str1, "##########################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "...##############################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444" + "'", str2, "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444");
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAA" + "'", str2, "AAAAAAAAAA");
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 608, (long) 84, (long) 13);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 13L + "'", long3 == 13L);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1L, (float) 99, 5.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                 aaaa0aaaaa    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                 aaaa0aaaaa    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                  aaaa", 216);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  aaaa" + "'", str2, "                                  aaaa");
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097." + "'", str1, "444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("        HI!H4444404444HI!HI.A A A ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        hi!h4444404444hi!hi.a a a " + "'", str1, "        hi!h4444404444hi!hi.a a a ");
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "100.0 aaaa0true-1.0097.044444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0 aaaa0true-1.0097.044444444444444444444444" + "'", str1, "100.0 aaaa0true-1.0097.044444444444444444444444");
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444a444444444444444444444444", "...44444...true-1.4444444...97.4444444...4444444444444...", "...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 22, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRUE-1.  97.", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                aaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 220 + "'", int16 == 220);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444...                                                                ", "    A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("444 100.0 aaaa444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                     aaaa0aaaaa           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 42 + "'", int1 == 42);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...44444444444...", (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...                          ...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                          ..." + "'", str2, "...                          ...");
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!" + "'", str1, "AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!");
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                      100.0                                                     aaaa100100.0                                                     aaaa.100.0                                                     aaaa0100.0                                                     aaaa                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0                                                     aaaa100100.0                                                     aaaa.100.0                                                     aaaa0100.0                                                     aaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
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
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("      ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..", "                     aaaa0aaaaa   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...44444...true-1.4444444...97.4444444...4444444444444...                  4                       \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#########.                                                   ", "##100.0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########.                                                   " + "'", str2, "#########.                                                   ");
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("###################################    a   HI!HI!...", "           a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999", "aAAAAAAAAAAAAAAAA...", 55);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("       ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                     aaaa0aaaaa           ", "AAAAA0AAAA0.7900.1-EURT04444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaa0aaaaa           " + "'", str2, "                     aaaa0aaaaa           ");
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444          ", 15, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444");
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                   ", "444444A444444444444444444", "0true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", "                     aaaa0aaaaa                     ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0true-1.0097.0", 50, 49);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                ..", "444444444444444  444444444444444", 12, 51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "            444444444444444  444444444444444             .." + "'", str4, "            444444444444444  444444444444444             ..");
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                               100.", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0TRUE-1.0097.044444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.044444444444444444444444444..." + "'", str1, "0TRUE-1.0097.044444444444444444444444444...");
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                   ", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("TRUE-1.  97.", ' ');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("444440true-1.0097.0100.0", strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", strArray8, strArray14);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444444444444444444444E-1.0         0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", strArray3, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str17, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi......i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi....", 95, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi......i!h" + "'", str3, "!hi!hi......i!h");
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                     0                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!hA", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..." + "'", str2, "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ...");
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444", 608);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa", "444444a444444444444444444");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', 56, (int) (short) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 72");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444" + "'", str1, "444444444444");
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(".79  .1-EURT44eurt", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".79  .1-EURT44eurt" + "'", str2, ".79  .1-EURT44eurt");
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", "                                      41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...aA4A4A4A444444444444444444444444" + "'", str2, "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...aA4A4A4A444444444444444444444444");
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00       000       000       00a", "A0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                ", "0true-1.0AAAAa44444...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi4!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi4!" + "'", str2, "hi4!");
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444..." + "'", str1, "444444...");
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.0", "     A    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 4444444, 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444a4444", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 36L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36L + "'", long2 == 36L);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", (java.lang.CharSequence) "        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444...7900.1-eurt044444", (int) (short) 4, ".0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444...7900.1-eurt044444" + "'", str3, "44444444444444...7900.1-eurt044444");
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "   4444444...AAAAAAAAA44444444444444444444444444444444444444444", "##100.0###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 69, 0L, (long) 638);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 638L + "'", long3 == 638L);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        char[] charArray8 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                   aaaaa0aaaa                                                                         ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444..4444", "...aaaaaaaaaaaaaaa...", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaa", "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", 57);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray4, strArray8);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("                                      ...                                                     ", "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, 'a');
        boolean boolean18 = org.apache.commons.lang3.StringUtils.endsWithAny("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...", strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00t..0true-1.0097.00t                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", strArray8, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str10, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                      a                                                     " + "'", str17, "                                      a                                                     ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".04444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi########" + "'", str1, "#########################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi########");
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("A         A", "                                                     ...                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("    A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A    ", "                                  aaaa", 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".79  .1-EURT44eurt");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".79  .1-EURT44eurt\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ", "                   TRUE-1.0097.0                       a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           " + "'", str2, "true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                           ");
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                       rue-1.0097.0", "               true  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0097.0" + "'", str2, "-1.0097.0");
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444...44444444444444444444444444444444440true-1.0097...44" + "'", str1, "444...44444444444444444444444444444444440true-1.0097...44");
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0TRUE-1.04444444444444444444444444444444444444444444", 20, ".0097.00TRUE-1.0097.00TRUE-1.0097.00TR                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1.04444444444444444444444444444444444444444444" + "'", str3, "0TRUE-1.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                            100.0");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444444...                            ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0       00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444440true-1.0097.", "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444440true-1.0097." + "'", str2, "4444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      A A A A A", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("97...#############################################################################################", 229);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 229 + "'", int2 == 229);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(6, (int) (short) -1, 660);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 660 + "'", int3 == 660);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444440true-1.0097.", (float) 216);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 216.0f + "'", float2 == 216.0f);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444   !    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                   .0097.00tr          ...", "000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi.", (short) 4);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 4 + "'", short2 == (short) 4);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "true-1.       ...97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", (int) (byte) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("a         a         a         a         a", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str5, "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray6, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444440true-1.0097.0", strArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concatWith("aaaaa0aaaa", (java.lang.Object[]) strArray6);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444a44444                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444a44444                                                                                                                                           \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("##100.0###", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 444, (float) 73, 20.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 444.0f + "'", float3 == 444.0f);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ..." + "'", str1, "0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A    4", 123);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 123 + "'", int2 == 123);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                             A    ", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", 92);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                         ...      ", (java.lang.CharSequence) "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                         ...      " + "'", charSequence2, "                                         ...      ");
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             a     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             a     " + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             a     ");
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097." + "'", str1, "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444440true-1.0097.", (java.lang.CharSequence) "4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A!hi!h!hi!hA A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A", "...7900.1-eurt0", 468);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("A00       000       000       00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h!ih!h!ih!", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "0TRUE-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4444444                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4444444                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("   4444444...AAAAAAAAA44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...44444444444...                                                                                                                                                                                                       ", "                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444...                                                                                                                                                        " + "'", str2, "...44444444444...                                                                                                                                                        ");
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(41, 0, 667);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("TRUE", (int) (short) 4, "                     aaaa0aaaaa    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "TRUE" + "'", str3, "TRUE");
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444" + "'", str1, "444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444");
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444444444444444444AAAAAAAAA...4444444   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444a44444", "                                      0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444a44444" + "'", str3, "4444a44444");
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("             ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("97 true-1", "rue-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444a00a.a1a-atruea0", "44444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("####################################...", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################..." + "'", str2, "####################################...");
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(671.0f, (float) 630, (float) 269);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 269.0f + "'", float3 == 269.0f);
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444440TRUE-1.0097.                    ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " . 97 . 4444444444444444444444444444444444444444444" + "'", str2, " . 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("!HI!HI!HI!HI!HI!HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!HI!HI!HI!HI!HI!HI!HI!HI!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                         AAAA0AAAAA", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("           A         A         A         A         A         A         A         A         A         A         A         A         A         A ...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                   .0097.00tr          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444440true-1.0097...444444444444444444444444", "4444444...", (int) (short) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444440true-1.0097...444444444444444444444444" + "'", str4, "444444444444444440true-1.0097...444444444444444444444444");
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 4, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                100.0#####100.0###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100.0#####100.0###" + "'", str1, "100.0#####100.0###");
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444" + "'", str1, "97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...    0true-1.0097.00true-1.0097.00true-1.0097.00tr", "AAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray5, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     A    44", strArray5);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.0", "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444");
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444444444444444444444444444444", strArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.endsWithAny("0.0010.0hi", strArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray17);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0" + "'", str9, "100.0");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0true-1.0097.0" + "'", str21, "0true-1.0097.0");
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a" + "'", str1, "4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a         a    0001                                                     a         a");
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" . 97 . 4444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " . 97 . " + "'", str2, " . 97 . ");
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aahI!aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aahI!aa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 61, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "                                                                                                                                      a         a         a         a         a      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444" + "'", str2, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("444444444444444444444444444", "#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 16L, 655.0d, (double) 850);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 850.0d + "'", double3 == 850.0d);
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00..", "  a    TRUETRUETRUET", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0");
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt" + "'", str1, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!hA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("    .         .                                                     1000    .         .         ", "0                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                       A                             ", 41);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4             ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", strArray4, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "att-------ttt-------ttt-------t");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa" + "'", str7, "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                ..", "444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", (int) (short) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ", "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hi4!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, (double) 3.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-1.0097.0", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1.0097.0" + "'", str3, "-1.0097.0");
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "                       A                             ", 136, 95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                       A                             " + "'", str4, "                       A                             ");
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444", 45, "...00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444");
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("A    ", "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444", 191, "###################    a   HI!HI!...#################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444");
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "true-1.0097.00true-1.0097.00true-1.0097.00trA0t", (java.lang.CharSequence) "    A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0aaaa", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        0aaaa         " + "'", str2, "        0aaaa         ");
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                     aaaa0aaaaa              ", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("        0aaaa         ", "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                                          ", "########################4444444444444444444444440TRUE-1.009...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        0aaaa         " + "'", str3, "        0aaaa         ");
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                    444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("          TRUE  ", 87, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA", 220);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 156);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0       000       00790       000       000       00-0       00eurt0       0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...t0444444444444444444444444444.....#...#4#a#", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "        hi!h4444404444hi!hi.a a a ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", "4444a44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A" + "'", str2, "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" 1aaaaaaaaaaa4444444...4444444...4444444...4  ", "aaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444444444a00a.a1a-atruea0", "       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444a00a.a1a-atruea0" + "'", str2, "4444444444444a00a.a1a-atruea0");
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 41, (float) 8L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A");
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaa", (double) 128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 128.0d + "'", double2 == 128.0d);
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       ", "                                                                                               100.0", 111);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...####################################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "0 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 000 000 00790 000 000 00-0 00eurt0 00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444444444444444444444444", "                     aaaa0aaaaa           ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("hi!hi!hi!", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444...79hi!hi!hi!hi!hi!hi!.1-EURThi!hi!hi!4444444444444444444444444444444444...444444444444444444444444" + "'", str4, "444444444444444444444444...79hi!hi!hi!hi!hi!hi!.1-EURThi!hi!hi!4444444444444444444444444444444444...444444444444444444444444");
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    a   HI!HI!                                                                                      ", "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 56.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.0d + "'", double2 == 56.0d);
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444...44444444444444444444444444444444", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.");
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h!ih!h!ih!", "44444444444444444440TRUE-1.0097.                    44444444444444444444444444      #a######################...##############################################      #a######################.", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("97.0", "aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0" + "'", str3, "97.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0aA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A4444497.0");
    }

    @Test
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "4444444..444444444444444440T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444..444444444444444440T" + "'", str2, "4444444..444444444444444440T");
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hI!################################", "AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!################################" + "'", str2, "hI!################################");
    }

    @Test
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ", "aaaa                                                     0.001                            A      A  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     0.001                            A      A  " + "'", str2, "                                                     0.001                            A      A  ");
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    ", "...44                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    " + "'", str2, "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    ");
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...t0444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...T0444444444444444444444444444..." + "'", str1, "...T0444444444444444444444444444...");
    }

    @Test
    public void test16754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16754");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444                                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "0true-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16756");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-" + "'", charSequence2, "...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-");
    }

    @Test
    public void test16757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16757");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "    A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "44444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test16758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16758");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16759");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaa.", "##############################################################################################################################################################################################################################################################################################################################################################################4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16760");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                ...", 123, 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16761");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                             A    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                ", "TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16764");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16765");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 95 + "'", int1 == 95);
    }

    @Test
    public void test16766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16766");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 14L, 138.0f, (float) 24);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 14.0f + "'", float3 == 14.0f);
    }

    @Test
    public void test16767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16767");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16768");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                            A    44", "4444a44444", 96);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "A A A A A");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                            A    44" + "'", str4, "                                                                                            A    44");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test16769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16769");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                          44444444444444444440true-1.0097." + "'", str2, "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.");
    }

    @Test
    public void test16771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ", "444...44444444444444444444444444444444440TRUE-1.0097...44                                        ", "444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444true444444444444444444444444444444444444444" + "'", str3, "44444444444true444444444444444444444444444444444444444");
    }

    @Test
    public void test16772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16772");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test16773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16773");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16774");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                               a                        44444444444444444444                        ...                        444444444444444444444444444444444444444444444", (double) 269);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 269.0d + "'", double2 == 269.0d);
    }

    @Test
    public void test16775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16775");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       ." + "'", str1, "444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
    }

    @Test
    public void test16776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16777");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                       a                             ###    a   HI!HI!...###    a   HI!HI!...###", 608);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16778");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", (java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("a0a0true-1.0AAAA", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                               " + "'", str6, "                                               ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test16779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16779");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                              ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test16780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             a     ", "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16781");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...            4444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16782");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       " + "'", str1, "                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ");
    }

    @Test
    public void test16783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16783");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     " + "'", str1, "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ");
    }

    @Test
    public void test16784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                         ...      ", "", 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         ...      " + "'", str3, "                                         ...      ");
    }

    @Test
    public void test16785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16786");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0a.a7900a.a1a-aeurta0#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...4444444444444444444444444444444444444444444444444hi!" + "'", str3, "4444444...4444444444444444444444444444444444444444444444444hi!");
    }

    @Test
    public void test16788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16788");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                             4444A44444                                                                                                                                                                                                                          ", 655, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16789");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("97...#############################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16790");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("HI", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "000", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                ...44444", "    aaaaa0aaaa                 ", "                                      100.0                                                AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test16792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16792");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 5, 55L, 113L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 113L + "'", long3 == 113L);
    }

    @Test
    public void test16793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                        ", 41);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16794");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4", (java.lang.CharSequence) "0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4" + "'", charSequence2, "...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4");
    }

    @Test
    public void test16795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16795");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaa", "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.0");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.044444444444444444444444444..." + "'", str1, "0true-1.0097.044444444444444444444444444...");
    }

    @Test
    public void test16797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16797");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0true-1.0097.0", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444", 4, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test16798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0" + "'", str3, "4444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta04444444444444444444444444444444444444444440a.a7900a.a1a-aeurta0");
    }

    @Test
    public void test16799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16799");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16800");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16802");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...aaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444", (int) (byte) -1, 445);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444" + "'", str4, "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test16803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444", "....4444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444");
    }

    @Test
    public void test16804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16804");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("00       000       000       00A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16805");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                                                                                                     aaaaa0aaaa                     ", (java.lang.CharSequence) "                                      100.0                                                     aaaa100100.0                                                     aaaa.100.0                                                     aaaa0100.0                                                     aaaa                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test16806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0097...", "0true-1.0097.044444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                            0aaa", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            0aaa" + "'", str2, "                                                            0aaa");
    }

    @Test
    public void test16808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "97 true-1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16809");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", (java.lang.CharSequence) "44444444444444444444444444444444444444444AAAAAAAAA...4444444   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", charSequence2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t");
    }

    @Test
    public void test16810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi4!", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi4!" + "'", str2, "Hi4!");
    }

    @Test
    public void test16811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0atruea-a1a.a00aaaa4444444444444", 224);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0atruea-a1a.a00aaaa4444444444444" + "'", str2, "0atruea-a1a.a00aaaa4444444444444");
    }

    @Test
    public void test16812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("true444...44444444444444444444444444444444440TRUE-1.0097...44                                                                                        ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true444...44444444444444444444444444444444440TRUE-1.0097...44" + "'", str2, "true444...44444444444444444444444444444444440TRUE-1.0097...44");
    }

    @Test
    public void test16813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16813");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444...44444444444444444444444444444444440TRUE-1.0097...44                                        ", ".");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("           A         A         A         A         A         A         A         A         A         A         A         A         A         A ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A ..." + "'", str1, "A         A         A         A         A         A         A         A         A         A         A         A         A         A ...");
    }

    @Test
    public void test16815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 48, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test16816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16816");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A0000000000");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test16817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16817");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("###0.001##", (float) 47);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 47.0f + "'", float2 == 47.0f);
    }

    @Test
    public void test16818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("100.0###", "aaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16819");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444true444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744");
    }

    @Test
    public void test16822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16822");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "TRUE97TRUE97", "                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16823");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(21, 891, 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 891 + "'", int3 == 891);
    }

    @Test
    public void test16824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16824");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 167 + "'", int2 == 167);
    }

    @Test
    public void test16825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                           true-1.97.                                                                                   ", "0true-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           true-1.97.                                                                                   " + "'", str2, "                                           true-1.97.                                                                                   ");
    }

    @Test
    public void test16826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16826");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "                 aaaa0aaaaa", "     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test16827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                " + "'", str3, "                                                ");
    }

    @Test
    public void test16829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...900.1-EURT04444444444444444444444444444444444444444444", 224);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...", "a4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16831");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                     aaaa0aaaaa           ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test16832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16832");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444...4444444444........444444444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16833");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4 ", "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                         ", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("079001-eurt0", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "079001-eurt0" + "'", str2, "079001-eurt0");
    }

    @Test
    public void test16835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16835");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A A A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A A A\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16836");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", "444444a4444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 570);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0true-1.0097.044444444444444444444444444 4", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt044444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16838");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4true-1.4497.4444444444444444444444444444", 99, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa4true-1.4497.4444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa4true-1.4497.4444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("              ", "    a   HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              " + "'", str2, "              ");
    }

    @Test
    public void test16840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444", "4444444444444444444444444444440T");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test16841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test16842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str1, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test16843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16843");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (java.lang.CharSequence) "...44444444444...                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", charSequence2, "..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test16844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16844");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("    4444444444444444444444444444   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    4444444444444444444444444444   \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0", 64, 817);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0" + "'", str3, "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0");
    }

    @Test
    public void test16846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16846");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test16847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test16848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0true-1.0097.00tr", "...097.00tr.0097.00tr.0097.00tr             ...", "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.00tr" + "'", str3, "0true-1.0097.00tr");
    }

    @Test
    public void test16849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("A A A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA" + "'", str2, "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA");
    }

    @Test
    public void test16852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16853");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test16854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444", "1aaaaaaaaaaa4444444...4444444...44...aaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444" + "'", str2, "    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test16855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16855");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test16856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16856");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444a444444444444444444444444", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        java.lang.String[] strArray8 = null;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444...4444444...4444444...4...", strArray7, strArray8);
        java.lang.String[] strArray10 = null;
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                ", strArray7, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                     a   hi!hi!...", strArray2, strArray10);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4444444...4444444...4444444...4..." + "'", str9, "4444444...4444444...4444444...4...");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                " + "'", str11, "                                                                                ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                     a   hi!hi!..." + "'", str12, "                                                                                     a   hi!hi!...");
    }

    @Test
    public void test16857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...1-eurt00.7900.1-eurt");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16858");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa4true-1.4497.4444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!hi!h!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                          ...####################################..", "...444444440tr...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          ...####################################.." + "'", str2, "                                                          ...####################################..");
    }

    @Test
    public void test16860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaa0aaaa0.7900.1-eurt04444444444444444...", 96, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16861");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444...44444444444444444444444444444444440TRUE-1.0097...44                                        ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097...44                                        " + "'", str2, "444...44444444444444444444444444444444440TRUE-1.0097...44                                        ");
    }

    @Test
    public void test16863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16863");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                           ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test16864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16864");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444A44444", "                                           ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444A44444" + "'", str3, "4444A44444");
    }

    @Test
    public void test16865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16865");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16866");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16867");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(667L, 62L, (long) 27);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 27L + "'", long3 == 27L);
    }

    @Test
    public void test16868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16868");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test16869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16869");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 191, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444...4444444...4...aaaaaa..." + "'", str3, "...44444...4444444...4...aaaaaa...");
    }

    @Test
    public void test16870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444a444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444a444444444444444444" + "'", str1, "444444a444444444444444444");
    }

    @Test
    public void test16871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16871");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test16872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16872");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16873");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                               ", "                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 546, "0true-1.0097.044444444444444444444444444 4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test16875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444");
    }

    @Test
    public void test16876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", "", "4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A" + "'", str3, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
    }

    @Test
    public void test16877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16877");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16878");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       " + "'", str2, "                       ");
    }

    @Test
    public void test16880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16880");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hi4!", "a00       000       000       00", 957);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16881");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0" + "'", str1, "Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
    }

    @Test
    public void test16882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("   4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   ", 253);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   " + "'", str2, "                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ");
    }

    @Test
    public void test16883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("11111111111111111111111111111111111111111", "00       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16884");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16885");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0444444444444444444444444444444444444444444", "       ", 25, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0444444444       444444444444444444" + "'", str4, "0444444444       444444444444444444");
    }

    @Test
    public void test16886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 149);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "444444444444444444444444444444444444444444444444444444444444E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test16887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16887");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(384, (int) '4', 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 384 + "'", int3 == 384);
    }

    @Test
    public void test16888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "a         a                                                     1000    a         a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a         a                                                     1000    a         a" + "'", str1, "a         a                                                     1000    a         a");
    }

    @Test
    public void test16889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16889");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".0097.00tr", "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97.                                                                                4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16890");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0true-1.0097.0444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0true-1.0097.0444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("100.0                                                     aaaa", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test16892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16892");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444", 24, 330);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16893");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("   4444444...AAAAAAAAA44444444444444444444444444444444444444444", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test16894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test16895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16895");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16896");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...........................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16897");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...aA4A4A4A444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test16899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16899");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt044444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16900");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0true-1.00###########################################################################################################################################################################################################################", "...                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16901");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "A A 1000 A A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a A 1000 A A" + "'", str1, "a A 1000 A A");
    }

    @Test
    public void test16902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###", "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###");
    }

    @Test
    public void test16903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...", "                          rue-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444...4444444...4444444...4", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...4444444...4444444...4" + "'", str2, "4444444...4444444...4444444...4");
    }

    @Test
    public void test16905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(".0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 665);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, ".0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test16906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...", "                                                      ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A     0true-1 0097 00true-1 0097 00true-1 0097 00tr" + "'", str3, "A     0true-1 0097 00true-1 0097 00true-1 0097 00tr");
    }

    @Test
    public void test16907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16907");
        long[] longArray1 = new long[] { 99L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[99]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
    }

    @Test
    public void test16908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(".0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0097.00tr" + "'", str1, ".0097.00tr");
    }

    @Test
    public void test16909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", 657);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###" + "'", str2, "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
    }

    @Test
    public void test16910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16910");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                       444...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16911");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                     AAAA0AAAAA           ", 14, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     AAAA0AAAAA           " + "'", str3, "                     AAAA0AAAAA           ");
    }

    @Test
    public void test16912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16912");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (int) (short) 100, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                ...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("4             ", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 156, 667);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 156");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test16914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", 2, 173);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ..." + "'", str3, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ...");
    }

    @Test
    public void test16915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16915");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A", "    A     ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "0true-1.0097.0", (int) ' ', (int) (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      ...                                                     ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16916");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(51, (int) '#', 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 84 + "'", int3 == 84);
    }

    @Test
    public void test16917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "    A     .7900.1-eurt0444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                   ", "                     aaaa0aaaaa                     #A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16919");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                     ...                                     ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16920");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16921");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                                                " + "'", str1, "...                                                                ");
    }

    @Test
    public void test16922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16922");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444440.7900.1-eurt0aaaa                                                     0.001", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test16923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                 4444a44444                  ", "                                        4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 4444a44444                  " + "'", str2, "                 4444a44444                  ");
    }

    @Test
    public void test16924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0true-1.0097.044444444444444444444444444444444444444444", "A00       000       000       0", "...t0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".true-1...97..44444444444444444444444444444444444444444" + "'", str3, ".true-1...97..44444444444444444444444444444444444444444");
    }

    @Test
    public void test16925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16925");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', 451, 4444444);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test16926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16926");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", 671);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16927");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                ", "44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test16928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A" + "'", str2, "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
    }

    @Test
    public void test16929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16929");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444...4444Aaaaaaaaa", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test16930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                      a                                                     ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      a                                                     " + "'", str2, "                                      a                                                     ");
    }

    @Test
    public void test16931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16931");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...0...", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A00       000       000       00", charArray14);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test16932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16933");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("IH  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16934");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", 28, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16935");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("rue-1.0097.00tr", 102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test16936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16936");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     a    ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4true-1.4497.4444444444444444444444444444", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test16937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test16938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16938");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16939");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                  aaaa", (long) 86);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 86L + "'", long2 == 86L);
    }

    @Test
    public void test16940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16940");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".............................................");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test16941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16941");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA                                        ", 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test16942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0", "Aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0" + "'", str2, "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0");
    }

    @Test
    public void test16943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16943");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", (int) 'a', "...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444444444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A" + "'", str3, "...44444444444444444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
    }

    @Test
    public void test16944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...aA4A4A4A444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "100.0#####100.0###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444" + "'", str3, "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444");
    }

    @Test
    public void test16945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16945");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A.7ee444ee44440.7ee444ee44440.7ee444ee44440.7e", (double) 665);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 665.0d + "'", double2 == 665.0d);
    }

    @Test
    public void test16946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16946");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("974", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16947");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 19, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test16948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444444444444444444444", "0true-1.0097...", "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444" + "'", str3, "44444444444444444444444444");
    }

    @Test
    public void test16949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16949");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...", 26);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 545);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                ");
    }

    @Test
    public void test16951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16951");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                 ", "..0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 444);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test16952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16952");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test16953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                      41004.404                                                ", "44444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test16955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("9744", "AE444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16956");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16957");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                          44444444444444444440true-1.009", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.00..");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16958");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a    ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str2, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
    }

    @Test
    public void test16960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0", "4true-1.4497.4444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0" + "'", str2, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0");
    }

    @Test
    public void test16961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("44444444444true444444444444444444444444444444444444444", "true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0true-10aaaa00970aaaa0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16963");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16964");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi", "                                ", 7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                         ...444444440tr...                                          ", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                         ...444444440tr...                                          " + "'", str9, "                                         ...444444440tr...                                          ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test16965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16965");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(546.0d, (double) 0.001f, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 546.0d + "'", double3 == 546.0d);
    }

    @Test
    public void test16966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0       000       00790       000       000       00-0       00eurt0       00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("100.0                                                     aaaa..", "a0aaaaa", "                                                                ..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0                                                     aaaa.." + "'", str3, "100.0                                                     aaaa..");
    }

    @Test
    public void test16969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16969");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444a4444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test16970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16970");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...aaaaaaaaaaaaaaaaaaaaaaaaaa", 55, "       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaa                          " + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaa                          ");
    }

    @Test
    public void test16971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16971");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", strArray5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test16972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16972");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16973");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0097.", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test16974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "                                                                                                AAAA", 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str3, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test16975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16975");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("##############################################################4true4-4449744########################################", "0       000       00790       000       000       00-0       00eurt0       00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                               ", "44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            " + "'", str1, "                            ");
    }

    @Test
    public void test16978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                     0", "                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     0" + "'", str2, "                                                                                     0");
    }

    @Test
    public void test16980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16980");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa", "A A 1000 A A", 502);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a4a4aaaaaaaaaaaaaaaaaaa4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.4....444444444tr...aaaaaaaaaaaaaaaaa" + "'", str5, "a4a4aaaaaaaaaaaaaaaaaaa4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.497.4TRUE-4.4....444444444tr...aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0097.00TR" + "'", str1, ".0097.00TR");
    }

    @Test
    public void test16982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16982");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16983");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "00.0                                                     aaaa0true-1.0097.044444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444440true-1.0097" + "'", str1, "44444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test16985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("100.0                                                     aaaa..", "4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0                                                     aaaa.." + "'", str2, "100.0                                                     aaaa..");
    }

    @Test
    public void test16987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16987");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ", (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test16988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16988");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444", 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test16989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0444...44444444444444444444444444444444440TRUE-1.0097...4", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0444...44444444444444444444444444444444440TRUE-1.0097...4 " + "'", str2, "0444...44444444444444444444444444444444440TRUE-1.0097...4 ");
    }

    @Test
    public void test16990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "a0aaaaa              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test16991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                           ", "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test16992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16992");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str3, "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test16993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16993");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0true-1.00-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test16994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16994");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                                                                                                                       ", "0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16996");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A    4");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test16997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16997");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0TRUE-1.0097.0", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".............................................", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4             ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("1", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test16999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                      ...                                                    ", "               ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      ...                                                    " + "'", str2, "                                      ...                                                    ");
    }

    @Test
    public void test17000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test17000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("a0aaaaa              ", " true-1.  97. ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0aaaaa              " + "'", str2, "a0aaaaa              ");
    }
}

