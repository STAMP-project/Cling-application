import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest91 {

    public static boolean debug = false;

    @Test
    public void test45501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("####################################AAAA0AAAAA###################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################AAAA0AAAAA###################################" + "'", str1, "####################################AAAA0AAAAA###################################");
    }

    @Test
    public void test45503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45503");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a     0true-1.0097.00true-1.0097.00true-1.0097.00trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test45504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                          ###################################################", "A44444", 93);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test45505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...####################################..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...####################################.." + "'", str1, "...####################################..");
    }

    @Test
    public void test45506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45506");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444444444444...4444444.79...4444444.1-eurt...44444444444444444444444444444444444444444444444444T00.7900", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 65, 92);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444...4444444.79...444444hI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444444444444444444444444444444T00.7900" + "'", str4, "4444444444444444444444444444444444444444444...4444444.79...444444hI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444444444444444444444444444444T00.7900");
    }

    @Test
    public void test45507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45507");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "", 91);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", (int) (byte) 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, " ", 100, 35);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ", strArray4, strArray8);
        java.lang.Class<?> wildcardClass15 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  " + "'", str14, " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test45508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi", 41, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi" + "'", str3, "0aaaa hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi");
    }

    @Test
    public void test45509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444440TRUE-    ...AAAA0AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test45510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45510");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...44444...TRUE-1.4444444...97.4444444...4444444444444...", "...                                      44444444444", "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                         ", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...44444...TRUE-1.4444444...97.4444444...4444444444444..." + "'", str4, "...44444...TRUE-1.4444444...97.4444444...4444444444444...");
    }

    @Test
    public void test45511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45511");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444444   aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " A 4479     000       000       09700       000       0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", 618, "true-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h############################...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str3, "44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test45514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     AAAAAA0AAAAAAAAAAAAA444444...                                                                                                                                                                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  ", "44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     AAAAAA0AAAAAAAAAAAAA444444...                                                                                                                                                                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     AAAAAA0AAAAAAAAAAAAA444444...                                                                                                                                                                                                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  ");
    }

    @Test
    public void test45515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45515");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                         #######################################################################################################################################################################4 0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                          ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test45516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", 544);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test45517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45517");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 97, 275);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test45518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45518");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatt-------ttt-------ttt-------taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                         AAAAAAAAAAAAAA                                                          ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test45519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 55, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   hi!hi!..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444AAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444444444" + "'", str3, "4444AAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444444444");
    }

    @Test
    public void test45520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0", "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                     ...", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0" + "'", str3, "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.0");
    }

    @Test
    public void test45521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "0true-1.0AAAAa44444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45522");
        long[] longArray2 = new long[] { (byte) 100, 12 };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[100, 12]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 12L + "'", long4 == 12L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 12L + "'", long5 == 12L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 12L + "'", long6 == 12L);
    }

    @Test
    public void test45523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45523");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaa...00.7900.1-eurt00.79...aaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                           4444a44444                                                                                                                                                                                                                          ", "44444444444444444444444444444444", 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaa...00.7900.1-eurt00.79...aaaaaaa" + "'", str4, "aaaaaaa...00.7900.1-eurt00.79...aaaaaaa");
    }

    @Test
    public void test45524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45524");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!HI!HI!HI!HI!HI!HIAHI!HI!HI!HI!H                                                                                                           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45525");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test45526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45526");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                               4444444444444444444444444444444444444444444                             a                        A A A A.79                             a                        A A A A.1-eurt                             a                        A A A A4444444444444444444444444444444444444444444", "A A A A                        a                       ...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440trueaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444", 670);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444" + "'", str2, "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444");
    }

    @Test
    public void test45528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      A A A A A", ".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test45530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 106);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "A rt00.7900.1-eurt00.7 A rt00.7900.1-eurt00.7                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test45531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45531");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.", "a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test45532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45532");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                     ...                                     aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                       aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa   ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45533");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44", "4...4444444...4444444...4444444aaaaaaaaaaa1");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test45534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444..444444444444444440Ta0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tra0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1", "                                                               0aaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444..444444444444444440Ta0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tra0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1" + "'", str2, "4444444..444444444444444440Ta0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tra0aaaaa              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1");
    }

    @Test
    public void test45535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45535");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                          #...#4#a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                          #...#4#a#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("a#4#...", "4444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#4#..." + "'", str2, "a#4#...");
    }

    @Test
    public void test45537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45537");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(665.0f, (float) 419, 534.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 419.0f + "'", float3 == 419.0f);
    }

    @Test
    public void test45538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("      00", "44444AAAAAAAAAAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test45539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "A44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45540");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test45541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444" + "'", str1, "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a1414141444444444444444444444444");
    }

    @Test
    public void test45542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45542");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0a4000aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0a" + "'", str2, "aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0a4000aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0a");
    }

    @Test
    public void test45543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444444444" + "'", str1, "...44444444444444444");
    }

    @Test
    public void test45544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45544");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                0.001                                               ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0.001", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test45545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45545");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaa.", 542);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45546");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.Class<?> wildcardClass12 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test45547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45547");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", (java.lang.CharSequence) "     A44444      Aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 950 + "'", int2 == 950);
    }

    @Test
    public void test45548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("######################################################################################################################################################################################################################################                                                                                                                                                                                                                                           ...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", 15, 125);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################################################################################" + "'", str3, "#############################################################################################################################");
    }

    @Test
    public void test45549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45549");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny("aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 231, 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test45550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str1, "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test45551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45551");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                     aaah                     aaa", "444...44444444444444444444444444444444440TRUE-1.0097...44097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("####################################                                         AAAA0AAAAA###################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"####################################                                         AAAA0AAAAA###################################\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45553");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       44444444444444444440true-1.0097HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                                                                                     ", "AAAAAAAAAAAAAAAAAAAAAAAAAAA                     AAAA0AAAAA           AAAAAAAAAAAAAAAAAAAAAAAAAAAA", 236);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45554");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("           A         A         A         A         A         A         A         A         A         A         A         A         A         A ..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45555");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "          TRUE  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test45556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45556");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10, 349);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test45558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                       true-1.00                                           true-1.97.                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1.00                                           true-1.97." + "'", str1, "true-1.00                                           true-1.97.");
    }

    @Test
    public void test45560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaa...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaa..." + "'", str2, "...0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaa...");
    }

    @Test
    public void test45561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45561");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("..####0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (double) 269L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 269.0d + "'", double2 == 269.0d);
    }

    @Test
    public void test45562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                              " + "'", str2, "                                              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...                                              ");
    }

    @Test
    public void test45563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45563");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                     AAAAAA0AAAAAAA              ", "4444444444444444444444444444444444444444444.79.-eurt4444444444444444444444444444444444444444444.79.79.-eurt4444444444444444444444444444444444444444444.-eurt.79.-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4447404444444444444444444444444444", 187, "... 444444444444444440true-1.0097...444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444447404444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444" + "'", str3, "... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444447404444444444444444444444444444... 444444444444444440true-1.0097...444444444444444444444444... 4444444444444");
    }

    @Test
    public void test45566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45566");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A A A        ", "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                      ...                                                    ", 726);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      ...                                                    " + "'", str2, "                                      ...                                                    ");
    }

    @Test
    public void test45568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45568");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test45569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatt-------ttt-------ttt-------taaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   a         ", 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      a         " + "'", str2, "                                                                      a         ");
    }

    @Test
    public void test45571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45571");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "A A A A A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45572");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###0.001##                         ", (java.lang.CharSequence) "4444444444444444444444444444444444444444444 true-1. 97. 444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45573");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("true -   97  ", "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "A", 5);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                               100.0                                                ", (int) (short) 100);
        java.lang.String[] strArray23 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray23, strArray25);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                            100.0", strArray16, strArray23);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray23);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray9, strArray23);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str26, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                            100.0" + "'", str27, "                                            100.0");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097" + "'", str31, "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...AAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097.A                                             0TRUE-1.0097");
    }

    @Test
    public void test45574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45574");
        short[] shortArray6 = new short[] { (short) 100, (byte) 100, (byte) 100, (short) 100, (byte) 100, (short) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 100, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test45575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45575");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                         ", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                         " + "'", str2, "                                                                                                        ...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0                                                                                                         ");
    }

    @Test
    public void test45577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45577");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444a444444444444444444", ' ');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test45578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...44444444444444444444444444444444440true-1.0097...44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45579");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45580");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...79hi!hi!hi!hi!hi!hi!.1-EURThi!hi!hi!4444444444444444444444444444444444...444444444444444444444444", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test45581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45581");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) ".true-1...97..44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45582");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("  ...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test45583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "           A         A         A         A         A         A         A         A         A         A         A         A         A         A ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444...                                                                ", "                   rt00.7900.                   ", "                                                                                                AAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444...                                                                " + "'", str3, "444444...                                                                ");
    }

    @Test
    public void test45585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45585");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.4A444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097" + "'", str3, "44444444444444444444444444444444444444444440TRUE-1.0097.4A444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097.4A44444444444444444444444444444444444444444444440TRUE-1.0097");
    }

    @Test
    public void test45586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test45587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45587");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi", "                                                                                                                                                                                                                                                                a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a                                                                                                                                                                                                                                                                 ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45588");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45589");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(585, 71, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 585 + "'", int3 == 585);
    }

    @Test
    public void test45590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45590");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                               ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test45591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45591");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                       aaaaaaa      a         a         a         a         aaaaaaaa", "ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!...ahi!hi!..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0       00", "444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.4444444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0       00" + "'", str2, "0       00");
    }

    @Test
    public void test45593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa", 292);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                    " + "'", str2, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                    ");
    }

    @Test
    public void test45594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.00                                               A44444                                               0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.009", "                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.00                                               A44444                                               0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.009" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.00                                               A44444                                               0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.009");
    }

    @Test
    public void test45595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45595");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10.0f, (double) 734, (double) 15L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test45596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45596");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(4.4444444444444444E52d, (double) 664.0f, (double) 533.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 533.0d + "'", double3 == 533.0d);
    }

    @Test
    public void test45597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45597");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   " + "'", str2, "   4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   ");
    }

    @Test
    public void test45599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45599");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 104, (float) 895, (float) 19);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 895.0f + "'", float3 == 895.0f);
    }

    @Test
    public void test45600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("rue-1.0097.00tr", "A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atrue", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atrue" + "'", str2, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atrue");
    }

    @Test
    public void test45602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-" + "'", str1, ".0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-");
    }

    @Test
    public void test45603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45603");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a00       000       000       00aaaaaaaaaaaaaaaaaaaaaaaaa", "                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45604");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...44440true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0097..##################################....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..0097..##################################", "97.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097..##################################....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..0097..##################################" + "'", str2, "0097..##################################....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..0097..##################################");
    }

    @Test
    public void test45606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                       ##44444444444444444444#...#44444444HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "...A .....44444...true-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   44444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test45608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45608");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 269 + "'", int2 == 269);
    }

    @Test
    public void test45609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45609");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test45610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45610");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45611");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A00       000       000       00");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test45612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45612");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("......44444444444444444444444444444444440TRUE-1.0097...         a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a    ...44444444444444444444444444444444440TRUE-1.0097...4444444444444444444444", "1aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45613");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" ...", " 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45614");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44                            ", "!hi!hi!hi!hi!hi!hi!hi!hi!hi...A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45615");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45617");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 5L, (float) 75, (float) 50L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 75.0f + "'", float3 == 75.0f);
    }

    @Test
    public void test45618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45618");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...44444444444444444444444444444444440TRUE-1.0097...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45619");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("             ", "", 444);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) (byte) 100, 167);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAA", 20, "44444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAA44" + "'", str3, "AAAAAAAAAAAAAAAAAA44");
    }

    @Test
    public void test45621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45621");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45622");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 111L, 191.0f, (float) 83);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 191.0f + "'", float3 == 191.0f);
    }

    @Test
    public void test45623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", 45, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
    }

    @Test
    public void test45624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45624");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 975, (long) '#', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 975L + "'", long3 == 975L);
    }

    @Test
    public void test45625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45625");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 267 + "'", int9 == 267);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 267 + "'", int11 == 267);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test45626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                           ", "444444a444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45627");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0atruea-a1a.a0097a.a0", "              ", 78);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "4...44444444444444444444a                        A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0atruea-a1a.a0097a.a0" + "'", str5, "0atruea-a1a.a0097a.a0");
    }

    @Test
    public void test45628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45628");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                       ###0.001##       ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test45629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "aaaa0aaaaa ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test45630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45630");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "444444444444444444...true-1.4444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test45632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45632");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                            ...    ue                            ...     ", "                                                   ", 833, 292);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                            ...    ue                            ...                                                        " + "'", str4, "                            ...    ue                            ...                                                        ");
    }

    @Test
    public void test45633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45633");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("         ...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test45634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45634");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 40, (double) 83L, (double) 181);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 40.0d + "'", double3 == 40.0d);
    }

    @Test
    public void test45635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45635");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444444444444444444444444444444444444444 true - 1 . 97 . 444444444444444444444444444 ... 4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "           00#######000#######000#######0011           ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45636");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("ue-1.0097.", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                          a                                 a   HI!HI!...    a   HI!HI!...", "###################################    a   HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                          a                                 a   HI!HI!...    a   HI!HI!..." + "'", str2, "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                          a                                 a   HI!HI!...    a   HI!HI!...");
    }

    @Test
    public void test45638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("a     0true-1.0097.00true-1.0097.00true-1.0097.00trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh", "                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45640");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                          ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 43 + "'", int15 == 43);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test45641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45641");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(12, 2, 645);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test45642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45642");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                     aaaa0aaaaa                     ", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt044444444444444", 4444444, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test45643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444440tru");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test45644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44 ...4A", 551, 545);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test45645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test45646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444", "AA", "...........");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444" + "'", str3, "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test45647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45647");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("                         AAAAAAAAAAAAAA", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45648");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45649");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444################################################################################################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444################################################################################################" + "'", str3, "4444################################################################################################");
    }

    @Test
    public void test45650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45650");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444", "444444444                A A ###################################                 97...#############################################################################################", 63);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test45651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                       444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################" + "'", str1, "444...44444444444444444444444444444444440true-1.0097################################################################################################################################################################################");
    }

    @Test
    public void test45652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45652");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.     A    4444444444444444444444444444444444444444444440TRUE-1.0097.", "true-1.  97");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("7.4444444444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
    }

    @Test
    public void test45653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45653");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!HI!HI!HI!HI!HI!HI\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45654");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a0a", "0true-1.0097.044444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test45655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0097...#############################################################################################", "", "444                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097...#############################################################################################" + "'", str3, "0097...#############################################################################################");
    }

    @Test
    public void test45656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a0000000000aaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "7.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "7.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45658");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##000###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444440000", "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                    ", 267);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                 " + "'", str4, "                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                 ");
    }

    @Test
    public void test45659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45659");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("HI", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##100.0###", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.  a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097                 ...                                                    ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 13 + "'", int23 == 13);
    }

    @Test
    public void test45660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test45662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45662");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 191, (float) 7L, (float) (short) 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 191.0f + "'", float3 == 191.0f);
    }

    @Test
    public void test45663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("#####################################################...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE97TRUE97aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45664");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790", (java.lang.CharSequence) "0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test45665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aahaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.a97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45666");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444", "-EURT04444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45667");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                     100.0                                                     aaaa                                     ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("0true-1.00###########################################################################################################################################################################################################################", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               444444444444.", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test45668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45668");
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
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test45669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45669");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45670");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                          4444444...4444444...4444444...4...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) ".001 444440true-1.0097...4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".001 444440true-1.0097...4" + "'", str1, ".001 444440true-1.0097...4");
    }

    @Test
    public void test45672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("097.0                       a                    ", 571, "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444097.0                       a                    " + "'", str3, "0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444097.0                       a                    ");
    }

    @Test
    public void test45673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45673");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test45674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0TRUE-1009", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1009" + "'", str2, "0TRUE-1009");
    }

    @Test
    public void test45675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45675");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test45676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 652);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test45677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45677");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444", 14);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("44444444444444..", "Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test45678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45678");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("       0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr        ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test45679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45679");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "                                                                                                                                                                                                                                                                 ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("a HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a HI!HI!HI!HI!HI!HI!H" + "'", str1, "a HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test45682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45682");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 49);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("...44444...true-1.4444444...97.4444444...4444444444444...", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444A");
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test45683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45683");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                               true  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444444444444444444444a...atruea-a1a.a4444444a...a97a.a4444444a...a4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444a...atruea-a1a.a4444444a...a97a.a4444444a...a444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444a...atruea-a1a.a4444444a...a97a.a4444444a...a444444444444444444444444444444444444444444");
    }

    @Test
    public void test45685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                    ", 655);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                    " + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                    ");
    }

    @Test
    public void test45686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", 182);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45687");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test45688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45688");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" true 1.  97.                            ", "                                                                                           ", 78);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "             rue-1.0097.0", 132, 45);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test45689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45689");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 444444444444444444444444444444444444444444" + "'", str1, "79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 4444444444444444444444444444444444444444444440000e00000 79    -eurt 444444444444444444444444444444444444444444");
    }

    @Test
    public void test45690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45690");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a4444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                           AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH A", 149, 950);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!", "ahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi...aahi!hi!hi!hi!hi!hi!hi!hi!hi!hi..444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.", "...4444444444444444444444444440t...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!" + "'", str3, "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!");
    }

    @Test
    public void test45692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45692");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" true 1.  97.", 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str1, "0TRUE-1.0097.04aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test45694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45694");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...000     ...", 234);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45695");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("..0true-1.0097.00true-1.0097.00true-1.0097.00tr", 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test45696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45696");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(".############################################", "a0aaaaa##############0true-1.0097.0444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a.........a....0001.....................................................a.........a", "                          44444444444444444444444a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a.........a....0001.....................................................a.........a" + "'", str2, "4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a.........a....0001.....................................................a.........a");
    }

    @Test
    public void test45698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45698");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...44444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 44444444444444444444444444...", "AAAAAAaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444TRUE-1.00TRUE-1.97.", "0TRUE...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444TRUE-1.00TRUE-1.97." + "'", str2, "4444444TRUE-1.00TRUE-1.97.");
    }

    @Test
    public void test45700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   hi!hi!..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   hi!hi!...");
    }

    @Test
    public void test45701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45701");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444...7900.1-eurt044444444444444444", "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", (int) (byte) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "44444a4444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444444444444444444444444...7900.1-eurt044444444444444444" + "'", str7, "444444444444444444444444...7900.1-eurt044444444444444444");
    }

    @Test
    public void test45702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a.7900.1-eurt0444444444444444444444444444444444444444444444a.7900.1-eurt04444444444444444444a.7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a.7900.1-eurt0444444444444444444444444444444444444444444444a.7900.1-eurt04444444444444444444a.7900.1-eurt04444444444444444444444444444444444444444444" + "'", str1, "a.7900.1-eurt0444444444444444444444444444444444444444444444a.7900.1-eurt04444444444444444444a.7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test45703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45703");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...##############################################......##############################################...AE444444444444444444444", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45704");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test45705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!################################hI!#######################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45706");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test45707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444...Aa4a4a4a444444444444444444444444", "true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444...Aa4a4a4a444444444444444444444444" + "'", str2, "0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444444444444444444444440TRUE-1.0097.0A0A44444444444444444444444...Aa4a4a4a444444444444444444444444");
    }

    @Test
    public void test45708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444..", "True-1.00-1.0097.0444444444444444444444444444444", "4000                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
    }

    @Test
    public void test45709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("A44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A44444" + "'", str1, "A44444");
    }

    @Test
    public void test45710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45710");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("     ...44                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(".............................................", "HH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHrt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "............................................." + "'", str2, ".............................................");
    }

    @Test
    public void test45712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test45713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.0", "A ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45714");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444444444444444444444444..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444..\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Aaaaaaa      a         a         a         a         aaaaaaaa", 544);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaa      a         a         a         a         aaaaaaaa" + "'", str2, "Aaaaaaa      a         a         a         a         aaaaaaaa");
    }

    @Test
    public void test45716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45716");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 623, 229L, (long) 465);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 229L + "'", long3 == 229L);
    }

    @Test
    public void test45717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45717");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) 4, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test45718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45718");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...0", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A        ", (-1));
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("a     0trae-1.0097.00trae-1.0097.00trae-1.0097.00trhiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahh", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test45719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45719");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 451);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45721");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                       A0                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test45722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                     AAAH                     AAA", "a HI!HI!HI!HI!HI!HI!H#####################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     AAAH                     AAA" + "'", str2, "                     AAAH                     AAA");
    }

    @Test
    public void test45723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45723");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                 444...44444444444444444444444444444444440TRUE-1.0097                                                                                                                                                                                          ", "!hi!hiTTTTTTi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45724");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAA", 65, 441);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a44444A A ###################################", "A0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a44444A A ###################################" + "'", str2, "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a4444444444444444444444...4444444444444444444444444444444444444444444444                       4a44444A A ###################################");
    }

    @Test
    public void test45726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45726");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...                                                   ", "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA", " a UE-1       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test45727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "               444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               444444444444" + "'", str1, "               444444444444");
    }

    @Test
    public void test45728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45728");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                               0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a" + "'", str1, "a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a");
    }

    @Test
    public void test45730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45730");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a a a a a", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "H!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 43 + "'", int17 == 43);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test45731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45731");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 69, (float) 61L, (float) 797);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 61.0f + "'", float3 == 61.0f);
    }

    @Test
    public void test45732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...a..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...a.." + "'", str1, "...a..");
    }

    @Test
    public void test45733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45733");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#######...#######...#######...#######...#######...#######...#######...#######...######           ", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45734");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444444444444444444444444444444444444444444444440true-1.0097.0444404444", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45736");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...44444444444444444444440TRUE-1.0440true-1.0097.0aaaa0aaaaa...44444444444444444444440TRUE-1.04", "44444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45737");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444                                                   ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("0true-1.0              ...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45738");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...00.7900.1-eurt00.79......aaa", "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45739");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", "    4444444444444444444444444444   ", 650);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str5, "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test45740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45740");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(65L, 101L, (long) 645);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 645L + "'", long3 == 645L);
    }

    @Test
    public void test45741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45741");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A44444", "        a                     44444444444444444444444444444444444444444444444444444444444444", 179);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45742");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00aaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45743");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A.7ee444ee44440.7ee444ee44440.7ee444ee44440.7e", "0097..##################################....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..0097..##################################");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "#########################################################################################################################################################                                                                                                                                  0AAAA                                                                                                                                  #########################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test45744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("A .7ee444ee44440.7ee444ee44440.7ee444ee44440.7e", 330, 441);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A .7ee444ee44440.7ee444ee44440.7ee444ee44440.7e" + "'", str3, "A .7ee444ee44440.7ee444ee44440.7ee444ee44440.7e");
    }

    @Test
    public void test45745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("######################################################################################################################################################################...################################################################################################################################################################", "4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970", "                                       true  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970");
    }

    @Test
    public void test45747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45747");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       ", "                                      4444400       0444444                                     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "             AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test45750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45750");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                             ...0TRUE-1.0097...                             ", "   44444AAAAAAAAAAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45751");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45752");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("... A A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", "a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790", 549);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   " + "'", str3, "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ");
    }

    @Test
    public void test45754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45754");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test45755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", "A0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test45756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45756");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAAA", "4444444444444444444", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45757");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                      ...                                                     ", 93);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45758");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test45759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("true-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h############################...", 24, "...44444444444444444444444444444444440true-A...44444444444444444444444444444444440true-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h############################..." + "'", str3, "true-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h############################...");
    }

    @Test
    public void test45760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################0097.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################0097.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##############################################0097.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test45761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                              0TRUE-1 0097 0", 190);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                               0TRUE-1 0097 0                 " + "'", str2, "                                                                                                                                                               0TRUE-1 0097 0                 ");
    }

    @Test
    public void test45762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444...4444444444........44444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45763");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "..1.u..T", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...                                                                                                                               ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                                               ..." + "'", str2, "...                                                                                                                               ...");
    }

    @Test
    public void test45765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45765");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "44444a4444", 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45766");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 12.0f, 4.444444444444444E27d, (double) 330);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.444444444444444E27d + "'", double3 == 4.444444444444444E27d);
    }

    @Test
    public void test45767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#" + "'", str1, "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0##Art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#");
    }

    @Test
    public void test45768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45768");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 52, (long) 79);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 79L + "'", long3 == 79L);
    }

    @Test
    public void test45769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45769");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a   HI!HI!...truea   HI!HI!...-a   HI!HI!...a   HI!HI!...a   HI!HI!...97a   HI!HI!...a   HI!HI!...", "a0aaaaa", 521);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45770");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 497 + "'", int2 == 497);
    }

    @Test
    public void test45771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45771");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test45772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45772");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                  ", (double) 27.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.0d + "'", double2 == 27.0d);
    }

    @Test
    public void test45773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                true-1.4444444...97", "      a         a         a         a         a                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test45774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45774");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      100.0                                                     aaaa", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test45775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45775");
        char[] charArray16 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaa0aaaa", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                          ", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...", charArray16);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... a4true4-44497", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 45 + "'", int20 == 45);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test45776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45776");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444444...4444444444........4444444444444444444444444444.#######################", "...                          ...", 253);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45777");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "4444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0TRUE-1.0aaaaA44444...", 213, 463);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA 0true-1.00-1.0097.0444444444444444444444444444444...", 660, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA 0true-1.00-1.0097.0444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA 0true-1.00-1.0097.0444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "444 44444 4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444 44444 4444444444444444444444444" + "'", str1, "444 44444 4444444444444444444444444");
    }

    @Test
    public void test45781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45781");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00#######000#######000#######0011", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", (java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00#######000#######000#######0011" + "'", str4, "00#######000#######000#######0011");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00#######000#######000#######0011" + "'", str6, "00#######000#######000#######0011");
    }

    @Test
    public void test45782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45782");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45783");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                       a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test45784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45784");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "0H!IH!H!IH!.H!IH!H!IH!0010H!IH!H!IH!.H!IH!H!IH!0H!IH!H!IH!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH" + "'", str2, "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH");
    }

    @Test
    public void test45786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45786");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("#######    a   HI!HI!...", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45787");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444", "...         aaaa0aaaaa", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45788");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...", "                                            AAAA", "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test45789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0TRUE-1.04444444...4444444...444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.04444444...4444444...444" + "'", str2, "0TRUE-1.04444444...4444444...444");
    }

    @Test
    public void test45790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(".0097.00true-1.00", 461, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.0097.00true-1.00" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444.0097.00true-1.00");
    }

    @Test
    public void test45791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45791");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 416, (long) 655, 741L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 741L + "'", long3 == 741L);
    }

    @Test
    public void test45792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 329, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test45793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                         ", 461);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHIHIHA                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test45794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                          ...####################################.....         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097....         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097....         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097....         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097....         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097....         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097....         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097....         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097....         aaaa0aaaaaTRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097....     ", 257);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45795");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("a a a a", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a a a a" + "'", str2, "a a a a");
    }

    @Test
    public void test45797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45797");
        long[] longArray4 = new long[] { 'a', (byte) 100, 52L, 44 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 100, 52, 44]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 44L + "'", long5 == 44L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 44L + "'", long6 == 44L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 44L + "'", long9 == 44L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 44L + "'", long10 == 44L);
    }

    @Test
    public void test45798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45798");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 16, 664.0f, (float) 38L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
    }

    @Test
    public void test45799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45799");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-1.00true-1.97.true-                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45800");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("...7900...7900...7900...7900", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444497.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444", 449);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str9, "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE" + "'", str10, "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE");
    }

    @Test
    public void test45801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444", 4444444, 124);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444 TRUE-1. 97. 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test45802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45802");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("           rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0            ", "Ah!ih!h!ih!A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A                                                                                                                                                                                                                                                                                                                                                                                                              ", 449);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45803");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true-1.0097.00true-1.0097.00true-1.0097.00trA0t", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45804");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444A   hi!hi!hi!h####################################################################################################", (double) 585.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 585.0d + "'", double2 == 585.0d);
    }

    @Test
    public void test45805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       aaaa0aaaaa                     ...", 59, 819);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test45806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45806");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRUE-1.  97.", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444440444", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00tr A", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test45807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0true-1.0097.0444444444444444444444444", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.0444" + "'", str2, "0true-1.0097.0444");
    }

    @Test
    public void test45808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45808");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrueaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444" + "'", str3, "44444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrueaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444");
    }

    @Test
    public void test45809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE#########################################################################################################################", 32, "                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE#########################################################################################################################" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE#########################################################################################################################");
    }

    @Test
    public void test45810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45810");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444att-------ttt-------ttt-------tt", 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test45811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                      4444444444444444444444444444444444444444444444444444444444", "                                                                         aaaa0aaaaa   ", 31);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45812");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "true............44444444444444444444444444444444444444444440true-1.0097.a44444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097.a4444444444444444444444444444444444444444444440true-1.0097...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45813");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "                                                                                               100.0                                                                                                                                                                                                                                                                                                                                               ", 967);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
    }

    @Test
    public void test45815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45815");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444...444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test45816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45816");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..                                                                                                                                                                                                                                                                                                                                                                                                                 ", 202);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45817");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "    a   HI!HI!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence) "                       0aaa                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444");
    }

    @Test
    public void test45819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45819");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444444444444444440true-1.0097...a0aaaaa0true-1.0097.0444100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 444444444444444440true-1.0097...a0aaaaa0true-1.0097.0444100.0 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45820");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("a...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a..." + "'", str1, "a...");
    }

    @Test
    public void test45821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("0 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA         A         A        ...", 134);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 " + "'", str3, "0 ");
    }

    @Test
    public void test45822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("..7900");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..7900" + "'", str1, "..7900");
    }

    @Test
    public void test45823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45823");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0                       A                                 true                       A                                 -                       A                                 1                       A                                 .                       A                                 0097                       A                                 .                       A                                 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0                       A                                 true                       A                                 -                       A                                 1                       A                                 .                       A                                 0097                       A                                 .                       A                                 0" + "'", str1, "0                       A                                 true                       A                                 -                       A                                 1                       A                                 .                       A                                 0097                       A                                 .                       A                                 0");
    }

    @Test
    public void test45824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45824");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ", "     0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaa0aaaaa    ");
    }

    @Test
    public void test45826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45826");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 50, (double) 202.0f, (double) 179);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 50.0d + "'", double3 == 50.0d);
    }

    @Test
    public void test45827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0aaaa", 260, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...      0aaaa               ..." + "'", str3, "...      0aaaa               ...");
    }

    @Test
    public void test45828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45828");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  A      A                            100.0                                                     AAAA");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("a HI!HI!HI!HI!HI!HI!H", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test45829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45829");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0097      A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...", " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                        ", "079001-eurt0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                        " + "'", str2, "                                                                                                                                        ");
    }

    @Test
    public void test45831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0aaa", "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0aaa" + "'", str2, "0aaa");
    }

    @Test
    public void test45832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45832");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  AAA...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097...AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45833");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444444444444444440TRUE-1.0097.0", "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", 4444444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45834");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", str4, " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test45835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45835");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A", 788, "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################44444444400    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A" + "'", str3, "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################44444444400    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
    }

    @Test
    public void test45836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                             00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ", 130, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 " + "'", str3, "                             00       0                 ...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test45837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45837");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 18, (long) 635, 819L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18L + "'", long3 == 18L);
    }

    @Test
    public void test45838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45838");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "!", 56);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test45839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45839");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00       000       000       00a", "A44444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HI...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....!");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("0", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("......4444444...4444444...4444444.....", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '#');
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...44444444444444");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, "4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", strArray4, strArray15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "......4444444...4444444...4444444....." + "'", str13, "......4444444...4444444...4444444.....");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str18, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test45840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45840");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AA44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444A44444", "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "aaaaaaaaaaaaaaaaaaaaaaaa0AAAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test45841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45841");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 669 + "'", int1 == 669);
    }

    @Test
    public void test45842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45842");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 841);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45843");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "  4444444444444444444444444 true - 1 . 97 . 44444444444444..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45844");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test45845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45845");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-E", (float) 16);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.0f + "'", float2 == 16.0f);
    }

    @Test
    public void test45846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45846");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("444444a444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test45847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaa", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa" + "'", str2, "aaaaaaa");
    }

    @Test
    public void test45848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45848");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#a#44444444444444444444#...#444444444444444444444444444444444444444444444", "                                      100.0I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I!4I444444444444444444444444444444", 671);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                       444...44444444444444444444444444444444440true-1.0097...44444...44444444444444", 23, 179);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45849");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...444444440tr...", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444440tr..." + "'", str3, "...444444440tr...");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...444444440tr..." + "'", str5, "...444444440tr...");
    }

    @Test
    public void test45850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45850");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444...", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444", "                      aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444440 true-1.0 97.0 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test45852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...###################################################", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...###################################################" + "'", str2, "...###################################################");
    }

    @Test
    public void test45853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45853");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                 ", "44444444444444444444444444444444444444444444444444...");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("hI!", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444444444444444444444444444                                                                                                                   0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097... ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test45854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45854");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...444444444444444444444444444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444", "                                                                                                                                                                            ...", 53, 279);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444444444444...                                                                                                                                                                            ...44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444" + "'", str4, "44444444444444444444444444444444444444444444444444...                                                                                                                                                                            ...44...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
    }

    @Test
    public void test45855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45855");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 100, 330.0d, (double) 13L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.0d + "'", double3 == 13.0d);
    }

    @Test
    public void test45856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45856");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0TRUE-1.0097.0", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".............................................", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a A 1000 A A", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("044444444444444444444444444                                                                                    ", charArray9);
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
    public void test45857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45857");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A      ...", "Aahaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45858");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444440444", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("44...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test45859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45859");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", "                   .0097.00tr          ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45860");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                                                                                                                                                                                                                  4444444TRUE-1.00TRUE-1.97.                                                                                                                                                                                                                                                                                                                                   ", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 826);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45861");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 0, 541);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45862");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440TRUE-1.0097...44444", 451);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "                                      100.0i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i!4i444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45864");
        int[] intArray3 = new int[] { 267, (byte) -1, 267 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[267, -1, 267]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 267 + "'", int4 == 267);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 267 + "'", int8 == 267);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test45865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45865");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                                                                      100.0                                                                                      100.0", "    a0a                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45866");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("        HI!H4444404444HI!HI.A A A ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test45867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45867");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaa0AAAA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45868");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                          44444444444444444440true-1.0097HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ", "  A      A                            100.0                                                     AAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45870");
        char[] charArray16 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444                                      100.0                                                     aaaa444444444444444444444", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray16);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsAny("4479", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 45 + "'", int20 == 45);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test45871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45871");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...0TRUE-1.0097...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00" + "'", str3, "0    -1.0097.00    -1.0097.00    -1.0097.00   A 0    -1.0097.00    -1.0097.00    -1.0097.00");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test45872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaa                                                     0.001                            A      A  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa                                                     0.001                            A      A  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaa                                                     0.001                            A      A  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45873");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4...44444444444444444444a                       ", "0true-1.0097.  a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097                 ...                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test45874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45874");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444404444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45875");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4044444444444444444444444444                                                                                    0TRUE-1.0097.044444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..", "#########################################hi!hi!hi!hi!hi!hi!hi!", "                                                  44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I.." + "'", str3, "IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I......IH IH IH IH IH IH IH IH IH IH IH IH IH IH IH I..");
    }

    @Test
    public void test45877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45877");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                       A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111                                                                                                                             4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", "444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...444444444444444444444444444444444444444440TRUE-1.0097...44444444444444444444444                 ...                                                     ", 124);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111                                                                                                                             4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444" + "'", str3, "                                       A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111                                                                                                                             4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
    }

    @Test
    public void test45878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45878");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh", "                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ", 424);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444..." + "'", str4, "....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa....4444444444444444444444444444...");
    }

    @Test
    public void test45879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45879");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("...T0444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test45880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45880");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", "444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.444444444444.4444444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45881");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a.7900.1-eurt044444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45882");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45884");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45885");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "00       0true00       0-00       000                                                       ", (java.lang.CharSequence) "       AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "00       0true00       0-00       000                                                       " + "'", charSequence2, "00       0true00       0-00       000                                                       ");
    }

    @Test
    public void test45886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45886");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                         ...                                                    ", "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", 39);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4", 548, 47);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test45887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("att-------ttt-------ttt-------t", "4444444444444444444444444444444444444444444...4444444.79...444444hI!HI!HI!HI!HI!HI!HI!HI!HI!HI4444444444444444444444444444444444T00.7900");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "att-------ttt-------ttt-------t" + "'", str2, "att-------ttt-------ttt-------t");
    }

    @Test
    public void test45888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45888");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaa0aaaa0.790", 245);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 245 + "'", int2 == 245);
    }

    @Test
    public void test45889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test45890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("    a   HI!HI!...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "                                                                                                                                                                           a         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45891");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...true-1....97....      #a######################...##############################################      #a######################.", "", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test45892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                  ###########################################################################################################################################################################################################################00.1-eurt0                                                                                                                                                                                                                                                                                                                   ", "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0                                            a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                  ###########################################################################################################################################################################################################################00.1-eurt0                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                  ###########################################################################################################################################################################################################################00.1-eurt0                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test45893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ", 571, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            " + "'", str3, "                                                                                                                                                                                                                                                                                                                                            HI!                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test45894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45894");
        char[] charArray13 = new char[] { '4', '4', ' ' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     A    ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray13);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "true                 ...                                                                      ...                                                                      ...                                                                      ...                            44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ", charArray13);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                       a44444444444444444444...444444444444444444444444444444444444444444444                     ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 24 + "'", int17 == 24);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test45895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45895");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                     a        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45896");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("......4444444...4444444...4444444.....", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                       #A#44444444444444444444#...#44444444444444444444444444444444444444...");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "......4444444...4444444...4444444....." + "'", str4, "......4444444...4444444...4444444.....");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test45897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45897");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                                                                                                                                                   aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa                                                                                                                                                                                                                                                                                                                    ", "  A      A                            100.0                                                     AAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45898");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                                                                                                               ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "0TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 42, 9);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test45899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45899");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      A         A         A         A         A", "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47" + "'", str2, "A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47");
    }

    @Test
    public void test45901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", "                                                                                                AAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0..." + "'", str2, "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
    }

    @Test
    public void test45902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45902");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...A ..", "", 741);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45904");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A", "                         hi!                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ", 123, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaa A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ");
    }

    @Test
    public void test45906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45906");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4 0true-1.0097.044444444444444444444444444", (java.lang.CharSequence) "a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test45907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444...4444", 279);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                           44444...4444" + "'", str2, "                                                                                                                                                                                                                                                                           44444...4444");
    }

    @Test
    public void test45908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45908");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45909");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "                                           true-1.97.                                                                                   ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaa0aaaa0.7900.1-eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test45910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45910");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test45912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45912");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test45913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a4444444444444444444444444444444", "    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt04444444444444444444    A  .7900.1-eurt04444444444444444444444444444444444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444", 670, 97);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test45914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("            ...                                   ", 26, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...         ..." + "'", str3, "...         ...");
    }

    @Test
    public void test45915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A      A                            100.0                                                     AAAA", 100, "...44444444444444444444444444444444440TRUE-    A     ...44444444444444444444444444444444440TRUE-");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A      A                            100.0                                                     AAAA.." + "'", str3, "A      A                            100.0                                                     AAAA..");
    }

    @Test
    public void test45916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45916");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                  444444444444444444444444...44444                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45918");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATRUE97TRUE97AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAATRUE97TRUE97AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                   ", "######################################################HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...", "                                                                                                                                                                                                                                                                                                                  ###########################################################################################################################################################################################################################00.1-eurt0                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".7900.1-eurt0444444444444444444444444444444444444444444444    A   ..." + "'", str2, ".7900.1-eurt0444444444444444444444444444444444444444444444    A   ...");
    }

    @Test
    public void test45921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45921");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                0.001                                               ", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0.001", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "true-1.4444444...97", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "97.0", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test45922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45922");
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
        boolean boolean29 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-14444a44444                                                                                                                                           A 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.0097.00trA 0true-1.0097.00true-1.0097.00true-1.", charArray17);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test45923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45923");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4000                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4000                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test45924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaa", "#A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#44444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00tr A#A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#444444444444444444444444444444444444444444444     #A#44444444444444444444#...#44444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaa" + "'", str2, "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaa");
    }

    @Test
    public void test45925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                          44444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45926");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 27, "         a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                   a                                                                ...                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         a                 " + "'", str3, "         a                 ");
    }

    @Test
    public void test45927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444...                            ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45928");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(".0097.00true-1.0097.00trA0t...", (long) 479);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 479L + "'", long2 == 479L);
    }

    @Test
    public void test45929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45929");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444440true-1.0097.0100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444440true-1.0097.0100.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45930");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(634, 448, 463);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 634 + "'", int3 == 634);
    }

    @Test
    public void test45931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444", "1791-eurt");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444 true-1. 97. 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test45932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45932");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Rue-1.0097.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test45933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444444444444444440true-1.0097.444444444444444444444444", "44444444444444444444444444444444444444444440");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444440true-1.0097.444444444444444444444444" + "'", str2, "44444444444444444440true-1.0097.444444444444444444444444");
    }

    @Test
    public void test45934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45934");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "44444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...4444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("00       000       000       00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00       000       000       00" + "'", str1, "00       000       000       00");
    }

    @Test
    public void test45937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test45938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("1000", "0TRUE-1.00-1.0097.04444444444444444444444444444444AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.00-1.0097.04444444444444444444444444444444AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                    " + "'", str2, "0TRUE-1.00-1.0097.04444444444444444444444444444444AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                    ");
    }

    @Test
    public void test45939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45939");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444440TRUE-1.0097.                    44444444444444444444444444      #a######################...##############################################      #a######################.", "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45940");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 99, (float) 191, 330.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 330.0f + "'", float3 == 330.0f);
    }

    @Test
    public void test45941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45941");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.00..");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test45942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444", "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45943");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A ...", "                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4444444                                                                                                                                                                                                                                                                                                                                                                                                               ", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test45944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45944");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test45945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45945");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  4444444444444444444444444 true - 1 . 97 . 44444444444444..", "ue-1.0097...444444444444444444444444                                                                                        100.");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45946");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................79...1-eurt", "                                                                                                                                                                                  ", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45947");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45948");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "  4444444444444444444444...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45949");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###########################################################################################################################################################################################################################00.1-eurt0                                                                                                    ", "                                                                                                                                                                                                                                                        aaaa0                                                                                                                                                                                                                                                         ", 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45950");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...7.044444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test45951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 726, "444444444444444444444444.#######################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444" + "'", str3, "444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444444444444444444444.#######################444444");
    }

    @Test
    public void test45952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444", 165, "                                                                                                                                                                                                                                                                                                                                                                                             4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444                                                                   " + "'", str3, "   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444                                                                   ");
    }

    @Test
    public void test45953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str2, "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test45954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45954");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444                A A ###################################                 97...#############################################################################################", "97..######################################97atrue-1.#########################################", "...AAAAAAA", 667);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444                A A ###################################                 97...#############################################################################################" + "'", str4, "444444444                A A ###################################                 97...#############################################################################################");
    }

    @Test
    public void test45955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                             ", 502, "...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                             " + "'", str3, "                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test45956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444404444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444404444" + "'", str1, "4444404444");
    }

    @Test
    public void test45957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45957");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test45958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45958");
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      100.0                                                     aaaa", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                         ...                                                     ", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444...44444444444444444444444444444444440TRUE-1.0097...44444...444444444...", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("100.0                ...", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test45959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45959");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("A   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAAAAAAAAAAA", "0444444444       44444A   hi!hi!0444444444       44444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test45960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45960");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...44444444444......", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...t0444444444444444444444444444.....#...#...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...t0444444444444444444444444444.....#...#..." + "'", str1, "...t0444444444444444444444444444.....#...#...");
    }

    @Test
    public void test45963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-eurt04444444444444444444444444444444444...444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-eurt04444444444444444444444444444444444...444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-eurt04444444444444444444444444444444444...444");
    }

    @Test
    public void test45964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                           444444444444", 359);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45965");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("   4444444...AAAAAAAAA44444444...", (float) 542);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 542.0f + "'", float2 == 542.0f);
    }

    @Test
    public void test45966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45966");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                     AAAA0AAAAA              ", 64, 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45967");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("true-97", "114");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...4444...444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444...444444444" + "'", str1, "...4444...444444444");
    }

    @Test
    public void test45969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                             0                                                                                                                          4444444...4444444...4444444...4...                       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test45970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45970");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    public void test45971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45971");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444...4444444...4444444...4...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                    .001                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".001" + "'", str1, ".001");
    }

    @Test
    public void test45973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test45974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                    ", "44444444444444444444444444444444444444444AAAAAAAAA...4444444   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0aaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    " + "'", str3, "                                                    ");
    }

    @Test
    public void test45975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45975");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", "                        ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str7, "Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0" + "'", str8, "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
    }

    @Test
    public void test45976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45976");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("   a   HI!HI!                                                                                      ", "                           TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR                            ", 546);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test45977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45977");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A44444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 179);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0097...##########################################0##############################################0097...#############################################################################################0097...#############################################################################################0097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test45978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45978");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                  4444444TRUE-1.00TRUE-1.97.                                                                                                                                                                                                                                                                                                                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA Aa         a                                                     1000    a         aa         a                                                     1000    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test45979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45979");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     A    ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray6, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.concatWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.Object[]) strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "...........................................................................................................................................................................");
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("A0a", strArray9);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4" + "'", str10, "4");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test45980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45980");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45981");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444" + "'", str1, "0true-1.0097.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test45982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45982");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("aaaa0aaaaa", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test45983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45983");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test45984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45984");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(625, 29, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 625 + "'", int3 == 625);
    }

    @Test
    public void test45985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45985");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI########", "truetruetruetruetruetruetruetruetrue");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test45986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(".001                                                                                                                                                                                                                                                                                                                                                                                                                                           444440true-1.0097...4", 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test45987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45987");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test45988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45988");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "0h!ih!h!ih!.h!ih!h!ih!0010h!ih!h!ih!.h!ih!h!ih!0h!ih!h!ih!hi", 224, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test45989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "       ...      a         a         a         a         a0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-10aaaa00970aaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test45991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00       000       000       00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test45992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45992");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##100.0###0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-10AAAA00970AAAA0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test45993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA.1-eurtaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaAaAaA4444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaa", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00t100.0#####100.0###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45994");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45995");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                       ", 120, 80);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test45996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45996");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A", "         aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa          ", (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test45997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "                                                                                  ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test45998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!HI!...a    " + "'", str2, "   HI!HI!...a    ");
    }

    @Test
    public void test45999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test45999");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test46000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest91.test46000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("###    a   HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###    a   HI!HI" + "'", str1, "###    a   HI!HI");
    }
}

