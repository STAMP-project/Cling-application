import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest53 {

    public static boolean debug = false;

    @Test
    public void test26501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26502");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                  ", "                                                                                                    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0 0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("             aaaa0aaaaa    ", 21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26505");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26508");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", "4444444444444a00a.a1a-atruea0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26509");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 585, 4444444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test26510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "###########################################################################################################################################################################################################################00.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.", "        a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       4444444444444444444444444444444444444444444...4444444.79...4444444.1-EURT...44444444444444444444444444444444444444444444444444       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("###########################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ...44444444444444444444444444444444440true-1.0097...44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!", "79 .1-EURT 444444440 TRUE - 1 . 44444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!" + "'", str2, "444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi     A    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!");
    }

    @Test
    public void test26514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test26515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26515");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...####################################..", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test26517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26517");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0..." + "'", str1, "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
    }

    @Test
    public void test26519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26519");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 266, 51L, (long) 741);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 741L + "'", long3 == 741L);
    }

    @Test
    public void test26520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 57, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "0true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) ".7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26522");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr", "", "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ", 94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr" + "'", str4, "rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
    }

    @Test
    public void test26523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26523");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("####################################                                         AAAA0AAAAA####################################", "AE444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", "AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26525");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                       0TRUE-1.04444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26526");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                     aaaa0aaaaa              ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("0444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...4444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...44444444444444444444444444444444444444444440444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...444444444", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 99, 146);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                     aaaaaa0aaaaaaa              " + "'", str4, "                     aaaaaa0aaaaaaa              ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test26527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      " + "'", str2, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test26528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!", 441);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!44444444444444444444444444444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test26529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ", "true-1.  97");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00" + "'", str2, "    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00");
    }

    @Test
    public void test26530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26530");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "...ue-1.0097.044444444444444444444444444444444...", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26531");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26532");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444440true-1.0097 A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 44444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test26533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test26534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26535");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("################################################################################################################################################################################################################################################################################################################################            1000    a         a################################################################################################################################################################################################################################################################################################################################", "", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 671 + "'", int3 == 671);
    }

    @Test
    public void test26536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26536");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-", "a   HI!HI!..    a   HI!HI!..    a   HI!HI!..", 668);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26537");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0true-1.0097.0444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("079001-eurt0", 0, "   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "079001-eurt0" + "'", str3, "079001-eurt0");
    }

    @Test
    public void test26539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                          ", "444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          " + "'", str2, "                          ");
    }

    @Test
    public void test26540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26540");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                     aaaa0aaaaa    ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26541");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "0                                                                                                                                                                                                                                                                          0                                                               A A A A A0                                                                                                                                                                                                                                                                          0                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26542");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", 61, 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26543");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "44444444444444444444444444444444444444444440true-1.0097.", 93);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', (int) (short) 100, 24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 95, 585);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test26544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26544");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("...44444444444444444444444444444444440TRUE-1.0097...         a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a    ...44444444444444444444444444444444440TRUE-1.0097...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26545");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 267, (long) 39, (long) 78);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 267L + "'", long3 == 267L);
    }

    @Test
    public void test26546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26546");
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', 10.0d, (-1.0f) };
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 10.0, 35.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test26547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26547");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    1000    .         .             1000    .         .          ", "TRUETRUE");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100.0", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test26548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                          ##100.0###                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##100.0###" + "'", str1, "##100.0###");
    }

    @Test
    public void test26549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26549");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test26550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26550");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test26551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26551");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(86L, (long) 229, (long) 201);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 86L + "'", long3 == 86L);
    }

    @Test
    public void test26552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26552");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "4                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26553");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("########################################44444444444444444440TRUE-1.0097.", "rt00.7900.1-eurt0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26555");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                            4444444444444444444444444444440ta4444444444444444444444444444440t    4444444444444444444444444444440t44", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0AAAA4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0AAAA4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa" + "'", str2, "0AAAA4444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test26557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("000", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0true-1.0097.00true-1.0097.00truA00       000       000       0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0       000       000       00Aurt00.7900.1-eurt00.7900.1-eurt0" + "'", str1, "0       000       000       00Aurt00.7900.1-eurt00.7900.1-eurt0");
    }

    @Test
    public void test26559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26559");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26560");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("...44444444444444444444444444444444440TRUE-1.0097", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test26561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("40true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "ue-1.0097...444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ue-1.0097...444444444" + "'", str2, "ue-1.0097...444444444");
    }

    @Test
    public void test26562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 " + "'", str2, "...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test26563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26563");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("A0true-1.0097.00true-1.0097.00true-1.0097.00tr", "                                                                                                                hi4!", 259);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", "4444################################################################################################", 451);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26565");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                                                                                                                                                     \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26566");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
    }

    @Test
    public void test26567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26567");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444440.7900.1-EURT0Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaaAaaaaaaaaaa4444444...4444444...4444444..A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaatrue0aaaa0.aaatruaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaatrue0aaaa0.aaatruaaa" + "'", str2, "aaaaatrue0aaaa0.aaatruaaa");
    }

    @Test
    public void test26569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26569");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test26570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                          ###################################################", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                          ###################################################" + "'", str3, "                                                                                                                                          ###################################################");
    }

    @Test
    public void test26571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26571");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0097      a   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...", "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA..." + "'", str2, "aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...aAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test26573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("   444444444444444444444444...44444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a#a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   444444444444444444444444...44444" + "'", str3, "   444444444444444444444444...44444");
    }

    @Test
    public void test26574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444400       000       000       00a");
    }

    @Test
    public void test26575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26575");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26576");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...##############################################......##############################################...AE444444444444444444444", (int) '#', 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26577");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444ahi!hi!...trueahi!hi!...-ahi!hi!...ahi!hi!...ahi!hi!...97ahi!hi!...ahi!hi!...1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "44444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                               100.", 229, (int) (short) 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26579");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(98, 136, 384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
    }

    @Test
    public void test26580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                  4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test26581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa" + "'", str1, "aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test26582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26582");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                         ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26583");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(149.0d, (double) 104L, (double) 138);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 149.0d + "'", double3 == 149.0d);
    }

    @Test
    public void test26584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26584");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...40true-1.0097.04444444444", "1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26586");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0true-1.0097.0444444444444444444444444444444444444444444", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "0true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test26588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26588");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444...7900.1-EURT04444444444444444444444444444444444...444", 403);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26589");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                    ", 131, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26590");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a44");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26591");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 6, 0L, (long) 150);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test26592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26592");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAA", "!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      " + "'", str2, "                                                      ");
    }

    @Test
    public void test26594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("          ###    A   hi!hi!.           ", 172);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                            ###    A   hi!hi!.                                                                              " + "'", str2, "                                                                            ###    A   hi!hi!.                                                                              ");
    }

    @Test
    public void test26595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26595");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   HI!HI!..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   hi!hi!.." + "'", str1, "4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.4444444444444444444444444444    a   hi!hi!..");
    }

    @Test
    public void test26597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test26598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26598");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split(" true-1.  97. ", '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("0true-1.00", 'a');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny("    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "AAAAAAAAAAAAAAAAAAAAAAAAA...");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("################################################################################################################################################################################################################################################################################################################################            1000    a         a################################################################################################################################################################################################################################################################################################################################", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "###################################    a   hi!hi!...", 80, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0true-1.00" + "'", str11, "0true-1.00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str12, "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test26599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26599");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                                                                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26600");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi0true-1.0097.00true-1.0097.00true-1.0097.00trA0t...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26601");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(64, 48, 329);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 329 + "'", int3 == 329);
    }

    @Test
    public void test26602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                A A ###################################                 ", "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaa");
    }

    @Test
    public void test26604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa", "4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa" + "'", str2, "            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0aa");
    }

    @Test
    public void test26605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0true-10aaaa00970aaaa0", "444444444...4444444444........44444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-10aaaa00970aaaa0" + "'", str2, "0true-10aaaa00970aaaa0");
    }

    @Test
    public void test26606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26606");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
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
    }

    @Test
    public void test26607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ", 655);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 " + "'", str2, "...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test26608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str1, "..4440TRUE-1.0097...44444.......................................................................................4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
    }

    @Test
    public void test26609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26609");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 550.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 550.0d + "'", double2 == 550.0d);
    }

    @Test
    public void test26610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26610");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test26611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26611");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h####################################################################################################", "4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a", 546);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26612");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...44                             ", "...44444444444...                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaa", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh", "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaa" + "'", str3, "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaa");
    }

    @Test
    public void test26614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4", 788, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "######################################################################################################################################################################################################################################################################################################################################################################4TRUE4-414.400974.4004TRUE4-414.400974.4004TRUE4-414.400974.4004TR4 4A4#######################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test26615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444 ", 124);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444 " + "'", str2, "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test26616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26616");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...44444...4444444...4...AAAAAA...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26617");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray12 = new char[] { '4', '4', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence5, charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                               100.0", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("  A      A                            100.0                                                     aaaa", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.  A    44444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test26618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE" + "'", str2, "A A A A                        A                       ...AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE");
    }

    @Test
    public void test26619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26619");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("    A     .7900.1-eurt0444444444444444444...", "aaaaaaa...00.7900.1-eurt00.79...aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                       444                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444" + "'", str1, "444");
    }

    @Test
    public void test26621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444a0aaaaa       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444", 38, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444a0aaaaa       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444" + "'", str3, "       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444a0aaaaa       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444");
    }

    @Test
    public void test26622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26622");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("100.0 AAAA0TRUE-1.0097.044444444444444444444444", "                                                                                              a                        A A A A                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "    a   HI!HI!..    a   HI!HI!..    a   HI!HI!..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26624");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 124);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26625");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444440TRUE-1.0097...444444444444444444444444", (double) 788);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 788.0d + "'", double2 == 788.0d);
    }

    @Test
    public void test26626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26626");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                               44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                                                                                               ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", 21, 262);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26627");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "    aaaaa0aaaa                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26628");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("         a                                          ", "                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444", "0TRUE-1.0097.00T..0TRUE-1.0097.00T                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                            100.0                                                     aaaa..", 6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      0.001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "A00       000       000       00");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("     A    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test26631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26631");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 95.0f, (double) 670, (double) 83L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 670.0d + "'", double3 == 670.0d);
    }

    @Test
    public void test26632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26632");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(17, 265, 754);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 754 + "'", int3 == 754);
    }

    @Test
    public void test26633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26634");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test26635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "A A A A                        a                       ...aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true-1.0097.0aaaa0aaaaa###########################################0true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...44444444444...                 aaaaaaaaaaa aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                                                                                       aaaa0aaaaa                                    ", 841, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26637");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26638");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##############################################0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################0097." + "'", str1, "##############################################0097.");
    }

    @Test
    public void test26639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26639");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(49L, (long) 98, 15L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 98L + "'", long3 == 98L);
    }

    @Test
    public void test26640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                AAAA", 638);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                AAAA" + "'", str2, "                                                                                                AAAA");
    }

    @Test
    public void test26641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26641");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0       000       00790       000       000       00-0       00eurt0       00");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0       000       00790       000       000       00-0       00eurt0       00\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0true-1.00###########################################################################################################################################################################################################################", 891, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444440true-1.00###########################################################################################################################################################################################################################" + "'", str3, "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.044444444444444440true-1.00###########################################################################################################################################################################################################################");
    }

    @Test
    public void test26643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                             ", "0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", "tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                             " + "'", str3, "                                                                                                                                                                             ");
    }

    @Test
    public void test26645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26645");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("a A 1000 A A", ".0097.00tr          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26646");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                     AAAH                     AAA", (java.lang.CharSequence) "                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 400 + "'", int2 == 400);
    }

    @Test
    public void test26647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ");
    }

    @Test
    public void test26648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26648");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26649");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A A A A                        a", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test26650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "0TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test26651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26651");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", "rue-1.AA97.AAtrue-1.AA97.AAtrue-1.AA97.AAtr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26652");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test26653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26653");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "4A44rt4004.479004.414-4eurt4004.474444444444444444444444444444444444444444444444444444A44rt4004.479004.414-4eurt4004.47");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00       000       000       00", 2, "        a4444444444444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00       000       000       00" + "'", str3, "00       000       000       00");
    }

    @Test
    public void test26655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26655");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "###################################################################################################...######################a######################################################", (java.lang.CharSequence) "444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 419 + "'", int2 == 419);
    }

    @Test
    public void test26656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26656");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", "                                       444444a444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444444", "4444404444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test26658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26658");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...            ...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26659");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("true-1.0097.00true-1.0097.00tr", "##100.0###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26660");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...097.00tr.0097.00tr.0097.00tr             ...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test26661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26661");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#######################################4true4-4449744########################################", "                      444444444...", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26662");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("        a4444444444444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26663");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(".                                  aaaa.", "4444444...444444           aaaaaaaaaaa", 671);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26664");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 4, 44L, (long) 24);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 44L + "'", long3 == 44L);
    }

    @Test
    public void test26665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(".....4444444444444444444444444444...444444440true-10aaaa00970aaaa0..4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", "aa                100.0aaaa                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".....4444444444444444444444444444...444444440true-10aaaa00970aaaa0..4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444." + "'", str2, ".....4444444444444444444444444444...444444440true-10aaaa00970aaaa0..4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
    }

    @Test
    public void test26666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26666");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A         A         A         A         A         A         A         A         A         A         A         A         A         A ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...4444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444..." + "'", str1, "...4444...");
    }

    @Test
    public void test26668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26668");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...0...", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("a                   TRUE-1.0097.0                       a", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith(".true-1...97..44444444444444444444444444444444444444444", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...0..." + "'", str6, "...0...");
    }

    @Test
    public void test26669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", "...hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A" + "'", str2, "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
    }

    @Test
    public void test26670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26670");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...4444444...4");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26671");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("444440true-1.0097...4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("#a#44444444444444444444#...#444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#a#44444444444444444444#...#444444444444444444444444444444444444444444444" + "'", str1, "#a#44444444444444444444#...#444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444444440true-1.0097...444444444444444444444444                                                                                        100.", "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444440true-1.0097...444444444444444444444444                                                                                        100." + "'", str2, "444444444444444440true-1.0097...444444444444444444444444                                                                                        100.");
    }

    @Test
    public void test26674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                            100.0                                                     aaaa", "                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0                                                     aaaa" + "'", str2, "100.0                                                     aaaa");
    }

    @Test
    public void test26675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26675");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444true-1.00                                           true-1.97.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26676");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...A" + "'", str1, "...A");
    }

    @Test
    public void test26677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26677");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "   4444444...aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26679");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 817, (float) (short) 1, (float) 56L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 817.0f + "'", float3 == 817.0f);
    }

    @Test
    public void test26680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26680");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a", "                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...4444444                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA", "...4A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH" + "'", str3, "0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH");
    }

    @Test
    public void test26682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26682");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("..0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test26683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26683");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
    }

    @Test
    public void test26684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26684");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(173, 131, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test26685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26686");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("a   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!...", "4444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(".0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-" + "'", str1, ".0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-");
    }

    @Test
    public void test26688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26688");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 630 + "'", int1 == 630);
    }

    @Test
    public void test26689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26689");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                  AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa");
    }

    @Test
    public void test26691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26691");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(".ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih AA ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih A", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 754);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26692");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.001");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test26693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26693");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26694");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444440true-1.0097.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444440true-1.0097.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a a a a a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a a a a a" + "'", str1, "a a a a a");
    }

    @Test
    public void test26696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26696");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...40true-1.0097.04444444444", "                                         ...                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26697");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444444444444444", ".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26698");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("  ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444");
    }

    @Test
    public void test26700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26700");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("        a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       4444444444444444444444444444444444444444444...4444444.79...4444444.1-EURT...44444444444444444444444444444444444444444444444444       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       ", "A A A A A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test26701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26702");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.7900.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                   4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test26703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26703");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(".044444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26704");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444                                      100.0                                                     aaaa444444444444444444444", "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             00       0                 ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray12);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray24, strArray27);
        boolean boolean29 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray24);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray24);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray19, strArray24);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (java.lang.Object[]) strArray24);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440TRUE-1.0097.0", strArray12, strArray24);
        boolean boolean34 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAAAAAAAAAAAA", strArray24);
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.stripAll(strArray24);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444", strArray7, strArray24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "    A     " + "'", str13, "    A     ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "    A     " + "'", str14, "    A     ");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "100.0" + "'", str28, "100.0");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str31, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.0097.0" + "'", str33, "44444444444444444444444444444444444444444440TRUE-1.0097.0");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444" + "'", str36, "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444");
    }

    @Test
    public void test26705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26705");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0.0010.0hi", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("    a    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   a    ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0TRUE-1.0097.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.0" + "'", str1, "0true-1.0097.0");
    }

    @Test
    public void test26708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26708");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test26709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.", 102, "444444A444444444444444444        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.44" + "'", str3, "4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA100.44");
    }

    @Test
    public void test26710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26710");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0aaaa                                                                                                                                                                                                                                                                     0aaaa                                                                                                                                                                                                                                                                     0", (float) 59);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 59.0f + "'", float2 == 59.0f);
    }

    @Test
    public void test26711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26711");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", "                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26712");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A         A         A         A         A         A         A         A         A         A         A         A         A         A ..", "                     aaaaa0aaaa                     ", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26713");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0444...44444444444444444444444444444444440TRUE-1.0097...44");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.     a    4444444444444444444444444444444444444444444440TRUE-1.0097.", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a" + "'", str1, "... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
    }

    @Test
    public void test26715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26715");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                           aaaa0aaaaa                  ", (float) 62L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 62.0f + "'", float2 == 62.0f);
    }

    @Test
    public void test26716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0" + "'", str1, "00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0");
    }

    @Test
    public void test26717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26717");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444...", "1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444..." + "'", str2, "4444444444444444444...");
    }

    @Test
    public void test26719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26719");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH" + "'", str1, "!....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...IH");
    }

    @Test
    public void test26720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26720");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 850.0d, (double) 179L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test26721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test26722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26722");
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
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "...4...4444444...4444444...4444444                      0", 441, 279);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test26723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                       A                       A                      ...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... A A" + "'", str2, "... A A");
    }

    @Test
    public void test26725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26725");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444444 0444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26726");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test26727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("a                             ###    a   HI!HI!...###    a   HI!HI!...###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A                             ###    A   hi!hi!...###    A   hi!hi!...###" + "'", str1, "A                             ###    A   hi!hi!...###    A   hi!hi!...###");
    }

    @Test
    public void test26728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("######################################044444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################044444444444444444444444444" + "'", str2, "######################################044444444444444444444444444");
    }

    @Test
    public void test26729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26729");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44444444444", 45, 638);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26730");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790");
    }

    @Test
    public void test26732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", 141);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A" + "'", str2, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A");
    }

    @Test
    public void test26733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26733");
        long[] longArray1 = new long[] { 99L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
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
    public void test26734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26734");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test26735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26735");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 4, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test26736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26736");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26737");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444440true-1.0097...a0aaaaa              0true-1.0097.0444                                                            100.0", "", 94);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test26738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26738");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444", 444);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0" + "'", str2, "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0");
    }

    @Test
    public void test26740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26740");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                      44444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444                                                                                                                                                                                                                                                                       ", 201, 648);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26741");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                          0true-1.0097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                          ", "", 145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 145 + "'", int3 == 145);
    }

    @Test
    public void test26742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444A A A A                        a                             true-1.A A A A                        a                             97.A A A A                        a                             4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################", "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################" + "'", str2, "                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
    }

    @Test
    public void test26744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26744");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 16.0f, (double) 660, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test26745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26745");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444440true-1.0097.0100.0", (java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26746");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaa", "                                                           0 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26747");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                             ...", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa4444444...aaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26748");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aa 100.0aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa 100.0aaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26749");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#########################                                                                               ...0...#########################", "    A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "41004.404");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "    a   HI!HI!HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test26751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26751");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 744, (double) 570, (double) 101);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 101.0d + "'", double3 == 101.0d);
    }

    @Test
    public void test26752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("HI!", "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26753");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaa", " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", 47);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test26754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26754");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444...", "4444444...");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray11, strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444440true-1.0097.0", strArray11);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray25);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray26, strArray29);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray26);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray26);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray21, strArray26);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", strArray11, strArray26);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444", strArray3, strArray11);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "100.0" + "'", str30, "100.0");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str33, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str34, "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str35, "444...44444444444444444444444444444444440true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test26755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                      " + "'", str1, " A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0                                      ");
    }

    @Test
    public void test26756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaa", 623);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                  aaaaaaaaaa                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                  aaaaaaaaaa                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test26757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26757");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR" + "'", str1, "TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR.0097.00TR");
    }

    @Test
    public void test26758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                        ", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                        " + "'", str2, "aaa   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               aa                                        ");
    }

    @Test
    public void test26760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26760");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(".............................................");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concatWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ", (java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "............................................." + "'", str3, ".............................................");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "............................................." + "'", str5, ".............................................");
    }

    @Test
    public void test26761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26761");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444   !   ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test26762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ", 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       " + "'", str2, "                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ");
    }

    @Test
    public void test26763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26763");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", "TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "a         a    0001                                                     a         a", 479);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0" + "'", str4, "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
    }

    @Test
    public void test26764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26764");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                           aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26765");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26766");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 17, (float) 449, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 17.0f + "'", float3 == 17.0f);
    }

    @Test
    public void test26767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-eurt0444444444444444444444444444444444444444444");
    }

    @Test
    public void test26768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26768");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("444...44444444444444444444444444444444440true-1.0097...44", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("aHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "... 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0 0true-10aaaa00970aaaa0", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("...40true-1.0097.04444444444444444444444444444444444...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test26769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26769");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                  ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26770");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 37, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test26771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 95, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################################################################" + "'", str3, "###############################################################################################");
    }

    @Test
    public void test26772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26772");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 262);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test26774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", "0true-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      " + "'", str2, "      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test26775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26775");
        char[] charArray13 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("HI", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa", charArray13);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test26776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26776");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26777");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu" + "'", str3, "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuu");
    }

    @Test
    public void test26778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26778");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt044444a4444rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                  444444444444444444444444...44444                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  444444444444444444444444...44444                                  " + "'", str1, "                                  444444444444444444444444...44444                                  ");
    }

    @Test
    public void test26780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("##########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################################################################################################################" + "'", str1, "##########################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test26781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26781");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   ", "0true-1.0097...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test26782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A     0true-1 0097 00true-1 0097 00true-1 0097 00tr", "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A     0true-1 0097 00true-1 0097 00true-1 0097 00tr" + "'", str2, "A     0true-1 0097 00true-1 0097 00true-1 0097 00tr");
    }

    @Test
    public void test26783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26783");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0true-1.0097.0444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26784");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444440444", (float) 46L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.44440448E8f + "'", float2 == 4.44440448E8f);
    }

    @Test
    public void test26785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26785");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444...44444", "..00.1-eurt0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 143, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaa..." + "'", str3, "...0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaa...");
    }

    @Test
    public void test26787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaa4444444...aaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 173, 170);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26788");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...         aaaa0aaaaa", "#", 136);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", 98, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###" + "'", str3, "##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###");
    }

    @Test
    public void test26790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa", 173);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa" + "'", str2, "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa");
    }

    @Test
    public void test26791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26791");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...               ", 502);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26792");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                 ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "######################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test26794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26795");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", 31, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     " + "'", str1, "    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     ");
    }

    @Test
    public void test26797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26797");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) ".0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue4-4449744     4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0true-100970", "    A    ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH   A    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-100970" + "'", str2, "0true-100970");
    }

    @Test
    public void test26800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "                                                                                                    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26801");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                      41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test26802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...44444444444444444444444444444444440true-    A     ...44444444444444444444444444444444440true-", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444444444444444444440true-A...44444444444444444444444444444444440true-" + "'", str2, "...44444444444444444444444444444444440true-A...44444444444444444444444444444444440true-");
    }

    @Test
    public void test26803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26803");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                            ", "                                                                           A444444               a   hi!hi!...A444444               a   hi!hi!...A444444               a   hi!hi!......                                                                            ", "444...44444444444444444444444444444444440true-1.0097...44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                            " + "'", str3, "                                                                                                                            ");
    }

    @Test
    public void test26804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1...", "!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1..." + "'", str2, "100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      1...");
    }

    @Test
    public void test26805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444...", "0097      a   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA444444444", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26807");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26808");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...........................................true-97...........................................true-97................................................................................true-97...........................................true-97......................................", "...hi!", 608);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26809");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1aaaaaaaaaaa4444444...4444444...44...aaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...44", (float) 50L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 50.0f + "'", float2 == 50.0f);
    }

    @Test
    public void test26810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26810");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "             AAAA0AAAAA    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             AAAA0AAAAA    " + "'", str1, "             AAAA0AAAAA    ");
    }

    @Test
    public void test26811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26811");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaa..." + "'", str1, "aaaaaaaaaaaa...");
    }

    @Test
    public void test26812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26812");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                  ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 667);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26814");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4true4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26815");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 61, (double) 891L, 229.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 891.0d + "'", double3 == 891.0d);
    }

    @Test
    public void test26816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("###############################################################################################", "00       000       000       00a", "0true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa40true-1.0097.0aaaa0aaaaa4...aaaa0aaaaa4a4A4A4A4A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################################################################" + "'", str3, "###############################################################################################");
    }

    @Test
    public void test26817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("      00", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00" + "'", str2, "00");
    }

    @Test
    public void test26818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA" + "'", str1, "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA");
    }

    @Test
    public void test26819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26819");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     AAAA0AAAAA              ", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444 A .7900.1-eurt0444444444444444444444444444444444444444444444 A .7900.1-eurt04444444444444444444 A .7900.1-eurt04444444444444444444444444444444444444444444", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test26820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26820");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "4444444TRUE-1.00TRUE-1.97.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", 256);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444" + "'", str2, "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444");
    }

    @Test
    public void test26822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("    1000    .         .             1000    .         .          ", 35, "   a         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    1000    .         .             1000    .         .          " + "'", str3, "    1000    .         .             1000    .         .          ");
    }

    @Test
    public void test26823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26823");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(".. A...", "AHI!HI!HI!HI!HI!HI!HI!HI!HI!HIA", "   4444444...aaaaaaaaa44444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26824");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26825");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440TRUE-1.0097");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                             ...                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test26827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0" + "'", str1, "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A    A00 000 0");
    }

    @Test
    public void test26829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440TRUE-1.0097...44444", "", "4444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440TRUE-1.0097...44444" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440TRUE-1.0097...44444");
    }

    @Test
    public void test26830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26830");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26831");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tr", (java.lang.CharSequence) "H!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I......IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26833");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 1, (short) 4);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 4 + "'", short3 == (short) 4);
    }

    @Test
    public void test26834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26834");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(93L, (long) 124, (long) 91);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 91L + "'", long3 == 91L);
    }

    @Test
    public void test26835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26835");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...444444440tr...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaa...", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI....");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test26837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T" + "'", str1, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
    }

    @Test
    public void test26838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26838");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444440.7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444440.7900.1-EURT0" + "'", str1, "44444444440.7900.1-EURT0");
    }

    @Test
    public void test26839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26839");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26840");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0       00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 468);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                               " + "'", str2, "                                                                                              44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                               ");
    }

    @Test
    public void test26842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26842");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      A A A A A", 608);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                      4444400       0444444                                     ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test26843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                       4true4-4449744                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                       4true4-4449744                                        \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26844");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1...97............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str1, "true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test26845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("A         A         A         A         A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A         A         A         A         A" + "'", str1, "A         A         A         A         A");
    }

    @Test
    public void test26846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26846");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444...", "###    a   HI!HI!.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26847");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################", "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444A", "444444...4444444444........4444444444444444444444444444.", 660);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################" + "'", str4, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    A0097...###################################################################################");
    }

    @Test
    public void test26848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaa" + "'", str1, "A4A4A4A444444444444444444444444a44444444444444444444444...aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaa");
    }

    @Test
    public void test26849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26849");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 667, 43L, (long) 608);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 667L + "'", long3 == 667L);
    }

    @Test
    public void test26850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("true-1....97true-1....97");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true-1....97true-1....97" + "'", str1, "true-1....97true-1....97");
    }

    @Test
    public void test26851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26851");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0true-10aaaa00970aaaa0", "Ahi!hi!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26852");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", (java.lang.CharSequence) "4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                                                                     ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444" + "'", charSequence2, "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444");
    }

    @Test
    public void test26853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26853");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", "0TRUE-", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26854");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###    a   HI!HI!.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26855");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("0TRUE-1.0097.00T..0TRUE-1.0097.00T", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray14);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test26856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26856");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                     ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test26857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26857");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.00");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test26858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("rt00.7900.1-eurt0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "rt00.7900.1-eurt0" + "'", str1, "rt00.7900.1-eurt0");
    }

    @Test
    public void test26859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26860");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("true - 97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26861");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", 907, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0 A RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test26862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26862");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26863");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     0                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26864");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAA0AAAA0.7900.1-EURT04444444444444444...", "###########################################true-1.97.############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26865");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("7900.1-eurt0444100.0A00       000       000       0A00       000 ", "0       00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26866");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "7900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 44, 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444447900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444447900.1-EURT04444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test26868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("     A    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0", "... a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a", "a   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26869");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.044444444444444444444444444 40TRUE-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                       A                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26871");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("TRUE-1.0097.0", "                                                                                                     0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaa.", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              aaaaaaaaa." + "'", str2, "                                              aaaaaaaaa.");
    }

    @Test
    public void test26873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                                                                                                                                                                                                                                04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4                                                                                                                                                                                                                                                                                                                                                                                                 ", "   A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str2, "A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
    }

    @Test
    public void test26874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("######...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######..." + "'", str1, "######...");
    }

    @Test
    public void test26875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26875");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...####################################..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test26876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26876");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi4!hi                                                                                                                                  0aaaa                                                                                                                                  ", "4444444444444444444444444444444444444444444 TRUE-1. 97. 444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26877");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26878");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                                                                                                                                                                                                  aaaaaaaaaa                                                                                                                                                                                                                                                                                                                   ", "100.0aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26879");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...4444444...4444444...4444444...44444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0", "           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26882");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("00       000       000       00a", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!hi!h!hi!h", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("...t0444444444444444444444444444...", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 43 + "'", int16 == 43);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test26883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...", "4444444444444444444444444444100.044444444444444444444444444444444444444444444444444444aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26884");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444true-1.97.4444444444444444444444444444444444444444444", "a   hi!hi!...truea   hi!hi!...-a   hi!hi!...a   hi!hi!...a   hi!hi!...97a   hi!hi!...a   hi!hi!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("    ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test26886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26887");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444...44444444444444444444444444444444440TRUE-1.0097...44");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test26888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26888");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444444444444444", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26889");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0097...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test26890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26890");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("       TRUE", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26891");
        int[] intArray6 = new int[] { (short) 10, 'a', 266, 32, 24, (short) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, 97, 266, 32, 24, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 266 + "'", int8 == 266);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 266 + "'", int10 == 266);
    }

    @Test
    public void test26892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26892");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 145, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26893");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", " 4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  A      A                            100.0                                                     aaaa", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  A      A                            100.0                                                     aaaa" + "'", str2, "  A      A                            100.0                                                     aaaa");
    }

    @Test
    public void test26895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "00       000       000       00A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt" + "'", str2, "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt");
    }

    @Test
    public void test26896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     " + "'", str2, "    a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a         a     ");
    }

    @Test
    public void test26897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44440.7900.1-eurt0" + "'", str2, "44440.7900.1-eurt0");
    }

    @Test
    public void test26899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA" + "'", str1, "AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA AAAA0AAAAA");
    }

    @Test
    public void test26900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26900");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 167, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26901");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26902");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test26903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    a   HI!HI!...");
    }

    @Test
    public void test26904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26904");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA   ", "                                                                                   ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "...44                             ", 292);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                         0                                                                                                                          4444444...4444444...4444444...4...                       ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 7 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test26905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26905");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("0444...44444444444444444444444444444444440TRUE-1.0097...44", "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44                                                                                            44444444444444444444444444                                               100.0                                                ", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  A      A                            100.0                                                     aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                      a         a         a         a         a      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a         a         a         a         a" + "'", str1, "a         a         a         a         a");
    }

    @Test
    public void test26908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    ", "4444444TRUE-1.00TRUE-1.97.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    " + "'", str2, "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                    ");
    }

    @Test
    public void test26909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!hi!hitttttti!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hitttttti!h" + "'", str1, "!hi!hitttttti!h");
    }

    @Test
    public void test26910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26910");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0 true - 1 . ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26911");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "a0aaaaaaaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa", 734);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...44444444444...                 aaaaaaaaaaa", "TRUE97TRUE97");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444...                 aaaaaaaaaaa" + "'", str2, "...44444444444...                 aaaaaaaaaaa");
    }

    @Test
    public void test26913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test26914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26914");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test26915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                              0097..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..7900                                                                                              " + "'", str1, "..7900                                                                                              ");
    }

    @Test
    public void test26916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tre-1.0097.00tru...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tre-1.0097.00tru..." + "'", str1, "0true-1.0097.00true-1.0097.00true-1.0097.00tr A 0true-1.0097.00true-1.0097.00true-1.0097.00tre-1.0097.00tru...");
    }

    @Test
    public void test26917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26917");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 99, (long) 445, 36L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 36L + "'", long3 == 36L);
    }

    @Test
    public void test26918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26918");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("            aaaa0aaaaa0aaaa0aaaaa0aaaa0aaaaa0aaaa0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26919");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test26920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26920");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444", 146);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test26921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...", "!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a..." + "'", str2, "...a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a...");
    }

    @Test
    public void test26922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26922");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("                                      100.0                                                      ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0TRUE-1.0097.0", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".............................................", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                           0 ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test26923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh", "aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhTRUEhh");
    }

    @Test
    public void test26924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26924");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444################################################################################################", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26925");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("A A A                              ", "Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26926");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.0097.044444444444444444444444444 4", "!hi!hi......i!h");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                   rt00.7900.                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test26927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Rue-1.0097.0", "  A      A                            100.0                                                     AAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################", "                                                                                                                                                                                                                                                                                  a        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI.A A A a                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################" + "'", str2, "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################");
    }

    @Test
    public void test26929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26929");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097." + "'", str1, "444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.");
    }

    @Test
    public void test26930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26930");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test26931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26931");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("######################################################################################################################################################################################################################################################################################################################################################0true-1.0097.00true-1.0097.00true-1.0097.00tr4444A444440true-1.0097.00true-1.0097.00true-1.0097.00t", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               true-1.  97");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26933");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("             rue-1.0097.0", "", 104, 479);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "             rue-1.0097.0" + "'", str4, "             rue-1.0097.0");
    }

    @Test
    public void test26934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444...4444444...4444444...4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...4444444...4444444...4" + "'", str1, "4444444...4444444...4444444...4");
    }

    @Test
    public void test26935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26935");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "###############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444" + "'", str1, "                                                                                                                                                                                                                        4444a44444                                                                                                                                                                                                       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444");
    }

    @Test
    public void test26937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26937");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                 ...                                                     ", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 ...                                                     " + "'", str3, "                 ...                                                     ");
    }

    @Test
    public void test26938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26938");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                        ", "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "......4444444...4444444...4444444.....");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                        " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                        ");
    }

    @Test
    public void test26939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26939");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(570L, 55L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 570L + "'", long3 == 570L);
    }

    @Test
    public void test26940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ", "44444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097 A 4444444444444444444444444444444444444444444440TRUE-1 0097", "                                                               a    TRUETRUETRUET                                                              ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test26941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26941");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4true4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4true4" + "'", str1, "4true4");
    }

    @Test
    public void test26942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26943");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...", 149, 179);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I..." + "'", str3, "....IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I...");
    }

    @Test
    public void test26944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0.7900.1-EURT0", "444hi!hi!hi!...hi!hi!hi!44444444444444444444444444444444440hi!hi!hi!truehi!hi!hi!-hi!hi!hi!1hi!hi!hi!.hi!hi!hi!0097hi!hi!hi!...hi!hi!hi!44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26945");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444440444", 26, 655);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26946");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("4000", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("A         A         A         A         A         A         A         A         A         A         A         A         A         A ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 132 + "'", int5 == 132);
    }

    @Test
    public void test26947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26947");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h####################################################################################################", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("A         ", "                                                                     99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A         " + "'", str2, "A         ");
    }

    @Test
    public void test26949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26949");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test26950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26950");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                    ", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test26951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(".4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", "                                                            0aaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test26952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", "A00       000       000       0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444" + "'", str2, "4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444");
    }

    @Test
    public void test26953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444" + "'", str2, "a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
    }

    @Test
    public void test26954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26954");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", "  ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0       000       00790       000       000       00-0       00eurt0       00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0       000       00790       000       000       00-0       00EURT0       00" + "'", str1, "0       000       00790       000       000       00-0       00EURT0       00");
    }

    @Test
    public void test26956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26956");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26957");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("    4444444444444444444444444444   ", "                                                                 0aaa                           ", "    4444444444444444444444444444   aaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    4444444444444444444444444444   " + "'", str3, "    4444444444444444444444444444   ");
    }

    @Test
    public void test26958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) ". 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 245, 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                               ..." + "'", str3, "...                                                               ...");
    }

    @Test
    public void test26960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444", 13, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444" + "'", str3, "4444444444444444444");
    }

    @Test
    public void test26961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26961");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAAAAAAAAAAAAAAAAAAAAAAAAA                     AAAA0AAAAA           AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAA                     AAAA0AAAAA           AAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AA", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA                                                             " + "'", str2, "AA                                                             ");
    }

    @Test
    public void test26963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                            000                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000" + "'", str1, "000");
    }

    @Test
    public void test26964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26964");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44440.7900.1-eurt0", (double) 4444444L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4444444.0d + "'", double2 == 4444444.0d);
    }

    @Test
    public void test26965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26965");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                       ", 43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26967");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.044444444444444444444444444", "            0 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444..." + "'", str1, "4444444...");
    }

    @Test
    public void test26969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                   ", 202);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" A", "                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " A" + "'", str2, " A");
    }

    @Test
    public void test26971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26971");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(97, 87, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test26972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26973");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test26975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26975");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "..####0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test26976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                                                                                                                aaaa                                                                                                aaaa                                                                                                aaaa                                 ", "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test26977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26977");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test26978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test26979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444");
    }

    @Test
    public void test26980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26980");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 4, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test26981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26981");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                  aaaa0                                                                                                                                  ", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00T");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26982");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(94, 135, 534);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 534 + "'", int3 == 534);
    }

    @Test
    public void test26983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0444...44444444444444444444444444444444440TRUE-1.0097...4 ", ".############################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test26984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00", 671);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test26985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26985");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                  444444444444444444444444...44444                                  ", 449);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 449 + "'", int2 == 449);
    }

    @Test
    public void test26986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0T");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                  aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                  aaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test26989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...44444...true-1.4444444...97.4444444...4444444444444...", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...44444...true-1.4444444...97.4444444...4444444444444..." + "'", str5, "...44444...true-1.4444444...97.4444444...4444444444444...");
    }

    @Test
    public void test26990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26990");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 8, 179L, (long) 86);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 179L + "'", long3 == 179L);
    }

    @Test
    public void test26991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26991");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h", "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097" + "'", str2, "44444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097");
    }

    @Test
    public void test26993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26993");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("UE");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"UE\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "114");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test26995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444...                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26996");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaa...", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     ", 21);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test26997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26997");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444", 23, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa" + "'", str3, "aaaaaaaaaa");
    }

    @Test
    public void test26998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26998");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a                   TRUE-1.0097.0                       a", (long) 842);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 842L + "'", long2 == 842L);
    }

    @Test
    public void test26999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test26999");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test27000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest53.test27000");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

