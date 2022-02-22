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
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAA", 57, "A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009" + "'", str3, "A 0true-1.0097.00true-1.00AAAAA 0true-1.0097.00true-1.009");
    }

    @Test
    public void test35502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", "#a######################...##############################################", "         .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444" + "'", str3, "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444");
    }

    @Test
    public void test35503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35503");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr", "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H", 150);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35504");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                          ##100.0###                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test35506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35506");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                         ...444444440tr...                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35507");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      100.0                                                AAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                             9EURT79EURT                                                                                                                                                                                                                                                                                                                             ", 441);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35509");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35510");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...", "44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("true-1.00true-1.97.", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1.00true-1.97." + "'", str3, "true-1.00true-1.97.");
    }

    @Test
    public void test35512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444440true-1.0097." + "'", str1, "4444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test35513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi", (int) (short) 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0true-1009700true-1009700true-1009700true-1009700true-1009700true-1009700true-100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1009700true-1009700true-1009700true-1009700true-1009700true-1009700true-100" + "'", str1, "0true-1009700true-1009700true-1009700true-1009700true-1009700true-1009700true-100");
    }

    @Test
    public void test35516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                  0aaaa                                                                  4ue-1.0097...444444444444444444444444########################################################################################100.44                                                                                                                                  0aaaa                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                  0aaaa                                                                  4ue-1.0097...444444444444444444444444########################################################################################100.44                                                                                                                                  0aaaa                                                                   " + "'", str1, "                                                                                                                                  0aaaa                                                                  4ue-1.0097...444444444444444444444444########################################################################################100.44                                                                                                                                  0aaaa                                                                   ");
    }

    @Test
    public void test35517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35517");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 156 + "'", int1 == 156);
    }

    @Test
    public void test35518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "                                                                                                                                  0aaaa                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test35519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444440true-1.0097", "44444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35520");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 17L, (double) 664, (double) 4.4444443E13f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444443213824E13d + "'", double3 == 4.4444443213824E13d);
    }

    @Test
    public void test35521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                 A A A A                        a                                                                                              ", "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 A A A A                        a                                                                                              " + "'", str2, "                                                                 A A A A                        a                                                                                              ");
    }

    @Test
    public void test35522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35522");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 419, (long) 32, 463L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test35523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35523");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("900.1-EURT0444444444444444444444444444", "a0000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Aaaa0aa00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35525");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("##100.0###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35526");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a0a", "0true-1.0097.044444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a#a" + "'", str4, "a#a");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test35527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35527");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("true444...44444444444444444444444444444444440TRUE-1.0097...44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35529");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("A   ", "####################################################################################################################################################################################################################################################...t0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35530");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0", (double) 24);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.0d + "'", double2 == 24.0d);
    }

    @Test
    public void test35531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35531");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4", "Aa00a       a000a       a000a       a00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35533");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444444444444444444444E-1.0         0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0true-1.00                                           true-1.97.                                                                                   ", "4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("a004444444000444444400044444440", "A A A A A A A A A A A A A A A A A A A A A A A A 4479     000       000       09700       000       0", "4444a44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test35537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35537");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", (java.lang.CharSequence) "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 359 + "'", int2 == 359);
    }

    @Test
    public void test35538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35538");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.0097.", "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097", "Ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 133);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35542");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                 ", "       ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa" + "'", str1, "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("4444444444444a00a.a1a-atruea0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444a00a.a1a-atruea0" + "'", str2, "4444444444444a00a.a1a-atruea0");
    }

    @Test
    public void test35545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35545");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                          ", "                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744     4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test35546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!HI!HI!HI!HI!HI!HI!HI!HI!", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                       0AAAA                                                                                                                                  A                                                                                                                                  0AAAA                                                                                                                                      ", "..44440TRUE-1.A00       000       000       00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                       0AAAA                                                                                                                                  A                                                                                                                                  0AAAA                                                                                                                                      " + "'", str2, "                                                                                                                                       0AAAA                                                                                                                                  A                                                                                                                                  0AAAA                                                                                                                                      ");
    }

    @Test
    public void test35548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4...44444444444444444444a                       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4...44444444444444444444a                       " + "'", str2, "4...44444444444444444444a                       ");
    }

    @Test
    public void test35549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("a###Ahi!hi!...###Ahi!hi!...###", "444440true-1.0097...4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444440true-1.0097...4" + "'", str2, "444440true-1.0097...4");
    }

    @Test
    public void test35550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35550");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...", 539);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35551");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test35552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35552");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...############################################################################", 181, 671);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0" + "'", str1, "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0");
    }

    @Test
    public void test35554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35554");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "0.7900.1-eurt0", (java.lang.CharSequence) "4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4                                                                                                                                                                                                                                                                           4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 4444444... 44");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0.7900.1-eurt0" + "'", charSequence2, "0.7900.1-eurt0");
    }

    @Test
    public void test35555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaaAaaaaaaaaaaa", "#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                     ", "                                                                                             100.", "                            100.0                                                     aaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     " + "'", str3, "                     ");
    }

    @Test
    public void test35557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35557");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                               ...", 21, "                                                                                                                                                                                                                                                                                       4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               ..." + "'", str3, "                                                                                               ...");
    }

    @Test
    public void test35560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                            0aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "##########################################################A0###########################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aAAAAAAAAAAAAAAAA...", "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAA..." + "'", str2, "aAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test35563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35563");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("    a   HI!HI!", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test35564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35564");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 0044444440004444444000444444400", "444444444444444440TRUE-1.0097...444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0atruea-a1a.a00aaaa4444444444444", (int) (short) 10, 554);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0atruea-a1a.a00aaaa4444444444444" + "'", str3, "0atruea-a1a.a00aaaa4444444444444");
    }

    @Test
    public void test35566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35566");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35568");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35569");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test35570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT" + "'", str1, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
    }

    @Test
    public void test35571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35571");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 4444444L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4444444.0f + "'", float2 == 4444444.0f);
    }

    @Test
    public void test35572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                   ", 84, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                   " + "'", str3, "                                                                                                                                   ");
    }

    @Test
    public void test35573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35573");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "  4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...         aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... aaaa0aaaaa" + "'", str1, "... aaaa0aaaaa");
    }

    @Test
    public void test35575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444...44444444444444444444444444444...444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444...44444444444444444444444444444...444444444444444444444444444" + "'", str1, "44444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444...44444444444444444444444444444...444444444444444444444444444");
    }

    @Test
    public void test35576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35576");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("ue-1.0097...444444444444444444444444                                                                                        100.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test35577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35577");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                             ", ".44444444444444444444444444444444a    4", 537);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0                                                                                                                                                                                                                                                                          ", 144, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0                                                                                                                                                                                                                                                                          " + "'", str3, "0                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test35579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35579");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa", "4444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                ...444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35581");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097 0");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097 0" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H0TRUE-1 0097 0");
    }

    @Test
    public void test35582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35582");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa                                                     0.001                            A      A  ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test35583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35583");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("        0aaaa         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############################################0097.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        0aaaa         " + "'", str3, "        0aaaa         ");
    }

    @Test
    public void test35584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35584");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test35585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35585");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...###################################################################################################################################################################################hI!###############################################################################################################################################################################################################################################################################################################################################################################################################################", "                                        4444444444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35586");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35587");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444440.7900.1-EURT04444444444444444444444444444444444444444444.790.7900.1-EURT04444444444444444444444444444444444444444444.1-EURT0.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 615);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444440");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440" + "'", str1, "44444444444444444444444444444444444444444440");
    }

    @Test
    public void test35589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.0" + "'", str1, "0true-1.0097.00true-1.0097.0");
    }

    @Test
    public void test35590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35590");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444440097...#############################################################################################", "0aaaa 0aaaa 0aaaa", 250);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("                A A ###################################                 ", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444                A A ###################################                 97...#############################################################################################" + "'", str5, "444444444                A A ###################################                 97...#############################################################################################");
    }

    @Test
    public void test35591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...                                                                                                                                                                             ...", ".97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                                                                                             ..." + "'", str2, "...                                                                                                                                                                             ...");
    }

    @Test
    public void test35592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44" + "'", str2, "4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44");
    }

    @Test
    public void test35593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "    a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    " + "'", str2, "    a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    ");
    }

    @Test
    public void test35594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35594");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35595");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...aaaaaaaaaaaaaaa...", "TRUEa97aTRUEa97", 554, 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...aaaaaaaaaaaaaaTRUEa97aTRUEa97" + "'", str4, "...aaaaaaaaaaaaaaTRUEa97aTRUEa97");
    }

    @Test
    public void test35596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35596");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("TRUE-1.##97.", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A", 30, 444);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "TRUE-1.##97.HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A" + "'", str4, "TRUE-1.##97.HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A");
    }

    @Test
    public void test35597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Aaaa0aa00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                          #...#4#a#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          #...#4#A#" + "'", str1, "                          #...#4#A#");
    }

    @Test
    public void test35599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                   aaaaa0aaaa                                                                         ", "44444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa0aaaa                                                                         " + "'", str2, "aaaaa0aaaa                                                                         ");
    }

    @Test
    public void test35600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35600");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("..    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ", "####################################                                         AAAA0AAAAA####################################", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35601");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                        44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!                                                                       0true-1.00", 191);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                   4                                                                    ", "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35603");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("###    a   HI!HI!.", "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35604");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "97 TRUE-1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test35605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...0TRUE-1.0097...", 670);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0TRUE-1.0097...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "...0TRUE-1.0097...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test35606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35606");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                          ...####################################..", 266, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                          ...####################################.." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                          ...####################################..");
    }

    @Test
    public void test35607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35607");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444" + "'", str1, "4444444444444444444");
    }

    @Test
    public void test35608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35608");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("00       0true00       0-00       000                                                       ", "                                        44...7900.1-eurt04444444444444444444444444444444444...444", "                                                                                                                                                                                                                                                                                                                                                                                                               #######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ", 463);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00       0true00       0-00       000                                                       " + "'", str4, "00       0true00       0-00       000                                                       ");
    }

    @Test
    public void test35609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04", "4444444...4444444...4444444...4...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04" + "'", str2, "0.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04");
    }

    @Test
    public void test35610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35611");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test35613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                   TRUE-1.0097.0                       a", 418);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   TRUE-1.0097.0                       a" + "'", str2, "                   TRUE-1.0097.0                       a");
    }

    @Test
    public void test35614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35614");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    a                     ", "...    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                         aaaa0aaaaa    ", (java.lang.CharSequence) "0444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35616");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                 ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0444444444...4444444444........444444444444444444.444444444...4444444444....." + "'", str2, "0444444444...4444444444........444444444444444444.444444444...4444444444.....");
    }

    @Test
    public void test35618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044");
    }

    @Test
    public void test35619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35619");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                       4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                       ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test35620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...4a444hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4a444hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44" + "'", str2, "...4a444hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa...44");
    }

    @Test
    public void test35621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... ...true-1. ...97. ... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ...", "44444444444444444444444444444444444444444AAAAAAAAA...4444444   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... ...true-1. ...97. ... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ..." + "'", str2, "0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... ...true-1. ...97. ... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ... 0TRUE-1.0097... 0 ...");
    }

    @Test
    public void test35622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35622");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444...790true-1.0097.0444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444.1-EURT0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444", "###################################    a   hi!hi!...######000###################################    a   hi!hi!...######", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444...790true-1.0097.0444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444.1-EURT0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444" + "'", str3, "444444444444444444444444...790true-1.0097.0444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444.1-EURT0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444");
    }

    @Test
    public void test35623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35623");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...44                            ", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     ...44                                 " + "'", str2, "     ...44                                 ");
    }

    @Test
    public void test35625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("a4444444444444444444444444444444", ".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35626");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...aaaa0aaaaa44444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35627");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4...7900");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35628");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray13 = new char[] { '4', '4', ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 43 + "'", int22 == 43);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test35629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35629");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444E-1.0         0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35630");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("44444444444444444444 !");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test35631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35631");
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
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test35632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35632");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444", (int) (byte) 0, 266);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444           " + "'", str3, "44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444           ");
    }

    @Test
    public void test35634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35634");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                   ", 957);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35635");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                           0true-1.0097.0", (float) 650);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 650.0f + "'", float2 == 650.0f);
    }

    @Test
    public void test35636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35637");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...T0444444444444444444444444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35638");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    }

    @Test
    public void test35639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35639");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444", (java.lang.CharSequence) "           rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 116 + "'", int2 == 116);
    }

    @Test
    public void test35640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35640");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0aaaa" + "'", str1, "0aaaa");
    }

    @Test
    public void test35641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35641");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a", (float) 840);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 840.0f + "'", float2 == 840.0f);
    }

    @Test
    public void test35642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0true-1 0097 044444444444444444444444444 4", "                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1 0097 044444444444444444444444444 4" + "'", str2, "0true-1 0097 044444444444444444444444444 4");
    }

    @Test
    public void test35644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35644");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0.001                                               ", "4444444444444444444444440TRUE-1.009...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.001                                               " + "'", str2, "0.001                                               ");
    }

    @Test
    public void test35646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35646");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35647");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                     a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35648");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35649");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444", "                                                       true-1.00                                           true-1.97.                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35650");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test35651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaa hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... 0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "    a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35652");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "44444444444444...7900.1-eurt044444", 614);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###########################################################################################################################################################################################################################00.1-eurt0", 329);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################################################################################################################################################################################################00.1-eurt0                                                                                                    " + "'", str2, "###########################################################################################################################################################################################################################00.1-eurt0                                                                                                    ");
    }

    @Test
    public void test35654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a", "0097444444a444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a" + "'", str2, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR a");
    }

    @Test
    public void test35655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35655");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       a", "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35656");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", "   a   HI!HI!                                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35657");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE", "", 71);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35658");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 445.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 445.0f + "'", float2 == 445.0f);
    }

    @Test
    public void test35659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35659");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa      a         a         a         a         aaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("974", 732, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "974444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            444444444" + "'", str3, "974444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                           true 1.  97                                                                                                                                                                                                                                                                            444444444");
    }

    @Test
    public void test35661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35661");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35662");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################...#########################...########################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "#########################...#########################...########################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test35663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35663");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0         aaa", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35664");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ahi!hi!hi!haaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaa", "4...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35665");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444444444444444449744444444444444444444444444", "                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "0H!IH!H!IH!.H!IH!H!IH!0010H!IH!H!IH!.H!IH!H!IH!0H!IH!H!IH!HI", "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test35667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("###############################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97.                                                                                4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "###############################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test35668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35668");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test35669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35669");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("             rue-1.0097.0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35670");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.", 179);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35671");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test35672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-", "                                           true-1.97.                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35673");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 578, 236L, (long) 76);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 76L + "'", long3 == 76L);
    }

    @Test
    public void test35674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444...", "                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa                                                                                                                                              " + "'", str2, "                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa                                                                                                                                              ");
    }

    @Test
    public void test35675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35675");
        char[] charArray17 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray17);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray17);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444440true-1.0097...444444444444444444444444", charArray17);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A0000000000", charArray17);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "truetruetruetruetruetruetruetruetrue", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test35676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35676");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Aa00a       a000a       a000a       a00", "0true-1.0097.00true-1.0097.00true-1.0097.00tr Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "444444...4444444444........4444444444444444444444444444.#######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "aaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test35679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("......4444444...4444444...4444444", 441);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35680");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", (double) 668.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 668.0d + "'", double2 == 668.0d);
    }

    @Test
    public void test35681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35681");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35682");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence9 = null;
        char[] charArray16 = new char[] { '4', '4', ' ' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence9, charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444...", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Aaaaaaaaa", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                 aaaa0aaaaa", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a    44", charArray16);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsAny("A         A         A         A         A         A         A         A         A         A         A         A         A         A ..", charArray16);
        int int29 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test35683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35683");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#########.                                                   ", 94, "...4...4444444...4444444...4444444                      0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4...4444444..#########.                                                   ...4...4444444..." + "'", str3, "...4...4444444..#########.                                                   ...4...4444444...");
    }

    @Test
    public void test35684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35684");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!", (java.lang.CharSequence) "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00 0true00 0-00 000 000 09700 000 0", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35687");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(23, 24, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test35688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0true-1.0aaaaaaaaaaaaaa", "                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35690");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444400       0444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test35691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", 36, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0" + "'", str3, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
    }

    @Test
    public void test35692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35692");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test35693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                ...44444", "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaaaaaaaaaaaaaaaaaaaaa                                 444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                ...44444" + "'", str2, "                                                                ...44444");
    }

    @Test
    public void test35694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35694");
        long[] longArray1 = new long[] { 99L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[99]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 99L + "'", long4 == 99L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 99L + "'", long5 == 99L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 99L + "'", long6 == 99L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 99L + "'", long7 == 99L);
    }

    @Test
    public void test35695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35695");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...444###################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", 840);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test35697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...444444444444444440true-1.0097...444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa444444444444444440true-1a0097aaa444444444444444444444444" + "'", str3, "aaa444444444444444440true-1a0097aaa444444444444444444444444");
    }

    @Test
    public void test35698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35698");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!", "...44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                     444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       444444444444444444444444444444444444444444444#...#44444444444444444444#a#                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "A.7900.1-eurt0444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35701");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaa0                                                            ", "a                             ###    A   hi!hi!...###    A   hi!hi!...###", 660);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa", "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ahi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!" + "'", str2, "ahi!");
    }

    @Test
    public void test35704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35705");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 12.0f, 175.0d, 12.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test35706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("##100.0###", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##100.0###" + "'", str2, "##100.0###");
    }

    @Test
    public void test35707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35707");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test35708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35708");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444##444440true-1.0097...4444444444444444444440true-1#0097###44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444##444440true-1.0097...4444444444444444444440true-1#0097###44" + "'", str1, "444##444440true-1.0097...4444444444444444444440true-1#0097###44");
    }

    @Test
    public void test35710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35710");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" aaaa0aaaaa    ", "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                         ", 73);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaa...", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 16 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test35711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35711");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", (java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", charSequence2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test35712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35712");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444                                                                                              0097..0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444                                                                                              0097..0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444" + "'", str1, "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444                                                                                              0097..0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444");
    }

    @Test
    public void test35715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...                             ", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                                                               " + "'", str2, "...                                                                                                                                               ");
    }

    @Test
    public void test35716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35716");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0                                             100.0                                                     aaaa                                                                                                                                                                                                                                                                                   ", "     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...      ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "00#######000#######000#######0011");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test35717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0" + "'", str2, "4444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
    }

    @Test
    public void test35718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35718");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...4444444...4", "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35719");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".                                  aaaa.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test35720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35720");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", "                                                                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                             ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35721");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444444...                                                                ", "...    0true-1.0097.00true-1.0097.00true-1.0097.00tr", "                                 ...4444444...444444444...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test35722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35722");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test35723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", 841);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 " + "'", str3, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test35724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35724");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.0", "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444444444444444444444444444444", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                ...44444");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...44444444444..", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0true-1.0097.0" + "'", str7, "0true-1.0097.0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test35725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35725");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...", "                     aaaa0aaaaa           ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!..." + "'", str3, "ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...");
    }

    @Test
    public void test35727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35727");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35728");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444a444440true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test35729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35729");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H", "1aaaaaaaaaaa4444444...4444444...4444444...4    aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H" + "'", str2, "a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a!HI!H!HI!H");
    }

    @Test
    public void test35731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35731");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aahI!aa", "######################################################a######################...###################################################################################################", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35732");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                         aaaa0aaaaa    ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa0aaaaa" + "'", str2, "aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaa0aaaaa" + "'", str4, "aaaa0aaaaa");
    }

    @Test
    public void test35733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35733");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35734");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35735");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A0a", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test35736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444444444444444444444444444444 !", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444 !" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444 !");
    }

    @Test
    public void test35737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ue-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UE-1.0097." + "'", str1, "UE-1.0097.");
    }

    @Test
    public void test35738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                             ...                           ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   ...                           " + "'", str2, "                                                   ...                           ");
    }

    @Test
    public void test35739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35739");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test35740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "                                                                                                                                                                             ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44" + "'", str1, "!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
    }

    @Test
    public void test35742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35742");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("......4444444...4444444...4444444.....", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..                             0true-1.0097.A                                             0true-1.0097.A                                             0true-1.0097.A                                             0true-1.0097.A                                             0true-1.0097.A                                             0true-1.0097.A                                             0true-1.0097.A                                             0true-1.0097.A                                             0true-1.0097.A                                             0true-1.0097", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test35743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35743");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.." + "'", str1, "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
    }

    @Test
    public void test35744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..", "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.." + "'", str2, "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
    }

    @Test
    public void test35745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35745");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", 42, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35746");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("44444444444444444444444a444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35747");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A A ###################################", 645, "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a44444A A ###################################" + "'", str3, "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a44444A A ###################################");
    }

    @Test
    public void test35748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35748");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUERT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUERT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-1.0097.00TRUE-1....0true-1.0097...0TRUE-\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444" + "'", str1, "44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444");
    }

    @Test
    public void test35750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35750");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35751");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0true-1.0AAAAa44444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str1, "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test35753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35753");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("a0aaaaa              ", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test35755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35755");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35756");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35757");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test35758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35758");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE97TRUE97aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!H", "444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test35760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35760");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("##############################################0097.", "0atruea-a1a.a0097a.a0", 657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                       A                       A                      ......A", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       A                       A                      ......A" + "'", str2, "                       A                       A                      ......A");
    }

    @Test
    public void test35762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35762");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35763");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test35764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   hi!hi!..", " aaaa0aaaaa    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   hi!hi!.." + "'", str2, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   hi!hi!..");
    }

    @Test
    public void test35765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35765");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111" + "'", str1, "A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111");
    }

    @Test
    public void test35766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35766");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa00       000       000       00aaaaaaaaaaaa", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35767");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!", "##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444..." + "'", str1, "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...");
    }

    @Test
    public void test35769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35769");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
    }

    @Test
    public void test35770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35771");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, 73L, 34L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test35772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 aaaa", "         a        ", "...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 aaaa" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 aaaa");
    }

    @Test
    public void test35773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                             ...0TRUE-1.0097...                             ", "true                                         TRUE-1                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             ...0TRUE-1.0097...                             " + "'", str2, "                             ...0TRUE-1.0097...                             ");
    }

    @Test
    public void test35774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "        a                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        a                     " + "'", str1, "        a                     ");
    }

    @Test
    public void test35775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35775");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....!", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test35776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35776");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970hhhhhhhhhhhhhhhh", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 50, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str3, "4444444444true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test35779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35779");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("444444444444444  444444444444444", "  ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35780");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "###    a   HI!HI!..", (java.lang.CharSequence) "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###    a   HI!HI!.." + "'", charSequence2, "###    a   HI!HI!..");
    }

    @Test
    public void test35781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", 840);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa" + "'", str2, "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444...44444444444444444444444444444444440TRUE-1.0097" + "'", str2, "444...44444444444444444444444444444444440TRUE-1.0097");
    }

    @Test
    public void test35783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35783");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("#########################################################################################################################################################", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35784");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(".7900.1-eurt04444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt0444444444444444444444444444444444444444444444A", 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35785");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(266.0d, 188.0d, (double) 545);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 188.0d + "'", double3 == 188.0d);
    }

    @Test
    public void test35786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35786");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                     ###    a   HI!HI                                                                                                                                                                                                                                                                                                                                      ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test35787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###########################################true-1.97.############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test35789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                     aaah                     aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     aaah                     aaa" + "'", str1, "                     aaah                     aaa");
    }

    @Test
    public void test35790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#######    a   HI!HI!...", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######    a   HI!HI!..." + "'", str2, "#######    a   HI!HI!...");
    }

    @Test
    public void test35791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35791");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("###################    a   HI!HI!...#################", (long) 54);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54L + "'", long2 == 54L);
    }

    @Test
    public void test35792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35792");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "0TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 833, 167);
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test35793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35793");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444449744444444444444444444444444", "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97.                                                                                4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35794");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 65, (float) 14L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test35795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("...4444                                                              ", "A A A A ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444                                                              " + "'", str2, "...4444                                                              ");
    }

    @Test
    public void test35796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test35797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35797");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "1.0097.04444444444444444444444444", (java.lang.CharSequence) "...                     aaaaa0aaaa                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...                     aaaaa0aaaa                     a...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1.0097.04444444444444444444444444" + "'", charSequence2, "1.0097.04444444444444444444444444");
    }

    @Test
    public void test35798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35798");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "", 256);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35799");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A                                                                   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                      444444444...");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test35800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44", "", 850);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44" + "'", str3, "4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44");
    }

    @Test
    public void test35801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35801");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0atruea-a1a.a0097a.a0", "                                                  ", 164);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0       00", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0       00" + "'", str2, "0       00");
    }

    @Test
    public void test35803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35803");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 61, (double) 463L, 667.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 667.0d + "'", double3 == 667.0d);
    }

    @Test
    public void test35804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35804");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444TRUE-1.97.44444444444444444444444444444444444444444444", 153);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35805");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "...000     ...");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("##100.0###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test35806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35806");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
    }

    @Test
    public void test35807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35807");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                               ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAAAAAAAAAAAA", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa", (java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                               " + "'", str7, "                                               ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                               " + "'", str9, "                                               ");
    }

    @Test
    public void test35808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35808");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...         aaaa0aaaaa", "0aaaa 0aaaa 0aaaa", 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("        a                     ", "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa" + "'", str2, "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("..!IH!IH   a    4444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444TRUE-1.00TRUE-1.97.                                      ", "44444444444444444444...40004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004000400040004");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TRUE-1.00TRUE-1.97.                                      " + "'", str2, "TRUE-1.00TRUE-1.97.                                      ");
    }

    @Test
    public void test35812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35812");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                      100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35813");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444", "0 ", 534);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444");
    }

    @Test
    public void test35814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test35815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35815");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...000     ...                                                                                                                                                                                                                                                                                                                                                                                  ", "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35816");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", "", 34);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA" + "'", str5, "AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA");
    }

    @Test
    public void test35817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###0.001##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##100.0###" + "'", str1, "##100.0###");
    }

    @Test
    public void test35818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35818");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                  ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444                                                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35819");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 45, (long) 147, (long) 62);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 147L + "'", long3 == 147L);
    }

    @Test
    public void test35820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444TRUE-1.00TRUE-1.97.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35821");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(".############################################", 589);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35822");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                             ", "4444444444444444444444444", 72);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35823");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#04444444444444444444444444444444444444444440#true#-#1#.#0097#.#0444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35824");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("79  .1-eurt 444444440 true - 1 . 44444444444444444444", "ue-1.0097...444444444", "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        art           tra                            " + "'", str3, "        art           tra                            ");
    }

    @Test
    public void test35825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35825");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi", 670, 292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44444444444444444440TRUE-1.0097.", "                                                 ###0.001##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444440TRUE-1.0097." + "'", str2, "44444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test35827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35827");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(842, 850, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 850 + "'", int3 == 850);
    }

    @Test
    public void test35828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("00       0true00       0-00       000                                                       ", "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 444);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00       0true00       0-00       000                                                       " + "'", str3, "00       0true00       0-00       000                                                       ");
    }

    @Test
    public void test35829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                     ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                     ..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                     ...");
    }

    @Test
    public void test35830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                                ...                                                    ", 463);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           ...                                                    " + "'", str2, "                           ...                                                    ");
    }

    @Test
    public void test35831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35831");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                           0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35832");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444...4444Aaaaaaaaa", "rue-1.0097.0                                       ", 50);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test35833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("A0", "                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 630);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test35835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                100.0#####100.0###", "                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                100.0#####100.0###" + "'", str2, "                                                                                100.0#####100.0###");
    }

    @Test
    public void test35836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35836");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test35837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35837");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "100.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35838");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a00       000       000       00");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("0true-1.0097.04444444444444444444444444440aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0aaaa0", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("                   .0097.00tr          ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a0044444440004444444000444444400" + "'", str6, "a0044444440004444444000444444400");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test35839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35839");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                            " + "'", str1, "                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                            ");
    }

    @Test
    public void test35840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "aA44444A44a44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A         A                                                     1000    A         A", "444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         A                                                     1000    A         A" + "'", str2, "A         A                                                     1000    A         A");
    }

    @Test
    public void test35842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35842");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test35843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35843");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test35844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                               AAAA0AAAA                      ", "                                         ...444444440tr...                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               AAAA0AAAA" + "'", str2, "                                                               AAAA0AAAA");
    }

    @Test
    public void test35845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35845");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (byte) 100, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0true-1.0097.0" + "'", str8, "0true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0true-1.0097.0" + "'", str9, "0true-1.0097.0");
    }

    @Test
    public void test35846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35846");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 49, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test35847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("-", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "!hi!hitttttti!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test35849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                       ", 463);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test35850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test35851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", "                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str2, "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }

    @Test
    public void test35852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35853");
        char[] charArray16 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     a    ", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4true-1.4497.4444444444444444444444444444", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                           ", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny("", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "......4444444...4444444...4444444.....", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 44 + "'", int19 == 44);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test35854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35854");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("A      ...", 468, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test35857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35857");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 461L, (double) 96L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test35858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         " + "'", str1, "A         A         A         A         A       Aaaaaaaaa A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         ");
    }

    @Test
    public void test35859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0 tru...ue-1.0097.044444444444444444444444444444444...4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35860");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("41004.404", 671, 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E", "         a        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E" + "'", str2, "RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E");
    }

    @Test
    public void test35862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35862");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                      A         A         A         A         A      ", "##100.0###44444444444.0097.00true-1.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h###########################################", "0444444444       444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h###########################################" + "'", str2, "true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h###########################################");
    }

    @Test
    public void test35864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35864");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "44444444444444444444444444444444444444444440true-1.0097.A44444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A44444444", 153);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str3, "#######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test35865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...", "                     aaaa0aaaaa                     #A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#444444444444444444444444444444444444444444444#A#44444444444444444444#...#44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t..." + "'", str2, "44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
    }

    @Test
    public void test35866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35866");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35867");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test35868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35868");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("    A     .7900.1-eurt0444444444444444444...", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test35869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                      100.0                                                AAAAAAAAAAAAAAAAAA", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test35870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("           rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0            ", "true-1.0097.00true-1.0097.00tr", 435);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0            " + "'", str3, "           rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0            ");
    }

    @Test
    public void test35871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35871");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A0a", "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35872");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444 ! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35873");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Aaaaaaa      a         a         a         a         aaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                     aaah                     aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     aaah                     aaa" + "'", str1, "                     aaah                     aaa");
    }

    @Test
    public void test35875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#a######################...##############################################", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#a######################...##############################################" + "'", str2, "#a######################...##############################################");
    }

    @Test
    public void test35876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35876");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ", "                                      100.0                                                     ", 269);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444444444444444444", "...A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444" + "'", str2, "44444444444444444444");
    }

    @Test
    public void test35878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa", 6, "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa" + "'", str3, "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa");
    }

    @Test
    public void test35879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("tr...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tr..." + "'", str1, "tr...");
    }

    @Test
    public void test35880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", 465, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test35881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35882");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                         100.                                                          ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test35883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "        HI!H4444404444HI!HI.A A A ", "!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("-1.0097.0", "                     0         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0097.0" + "'", str2, "-1.0097.0");
    }

    @Test
    public void test35885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "000044444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA###000##AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test35886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35886");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#...#4                       #a#4#...#4                       #a#4#...#4                       #a#4                     4#...#4                       #a#4#...#4                       #a#4#...#4#a#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test35887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35887");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 127, (double) 463.0f, (double) 173L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 463.0d + "'", double3 == 463.0d);
    }

    @Test
    public void test35888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("..!IH!IH   a    4444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.aa97.a44444444444444444444444444a.............................................###a.aa1##.............................................aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..!IH!IH   a    4444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444" + "'", str2, "..!IH!IH   a    4444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444");
    }

    @Test
    public void test35889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35890");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 64L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 64L + "'", long2 == 64L);
    }

    @Test
    public void test35891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0TRUE-1 0097 0", 539);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0TRUE-1 0097 0" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             0TRUE-1 0097 0");
    }

    @Test
    public void test35892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", "    a0a                 0true-1.0A A A A            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444" + "'", str2, "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444");
    }

    @Test
    public void test35893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35893");
        long[] longArray4 = new long[] { 'a', (byte) 100, 52L, 44 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 100, 52, 44]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 44L + "'", long5 == 44L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 44L + "'", long6 == 44L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 44L + "'", long8 == 44L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 44L + "'", long9 == 44L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 44L + "'", long10 == 44L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test35894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35894");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("true -   97", "                                                                                                                                                                                                                                                                                                                                                                                                                               hI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35895");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                              0097..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                              0097." + "'", str1, "                                                                                              0097.");
    }

    @Test
    public void test35896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4aaaaaaaaaaa44444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa4444444444444444444444444444444444444444", "##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4aaaaaaaaaaa44444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa4444444444444444444444444444444444444444" + "'", str2, "4aaaaaaaaaaa44444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa4444444444444444444444444444444444444444");
    }

    @Test
    public void test35897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                                                                                                                                                                                                                                                             444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097." + "'", str1, "444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test35898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test35899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "                                      4444400       0444444                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444400       0444444                                     " + "'", str2, "4444400       0444444                                     ");
    }

    @Test
    public void test35900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35900");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaa   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    a0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35901");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                           ...444444440tr...                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                            ...444444440tr...                                           is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0, "A A A A A A A A A A A A A A A A A A A A A A A A 4479     000       000       09700       000       0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 550);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test35904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0aaa", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0aaa" + "'", str3, "0aaa");
    }

    @Test
    public void test35905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35905");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.00" + "'", str1, "    ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...A...44444444444444444444444444444444440TRUE-1.00");
    }

    @Test
    public void test35906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ", "                   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     " + "'", str2, "4                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa                     ");
    }

    @Test
    public void test35908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa...", "###    a   HI!HI!.", 951);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35909");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 104, (long) 146, (long) 253);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 104L + "'", long3 == 104L);
    }

    @Test
    public void test35910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35910");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("114", '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "aaaaaaaaa");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("a0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", strArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4, strArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                   aaaaa0aaaa                                                                         ", strArray8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str11, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str14, "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     " + "'", str16, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
    }

    @Test
    public void test35911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0000000444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000", "0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000" + "'", str2, "444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4aaaaa##############44444444444444000");
    }

    @Test
    public void test35912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35912");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AE444444444444444444444", "00       0", 201);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test35913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35913");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("h", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                          44444444444444444440true-1.0097.", strArray4, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "    A     " + "'", str5, "    A     ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                                                          44444444444444444440true-1.0097." + "'", str10, "                                                                                                                                                                                                                                          44444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "    A     " + "'", str12, "    A     ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "    A     " + "'", str14, "    A     ");
    }

    @Test
    public void test35914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true" + "'", str1, "A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true");
    }

    @Test
    public void test35915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35915");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Rue-1.0097.0", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35916");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 4                                                                                              0097..0true-1.0097.040true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.0", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAtrueAA", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A A A.IH!IH!IH!IH!IH!IH!IH!IH!IH!IH        ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH A A A.IH!IH!IH!IH!IH!IH!IH!IH!IH!IH        a" + "'", str1, "A A A.IH!IH!IH!IH!IH!IH!IH!IH!IH!IH        ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH A A A.IH!IH!IH!IH!IH!IH!IH!IH!IH!IH        a");
    }

    @Test
    public void test35918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35919");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny(".true-1...97..44444444444444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test35920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35920");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444444444444444 TRUE-1. 97. 444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35921");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(618, (int) (byte) 0, 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test35922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35922");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaa0aaaa0.7900.1-eurt04444444444444444...", "A      A                            100.0                                                     AAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test35923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35923");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 t97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 t");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35925");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test35926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35926");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35927");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", 8, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI", ".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35929");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35930");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("       ...      a         a         a         a         a", "                     aaaa0aaaaa   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("A         A         A         A         A         A         A         A         A         A         A         A         A         A ...", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                      0.001                                               ", "Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test35934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35934");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test35935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444");
    }

    @Test
    public void test35936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35936");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444444444444444444444444444", "    A     .7900.1-eurt0444444444444444444...", 253);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35937");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", "...44444444444...                                                                                                                                                                                                       ", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIA" + "'", str4, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIA");
    }

    @Test
    public void test35938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35938");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAA", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test35939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35939");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444 ", "####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35940");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444", 632, 84);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444" + "'", str4, "4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444");
    }

    @Test
    public void test35941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("truetruetruetruetruetruetruetruetrue", "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "truetruetruetruetruetruetruetruetrue" + "'", str2, "truetruetruetruetruetruetruetruetrue");
    }

    @Test
    public void test35942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35942");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A         A         A        ...", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444       4444444440", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 15 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test35943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa" + "'", str1, "aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa");
    }

    @Test
    public void test35944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("true-1....97true-1....9");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1....97true-1....9" + "'", str1, "true-1....97true-1....9");
    }

    @Test
    public void test35945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                      0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                  0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test35946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0 true - 1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0 true - 1" + "'", str1, "0 true - 1");
    }

    @Test
    public void test35947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35947");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test35948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444444444444444444444444440T", (java.lang.CharSequence) "0true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 4                                                                                              0097..0true-1.0097.040true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35949");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                       a44444444444444444444...4", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35950");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00.1-eurt044444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0TRUE-1.00-1.0097.0                                           ", 797, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1.00-1.0097.0                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0TRUE-1.00-1.0097.0                                           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test35952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35952");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("97 true-1.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test35953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35953");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00       000       000       0", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444", "aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444", ".7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444" + "'", str3, "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444");
    }

    @Test
    public void test35955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35955");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                           0true-1.0097.0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test35956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35956");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35957");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35958");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                      4444400       0444444                                      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35959");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35960");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444441004.4044444444444444444444444444444444444444444444444", "0444...44444444444444444444444444444444440TRUE-1.0097...4 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test35961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35961");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAA0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35962");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                        ", "a a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a aa a a a a                                        44...7900.1-eurt04444444444444444444444444444444444...444", 269);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test35963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35963");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("   A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test35964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", "44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35965");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                          ...                                                                                                                                                                                                                                                                                            ", (java.lang.CharSequence) "rue-1.0097.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test35966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444..444444444444444440TRUE-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "truetruetruetruetruetruetruetruetrue");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                       0                                                                                                                                 ", 5, 833);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  0                                                                                                                                 " + "'", str3, "                                                                                                  0                                                                                                                                 ");
    }

    @Test
    public void test35969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35969");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                               0aaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test35970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35970");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa", "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test35971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                     aaaaaa0aaaaaaa              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     aaaaaa0aaaaaaa              " + "'", str1, "                     aaaaaa0aaaaaaa              ");
    }

    @Test
    public void test35972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35972");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "rue-1.0097.0", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsAny("", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test35973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35973");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                         ...                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                         ...                                                    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35974");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                            ", " 4444444444444444444444444444444444444444444TRUE..4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35975");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440true-1.0097.");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 349, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test35976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                      4444400       0444444                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      4444400       0444444                                      " + "'", str1, "                                      4444400       0444444                                      ");
    }

    @Test
    public void test35977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35977");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("..4444444...4444444...4444444...4444444...4444444...4444444...4444444", "TRUE");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", "TRUE97TRUE9");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35979");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(668.0f, (float) 57L, (float) 5);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 5.0f + "'", float3 == 5.0f);
    }

    @Test
    public void test35980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                            ", 292, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################################################################################################                                                                                                                                                            " + "'", str3, "########################################################################################################################################                                                                                                                                                            ");
    }

    @Test
    public void test35981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...aaaa...44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaa...44444444444444444" + "'", str1, "...aaaa...44444444444444444");
    }

    @Test
    public void test35982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "####################################...####################################...####################################...####################################...                                     100.0                                                     aaaa                                     ####################################...####################################...####################################...####################################...                                 1000    .         .             1000    .         .          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test35984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35984");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test35985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47" + "'", str1, "A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47");
    }

    @Test
    public void test35986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0", "", "                                                 ...                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0" + "'", str3, "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0");
    }

    @Test
    public void test35987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "0TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###    a   HI!HI!...", "...0...AAA0AAAAAAAAA0AAAAAAAAA0AAAA44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###    a   HI!HI!..." + "'", str2, "###    a   HI!HI!...");
    }

    @Test
    public void test35989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", 236);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str2, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test35990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35990");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt044444444444444", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test35991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35991");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35992");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "true                 ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...                                                                      ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test35993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35993");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test35994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35994");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "true-1.00                                           true-1.97.", 63, 632);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                      hI!HI!HI!HI!HI!HI!HI!HI!Htrue-1.00                                           true-1.97." + "'", str4, "                                      hI!HI!HI!HI!HI!HI!HI!HI!Htrue-1.00                                           true-1.97.");
    }

    @Test
    public void test35995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35995");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.", 0, 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test35996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35996");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                               0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35997");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444444444444444444444444444", "                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test35998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi...A" + "'", str1, "!hi!hi!hi!hi!hi!hi!hi!hi!hi...A");
    }

    @Test
    public void test35999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test35999");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444..4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest71.test36000");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaaa", "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444#44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444   00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertNotNull(strArray2);
    }
}

