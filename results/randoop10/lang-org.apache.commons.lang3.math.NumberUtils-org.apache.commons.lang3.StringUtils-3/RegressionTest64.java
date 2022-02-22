import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest64 {

    public static boolean debug = false;

    @Test
    public void test32001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32001");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "true444...44444444444444444444444444444444440TRUE-1.0097...44", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                             444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "true444...44444444444444444444444444444444440TRUE-1.0097...44" + "'", charSequence2, "true444...44444444444444444444444444444444440TRUE-1.0097...44");
    }

    @Test
    public void test32002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32002");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("###################################    a   hi!hi!...######000###################################    a   hi!hi!...######");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test32003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", 550);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test32005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32005");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .", "   4444444...aaaaaaaaa44444444444444444444444444444444444444444", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32006");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 82, 236);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444440true-1.0097.444444444444444444444444", 22, 80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ue-1.0097.444444444444444444444444" + "'", str3, "ue-1.0097.444444444444444444444444");
    }

    @Test
    public void test32008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...         aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...         aaaa0aaaaa" + "'", str1, "...         aaaa0aaaaa");
    }

    @Test
    public void test32009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test32010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32010");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaa                                                                ...44444", 349);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444..." + "'", str1, "4444444444444444444444444444...");
    }

    @Test
    public void test32012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444...44444444444444444444444444444444440TRUE-1.0097...44                                        ", "########################################44444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097...44                                        " + "'", str2, "444...44444444444444444444444444444444440TRUE-1.0097...44                                        ");
    }

    @Test
    public void test32013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                   0true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.0444444444444444444444444444" + "'", str1, "0true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test32014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("   4444444...aaaaaaaaa44444444444444444444444444444444444444444", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   4444444...aaaaaaaaa44444444444444444444444444444444444444444" + "'", str2, "   4444444...aaaaaaaaa44444444444444444444444444444444444444444");
    }

    @Test
    public void test32015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4 ", "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I" + "'", str2, "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test32016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                   ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32017");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...aaaa...44444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32018");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444a0aaaaa       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444", 589);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test32019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...t0444444444444444444444444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...AAAAAAAAAAAAAAAAAAAAAAAAA                                 ", 545, 400);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAA                                 " + "'", str3, "...AAAAAAAAAAAAAAAAAAAAAAAAA                                 ");
    }

    @Test
    public void test32021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...A ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...A.." + "'", str1, "...A..");
    }

    @Test
    public void test32022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32022");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444 44444 4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("######...", 826);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                        ######...                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                        ######...                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test32024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32024");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test32025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32025");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                AAAA0AAAAA    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test32026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32026");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 127.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 127.0d + "'", double2 == 127.0d);
    }

    @Test
    public void test32027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                     ...                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32028");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("TRUE97TRUE97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE97TRUE97" + "'", str1, "TRUE97TRUE97");
    }

    @Test
    public void test32029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32029");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "                       A                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32030");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test32031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32031");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                     0         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 975 + "'", int2 == 975);
    }

    @Test
    public void test32032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32032");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", "444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44444444440.7900.1-EURT0", "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32034");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 167, (float) 44, (float) 123);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 167.0f + "'", float3 == 167.0f);
    }

    @Test
    public void test32035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32035");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444...", "4444444...");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny("4444A44444", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                                                                                                            ", strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test32036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 168);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                        ");
    }

    @Test
    public void test32037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".0097.00tr", "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".0097.00tr" + "'", str2, ".0097.00tr");
    }

    @Test
    public void test32038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa" + "'", str2, "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa");
    }

    @Test
    public void test32039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32039");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                            ###    A   hi!hi!.                                                                              ", "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa", 191);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                            ###    A   hi!hi!.                                                                              " + "'", str3, "                                                                            ###    A   hi!hi!.                                                                              ");
    }

    @Test
    public void test32040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32040");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "                                                97.0", 28);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32041");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("000", "44444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444", "...0TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.00TRUE-1.0", 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "000" + "'", str4, "000");
    }

    @Test
    public void test32042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32042");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("AAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444a4444", "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444a4444" + "'", str2, "44444a4444");
    }

    @Test
    public void test32044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test32045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32045");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4, (float) 72, (float) 444L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 444.0f + "'", float3 == 444.0f);
    }

    @Test
    public void test32046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32046");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAAAAAAAAAAAA                         ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test32047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test32048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                       a44444444444444444444...444444444444444444444444444444444444444444444", "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       a44444444444444444444...444444444444444444444444444444444444444444444" + "'", str2, "                       a44444444444444444444...444444444444444444444444444444444444444444444");
    }

    @Test
    public void test32049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4" + "'", str2, "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
    }

    @Test
    public void test32050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32050");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
    }

    @Test
    public void test32051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr" + "'", str2, "rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
    }

    @Test
    public void test32052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32052");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...aaaaaaaaaaaaaaa...", (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test32053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32053");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test32054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("    A     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test32055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32056");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("A A A A a", "A   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi...    AA   hi0hi0hi0hi0hi0hi0hi0hi0hi0hi.", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4 0true-1.0097.044444444444444444444444444", "...44444444444444444444444444444444440true-1.0097...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32058");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 279);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32059");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("##############################################################4true4-4449744########################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32060");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", 104, 243);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("     A    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     A    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "     A    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test32062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("00       0true00       0-00       000                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00       0true00       0-00       000                                                       " + "'", str1, "00       0true00       0-00       000                                                       ");
    }

    @Test
    public void test32063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!", "aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!" + "'", str2, "AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!");
    }

    @Test
    public void test32064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 35, 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaa");
    }

    @Test
    public void test32065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32065");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", 57);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', 53, 1);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", 57);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray6, strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 86);
        int int23 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444", strArray22);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("444                                      100.0                                                     aaaa444444444444444444444", strArray17, strArray22);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny("#######...#######...#######...#######...#######...#######...#######...#######...######           #######...#######...#######...#######...#######...#######...#######...#######...######   44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097#######...#######...#######...#######...#######...#######...#######...#######...######           #######...#######...#######...#######...#######...#######...#######...#######...######   ", strArray22);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str16, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "444                                      100.0                                                     aaaa444444444444444444444" + "'", str24, "444                                      100.0                                                     aaaa444444444444444444444");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test32066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32066");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test32067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32067");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("         000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...A ..", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...A .." + "'", str2, "...A ..");
    }

    @Test
    public void test32069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32069");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("       ...      a         a         a         a         a0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32070");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     aaaa      a         a         a         a         aaaaaa    ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR A 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     A    44", "a#a", 48);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32073");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AAAAAAA...00.7900.1-EURT00.79...AAAAAAA", 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32074");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i44444444444444444444444444444444444444444444TRUE-10497044444444444444444444444444444444444444444444 ", 817, 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test32076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32076");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", 403, 125);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str3, "...444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test32078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32078");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(368.0d, (double) 21.0f, 850.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 850.0d + "'", double3 == 850.0d);
    }

    @Test
    public void test32079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32079");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444a444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", ".79 .1-EURT44eurt", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test32081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32081");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test32082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32082");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##############################################################4true4-4449744########################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("AE444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AE444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0true-1.0A A A A                        a44444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0A A A A                        a44444..." + "'", str1, "0true-1.0A A A A                        a44444...");
    }

    @Test
    public void test32086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32087");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444 ! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44...7900.1-eurt04444444444444444444444444444444444...444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32088");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.", "###    a   HI!HI!..", 403);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00", "a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32091");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 546L, (float) 111, 123.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 546.0f + "'", float3 == 546.0f);
    }

    @Test
    public void test32092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "                100.0aaaa                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..", "######################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32094");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ", "a44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test32095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("4444a44444", "                     aaaaa0aaaa                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444a44444" + "'", str2, "4444a44444");
    }

    @Test
    public void test32096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32096");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "                                                                                                 ", (int) (short) 4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.0");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray12, strArray17);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...4444...", strArray8, strArray12);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.startsWithAny("A", strArray12);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                       A                             ", strArray4, strArray12);
        java.lang.Class<?> wildcardClass25 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str18, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "...4444..." + "'", str22, "...4444...");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                       A                             " + "'", str24, "                       A                             ");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test32097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32097");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 557);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32100");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                       true-1.00                                           true-1.97.                                                        ", "..0true-1.0097.00true-1.0097.00true-1.0097.00tr", 181);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32101");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.044", "444444444444444440true-1.0097...a0aaaaa0true-1.0097.0444100.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...                 ", "444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test32103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444a44444                                                                                                                                                                                                                          ", 445, 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44a44444                       ..." + "'", str3, "...44a44444                       ...");
    }

    @Test
    public void test32104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32105");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32106");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                 !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                 !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                 !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test32108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32108");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32109");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".....4444444444444444444444444444...4444444444...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test32110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32110");
        java.lang.Object[] objArray1 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concatWith("...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ", objArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("97.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32112");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test32113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32113");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32114");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32115");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.00", 138);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A     0true-1.0097.00true-1.0097.00true-1.0097.00tr\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32117");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                               0aaa                        ", 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32118");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("   A         ", "     A44444      Aaaaaaaaaaa4444444...4444444...4444444...4", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("TRUE-1.0097.0", "                                      41004.404                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1.0097.0" + "'", str2, "TRUE-1.0097.0");
    }

    @Test
    public void test32120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", 744);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test32121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test32122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...44444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444..." + "'", str1, "...44444444444...");
    }

    @Test
    public void test32123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32123");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("       true-1.97.                                                                                   ", (float) 94L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 94.0f + "'", float2 == 94.0f);
    }

    @Test
    public void test32124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("true-1.0097.00true-1.0097.00tr", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.0097.00true-1.0097.00tr" + "'", str2, "true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test32125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32127");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("TRUE-1.  97.", (float) 167L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 167.0f + "'", float2 == 167.0f);
    }

    @Test
    public void test32128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Aa00aa000aa000aa00", "4444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aa00aa000aa000aa00" + "'", str2, "Aa00aa000aa000aa00");
    }

    @Test
    public void test32129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32129");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("            1000    a         a", (float) 585);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 585.0f + "'", float2 == 585.0f);
    }

    @Test
    public void test32130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "##100.0###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32131");
        int[] intArray5 = new int[] { 57, 267, (byte) -1, 9, 5 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[57, 267, -1, 9, 5]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 267 + "'", int10 == 267);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 267 + "'", int11 == 267);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 267 + "'", int12 == 267);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 267 + "'", int14 == 267);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 267 + "'", int15 == 267);
    }

    @Test
    public void test32132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32132");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test32133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a HI!HI!HI!HI!HI!HI!H" + "'", str1, "a HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test32134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("... aaaaa0aaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaa0aaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... aaaaa0aaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaa0aaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....." + "'", str1, "... aaaaa0aaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... aaaaa0aaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.....");
    }

    @Test
    public void test32135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr", 967);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr" + "'", str2, "tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
    }

    @Test
    public void test32137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32137");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".44444444444444444444444444444444A    4", "                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...00.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444...", "4444444444444444444444444444440T                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444..." + "'", str2, "...00.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444...");
    }

    @Test
    public void test32139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32139");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("    1000    .         .             1000    .         .          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32140");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA ", "                       a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A         A                                                     1000    A         A", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A         A                                                     1000    A         A" + "'", str3, "A         A                                                     1000    A         A");
    }

    @Test
    public void test32142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32142");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 444444444444444444444444444444444444444444444    A     .79  .1-eurt 4444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                              a                        A A A A                                                                 ", "                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           a                        A A A A                                                                 " + "'", str2, "                                           a                        A A A A                                                                 ");
    }

    @Test
    public void test32144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32144");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("...4444...", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "7900.1-EURT0");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  " + "'", str6, "  ");
    }

    @Test
    public void test32145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32145");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                                         a44444a444444a444444444444444444a44444a                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a44444a444444a444444444444444444a44444a" + "'", str1, "a44444a444444a444444444444444444a44444a");
    }

    @Test
    public void test32146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444444444444444444444444444444444444444444444444444444444444E-1.0         0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "..44440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444HI HI HI HI HI HI HI HI HI HI...4444a44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32147");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 62.0f, (double) 27L, (double) 60);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.0d + "'", double3 == 27.0d);
    }

    @Test
    public void test32148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32148");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "TRUETRUE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32150");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 625.0f, (double) 43L, 99.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 625.0d + "'", double3 == 625.0d);
    }

    @Test
    public void test32151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32151");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             " + "'", str1, "                                             ");
    }

    @Test
    public void test32152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa..", 32, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa.." + "'", str3, "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa..");
    }

    @Test
    public void test32153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a" + "'", str1, "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a");
    }

    @Test
    public void test32154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32154");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                aaaa", (java.lang.CharSequence) "                                                                                                                                                                             Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 344 + "'", int2 == 344);
    }

    @Test
    public void test32155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0AAA", "4 0true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0AAA" + "'", str2, "0AAA");
    }

    @Test
    public void test32156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("      ", "0true-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
    }

    @Test
    public void test32157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32157");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################Ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 578 + "'", int2 == 578);
    }

    @Test
    public void test32158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32158");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a4true4-44497                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test32159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32159");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!..", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...##########hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h#####################...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32161");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("            A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", 253);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32162");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaaa00       000       000       00aa  A      A                            100.0                                                     aaaa", 59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32163");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32164");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                          ", "0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00t", 4444444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32165");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("    A         A                                                     1000    A         A         ", "                                                                             A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A ...A                                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test32166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("        A                             ", "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        A                             " + "'", str2, "        A                             ");
    }

    @Test
    public void test32167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32167");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "TRUE97TRUE9", 132, 479);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32169");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                            0aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("true-1.  97.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1.  97.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32172");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444                                      100.0                                                     aaaa444444444444444444444", "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("444", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test32173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32173");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0       000       000       00Aurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32174");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .", "                                       4true4-4449744                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32175");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0true-1.0097.044444444444444444444444444..", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32176");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("A0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh###############################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("##100.0###44444444444.0097.00true-1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##100.0###44444444444.0097.00true-1.0" + "'", str1, "##100.0###44444444444.0097.00true-1.0");
    }

    @Test
    public void test32180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32180");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                           A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......                                                                            ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32181");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                                                                        100.444444444444444440true-1.0097...444444444444444444444444                                     ", "                                                            0         aaa                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32182");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A", 826, 9);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test32183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("A0", 119, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################A0###########################################################" + "'", str3, "##########################################################A0###########################################################");
    }

    @Test
    public void test32184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32184");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("44...7900.1-eurt04444444444444444444444444444444444...444", "0true-1.0097.", 13, 80);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44...7900.1-e0true-1.0097." + "'", str4, "44...7900.1-e0true-1.0097.");
    }

    @Test
    public void test32185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test32186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32186");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                      100.0                                                AAAAAAAAAAAAAAAAAA", "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444000true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test32187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32187");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 250);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32188");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 98, 22);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4                                                   " + "'", str3, "4                                                   ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test32189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0TRUE-1.0097.00TRUE-1....0true-1.0097...", "AAAAAAA...00.7900.1-EURT00.79...AAAAAAA", "    A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
    }

    @Test
    public void test32190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32190");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      100.0                                                     ", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      100.0                                                     " + "'", str3, "                                      100.0                                                     ");
    }

    @Test
    public void test32191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI." + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A         A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.");
    }

    @Test
    public void test32192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32192");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test32193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32194");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", 551);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test32196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32196");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    " + "'", str3, "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                                                                    ");
    }

    @Test
    public void test32197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32197");
        char[] charArray9 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                  aaaa0                                                                                                                                  ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test32198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32198");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                        ", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                " + "'", str4, "                                                ");
    }

    @Test
    public void test32199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32199");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479", (java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479" + "'", charSequence2, "4A4 4rt4004.47                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444A4 4rt4004.479");
    }

    @Test
    public void test32200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32200");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test32201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32201");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32202");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("0       00", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test32203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test32204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32204");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) " 1aaaaaaaaaaa4444444...4444444...4444444...4  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444", 403, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444####################################################################################################################################################################################" + "'", str3, "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444####################################################################################################################################################################################");
    }

    @Test
    public void test32206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097", "44444444444444444444444444444444444444444444444444444444444444444444444!", 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097" + "'", str3, "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097");
    }

    @Test
    public void test32207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32207");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rue-1.0097.0", "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 224);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                     aaaa0aaaaa              ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("0444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...4444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...44444444444444444444444444444444444444444440444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...444444444", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 13 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                     aaaaaa0aaaaaaa              " + "'", str9, "                     aaaaaa0aaaaaaa              ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test32208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32208");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 277);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 277 + "'", int2 == 277);
    }

    @Test
    public void test32209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32209");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", "                                                                                                aaaa");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray10, strArray13);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     A    44", strArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("                                         AAAA0AAAA", strArray5, strArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", strArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.concatWith("...t0444444444444444444444444444.....#...#...", (java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                         AAAA0AAAA" + "'", str18, "                                         AAAA0AAAA");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444" + "'", str20, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
    }

    @Test
    public void test32210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32210");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh", "a0aaaaa", 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097" + "'", str1, "44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test32212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32212");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
    }

    @Test
    public void test32213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32213");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test32214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32214");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", "a...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32215");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444" + "'", str2, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
    }

    @Test
    public void test32216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32216");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(".0097.00true-1.00", 30, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".0097.00true-1.00" + "'", str3, ".0097.00true-1.00");
    }

    @Test
    public void test32217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32217");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0true-1.00                           aaaa0aaaaa                                             aaaa0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test32219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...", "                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                        ", "...!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        " + "'", str2, "                                        ");
    }

    @Test
    public void test32221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32221");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("           ", "                     aaaa0aaaaa                     ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 550);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("...                                                                                              0aaaa                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...                                                                                              0aaaa                                                                                                                                  \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32224");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                    0.001                                                            44444444444444444440true-1.0097.", 58L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 58L + "'", long2 == 58L);
    }

    @Test
    public void test32225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test32226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("00aaaaaaaaaaaaa...", "   44444AAAAAAAAAAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32227");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                           a                        A A A A                                                                 ", (java.lang.CharSequence) "...44444...true-1.4444444...97.4444444...4444444444444...4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32228");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".7900.1-eurt04444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt0444444444444444444444444444444444444444444444A", "Ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444..." + "'", str1, "...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444...");
    }

    @Test
    public void test32230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32230");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ", "0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0       000       00790       000       000       00-0       00eurt0       00", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0       000       00790       000       000       00-0       00eurt0       00" + "'", str2, "0       000       00790       000       000       00-0       00eurt0       00");
    }

    @Test
    public void test32232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("   !    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   !    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32234");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                 0aaa                           ", "                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test32235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32235");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("     Ahi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaaaAhi!hi!hi!haaaaaaaaaaaaaaA44444aaaaaaaaaaaaaaaaaaaaaaaa    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32236");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a" + "'", str1, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a");
    }

    @Test
    public void test32237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("A         A", 16, 623);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...####################################..", "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test32239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32239");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                           aaaa0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", 895);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 895 + "'", int2 == 895);
    }

    @Test
    public void test32240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32240");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                   rt00.7900.                   ", 842);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test32243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32243");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray5, strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray5);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "##100.0###");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.endsWithAny(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("4", strArray5, strArray19);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, 'a');
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", 441, 93);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str11, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4" + "'", str22, "4");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4444444" + "'", str24, "4444444");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4444444" + "'", str26, "4444444");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test32244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32244");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test32245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32246");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                               100.0                                                ", (int) (short) 100);
        java.lang.String[] strArray11 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray11, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                            100.0", strArray4, strArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '4', 544, (int) ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str14, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                            100.0" + "'", str15, "                                            100.0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test32247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32247");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test32248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32248");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "44444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32249");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          ", "TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("1aaaaaaaaaaa4444444...4444444...44...aaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...44", "44444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444..." + "'", str2, "44444444444444444444...");
    }

    @Test
    public void test32251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32251");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "0", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 4444444, 42);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444" + "'", str5, "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4444444444444444444444444444444444444444444RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  Etrue-1.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E97.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E4444444444444444444444444444444444444444444" + "'", str13, "4444444444444444444444444444444444444444444RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  Etrue-1.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E97.RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E4444444444444444444444444444444444444444444");
    }

    @Test
    public void test32252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32252");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...44444444444444444444444444444444440TRUE-    A     ...A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", "A ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444" + "'", str2, "                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test32254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32254");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "               true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32255");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 44, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test32256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32256");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, 27, 721);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 721 + "'", int3 == 721);
    }

    @Test
    public void test32257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32257");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                        ", 146);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ", "0TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA444444444", "a###ahi!hi!...###ahi!hi!...###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 " + "'", str3, " rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ");
    }

    @Test
    public void test32259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0       00", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32260");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444440T", "44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32261");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("                                                                                                 ", "...00.7900.1-eurt00.7900.1-eurt0", 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                aaaa", "                                            100.0");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("97.0", strArray9, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97.0" + "'", str13, "97.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 201 + "'", int15 == 201);
    }

    @Test
    public void test32262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("     A    ", "    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444", 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     A    " + "'", str3, "     A    ");
    }

    @Test
    public void test32263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaa" + "'", str1, "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaa");
    }

    @Test
    public void test32264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444true-1.00                                           true-1.97.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("True444...444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444", "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "True444...444444444444444444444" + "'", str3, "True444...444444444444444444444");
    }

    @Test
    public void test32266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32266");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0TRUE-1.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32267");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test32268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32268");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32269");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...aaaa...44444444444444444", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32270");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444aHI!HI!..");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test32271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) ".. A         A         A         A         A         A         A         A         A         A         A         A         A         A           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32272");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                    00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32273");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test32274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...AAAAAAAAAAAAAAAAAAAAAAAAA                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "...AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test32275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32275");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "444444444444444444444444...7900.1-eurt044444444444444444", 91);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test32276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32276");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444" + "'", str1, "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444");
    }

    @Test
    public void test32277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.", 31, 224);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.     A    aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "          ###    a   HI!HI!.           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32280");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("40true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444...4444444444........44444444444", 721);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444...4444444444........44444444444" + "'", str2, "444444444...4444444444........44444444444");
    }

    @Test
    public void test32282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                    ", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test32283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32283");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test32284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...44444444444...                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444..." + "'", str1, "...44444444444...");
    }

    @Test
    public void test32285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32285");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       A                       A                      ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test32286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32286");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 83.0f, 69.0d, (double) 444440444L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 69.0d + "'", double3 == 69.0d);
    }

    @Test
    public void test32287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32287");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA", "0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", 671, 368);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444" + "'", str4, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!hi!h!hi!hA0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444");
    }

    @Test
    public void test32288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32291");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                               0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "  A      A                            100.0                                                     aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test32293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", "44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 149);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str3, "                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test32294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0");
    }

    @Test
    public void test32295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32295");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A        ", "0true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 232);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "...........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test32297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......" + "'", str1, "A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......");
    }

    @Test
    public void test32298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...4...4444444...4444444...4444444                                                                                                                          0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4...4444444...4444444...4444444                                                                                                                          0" + "'", str2, "...4...4444444...4444444...4444444                                                                                                                          0");
    }

    @Test
    public void test32299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32299");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("true - 97", "         a                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32300");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a004444444000444444400044444440", 113);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 113 + "'", int2 == 113);
    }

    @Test
    public void test32301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32301");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", "4444444444444444444...44444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                    ", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test32303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("IH  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: IH   is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    ", "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    " + "'", str2, "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    ");
    }

    @Test
    public void test32305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32305");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                         0", "4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32306");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                  ", "           aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32308");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
    }

    @Test
    public void test32309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                            000                        ", "", "###################################    a   HI!HI!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            000                        " + "'", str3, "                                            000                        ");
    }

    @Test
    public void test32310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32310");
        char[] charArray13 = new char[] { '4', '4', ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444444444444444444444", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "              ", charArray13);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "TRUE97TRUE97", charArray13);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("         000", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43 + "'", int18 == 43);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test32311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32312");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", 655, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
    }

    @Test
    public void test32313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32313");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("true                 ...                                                                      ...                                                                      ...                                                                      ...                            44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32314");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444", "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ", "0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...44444444444444444444444444444444440true-1.0097...44444" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000...44444444444444444444444444444444440true-1.0097...44444");
    }

    @Test
    public void test32315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...e-1.0097.00true-1.0097.00trA0t", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...e-1.0097.00true-1.0097.00trA0t" + "'", str2, "...e-1.0097.00true-1.0097.00trA0t");
    }

    @Test
    public void test32316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32316");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0tr" + "'", str1, "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaaaaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0tr");
    }

    @Test
    public void test32317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a                             ###    a   HI!HI!...###    a   HI!HI!...###", 68, "                                                                                             100.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a                             ###    a   HI!HI!...###    a   HI!HI!...###" + "'", str3, "a                             ###    a   HI!HI!...###    a   HI!HI!...###");
    }

    @Test
    public void test32318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32318");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "########################################################################################################################################################################################################################################################################################################################################################################TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR########################################################################################################################################################################################################################################################################################################################################################################", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32319");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaa0aaaaaaaaaaaaa444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa0aaaaaaaaaaaaa444444..." + "'", str1, "aaaaaa0aaaaaaaaaaaaa444444...");
    }

    @Test
    public void test32320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32320");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0true-1.0097.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test32321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32321");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 135);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32322");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test32323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32323");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     aaaa0aaaaa                     ", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "444444444...");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "44444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaa0aaaaaaaaaaaaa444444...", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                               TRUE  ", strArray4, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 67");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                     aaaa0aaaaa                     " + "'", str6, "                     aaaa0aaaaa                     ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test32324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32324");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 51, (double) 250L, (double) 551);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 51.0d + "'", double3 == 51.0d);
    }

    @Test
    public void test32325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32325");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444", ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test32326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......", 159, "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0T");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0TaaaaaaaaaaaaaaaaaaaA   hi!hi!h" + "'", str3, "aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0TaaaaaaaaaaaaaaaaaaaA   hi!hi!h");
    }

    @Test
    public void test32327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0true-1.0097.0444444444444444444", "                           aaaa0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.0097.0444444444444444444" + "'", str2, "true-1.0097.0444444444444444444");
    }

    @Test
    public void test32328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32329");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("...00.7900.1-eurt00.79......aaa", 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test32330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32330");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444", 400, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaa", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                 ..." + "'", str2, "                                                                                 ...");
    }

    @Test
    public void test32333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH" + "'", str2, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
    }

    @Test
    public void test32334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32334");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32335");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test32336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                      ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                      " + "'", str3, "ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                      ");
    }

    @Test
    public void test32337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32337");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444440true-1.0097...444444444444444444444444                                                                                        100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test32338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32338");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", "444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32339");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444440true-1.0097...a0aaaaa              0true-1.0097.0444                                                            100.0", "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444a44444                                                                                                                                           ", "                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!.." + "'", str3, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..");
    }

    @Test
    public void test32342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("97.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97.00true-1.0097.0" + "'", str2, "97.00true-1.0097.0");
    }

    @Test
    public void test32343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAA", 589, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAA0AAAA" + "'", str3, "...AAAA0AAAA");
    }

    @Test
    public void test32344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32344");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 2, 62L, (long) 119);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 119L + "'", long3 == 119L);
    }

    @Test
    public void test32345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32345");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0true-1.0097.044444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test32346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                          ...####################################..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32347");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("    A", 201);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32348");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(41.0d, (double) 187, (double) 12L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 187.0d + "'", double3 == 187.0d);
    }

    @Test
    public void test32349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32349");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0aaaaa4a4A4A4A4A", "AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32350");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "44444444444444444444444444444444444444444440true-1.0097.", 93);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..", (int) (short) 10, 329);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test32351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32351");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("    aaaaa0aaaa                 ", (float) 69);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 69.0f + "'", float2 == 69.0f);
    }

    @Test
    public void test32352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32352");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0444...44444444444444444444444444444444440TRUE-1.0097...4", "0true-1.00                                           true-1.97.                                                                                   ", 65);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test32353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32354");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                              0097..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32355");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                           aaaa0aaaaa                  4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                      0true-1.00                           aaaa0aaaaa                                             aaaa0a                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa", 625);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa" + "'", str2, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa");
    }

    @Test
    public void test32359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32359");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".0097.00true-1.000true-1.0                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A");
    }

    @Test
    public void test32361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32361");
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("aaaa0aaaaa", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                         ...                                                    ", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...40true-1.0097.04444444444444444444444444444444444...", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 41 + "'", int19 == 41);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test32362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32362");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 252, 655L, (long) 153);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 655L + "'", long3 == 655L);
    }

    @Test
    public void test32363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32363");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0444444444       44444A   hi!hi!0444444444       44444", "a a a a a", 667, 840);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0444444444       44444A   hi!hi!0444444444       44444a a a a a" + "'", str4, "0444444444       44444A   hi!hi!0444444444       44444a a a a a");
    }

    @Test
    public void test32364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32364");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               ", "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               " + "'", str2, "                              ...44444...true-1.4444444...97.4444444...4444444444444...4                               ");
    }

    @Test
    public void test32366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32366");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...                          ...", "A A A ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-", "ue-1.0097...444444444444444444444444########################################################################################100.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ue-1.0097...444444444444444444444444########################################################################################100." + "'", str2, "ue-1.0097...444444444444444444444444########################################################################################100.");
    }

    @Test
    public void test32368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32368");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32369");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(97, 256, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test32370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "4444################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32371");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                      100.0                                                ", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test32372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32372");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0TRUE-1.0097.04444444444444444444444444440AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32373");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...40000true-1.0097...", "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0..." + "'", str1, "aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...");
    }

    @Test
    public void test32375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32375");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32376");
        short[] shortArray6 = new short[] { (short) 100, (byte) 100, (byte) 100, (short) 100, (byte) 100, (short) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 100, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
    }

    @Test
    public void test32377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32377");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                 aaaa0aaaaa    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32378");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...4444...", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                         a44444a444444a444444444444444444a44444a                                                                                                                                                                                                                                                                          ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test32379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32379");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(104, 4444444, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4444444 + "'", int3 == 4444444);
    }

    @Test
    public void test32380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32380");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", "4444.444444444.4444444444444444444444444444444444444444444444444444410004444.444444444.444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32381");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.0097.00true-1.0097.00true-1.0097.00tr Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0", "A      A                            100.0                                                     AAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32382");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32383");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...AAAAAAAAAAAAAAAAAAAAAAAAA                                 ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32384");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "...4444...44....t..4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str2, "0true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test32386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a0aaaaa##############0true-1.0097.0444", "     A    44444444444444444444444444444444444444444440true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0aaaaa##############0true-1.0097.0444" + "'", str2, "a0aaaaa##############0true-1.0097.0444");
    }

    @Test
    public void test32387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32387");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444...44444444444444444444444444444444440TRUE-1.0097...44", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32388");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0097.0                       a                    ", "4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444#true#-#1#.#97#.#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444#true#-#1#.#97#.#4444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32389");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                          ###################################################", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 551);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("-1.0097.0", "0ATRUEA-A1A.A0097A.A0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0097.0" + "'", str2, "-1.0097.0");
    }

    @Test
    public void test32391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32391");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                         ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test32392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", ".0097.00TRUE-1.0097.00TRUE-1.0097.00TR                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test32393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32393");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                 I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HII!HI!HI!HI!HI!HI!HI!HI!HI", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                   ", "                                      41004.404                                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32395");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "                                                            0aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32396");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("    a   HI!HI!", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32397");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32398");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test32399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32399");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 175.0f, (double) 12L, (double) 424L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test32400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...44444...4444444...4...AAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444...4444444...4...AAAAAA..." + "'", str1, "...44444...4444444...4...AAAAAA...");
    }

    @Test
    public void test32401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32401");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test32402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32402");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32403");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(".0097.00true-1.0097.00trA0t...", "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 187);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32404");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097" + "'", str3, "44444444444444444444444444444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097");
    }

    @Test
    public void test32405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32405");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 534, 615);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test32406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32407");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaa   ", "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0", 645);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...                   ", "0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", "44444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test32410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32410");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", (double) 5.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test32411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32411");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...         aaaa0aaaaa", "...T0444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...........#######################################################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...........#######################################################################################" + "'", str2, "...........#######################################################################################");
    }

    @Test
    public void test32413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32413");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32414");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE", (java.lang.CharSequence) "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32415");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444", "...444444440tr...", 267);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444", 92);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 9 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test32416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32416");
        long[] longArray2 = new long[] { (byte) 100, 12 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 12]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test32417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32417");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32418");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44444444444444444444444444444444444444444444444444444444                                                                                                                   0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test32419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32419");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test32420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", 833);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test32421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32421");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444444aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444aaaaaaaaaaaaaaaaaa" + "'", str1, "4444444444444444444aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32422");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "", "A   ", 44);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str4, "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test32423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32423");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32425");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("079001-eurt0", 138, 668);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "079001-eurt0" + "'", str3, "079001-eurt0");
    }

    @Test
    public void test32426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32426");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.044444444444444444444444444...");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32427");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################", ".0097.00TR");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32428");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444440TRUE-1.0097.", "                                                           0 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("100.0###", "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...      aaaa0a");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaa0aaaaaaaaa0a", "aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaaTR4444A44444aTRUE-aaaa97aaaTRUE-aaaa97aaaTRUE-aaaa97aaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                         aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test32432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32432");
        char[] charArray10 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444E-1.0         0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0444...44444444444444444444444444444444440TRUE-1.0097...4 ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0444444444       44444A   hi!hi!0444444444       44444a a a a a", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test32433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32433");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("###0.001##", "                                                                                                                                                                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32435");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("A0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32436");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 47L, 0.0f, (float) 168);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 168.0f + "'", float3 == 168.0f);
    }

    @Test
    public void test32437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32437");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(4.4444444444444444E52d, (double) 138, (double) 4.4444443E13f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444444444444444E52d + "'", double3 == 4.4444444444444444E52d);
    }

    @Test
    public void test32438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32438");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) " 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "                                                                                                                   0true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32439");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AAAAA", ".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444440097...#############################################################################################", 615, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444440097...#############################################################################################" + "'", str3, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444440097...#############################################################################################");
    }

    @Test
    public void test32441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444..." + "'", str1, "aaaaa0aaaa0.7900.1-eurt04444444444444444...");
    }

    @Test
    public void test32442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32442");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0                                                                                                                                                                                                                                                                         ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                                                                                        004444444000444444400044444440011                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "004444444000444444400044444440011" + "'", str1, "004444444000444444400044444440011");
    }

    @Test
    public void test32444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               A A 0001 A a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("a44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", "hhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh", "                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444" + "'", str3, " 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444");
    }

    @Test
    public void test32446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32446");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0", (double) 132);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 132.0d + "'", double2 == 132.0d);
    }

    @Test
    public void test32447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32447");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0000000000", "##########################################################A0###########################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0true-1.0097.0444444444444444444444444444444444444444444", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.0444444444444444444444444444444444444444444" + "'", str3, "0true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test32449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test32450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32450");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32451");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(479, (-1), 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32452");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ", "00       0true00       0-00       000                                                        ", "7900.1-EURT0", 615);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     " + "'", str4, "HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ");
    }

    @Test
    public void test32453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32453");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(87, 127, 368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test32454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32454");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                       a44444444444444444444...444444444444444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "-1.0097.04444444444444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test32455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32455");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32457");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444...444444           AAAAAAAAAAA", "          TRUE  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 aaaa0aaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test32459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32460");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test32461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32461");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A A A A", "                                     4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 191);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test32462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32462");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                       a                   TRUE-1.0097.0                       a                    ", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test32463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32463");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 578);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 578 + "'", int2 == 578);
    }

    @Test
    public void test32464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32464");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test32465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                   ", "44444444444444444444444444444444440true-140097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   " + "'", str2, "                                                   ");
    }

    @Test
    public void test32466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...4444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...44444444444444444444444444444444444444444440444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... ...true-1. ...97. ... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ..." + "'", str4, "0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... ...true-1. ...97. ... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ...");
    }

    @Test
    public void test32467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32468");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "true44TRUE-1.  97.", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4479", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test32469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32469");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("7.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test32471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                       a44444444444444444444...4444                       a44444444444444444444...444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       A44444444444444444444...4444                       A44444444444444444444...444" + "'", str1, "                       A44444444444444444444...4444                       A44444444444444444444...444");
    }

    @Test
    public void test32472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097 0", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test32473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", 33, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa" + "'", str3, "aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa");
    }

    @Test
    public void test32474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32474");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Aa00aa000aa000aa00", "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32475");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...", "7900.1-eurt0444100.0", "                                                                                                       !HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test32476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("00       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       0", "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       0" + "'", str2, "00       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       000       0true00       0-00       000       000       09700       000       0");
    }

    @Test
    public void test32477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32479");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aa...", (java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1.97.4444444444444444444444444444444444444444444" + "'", str3, "true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test32480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00" + "'", str1, "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00");
    }

    @Test
    public void test32481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test32482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32482");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray6, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray6);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray18, "##100.0###");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray20);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.endsWithAny(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("4", strArray6, strArray20);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "444...44444444444444444444444444444444440TRUE-1.0097...44");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", strArray6, strArray26);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray26);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray26);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray26);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray26, '#', 623, 6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str12, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4" + "'", str23, "4");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str27, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str28, "A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test32483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!hi!hi......i!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi......i!h" + "'", str1, "!hi!hi......i!h");
    }

    @Test
    public void test32484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                     aaaa0aaaaa           ", "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32485");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("             aaaa0aaaaa    ", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                 ", (java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                              0                     " + "'", str5, "                              0                     ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    " + "'", str6, "             aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa0aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa    ");
    }

    @Test
    public void test32486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...000     ...                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...000     ..." + "'", str1, "...000     ...");
    }

    @Test
    public void test32488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32488");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test32489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32489");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", "                                                                                                                                                                                                                                                                                                                                                                                                                 !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH                                                                                                                                                                                                                                                                                                                                                                                                                 ", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test32490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32490");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("0aaaa", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0aaa", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test32491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32491");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" rteurt  rteurt                                                                                     ", "...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32492");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(237, 144, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test32493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32493");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                              4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa                                                                                               ", 585);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test32494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32494");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                          100.0                                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00tr A", "                                                                                     4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ", 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                          100.0                                                " + "'", str4, "                          100.0                                                ");
    }

    @Test
    public void test32495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAA0AAAAA", "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test32496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A" + "'", str1, "a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A");
    }

    @Test
    public void test32497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("           aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa           ", 655);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                   aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                   aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test32498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32498");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "true-1.       ...97aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest64.test32500");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!...    a   hi!hi!......7900.1-eurt0", 444.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 444.0d + "'", double2 == 444.0d);
    }
}

