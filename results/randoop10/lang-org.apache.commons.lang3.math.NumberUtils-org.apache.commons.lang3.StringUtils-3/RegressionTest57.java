import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest57 {

    public static boolean debug = false;

    @Test
    public void test28501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ..." + "'", str1, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa       ...");
    }

    @Test
    public void test28502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444a4444", "444                                      100.0                                                     aaaa444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444TRUE-1.00TRUE-1.97.", 534, 841);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("####################################################################################################################################################################################################################################################...t0444444444444444444444444444...", "0                                                                                                                                                                                                                                                                          0                                                               A A A A A0                                                                                                                                                                                                                                                                          0                                                               ", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0    ..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################################################################################################################...t0444444444444444444444444444..." + "'", str3, "####################################################################################################################################################################################################################################################...t0444444444444444444444444444...");
    }

    @Test
    public void test28505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28505");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                ...444444", "..0true-1.0097.00true-1.0097.00true-1.0097.00tr", 625, 86);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                ...444444..0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str4, "                                                                ...444444..0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test28506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                       0aaaa                                                                                                                                  A                                                                                                                                  0aaaa                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                       0AAAA                                                                                                                                  A                                                                                                                                  0AAAA                                                                                                                                      " + "'", str1, "                                                                                                                                       0AAAA                                                                                                                                  A                                                                                                                                  0AAAA                                                                                                                                      ");
    }

    @Test
    public void test28507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", "aa 100.0aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A" + "'", str1, ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A");
    }

    @Test
    public void test28510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001" + "'", str1, "0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001                                                                                      0.001");
    }

    @Test
    public void test28511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28511");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "100.0                                                     aaaa", (java.lang.CharSequence) "0TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "100.0                                                     aaaa" + "'", charSequence2, "100.0                                                     aaaa");
    }

    @Test
    public void test28512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 ", 0, 419);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 " + "'", str3, "004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 ");
    }

    @Test
    public void test28513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                                                                                                                              4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("044444444444444444444444444....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH", 170, "                                       rue-1.0097.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "044444444444444444444444444....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH" + "'", str3, "044444444444444444444444444....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH");
    }

    @Test
    public void test28515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28515");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                              ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test28516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("97...#############################################################################################", "44444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97...#############################################################################################" + "'", str2, "97...#############################################################################################");
    }

    @Test
    public void test28517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str1, "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
    }

    @Test
    public void test28518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...44444444444...                                                                                                                                                              ", "4 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444...                                                                                                                                                              " + "'", str2, "...44444444444...                                                                                                                                                              ");
    }

    @Test
    public void test28519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28519");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test28520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                  a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a                                                                                                                                                                                                                                                                                  ", 179, 201);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                               a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!..." + "'", str3, "...                                                                                               a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test28521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28521");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    A     " + "'", str3, "    A     ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    A     " + "'", str4, "    A     ");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test28522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444", "                                                                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28523");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444..4444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test28524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28524");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a" + "'", str1, "HHHHHHHHHHHHHHHHHHHrue-1.0097.0             a");
    }

    @Test
    public void test28525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28526");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28527");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "####################################...", 502);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa" + "'", str1, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28529");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", 608, 111);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                 ", "                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test28531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 630, 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test28533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28533");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444 100.0 aaaa444444444444444444444", "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444                                                                                              0097..0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.04444444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 4                                                                                              0097..0true-1.0097.040true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.0" + "'", str2, "0true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 4                                                                                              0097..0true-1.0097.040true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.04 40true-1.0097.0");
    }

    @Test
    public void test28535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", "a hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... AA hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT" + "'", str2, "EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT");
    }

    @Test
    public void test28536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......" + "'", str1, "A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!...A                                                                                     a   hi!hi!......");
    }

    @Test
    public void test28537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28537");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("    A         A                                                     100.0    A         A         ", 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 68 + "'", int2 == 68);
    }

    @Test
    public void test28538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         ...", "...00.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444...", "0097...4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         000" + "'", str3, "         000");
    }

    @Test
    public void test28539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ..." + "'", str1, "0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...");
    }

    @Test
    public void test28540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28540");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 833, (long) 277, 16L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 833L + "'", long3 == 833L);
    }

    @Test
    public void test28541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                    .001                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".001" + "'", str1, ".001");
    }

    @Test
    public void test28542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28542");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 48, (double) 64L, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test28543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("....414-4eurt40", 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28544");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                       A                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28545");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(257.0f, 39.0f, 73.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 39.0f + "'", float3 == 39.0f);
    }

    @Test
    public void test28546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28546");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 655L, (float) 164, (float) 69L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 655.0f + "'", float3 == 655.0f);
    }

    @Test
    public void test28547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("079001-eurt0", "a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "079001-eurt0" + "'", str2, "079001-eurt0");
    }

    @Test
    public void test28548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444440TRUE-1.009...", 585, "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009..." + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.009...");
    }

    @Test
    public void test28549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28549");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28551");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tre-1.0097.00tru...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 93);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28552");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "        A                             ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28553");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444...44444444444444444444444444444444440true-1.0097...44", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("       ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 43 + "'", int14 == 43);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28554");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28555");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                       444...44444444444444444444444444444444440true-1.0097", "                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28556");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "44444444444444444444444444444444444444444440true-1.0097.", 93);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', (int) (short) 100, 24);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                                                                                                                                                          44444444444444444440true-1.0097HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test28557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28557");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28558");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAA   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1 0097   AA                                        ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28559");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 73, (double) 0.044444446f, (double) 269.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04444444552063942d + "'", double3 == 0.04444444552063942d);
    }

    @Test
    public void test28560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28560");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 49, (float) 548, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test28561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(".true-1...97..44444444444444444444444444444444444444444", "         000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".true-1...97..44444444444444444444444444444444444444444" + "'", str2, ".true-1...97..44444444444444444444444444444444444444444");
    }

    @Test
    public void test28562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a         a                                                     1000    a         a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a         a                                                     1000    a         a" + "'", str1, "a         a                                                     1000    a         a");
    }

    @Test
    public void test28563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28564");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 123.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 123.0d + "'", double2 == 123.0d);
    }

    @Test
    public void test28565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28565");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(51, 86, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test28566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28566");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test28567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                        ", 982);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test28568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28568");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("E-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28571");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################", "", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test28572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...        A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...        A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  " + "'", str2, "...        A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  ");
    }

    @Test
    public void test28573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0", "                                                                                                                                                                                                                                                                                                  ", "###############################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0" + "'", str3, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a0");
    }

    @Test
    public void test28574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28574");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...4...4444444...4444444...4444444                      0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28575");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaa0.7900.1-eurt0A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", "                                                                            ###    A   hi!hi!.                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "0.0010.0hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  " + "'", str3, "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  ");
    }

    @Test
    public void test28577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28577");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28578");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "TRUE-1.0097.0", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                     AAAA0AAAAA                     ...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14 + "'", int17 == 14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test28579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                      44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444                                                                                                                                                                                                                                                                       ", "                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                      44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444                                                                                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                                                                                      44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test28580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28580");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444", (double) 93L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4444444444444444E52d + "'", double2 == 4.4444444444444444E52d);
    }

    @Test
    public void test28581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28581");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 46L, (double) 13.0f, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test28582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28583");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444...4444444...44a1a4444444...4444444...44...a1", "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 533, 63);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444...4444444...44a1a4444444...4444444...44...a1     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "4444444...4444444...44a1a4444444...4444444...44...a1     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28584");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0.7900.1-EURT0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28586");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("          true -   97  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true -   97" + "'", str1, "true -   97");
    }

    @Test
    public void test28588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                       a                             ###    a   HI!HI!...###    a   HI!HI!...###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             a     ", 788, 224);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 648, "hI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
    }

    @Test
    public void test28591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28591");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "                 ...                                                     aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28593");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) ".############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28594");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA", 585);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28596");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28597");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("       true-1.97.                                                                                   ", "4444444TRUE-1.00TRUE-1.97.", 660);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097" + "'", str1, "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...aaHI!HI!HI!HI!HI!HI!HI!HI!HI!HI..444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097.A4444444444444444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test28599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA" + "'", str1, "aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44a44444aA44444A44aAAAAAA4440true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA4#AAAAAA40true-1.0097.0AAAAAA");
    }

    @Test
    public void test28600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28600");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr A ", "rue-1.0097.0");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                               100.0                                                ", (int) (short) 100);
        java.lang.String[] strArray17 = new java.lang.String[] { "a", "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" };
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray17, strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                            100.0", strArray10, strArray17);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray24, "                     aaaa0aaaaa              ", (int) (byte) 100, (-1));
        boolean boolean29 = org.apache.commons.lang3.StringUtils.startsWithAny("100.0                                                     aaaa", strArray24);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("ih0.0100.0", strArray3, strArray24);
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str20, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                            100.0" + "'", str21, "                                            100.0");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ih0.0100.0" + "'", str30, "ih0.0100.0");
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test28601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 20, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444" + "'", str3, "44444444444444444444");
    }

    @Test
    public void test28602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28602");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 25, 817);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 817 + "'", int3 == 817);
    }

    @Test
    public void test28603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4444444...4444444...44a1a4444444...4444444...44...a1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...4444444...44a1a4444444...4444444...44...a1" + "'", str1, "4444444...4444444...44a1a4444444...4444444...44...a1");
    }

    @Test
    public void test28604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28604");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test28605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28605");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 20, (double) 28.0f, (double) 47.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 20.0d + "'", double3 == 20.0d);
    }

    @Test
    public void test28606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28606");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################", 55, 638);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28607");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(56L, 50L, 53L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 50L + "'", long3 == 50L);
    }

    @Test
    public void test28608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28608");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test28609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0", 220, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    " + "'", str3, "                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    ");
    }

    @Test
    public void test28610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28610");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Aaaa0aa00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                     100.0                                                     AAAA                                     ", "44444444444true444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     100.0                                                     AAAA                                     " + "'", str2, "                                     100.0                                                     AAAA                                     ");
    }

    @Test
    public void test28612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28612");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                     aaaaaaaaaa                     ", (java.lang.CharSequence) "                       #A#44444444444444444444#...#444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test28613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", 130, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28614");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("###0.001##", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".............................................", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray10);
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
    }

    @Test
    public void test28615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28615");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...44444444444444444444444444444444440TRUE-1.0097...", "444444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "44444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...44444444444444444444444444444444440TRUE-1.0097..." + "'", str4, "...44444444444444444444444444444444440TRUE-1.0097...");
    }

    @Test
    public void test28616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa", 130);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa" + "'", str2, "aaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
    }

    @Test
    public void test28618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                     AAAAAA0AAAAAAA              ", 123, 349);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28619");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4.44444453E18f, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test28620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28620");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28621");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444   !    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28623");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                ..", "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444444444", 648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ", 418, 424);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28626");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test28627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28627");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt", "                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ", 982, 557);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           " + "'", str4, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ");
    }

    @Test
    public void test28628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28628");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28629");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...        A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  ", "                                                                                                                                                                                                                                                                                                                                                                                                                               hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test28631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28631");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...", 895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("            A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ", "0true-1.0097...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28633");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444", "4777777777777777777777aaaa0aaaaa777777777777777777777777777777777777777777aaaa0aaaaa777777777777777777777777777777777777777777aaaa0aaaaa7777777...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...........");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..........." + "'", str1, "...........");
    }

    @Test
    public void test28635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                                                                                                HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test28636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28636");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444444444444444444444444...7900.1-eurt044444444444444444", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("...44444...true-1.4444444...97.4444444...4444444444444...", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                  4                   ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny("    4444444444444444444444444444   ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#########...##########........###########", charArray15);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444444444444444...TRUE-1.4444444...97.4444444...4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 45 + "'", int19 == 45);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 465 + "'", int25 == 465);
    }

    @Test
    public void test28637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa", 741);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "a0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test28638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28638");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH" + "'", str1, "0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH");
    }

    @Test
    public void test28640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28641");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444" + "'", str5, "0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str6, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test28642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28642");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("          ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444   !   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28643");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(98.0f, (float) 62, (float) 6L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 6.0f + "'", float3 == 6.0f);
    }

    @Test
    public void test28644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28644");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444440444", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test28645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28645");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "                                      100.0                                                     aaaa100100.0                                                     aaaa.100.0                                                     aaaa0100.0                                                     aaaa                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0atruea-a1a.a0097a.a", "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test28647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28647");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr A ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28648");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0atrue 1.  97.a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28649");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("   A         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   A\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28650");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...####################################...", "...44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test28651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                       #a######################...##############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       #a######################...##############################################" + "'", str1, "                       #a######################...##############################################");
    }

    @Test
    public void test28652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test28653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28653");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28654");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("..44440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444HI HI HI HI HI HI HI HI HI HI...4444a44444444                                                                                                                                                                   ", "44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH                                                                          44444                                                                        44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH   A4...44...AAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IH  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..44440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444HI HI HI HI HI HI HI HI HI HI...4444a44444444                                                                                                                                                                   " + "'", str2, "..44440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444HI HI HI HI HI HI HI HI HI HI...4444a44444444                                                                                                                                                                   ");
    }

    @Test
    public void test28656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test28657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28657");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                100.0#####100.0###", "                                                                                           ", "444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00Ta0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28658");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###    a   HI!HI!.", 156, 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28659");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a", (double) 403);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 403.0d + "'", double2 == 403.0d);
    }

    @Test
    public void test28660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28660");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28661");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(138, (int) '#', 123);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test28662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A" + "'", str1, "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A");
    }

    @Test
    public void test28663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test28664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str2, "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test28665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28666");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("        a                     ", "########################4444444444444444444444440TRUE-1.009...", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0444...44444444444444444444444444444444440TRUE-1.0097...4", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0444...44444444444444444444444444444444440TRUE-1.0097...4" + "'", str3, "0444...44444444444444444444444444444444440TRUE-1.0097...4");
    }

    @Test
    public void test28668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28668");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".7900.1-eurt04444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A", "0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "                                      hI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test28670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28670");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444..4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790");
    }

    @Test
    public void test28673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28673");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(625.0d, (double) 842L, (double) 615);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 615.0d + "'", double3 == 615.0d);
    }

    @Test
    public void test28674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28674");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 53L, (float) 82, (float) 833);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 53.0f + "'", float3 == 53.0f);
    }

    @Test
    public void test28675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                     aaaaaaaaaa                     ", "-EURT04444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaaaaaaaa                     " + "'", str2, "                     aaaaaaaaaa                     ");
    }

    @Test
    public void test28676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28676");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "1AAAAAAAAAAA4444444...4444444...4444444...4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1AAAAAAAAAAA4444444...4444444...4444444...4" + "'", str1, "1AAAAAAAAAAA4444444...4444444...4444444...4");
    }

    @Test
    public void test28677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28677");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                        A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   4444444444444444444", 384);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 384 + "'", int2 == 384);
    }

    @Test
    public void test28678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28678");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "0true-144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR009744444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0", "00000e0000");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test28679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28679");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440                                                                                                                                                                                                                                                                          true-1.0                                                                                                                                                                                                                                                                          97.0                                                                                                                                                                                                                                                                          4444444444444444444444444444444444444444444", "                                                                         aaaa0aaaaa   ", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28680");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("0AAAA4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0", 191, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("444444444444444444444444444444444444444444479-eurt44444444444444444444444444444444444444444447979-eurt4444444444444444444444444444444444444444444-eurt79-eurt44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("A   hi!hi!", "0true-100970");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   hi!hi!" + "'", str2, "A   hi!hi!");
    }

    @Test
    public void test28685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "                                                     ...                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test28686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                0.001                                      ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28687");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0true-1.0097...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test28688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28688");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "    a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28690");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                     AAAAAA0AAAAAAA              ", "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", 445);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28691");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4044444444444444444444444444                                                                                    0true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4044444444444444444444444444                                                                                    0TRUE-1.0097.044444444444444444444444444" + "'", str1, "4044444444444444444444444444                                                                                    0TRUE-1.0097.044444444444444444444444444");
    }

    @Test
    public void test28692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28692");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                         hi!                        ", "                     aaah                     aaa", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444                                                                                                                   0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28694");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("11111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test28695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28695");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("a HI!HI!HI!HI!HI!HI!H", "                            ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test28697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28697");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test28698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28698");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 179, " 4A4 4rt4004.479004.414-4eurt4004.479004.414-4eurt4004.479004.414-4eurt40");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097." + "'", str3, "444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test28699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28699");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (int) (short) 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "0TRUE-");
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "444444444444444444444444444444444444444444" + "'", str6, "444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...##################################################################################" + "'", str1, "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...##################################################################################");
    }

    @Test
    public void test28701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ", "44444444444444444444444444444444444444444444444444...TRUE", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   ");
    }

    @Test
    public void test28702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28702");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                    ", "...00.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 68);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
    }

    @Test
    public void test28703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28703");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444                                      100.0                                                     aaaa444444444444444444444", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444                                      100.0                                                     aaaa444444444444444444444" + "'", str3, "444                                      100.0                                                     aaaa444444444444444444444");
    }

    @Test
    public void test28704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28704");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", "44444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444...44444444444444444444444444444...444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28705");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0TRUE-1.00-1.0097.0                                           ", "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...", "#########.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru..." + "'", str2, "    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...");
    }

    @Test
    public void test28707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", "                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4444444444444444444");
    }

    @Test
    public void test28708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28708");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test28709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" rteurt  rteurt                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " rteurt  rteurt                                                                                     " + "'", str1, " rteurt  rteurt                                                                                     ");
    }

    @Test
    public void test28710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 4, 224);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr" + "'", str1, "aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr");
    }

    @Test
    public void test28712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28712");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 94, 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atruea-a1a.a97a.a", "A      A                            100.0                                                     aaaa", "         .");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28714");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A0444444444444444444444444444444444444444444", "a.7900.1-eurt0444444444444444444444444444444444444444444444a.7900.1-eurt04444444444444444444a.7900.1-eurt04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28715");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test28716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28716");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(665.0d, (double) 1L, (double) 292.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 665.0d + "'", double3 == 665.0d);
    }

    @Test
    public void test28717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr..." + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...");
    }

    @Test
    public void test28718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28718");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("rue-1.0097.0", "true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28719");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("444440true-1.0097.0100.0", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28720");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", "                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", (int) (short) 100);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 93, 37);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concatWith("", (java.lang.Object[]) strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "100.0                                                     aaaa..");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444", strArray4, strArray15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4444444..." + "'", str14, "4444444...");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444" + "'", str18, "4444444444444444444444444444444444444444444 0.79 0.1-eurt 04444444444444444444444444444444444444444444");
    }

    @Test
    public void test28721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28721");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aAAAAAAAAAAAAAAAA...", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test28722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 819, 125);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28723");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hI");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28724");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "1000    A         A", (java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00trA0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 86 + "'", int2 == 86);
    }

    @Test
    public void test28725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                0 true - 1 . ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                0 true - 1 . " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                0 true - 1 . ");
    }

    @Test
    public void test28726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28726");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...44                            ", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                     4444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444" + "'", str1, "                                                                                     4444444444444444444444444444444444444444444a.79a.1-eurta44444444444444444444444444444444444");
    }

    @Test
    public void test28728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28728");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(533, 54, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 533 + "'", int3 == 533);
    }

    @Test
    public void test28729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...........................................................................................................................................................................", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28730");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test28731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28731");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) ".....4444444444444444444444444444...444444440true-10aaaa00970aaaa0..4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", (java.lang.CharSequence) "444444444444444444444444...4444444444444444444444444444444444A         A                                  TRUE-1.A         A                                  A         A                                  97...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("####################################                                         AAAA0AAAAA####################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################                                         AAAA0AAAAA###################################" + "'", str1, "####################################                                         AAAA0AAAAA###################################");
    }

    @Test
    public void test28733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28733");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28734");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 267);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue-1.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97.AaAaAaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28736");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaa                                                     0.001                            A      A  ", "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28737");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", ".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444...44444444444444444444444444444444440true-1.0097...44                                        ", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "444...44444444444444444444444444444444440true-1.0097...44                                        " + "'", str8, "444...44444444444444444444444444444444440true-1.0097...44                                        ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test28738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28738");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", "                        ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str8, "Aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test28739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28739");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...4444...", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test28740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28740");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test28741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28741");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A0444444444444444444444444444444444444444444", "    aaaaa0aaaa                 ", "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A0444444444444444444444444444444444444444444" + "'", str3, "0ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A04444444444444444444444444444444444444444440ATRUEA-A1A.A0097A.A0444444444444444444444444444444444444444444");
    }

    @Test
    public void test28742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28742");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "0097..##################################....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..0097..##################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28743");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444", "...aaaaaaaaaaaaaaaaaaaaaaaaa                                 ", 262);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaaaaaaaaaaaaaaaaaaaaa                                 444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444" + "'", str3, "444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a4444444...aaaaaaaaaaaaaaaaaaaaaaaaa                                 444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444");
    }

    @Test
    public void test28744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28744");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT0", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28745");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "AAAAAAAAAAAAAAA                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28746");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                97.0", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test28747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28747");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   4444444...AAAAAAAAA44444444444444444444444444444444444444444", 12, "444...44444444444444444444444444444444440TRUE-1.0097...44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   4444444...AAAAAAAAA44444444444444444444444444444444444444444" + "'", str3, "   4444444...AAAAAAAAA44444444444444444444444444444444444444444");
    }

    @Test
    public void test28748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 819, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A 0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "A 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test28750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28750");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                      AAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                               ", (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test28751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    ", " 1aaaaaaaaaaa4444444...4444444...4444444...4  ", 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    " + "'", str3, "                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    ");
    }

    @Test
    public void test28752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444...4444444...44a1a4444444...4444444...44...a1", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 655);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test28754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28754");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28755");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...00.7900.1-eurt00.79......aaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 45 + "'", int10 == 45);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test28756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28756");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a0000000000", "#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 957);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28757");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                     aaaa0aaaaa         A         A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28758");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0TRUE-1.0097.00T..0TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "       aaaa0aaaaa                     ...", 93);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...444444", "true-1.       ...97true-1.       ...97", "AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444" + "'", str3, "...444444");
    }

    @Test
    public void test28760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "                     aaaa0aaaaa                     ...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test28761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ", 615);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ");
    }

    @Test
    public void test28762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28762");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true-1.00true-1.97.44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28763");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("100.0 AAAA0TRUE-1.0097.044444444444444444444444", "", (int) (short) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test28764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28764");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44                             ", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     A    ", "4444444444444444444...44444444444444444444", (int) (byte) 100);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaa4444444...4444444...4444444...4  ", 650, 201);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test28766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 842);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28768");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28769");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0", "0true-1.0097.00true-1.0097.00true-1.0097.00tr A", 12, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0" + "'", str4, "0true-1.0097.00true-1.0097.00true-1.0097.00tr Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0");
    }

    @Test
    public void test28770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", 77, "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    4444444444444444444444444444444444444" + "'", str3, "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    4444444444444444444444444444444444444");
    }

    @Test
    public void test28771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                ", 256, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                " + "'", str3, "                                                                                    100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                ");
    }

    @Test
    public void test28772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!hi!hi!1hi!hi!hi!.hi!hi!hi!0097hi!hi!hi!...hi!hi!hi!44", "   444444444444444444444444...44444a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    ", 664);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4                                                 100.0                                                                             AAAA0AAAAA       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4                                                 100.0                                                                             AAAA0AAAAA       ..." + "'", str1, "4                                                 100.0                                                                             AAAA0AAAAA       ...");
    }

    @Test
    public void test28774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28774");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "444444444444444444444444...7900.1-eurt044444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test28775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28775");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                                                              hi!                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test28776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28776");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("97atrue-1.", "                            100.0                                                     aaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28777");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(245.0f, (float) 55, (float) 182);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 245.0f + "'", float3 == 245.0f);
    }

    @Test
    public void test28778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                           0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test28779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28779");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                               a                        44444444444444444444                        ...                        444444444444444444444444444444444444444444444", 721);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28780");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("7.44444444444444444444444444444444A    4", "...44444444444...                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...4444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...44444444444444444444444444444444444444444440444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...4444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...44444444444444444444444444444444444444444440444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...444444444" + "'", str1, "0444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...4444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...44444444444444444444444444444444444444444440444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...444444444");
    }

    @Test
    public void test28782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28782");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 269, 56.0d, (double) 841L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 56.0d + "'", double3 == 56.0d);
    }

    @Test
    public void test28783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28783");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!" + "'", str1, "ahi!");
    }

    @Test
    public void test28785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28785");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444440true-1.0097.", "0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444#true-1.##97." + "'", str5, "4444444444444444444444444444444444444444444#true-1.##97.");
    }

    @Test
    public void test28786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28786");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                             ...", "4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                          0.79                                                                                                                                                                                                                                                                          0.1-eurt                                                                                                                                                                                                                                                                          04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28788");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(49L, 0L, (long) 150);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test28789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28789");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444", "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", 502);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.Object[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444" + "'", str6, "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444" + "'", str8, "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
    }

    @Test
    public void test28790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28790");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "##100.0###");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A                                 100.0                                                     aaaa..", 11, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444..." + "'", str5, "4444444...");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test28791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28791");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 63, 842);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str3, "44444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test28793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28793");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test28794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28794");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test28795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28795");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A    4", "                                      100.0                                                     ", 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A    4" + "'", str4, "A    4");
    }

    @Test
    public void test28796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "", "                             ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test28797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28797");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("444##444440true-1.0097...4444444444444444444440true-1#0097###44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("A   hi!hi!", "0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   hi!hi!" + "'", str2, "A   hi!hi!");
    }

    @Test
    public void test28799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28799");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   " + "'", str2, "                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
    }

    @Test
    public void test28801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28801");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#######################################4true4-4449744########################################", "4444400       0444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28802");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0 00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28803");
        char[] charArray10 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            100.0", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test28804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28804");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28805");
        long[] longArray5 = new long[] { (byte) 1, (byte) 10, (short) -1, (byte) 10, (short) 10 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test28806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28806");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...####################################..");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test28807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28807");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ".0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 82);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28808");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test28809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28809");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "    4444444444444444444444444444   aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28812");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                   ", (float) 656);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 656.0f + "'", float2 == 656.0f);
    }

    @Test
    public void test28813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28813");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                 ...4444444...444444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("       ...      a         a         a         a         a", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...      a         a         a         a         a" + "'", str2, "       ...      a         a         a         a         a");
    }

    @Test
    public void test28815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaa hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... 0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "        HI!H4444404444HI!HI.A A A ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28817");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray8, strArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444440true-1.0097.0", strArray8);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray22);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray23, strArray26);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray23);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray18, strArray23);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", strArray8, strArray23);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray23, "4444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 116, (int) (short) -1);
        boolean boolean36 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray23);
        boolean boolean37 = org.apache.commons.lang3.StringUtils.endsWithAny("0097      a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", strArray23);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "100.0" + "'", str27, "100.0");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str30, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str31, "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test28818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28818");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                     aaaa0aaaaa    ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test28819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444..." + "'", str1, "444444444444444444444444...");
    }

    @Test
    public void test28820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28820");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("0TRUE-1.0097.00T..0TRUE-1.0097.00T", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                                                                          ", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 43 + "'", int23 == 43);
    }

    @Test
    public void test28821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28821");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "", 545);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test28823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28823");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 0, (float) 842L, (float) 253);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test28824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28824");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28825");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28826");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                           A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......                                                                            ", 48.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.0f + "'", float2 == 48.0f);
    }

    @Test
    public void test28827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28827");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                aaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.", 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28828");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                A A ###################################                 ", 104, 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###" + "'", str3, "100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
    }

    @Test
    public void test28830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28830");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2.0f, (double) 201L, (double) 6L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 201.0d + "'", double3 == 201.0d);
    }

    @Test
    public void test28831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28831");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 156L, 87.0f, (float) 91L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 87.0f + "'", float3 == 87.0f);
    }

    @Test
    public void test28832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28832");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "0", (int) 'a');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                ", (java.lang.Object[]) strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97.                                                                                4444444444444444444444444444444444444444444" + "'", str7, "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97.                                                                                4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444" + "'", str9, "4444444444444444444444444444444444444444444atrue-1.a97.a4444444444444444444444444444444444444444444");
    }

    @Test
    public void test28833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444...4444444444........4444444444444444444444444444.", 79, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444...4444444444........4444444444444444444444444444.#######################" + "'", str3, "444444...4444444444........4444444444444444444444444444.#######################");
    }

    @Test
    public void test28835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28835");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test28836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28836");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(172, (int) (byte) 100, 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test28837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28837");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 550, (float) 71, 21.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 550.0f + "'", float3 == 550.0f);
    }

    @Test
    public void test28838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28838");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa0aaaaa", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " true-1.  97. ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444...                       a                       a                       a                       a                       a                       a  ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("4044444444444444444444444444                                                                                    0TRUE-1.0097.044444444444444444444444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28840");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28841");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444444440.7900.1-eurt0aaaa0.001");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28842");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 127, 14.0f, (float) 138);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 14.0f + "'", float3 == 14.0f);
    }

    @Test
    public void test28843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28843");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444  444444444444444", "A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444" + "'", str3, "444444444444444");
    }

    @Test
    public void test28844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28844");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0true-1.0097.0444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28845");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("               true  ", "                                             A    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               true  " + "'", str2, "               true  ");
    }

    @Test
    public void test28847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28848");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...", "aaaaaaaaaaaaaaaaaaaaaaaaa...", 182);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test28850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("97 true-1.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97 TRUE-1." + "'", str1, "97 TRUE-1.");
    }

    @Test
    public void test28851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28851");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0" + "'", charSequence2, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0aaaaaaaaaart00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test28852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0true-1.0097.4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.4444444444444444444444444444444444444444444440true-1.0097" + "'", str1, "0true-1.0097.4444444444444444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test28853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28853");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test28854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28854");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A         A         A         A         A         A         A         A         A         A         A         A         A         A         A\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test28856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28856");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) ". 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("true            ", 59, 232);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true            " + "'", str3, "true            ");
    }

    @Test
    public void test28858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...444444", "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444444" + "'", str2, "...444444");
    }

    @Test
    public void test28859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28859");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("7900.1-eurt0444100.0A00       000       000       0A00       000 ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28860");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "      ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h####################################################################################################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test28861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28861");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 349, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 349 + "'", int3 == 349);
    }

    @Test
    public void test28862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28862");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1.97.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28863");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.00true-1.0097.00true-1.0097.00tr A", "A   hi!hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28864");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test28865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAA                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28866");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28867");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("    a   HI!HI!..", "4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..." + "'", str2, "true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00...");
    }

    @Test
    public void test28869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28869");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                           aaaa0aaaaa                  ", "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 292, 144);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                           aaaa0aaaaa                  4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "                           aaaa0aaaaa                  4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28870");
        char[] charArray8 = new char[] { '4', '4', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("###0.001##", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                        ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test28871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", 589);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0..." + "'", str2, "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
    }

    @Test
    public void test28872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28872");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "A A A A                        a");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "44444", 45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...4...4444444...4444444...4444444                      0", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test28873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28873");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", "                                                    444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHA                                                                                                         ", 329);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str4, "444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test28874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28874");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", 424);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 111 + "'", int3 == 111);
    }

    @Test
    public void test28875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28875");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                         AAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test28876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0       00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000" + "'", str1, "000");
    }

    @Test
    public void test28877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                 ###0.001##", "                                                0.001                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 ###0.001##" + "'", str2, "                                                 ###0.001##");
    }

    @Test
    public void test28878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28878");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...                                      44444444444", "100.0100.0100.0100.0100.0100.0100.0100.0100.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28879");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test28880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28880");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28881");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) -1, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test28882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr", "###################################################################################################################################################################################################################################################444444444444444444444440.7900.1-eurt0aaaa                                                     0.001###################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "04444444444444444444444444444444444444444444" + "'", str1, "04444444444444444444444444444444444444444444");
    }

    @Test
    public void test28884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                             ", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          " + "'", str2, "                                                          ");
    }

    @Test
    public void test28885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 18, "                                                                                                                                                                                                                                                            0true-1.0097.044444444444444444444444444...                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" 1aaaaaaaaaaa4444444...4444444...4444444...4  ", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                1aaaaaaaaaaa4444444...4444444...4444444...4  " + "'", str2, "                                1aaaaaaaaaaa4444444...4444444...4444444...4  ");
    }

    @Test
    public void test28887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0art00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28888");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444a444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T", 159);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0" + "'", str2, "4444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
    }

    @Test
    public void test28890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                        ...44444444444...", "A0000000000                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28891");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("079001-eurt0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test28892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 236, 267);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test28893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28893");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...A ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28894");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28895");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                            ", (java.lang.CharSequence) "44444444444444444444444444444440true0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252 + "'", int2 == 252);
    }

    @Test
    public void test28896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...", 502, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa0aaaaaaaaa0aaaaaaaaa0aaa...0...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test28897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...0aAAAAAAAAAAAAAAAA......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444", "true -   97  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true -   97  " + "'", str2, "true -   97  ");
    }

    @Test
    public void test28899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   aa", "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   " + "'", str2, "   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1 0097   ");
    }

    @Test
    public void test28900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(".....4444444444444444444444444444...4444444444...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97", 202);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97" + "'", str2, "4444444444444444444444444444444444444444444                                                                                true-1.                                                                                97");
    }

    @Test
    public void test28902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaa44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    44444444!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", 86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test28903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28903");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test28904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28904");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...00true-1.0097.00true-1.0097.00tr...00true-1.009700#######000#######000#######0011...00true-1.0097.00true-1.0097.00tr...00true-1.0097.", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                            100.0                                                     AAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 589);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28905");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test28906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0true-1.0097.00true-1.0097.00true-1.0097.00tr...                                                                ...                                                                ...                                                                ...                                                                A...                                                                ...                                                                ...                                                                ...                                                                ...                                                                0true-1.0097.00true-1.0097.00true-1.0097.00t", "44444444444444444440TRUE-1.0097.                    44444444444444444444444444      #a######################...##############################################      #a######################.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr...                                                                ...                                                                ...                                                                ...                                                                A...                                                                ...                                                                ...                                                                ...                                                                ...                                                                0true-1.0097.00true-1.0097.00true-1.0097.00t" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr...                                                                ...                                                                ...                                                                ...                                                                A...                                                                ...                                                                ...                                                                ...                                                                ...                                                                0true-1.0097.00true-1.0097.00true-1.0097.00t");
    }

    @Test
    public void test28907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28907");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4000" + "'", str2, "4000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4000" + "'", str3, "4000");
    }

    @Test
    public void test28908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test28909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28909");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("044444444444444444444444444                                                                                    ", "444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28910");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", "AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444...", 368);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                    444444444..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                    444444444...");
    }

    @Test
    public void test28912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28912");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0TRUE-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28913");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h###########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h###########################################" + "'", str1, "true-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444a   hi!hi!hi!h###########################################");
    }

    @Test
    public void test28915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28915");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28916");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test28917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28917");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0044444440004aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr044444440011", "44444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", ".0097.00true-1.00", 156);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0044444440004aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr044444440011" + "'", str4, "0044444440004aatrue-aaaa97aaatrue-aaaa97aaatrue-aaaa97aaatr044444440011");
    }

    @Test
    public void test28918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28919");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("100.                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100." + "'", str1, "100.");
    }

    @Test
    public void test28920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                  0AAAA                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                  0AAAA                                                                                                                                  " + "'", str1, "                                                                                                                                  0AAAA                                                                                                                                  ");
    }

    @Test
    public void test28921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "44444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "a0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test28922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28922");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100.0                                                     aaaa..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0                                                     aaaa..\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28923");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0" + "'", str1, "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0");
    }

    @Test
    public void test28924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28924");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", (int) (short) 4, "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr" + "'", str3, "                                                                                                                                                                              Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr A Atrue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
    }

    @Test
    public void test28925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28925");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("A    44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A    44\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28926");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("044444444444444444444444444....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH", 30, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "044444444444444444444444444....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH" + "'", str3, "044444444444444444444444444....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I.......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH");
    }

    @Test
    public void test28927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ", "aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa", 80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444...true-1.4444444...97.4444444...4444444444444...                  4                       " + "'", str3, "...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ");
    }

    @Test
    public void test28928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28929");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0000000000");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test28930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28930");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28931");
        char[] charArray10 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                  aaaa0                                                                                                                                  ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test28932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28932");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                          a                             ###    a   HI!HI!...###    a   HI!HI!...###", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 54);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test28933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100.0", 220);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100.0" + "'", str2, "0true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100.0");
    }

    @Test
    public void test28934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28934");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...444                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28935");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A A A A                        a                             ", 167, 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test28936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28936");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...      ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28937");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt04444444444444444444444444444444444444444444", 589.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 589.0f + "'", float2 == 589.0f);
    }

    @Test
    public void test28938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28938");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...   4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test28939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28939");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "  A    ", (java.lang.CharSequence) "...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28940");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0aaaa", "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                100.0#####100.0###", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0aaaaaaaaaaRT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "100.0#####100.0###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                10000#####10000###" + "'", str3, "                                                                                10000#####10000###");
    }

    @Test
    public void test28942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0TRUE-1.0097.044444444444444444444444444...", "444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444..." + "'", str2, "44444444444444444444444...");
    }

    @Test
    public void test28943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28943");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                       444...44444444444444444444444444444444440TRUE-1.0097...44444...4444444444444", (long) 670);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 670L + "'", long2 == 670L);
    }

    @Test
    public void test28944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28944");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 4.444444444444444E50d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444444444444E50d + "'", double2 == 4.444444444444444E50d);
    }

    @Test
    public void test28945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28945");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("0true-1.00-1.0097.0444444444444444444444444444444...", strArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 424, 119);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str5, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test28946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28946");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test28947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28947");
        char[] charArray9 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                  aaaa0                                                                                                                                  ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444...44444444444444444444444444444...4444444444444444444444444444", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test28948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28948");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(149, 150, 546);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 149 + "'", int3 == 149);
    }

    @Test
    public void test28949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28949");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                  4                   ", "                                                              ", "aA44444A44444A44444A44444A44444A44444A44444A44444A44444100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  4                   " + "'", str3, "                  4                   ");
    }

    @Test
    public void test28950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28950");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(15.0d, (double) 61L, 57.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
    }

    @Test
    public void test28951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28951");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test28952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28952");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      4444400       0444444                                     ", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      00       0                                     " + "'", str3, "                                      00       0                                     ");
    }

    @Test
    public void test28953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28953");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 257, (float) 969, (float) 19);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 969.0f + "'", float3 == 969.0f);
    }

    @Test
    public void test28954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28954");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("##################################################################################################################################################################################################################################################################################### A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ######################################################################################################################################################################################################################################################################################", "                                                                ...444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                         ...                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         ...                                                    " + "'", str1, "                                         ...                                                    ");
    }

    @Test
    public void test28956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28956");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28957");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HhI!7.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444" + "'", str1, "...i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!7.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test28959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28959");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    " + "'", str1, "                         A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0                    ");
    }

    @Test
    public void test28960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28960");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444444..444444444444444440T");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh..." + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhhhhhhh...");
    }

    @Test
    public void test28962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28962");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, (float) 216, 4.4444443E13f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test28963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28963");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ahi!hi!...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28964");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 741L, (double) 172, (double) 33);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 741.0d + "'", double3 == 741.0d);
    }

    @Test
    public void test28965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A A A A A");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                      41004.404                                                ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A A A A A" + "'", str6, "A A A A A");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test28966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444..." + "'", str2, "4444444...");
    }

    @Test
    public void test28967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 292);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test28968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                       0aaa                        ", 1, 463);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       0aaa                        " + "'", str3, "                       0aaa                        ");
    }

    @Test
    public void test28969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", " 4...7900.1-EURT04444444444444444444444444444444444...4440");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 4...7900.1-EURT04444444444444444444444444444444444...4440" + "'", str2, " 4...7900.1-EURT04444444444444444444444444444444444...4440");
    }

    @Test
    public void test28970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28970");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", "0aaaa", 895);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test28971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  ", (int) (short) 0, 232);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.00" + "'", str3, "                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.00");
    }

    @Test
    public void test28972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...44a1a4444444...4444444...44...a1     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28973");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                                                                ", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!" + "'", str1, "h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!h!ih!");
    }

    @Test
    public void test28975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#########################################################################################################################################################", "0true-1.0097.00true-1.0097.00true-1.0097.00tr a 0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################################################################################" + "'", str2, "#########################################################################################################################################################");
    }

    @Test
    public void test28976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28976");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test28977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test28978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444");
    }

    @Test
    public void test28979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("               ...", "##########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               ..." + "'", str2, "               ...");
    }

    @Test
    public void test28980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28980");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...                                                   ", "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444", 465);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test28981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28981");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                AAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test28982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28982");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...40true-1.0097.04444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                     aaaa0aaaaa   ", "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     aaaa0aaaaa   " + "'", str3, "                     aaaa0aaaaa   ");
    }

    @Test
    public void test28984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28984");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################", (java.lang.CharSequence) "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################" + "'", charSequence2, "0true-10aaaa00970aaaa0###################################    a   HI!HI!#########################");
    }

    @Test
    public void test28985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28985");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                ", 533, "0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "                                0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA    A     0.7900.1-EURT0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                   4AAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test28986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28986");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                      100.0                ...", ".0097.00true-1.00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test28987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28987");
        float[] floatArray6 = new float[] { (short) 1, 9, 100.0f, 86, (byte) -1, (byte) 0 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 9.0, 100.0, 86.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test28988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...aaaa...444444444", 27, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaa...44444444444444444" + "'", str3, "...aaaa...44444444444444444");
    }

    @Test
    public void test28989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("true4-4449744                                       ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test28990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                     0                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                     0                                                                                                                                 " + "'", str1, "                                                                                                                     0                                                                                                                                 ");
    }

    @Test
    public void test28991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaa0aaaaaaaaaaaaa444444...", "    4444444444444444444444444444   aaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test28992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaa0aaaaaaa", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "              ...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa0aaaaaaa" + "'", str3, "aaaaaa0aaaaaaa");
    }

    @Test
    public void test28993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28993");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "...44444444444...                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444...                                                                                                                                                              " + "'", str1, "...44444444444...                                                                                                                                                              ");
    }

    @Test
    public void test28994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28994");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...4444444...4444444...4444444...4444444...---------------------------------------444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...0077.00...t744444444444444444..4444444", (long) 73);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 73L + "'", long2 == 73L);
    }

    @Test
    public void test28995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28995");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28996");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "true4-4449744");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444440097...#############################################################################################", 668);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444440097...#############################################################################################" + "'", str2, "4444444440097...#############################################################################################");
    }

    @Test
    public void test28998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4true4-4449744");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test28999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test28999");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "0true-1.0097.0", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test29000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest57.test29000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A  ", "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097." + "'", str2, "44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.");
    }
}

