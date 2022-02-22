import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest61 {

    public static boolean debug = false;

    @Test
    public void test30501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30501");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                       ", (java.lang.CharSequence) "44444444444444444444444444444444440true-140097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30502");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A A A A                        a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A A A A                        a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30504");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 744, (long) 172, (long) 77);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 77L + "'", long3 == 77L);
    }

    @Test
    public void test30505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30505");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("...444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           444444444444444444444444444444444444444444444     4    444444444444", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                               ...", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 26 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test30506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30506");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("             0true-10aaaa00970aaaa0", "4444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "....414-4eurt40");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30508");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444TRUE-1.497.44444444444444444444444444444444444444444444 ", (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test30509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30509");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...        A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  444440444                                                     0.001                            A      A  ", "A.7ee444ee44440.7ee444ee44440.7ee444ee44440.7e");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30510");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ue-1.0097...444444444444444444444444########################################################################################100.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 39, 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30511");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                             ...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test30512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30512");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "                                                                                                                                                4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.00..", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30514");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!0097      A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!HI!...AHI!", "444444444444444444444444...790true-1.0097.0444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444.1-EURT0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test30515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30515");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0true-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test30516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30516");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 60, 34.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test30517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "rue-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444 a A A A 97.A a A A A true-1.A a A A A 4444444444444444444444444444444444444444444");
    }

    @Test
    public void test30519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...444444444444444444444440TRUE-1 0097 ", ".1-EURT00.7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                   ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30521");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ", "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA", 557);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30522");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30523");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", (java.lang.CharSequence) "aaTRUE-1.  97.aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
    }

    @Test
    public void test30524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30524");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(".7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a" + "'", str1, ".7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt0444444444444444444444444444444444444444444444    A     .7900.1-eurt044444444444444444444444444444..IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a               a ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH a");
    }

    @Test
    public void test30525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30525");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         ", 245);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         " + "'", str2, "        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         ");
    }

    @Test
    public void test30527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("04444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "04444444444444444444444444" + "'", str1, "04444444444444444444444444");
    }

    @Test
    public void test30528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30528");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(".7900.1-eurt04444444444444444444444444444444444444444444 a .7900.1-eurt04444444444444444444 a .7900.1-eurt0444444444444444444444444444444444444444444444 a", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                aaaa", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30529");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", ".1-eurt00.7900.1-eurt", 463);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444444444444444444444444444444444440true-1.0097. A 44444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 4444444444444444444444444444444444444444444440true-1.0097. A 444444444444444444444444444444444444444444444", "..                          ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30532");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                      aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30533");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A", (java.lang.CharSequence) "  a    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 434 + "'", int2 == 434);
    }

    @Test
    public void test30534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30534");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("97...#############################################################################################", 182);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 182 + "'", int2 == 182);
    }

    @Test
    public void test30535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30535");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A         A         A        ...", "", 99);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concatWith("aaaaaaaaaaaa", (java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa..." + "'", str5, "AaaaaaaaaaaaaAaaaaaaaaaaaaAaaaaaaaaaaaa...");
    }

    @Test
    public void test30536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("A44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444", 502);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444" + "'", str2, "0true-1.00-1.0097.0444444444444444444444444444444......       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444");
    }

    @Test
    public void test30538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30538");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(721, 62, 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 721 + "'", int3 == 721);
    }

    @Test
    public void test30539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444440true-1.0097...4444440true-1.0097...4444440444444444444444444444444444444440true-1.0097...4444440true-1.0097...4444440");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test30540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30540");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(8L, (long) 463, (long) 6);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 463L + "'", long3 == 463L);
    }

    @Test
    public void test30541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                     aaaaa0aaaa                     ", 98, "    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...                                                     ...44444444444444444444444444444444440true-1.0097...100...44444444444444444444444444444444440true-1.0097.......44444444444444444444444444444444440true-1.0097...0...44444444444444444444444444444444440true-1.0097...    ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ...44444444444444444444444444444444440true-1.0097...A...44444444444444444444444444444444440true-1.0097...         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                     aaaaa0aaaa                     " + "'", str3, "                                                                                                                                                                                                                                                                     aaaaa0aaaa                     ");
    }

    @Test
    public void test30542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30542");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...4444444444444444444444444440t...");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test30543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.001");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.00" + "'", str1, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################0.00");
    }

    @Test
    public void test30544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                            100.0", 87, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaa                                            100.0aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30545");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                                                                ...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test30546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30546");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "00 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444", 0, 667);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444" + "'", str3, "0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444");
    }

    @Test
    public void test30548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0     a    rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30549");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0T...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444444444444444444444!", 451);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa" + "'", str1, "4444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0aaaa");
    }

    @Test
    public void test30552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30552");
        long[] longArray6 = new long[] { 0L, (byte) -1, (short) 1, (short) 100, 10L, 10L };
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1, 1, 100, 10, 10]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test30553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30553");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444", "0true-1.00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30554");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (double) 91L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.0d + "'", double2 == 91.0d);
    }

    @Test
    public void test30555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "1aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30556");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     A    44");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("0TRUE-1.0097.0", (java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    A         A                                                     1000    A         A         ", "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A         A                                                     100.0    A         A0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a4444444444444444444444444444444444444444", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044" + "'", str4, "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.0A0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.044");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test30557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30557");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a04444444444444444444444444444444444444444440atruea-a1a.a0097a.a0444444444444444444444444444444444444444444", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30558");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("              ", "44444444444444444444444444444444444444444440true-1.0097", 216);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("a         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test30559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30560");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                       100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                                                                      100.0                                ", "4444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97.     A    444444444444444444444444444444444444444444444 true-1.  97");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ", "                                                                                                                                                                                                                                          44444444444444444440true-1.0097HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "            0000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30563");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "4444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test30564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0" + "'", str1, "00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 0");
    }

    @Test
    public void test30565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", "A!hi!h!hi!hA A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...");
    }

    @Test
    public void test30566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a0aaaaa##############0true-1.0097.0444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH!IH!IH!IHa                                                                                                         ", ".0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr.0097.00tr                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 26);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test30567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30568");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444a444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 27);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".0097.00TRUE-1.0097.00TRUE-1.0097.00TR", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test30569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30569");
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
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
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
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test30570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("             44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "             AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test30571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...aaaa...44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30572");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a       44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a                       a        ", "rue-1.0097.0                                       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30573");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                       ", (java.lang.CharSequence) "                     aaaaa0aaaa                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test30574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test30575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30575");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "A!hi!h!hi!hA A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98 + "'", int1 == 98);
    }

    @Test
    public void test30576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30576");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444440true-1.0097.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test30577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30577");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test30578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                       444...44444444444444444444444444444444440TRUE-1.0097################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30579");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(".001");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test30580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("00.0                                                     AAAA0TRUE-1.0097.044444444444444444444444                                                                                                                                       0", 76, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test30581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444", 51, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
    }

    @Test
    public void test30582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30582");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concatWith("0aaa", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test30583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4" + "'", str2, "...44444...TRUE-1.4444444...97.4444444...4444444444444...                  4");
    }

    @Test
    public void test30584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30584");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                           ", (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test30585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "...7900...7900...7900...7900");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test30586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30586");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("        a                     ", 656, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        a                     44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "        a                     44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test30588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30588");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...44444444444...                 aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30589");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00.1-eurt044444444444444444444444444444", 102L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
    }

    @Test
    public void test30590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ", "...4444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 " + "'", str2, "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test30591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30591");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("     ", "...         aaaa0aaaaa", "A         A         A         A         A         A         A         A         A         A         A         A         A         A ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     " + "'", str3, "     ");
    }

    @Test
    public void test30592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA..." + "'", str1, "AAA...");
    }

    @Test
    public void test30593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30593");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30594");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("       TRUE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ..." + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA       ...");
    }

    @Test
    public void test30596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30596");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(533, 262, 657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 262 + "'", int3 == 262);
    }

    @Test
    public void test30597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30597");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30598");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444", (double) 229.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 229.0d + "'", double2 == 229.0d);
    }

    @Test
    public void test30599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30599");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...4444444...4444444...4444444...4444444...                                       444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444", "                                              0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr    A     0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0true-1.00...44444...true-1.4444444...97.4444444...4444444444444...0tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30600");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444440true-1.0097...a0aaaaa              0true-1.0097.0444                                                            100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test30601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30601");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...00.7900.1-eurt00.79......aaa");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                           ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4 0true-1.0097.044444444444444444444444444", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30603");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test30604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30604");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                       #a#44444444444444444444#...#444444444444444444444444444444444444444444444                     ", ".true-1...97..44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30605");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...44444...true-1.4444444...97.4444444...4444444444444...                  4000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000044444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30606");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                       a44444444444444444444...444444444444444444444444444444444444444444444", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaaaaaaa0aaaa...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test30607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30607");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A A A A A");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                      41004.404                                                ", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A A A A A" + "'", str5, "A A A A A");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A A A A A" + "'", str6, "A A A A A");
    }

    @Test
    public void test30608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30608");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "0000000000", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, "0true-1.0                                               41004.404                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test30610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...44444...TRUE-1.4444444...97.4444444..    a0a                 ...44444...TRUE-1.4444444...97.4444444..", "aaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30611");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                 444...44444444444444444444444444444444440true-1.0097...44                                        ", (java.lang.CharSequence) "4aaaaaaaaaaa44444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa44444444444444444444444444444444444444444444444444444444444444444444444444444aaaaa4aaaa4444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaa0aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA0AAAAAAA" + "'", str1, "AAAAAA0AAAAAAA");
    }

    @Test
    public void test30613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30613");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444...444444           aaaaaaaaaaa44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "a                   TRUE-1.0097.0                       a");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test30615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ", 76, "                                                                                            4444444444444444444444444444440TA4444444444444444444444444444440T    4444444444444444444444444444440T44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                               4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test30616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30616");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("rt00.7900.1-eurt0", "                                                                      aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test30617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30617");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("A.79--.10eurt-111111111111111111111111111111111111111111111A.79--.10eurt-1111111111111111111A.79--.10eurt-1111111111111111111111111111111111111111111", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaa...    A         A         A  A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test30618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30618");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("A!hi!h!hi!hA A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                    444444444444", "aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444true-1aaaaaaaaa4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30620");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "0       000       00790       000       000       00-0       00eurt0       0", (java.lang.CharSequence) "444444444 ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test30621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30621");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("444444444444444440TRUE-1.0097...444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30622");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(546.0f, (float) 229, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 546.0f + "'", float3 == 546.0f);
    }

    @Test
    public void test30623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "    a   HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30624");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...      aaaa0a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test30625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30625");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                      ...                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test30626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30626");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444...4444444...44a1a4444444...4444444...44...a1     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 41L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test30627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                            00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                            00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "                                                                                                            00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test30628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("  ...", "444444444444444  444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ..." + "'", str2, "  ...");
    }

    @Test
    public void test30629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30629");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00...", "tr...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test30630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30630");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...         aaaa0aaaaa", 618);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440TRUE-1.009...", "A44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444", 72);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30632");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", 172, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30633");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444...", "0true-1.0097.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test30634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4444A44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444A44444" + "'", str1, "4444A44444");
    }

    @Test
    public void test30635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30635");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test30636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30636");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaa4444444...4444444...4444444...4  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaa4444444...4444444...4444444...4  " + "'", str1, "Aaa4444444...4444444...4444444...4  ");
    }

    @Test
    public void test30637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30637");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440010444444444...4444444444........444444444444444444.444444444...4444444444........4444444444444444440444444444...4444444444........444444444444444444hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30638");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaa0aaaaa", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " true-1.  97. ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...4444...                       a                       a                       a                       a                       a                       a  ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...A     ...", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444...444444444444444444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A.7900.1-eurt0444444444444444444444444444444444444444444444A.7900.1-eurt04444444444444444444A.7900.1-eurt04444444444444444444444444444444444444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test30639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30640");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                              0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00" + "'", str1, "0    -1.0097.00    -1.0097.00    -1.0097.00   a 0    -1.0097.00    -1.0097.00    -1.0097.00");
    }

    @Test
    public void test30641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30641");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444" + "'", str1, "444444444444");
    }

    @Test
    public void test30642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30642");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", "", 144);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                       44444444444444444444...4444                       44444444444444444444...4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30644");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "444444444444444444444444...44444444444444444444444444444444440TRUE-1.0097...444444444444444444444444", (int) (byte) 100, (int) (byte) -1);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0true-1.0097.044444444444444444444444444...");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test30645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A         A                                                                  ...A         A  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "uuuuuuuuHI!HI!HI!HI!HI!HI!HI!HI!HI!HI444uuuuuuuuuaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30646");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray7, strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444440true-1.0097.0", strArray7);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("a", "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", '4');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("100.0", strArray22, strArray25);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.endsWithAny("a", strArray22);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray22);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEach("4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray17, strArray22);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH", strArray7, strArray22);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfAny(".1-eurt00.7900.1-eurt", strArray7);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0" + "'", str11, "100.0");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "100.0" + "'", str26, "100.0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str29, "4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH" + "'", str30, "    A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test30647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30647");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444", 36, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444" + "'", str3, "444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444444444a444444444444444444");
    }

    @Test
    public void test30648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                         ih0.0100.0                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                         ih0.0100.0                                                                                                                                                                                                                                                                                                                                        " + "'", str1, "                                                                                                                                                                                                                                                                                                                                         ih0.0100.0                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test30649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" 4A4 4rt4004.479004.414-4eurt4004.479004.414-4eurt4004.479004.414-4eurt40", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444497.04444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 4A4 4rt4004.479004.414-4eurt4004.479004.414-4eurt4004.479004.414-4eurt40" + "'", str2, " 4A4 4rt4004.479004.414-4eurt4004.479004.414-4eurt4004.479004.414-4eurt40");
    }

    @Test
    public void test30650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30650");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "..!IH!IH   a    4444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444444444444.7900.1-eurt0444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30651");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                           0true-1.0097.0", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30652");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.000.7900.1-eurt0444444444444444444444444444444444444444444400.7900.1-eurt0444444444444444444444444444444444444444444400.790", "97 true-1.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30653");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30654");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                 ", "44444444444444444444444444444444444444444444444444...");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("hI!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny("4444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444 ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test30655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0TRUE-1.0097.044444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30656");
        char[] charArray11 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.044444444444444444444444444 40true-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 45 + "'", int15 == 45);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14 + "'", int16 == 14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14 + "'", int17 == 14);
    }

    @Test
    public void test30657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "         aaaa0aaaaa    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         aaaa0aaaaa    " + "'", str1, "         aaaa0aaaaa    ");
    }

    @Test
    public void test30658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444", 570, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa444444444");
    }

    @Test
    public void test30659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30659");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ...44444444444444444444444444444444440true-1.0097...44444", "0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH 0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.0");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test30660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "       ...a0a                                          a0a                                          a0a                                                                                                                                                                                                                                                                                                                                                                                                               44                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30661");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(153, 175, 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 153 + "'", int3 == 153);
    }

    @Test
    public void test30662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                 ...", 734);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ..." + "'", str2, "                 ...");
    }

    @Test
    public void test30663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30663");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30664");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("A         A         A         A         A         A         A         A         A         A   114", "ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30665");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                      ...                           ", 655, 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30666");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444444444444444444444444444444440true-1.0097.4444444444444444444444444444444444444444444440true-1.0097.444444444444444444444444444444444444444", "0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAAA0TRUE-1.0097.0AAAA0AAAA", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30667");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("    a   HI!HI!HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a   HI!HI!HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30668");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" 4...7900.1-EURT04444444444444444444444444444444444...4440", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30670");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00.1-eurt044444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaa444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30671");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444444444444444444444444444444!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30672");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("true-1.97.4444444444444444444444444444444444444444444", "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    AA   hi!hi!hi!hi!0true-1 0097 044444444444444444444444444 4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test30673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30673");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAA                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...", 533, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ..." + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                               44                     aaaa0aaaaa                                          aaaa0aaaaa                                          aaaa0aaaaa       ...");
    }

    @Test
    public void test30675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("97atrue-1.", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    97atrue-1." + "'", str2, "                                                    97atrue-1.");
    }

    @Test
    public void test30676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30676");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aahaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test30677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A" + "'", str1, "4444444444444444444444A A A A 444444444444444440TRUE-1.0097.  A    44444444444444444440TRUE-1.0097.     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa    A");
    }

    @Test
    public void test30678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                              ", 0, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              " + "'", str3, "                                                              ");
    }

    @Test
    public void test30679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test30680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30680");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(73.0d, (double) 28, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test30681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30681");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "4444444true-1.00                                           true-1.97.                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444          " + "'", str1, "444444444444444444444444444444444444444444444     4    444444444444444444444444444444444444444444444          ");
    }

    @Test
    public void test30683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30683");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", ".....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30684");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A         A         A         A         A         A         A         A         A         A         A         A         A         A ...", "4444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444 ", 97);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30685");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("1aaaaaaaaaaa4444444...4444444...44...aaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaa4444444...4444444...44", "4A444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 403);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...", 329, "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test30688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30688");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA", (java.lang.CharSequence) "                                                                                              44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                   .0097.00tr          ...", 0, 670);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   .0097.00tr          ..." + "'", str3, "                   .0097.00tr          ...");
    }

    @Test
    public void test30690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30690");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(".....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                     aaaa0aaaaa                     ...", "                       a", 826);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097", "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444", "                               44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.00..");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test30692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30692");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################", "4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a.........a....0001.....................................................a.........a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30693");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "A   HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "44444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47                                       A HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30694");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0 tru...ue-1.0097.044444444444444444444444444444444...4444", "444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30695");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0aaaaa    ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test30696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30696");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "a A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A A aaaaaaaaaaaaaaaaaaaa00 0true00 0-00 000 000 09700 000 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30697");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", (double) 236);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 236.0d + "'", double2 == 236.0d);
    }

    @Test
    public void test30698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     " + "'", str2, "##############################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH             A     ");
    }

    @Test
    public void test30700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30700");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 4, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test30701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAA                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaa                         " + "'", str1, "aaaaaaaaaaaaaa                         ");
    }

    @Test
    public void test30702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30702");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30703");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test30704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30704");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("###    a   HI!HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test30705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 167);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ", "                                                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("AAAAAAAAAAAAAA", "Hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa 0TRUE-1.00-1.0097.0444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30708");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...44444444444444444444444444444444440true-1.0097...44444", "", 744);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30709");
        char[] charArray10 = new char[] { '4', '4', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A     ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "TRUE-1.  97.", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                        ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...44444444444...                                                                                                                                                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test30710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!Hi!hi!hi!hi!hTRUETRUE", " true-1.  97. ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!hi!hi!hi!hTRUETRUE" + "'", str2, "hi!Hi!hi!hi!hi!hTRUETRUE");
    }

    @Test
    public void test30711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444a444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444a444444444444444444444444" + "'", str1, "44444444444444444444444a444444444444444444444444");
    }

    @Test
    public void test30712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("9744", (int) '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444449744444444444444444444444444" + "'", str3, "4444444444444444444444449744444444444444444444444444");
    }

    @Test
    public void test30713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30713");
        float[] floatArray4 = new float[] { 100, (byte) -1, (short) 1, (byte) -1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test30714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30714");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A0a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test30715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("A   hi!hi!", 54, "0444444444       444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0444444444       44444A   hi!hi!0444444444       44444" + "'", str3, "0444444444       44444A   hi!hi!0444444444       44444");
    }

    @Test
    public void test30716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30716");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("       AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30717");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "RT0000EURT0000EURT0000EURT0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30718");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(17L, (long) 734, (long) 655);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 17L + "'", long3 == 17L);
    }

    @Test
    public void test30719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30719");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                          44444444444444444440true-1.009");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test30720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30720");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                    444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    444444444444444444444444444444444444444444" + "'", str1, "                                                    444444444444444444444444444444444444444444");
    }

    @Test
    public void test30721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.0444444444444444444!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "0TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test30722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30722");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...                                                     ...44444444444444444444444444444444440TRUE-1.0097...100...44444444444444444444444444444444440TRUE-1.0097.......44444444444444444444444444444444440TRUE-1.0097...0...44444444444444444444444444444444440TRUE-1.0097...    ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.0097...         ...44444444444444444444444444444444440TRUE-1.0097...a...44444444444444444444444444444444440TRUE-1.00");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test30723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30723");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test30724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30724");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test30725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                     4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                        " + "'", str1, "                                        ");
    }

    @Test
    public void test30727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30727");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("            0 ", "44444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.A4444444444444444444444444444444444444444444440TRUE-1.0097.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AHI!", 819);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30729");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                            100.0                                                     aaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h4444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30730");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1000");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test30731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30731");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aahaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aahaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30732");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444440097...##########################################0444##############################################4444444440097...#############################################################################################4444444440097...#############################################################################################4444444440097...#################################A hi!hi!hi!hi!hi!hi!hi!hi!hi!hi... A", "4444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30733");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                       0AAAA                                                                                                                                  A                                                                                                                                  0AAAA                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0AAAA A 0AAAA" + "'", str1, "0AAAA A 0AAAA");
    }

    @Test
    public void test30734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30734");
        char[] charArray11 = new char[] { '4', '4', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A     ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("100.0aaaa", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444440444", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                  4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test30735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30735");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hI!", (java.lang.CharSequence) "                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 173 + "'", int2 == 173);
    }

    @Test
    public void test30736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30736");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30737");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ...44444...true-1.4444444...97.4444444...4444444444444...                  4                        is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30738");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                       0                                                                                                                                 ", 329, 418);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30739");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test30740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "0true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30741");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaa", "            1000    a         a");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                                     ...44444444444...                                                                                                                                                                                                     ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30742");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0true-1.0097.00true-1.0097.00true-1.0097.00t                                                                                100.0                                         ...00true-1.0097.00tru...4A4    100.0      0true-1.0097.00true-1.0097.00true-1.0097.00tr", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30743");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444440true-1.0097.444444444444444444444444");
    }

    @Test
    public void test30744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("######...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######..." + "'", str1, "######...");
    }

    @Test
    public void test30745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30745");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAAA0AAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30746");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a4000                          aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0aaaaa                                   aaaa0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30747");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT" + "'", str1, "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT");
    }

    @Test
    public void test30748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...4A444HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a0aaaaa" + "'", str1, "a0aaaaa");
    }

    @Test
    public void test30750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH" + "'", str1, "0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH0HHHHH0TRUE-1H0097H0HHHH");
    }

    @Test
    public void test30751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tra0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str1, "444444444444444444444444444444444444444444444444444444444444e-1.0097.00true-1.0097.00true-1.0097.00tra0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test30752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("true444...44444444444444444444444444444444440TRUE-1.0097...44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true444...44444444444444444444444444444444440TRUE-1.0097...44" + "'", str1, "true444...44444444444444444444444444444444440TRUE-1.0097...44");
    }

    @Test
    public void test30753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30753");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", "...........................................................................................0TRUE-1.0097.0AAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                      ...........................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test30754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("0TRUE-1.00-1.0097.04444444444444444444444444444444444444444444", "...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...44444444444444444444444444...7900.1-eurt044444444444444444..4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.00-1.0097.04444444444444444444444444444444444444444444" + "'", str2, "0TRUE-1.00-1.0097.04444444444444444444444444444444444444444444");
    }

    @Test
    public void test30755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                            00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "A   hi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444444444444444444444444...7900.1-eurt044444444444444444", "AHI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444...7900.1-eurt044444444444444444" + "'", str2, "444444444444444444444444...7900.1-eurt044444444444444444");
    }

    @Test
    public void test30757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30757");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0true-1.0                                               41004.404", "00 0", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0", 159);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0true-1.0                                               41004.404" + "'", str4, "0true-1.0                                               41004.404");
    }

    @Test
    public void test30758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30758");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                       a44444444444444444444...444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30759");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) -1, 589L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test30760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444AAAAAAAAA...4444444                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaa0aaaa0.7900.1-eurt04444444444444444...HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA...44", "H!ih!h!ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "0097...0097...0097...0097...", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                               TRUE  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30763");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30764");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(655.0f, (float) 83, (float) 5L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 655.0f + "'", float3 == 655.0f);
    }

    @Test
    public void test30765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30765");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "44444444444444444444444444444444444444444440TRUE-1.009...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440TRUE-1.009..." + "'", str1, "44444444444444444444444444444444444444444440TRUE-1.009...");
    }

    @Test
    public void test30766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30766");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444A444444444444444444", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
    }

    @Test
    public void test30767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30767");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                      0.001                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                      0.001                                               \"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30768");
        short[] shortArray6 = new short[] { (short) 100, (byte) 100, (byte) 100, (short) 100, (byte) 100, (short) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 100, 100, 100, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test30769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    aaaaa0aaaa                 ", "Aahaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30770");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                         ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30771");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test30772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("          true -   97  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          true -   97  " + "'", str1, "          true -   97  ");
    }

    @Test
    public void test30773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30773");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30774");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaHi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                       444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                                              444                       .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30776");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("00       0");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444" + "'", str1, "a         a                 44444444444444444444444444444444444444444444444444                                      100.0                                                      true                                      100.0                                                      4444444                                      100.0                                                      4444444                                      100.0                                                      4444444444444444444444444444444444444444444");
    }

    @Test
    public void test30778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30778");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 86, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny("100.", strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test30779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30779");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                     44                                                                                                                                                                                                                                                                                                                                                                                                               a0a                                          a0a                                          a0a...       ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test30780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30780");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", "                                                                                                                                                                                                                                                                                                                                                                             444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 650);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa" + "'", str4, "44444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
    }

    @Test
    public void test30781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30781");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                               A                                               ", "4444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30782");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444 true - 1 . 97 . 444444444444444444444444444                                         ...                                                     4444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", "a         a    0001                       aaaaaaaaaaaaaaaaaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test30783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30784");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                           a         ", "                                                       true-1.00                                           true-1.97.                                                        ", 175);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30785");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4A4 4rt4004.479004.414-4eurt4004.47444444444444444444444444444444444444444444444444444 4A4 4rt4004.479004.414-4eurt4004.47", "444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa", 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30786");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("####################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", "aaaa44........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.aaaa", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                              ...44444444444444444444444444444444440TRUE-1.0097...                                                                 ", 250, 22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                   " + "'", str3, "...                   ");
    }

    @Test
    public void test30788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 468);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30790");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30791");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...444444440 true - 1 . 0097 . 04444444444444444444444444444444444444444440 true - 1 . 0097 . 0444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444...444444           aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...444444           AAAAAAAAAAA" + "'", str1, "4444444...444444           AAAAAAAAAAA");
    }

    @Test
    public void test30793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("A A A                              ", "                                                                                                                                   ", "                                                                                               100.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test30794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "a444444444444444444444444...44444444444444444444444444444444440true-1.0097...444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test30795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30795");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("A ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30796");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                                                            ", "A     0true-1.0097.00true-1.0097.00true-1.0097.00trHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30797");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaa00       0true00       0-00       000       000       09700       000       0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30798");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30799");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test30800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30800");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                      00       0                                     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("0true-1.0097.0aaaa0aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0true-1.0097.0aaaa0aaaaa" + "'", str1, "0true-1.0097.0aaaa0aaaaa");
    }

    @Test
    public void test30802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30802");
        long[] longArray6 = new long[] { 0L, (byte) -1, (short) 1, (short) 100, 10L, 10L };
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, -1, 1, 100, 10, 10]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test30803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30803");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0TRUE-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Aa00a       a000a       a000a       a00", 833);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30804");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444", 550L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 550L + "'", long2 == 550L);
    }

    @Test
    public void test30805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30805");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("   A         ", "44444444444444444444444444444444444444444440");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30806");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "########################################################################################################################################################################################################################################################################################################################################################################TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR########################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "                           aaaa0aaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "########################################################################################################################################################################################################################################################################################################################################################################TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR########################################################################################################################################################################################################################################################################################################################################################################" + "'", charSequence2, "########################################################################################################################################################################################################################################################################################################################################################################TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR    A     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR########################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test30807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30807");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444          ", "4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test30808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("RT00I00I  EURT00I00I  EURT00I00I  EURT0     A    RT00I00I  EURT00I00I  EURT00I00I  E", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E" + "'", str3, "RT00I00I##EURT00I00I##EURT00I00I##EURT0#####A####RT00I00I##EURT00I00I##EURT00I00I##E");
    }

    @Test
    public void test30809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30809");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     a    44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0", "7.4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0" + "'", str2, "4444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444440.7900.1-eurt0");
    }

    @Test
    public void test30811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444################################################################################################", "A A A A A4A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444444444A4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444################################################################################################" + "'", str2, "4444################################################################################################");
    }

    @Test
    public void test30812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("a    44", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test30813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30813");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                   ...                                   ", 451);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test30815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30815");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
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
    }

    @Test
    public void test30816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("true-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h##########################################hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h###########################################", 95, 168);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...##########hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h#####################..." + "'", str3, "...##########hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihitrue-1.00-1.0097.04444444444444444444444444444444A   hi!hi!hi!h#####################...");
    }

    @Test
    public void test30817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30817");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("AA                                                             ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test30818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30818");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                          ", "...........", "                                                                                                                hi4!", 62);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                          " + "'", str4, "                                                          ");
    }

    @Test
    public void test30819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30820");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("true-1...97.............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", 71, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
    }

    @Test
    public void test30821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30821");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444444444444444440true-1.0097.  a    44444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097.     a    4444444444444444444444444444444444444444444440true-1.0097                 ...                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt04444444444444444444444444444444444444444444" + "'", str1, "                                                     ...                 7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt0444444444444444444444444444444444444444444444    a     .7900.1-eurt04444444444444444444    a  .7900.1-eurt04444444444444444444444444444444444444444444");
    }

    @Test
    public void test30823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", "true-1.  97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str2, "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
    }

    @Test
    public void test30824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("    A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test30825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30825");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                        0.0010.0hi                                                                                                                                                                                                                                                                                                                                         ", (java.lang.CharSequence) "###    a   HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 660 + "'", int2 == 660);
    }

    @Test
    public void test30826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!......7900.1-EURT0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!......7900.1-EURT" + "'", str1, "    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!...    A   HI!HI!......7900.1-EURT");
    }

    @Test
    public void test30827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30827");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("################################################################################################################################################################################################################################################################################################################################            1000    a         a################################################################################################################################################################################################################################################################################################################################", "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", 93);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("0       000       00790       000       000       00-0       00eurt0       0", strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0atruea-a1a.a0097a.a0", "              ", 78);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("##100.0###", strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("                                      100.0", strArray5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 26 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test30828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30828");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a                   TRUE-1.0097.0                       a", "#########################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi########");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("A     0true-1.0097.00true-1.0097.00true-1.0097.00t", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test30829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44", 449);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30830");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                              a                        A A A A                                                                 ", "  aa     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                       4444444...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                       ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30832");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30833");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                         aaaa0aaaaa    ", "444...44444444444444444444444444444444440TRUE-1.0097...44                                        ", 18);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa" + "'", str5, "aaaaHHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0H7900H1-EURT0HHHHH0HHHH0aaaaa");
    }

    @Test
    public void test30834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#...#4#a#", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#...#4#a#" + "'", str2, "#...#4#a#");
    }

    @Test
    public void test30835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444     4    44444444444444444444444444444444444444444444444                                      100.0                                                     aaaa444444444444444444444");
    }

    @Test
    public void test30836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa", 243);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     " + "'", str2, "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaHI!HI!HI!HI!HI!HI!HI!HI!HI!HIa                                                                                                                                                                                     ");
    }

    @Test
    public void test30837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30837");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + Float.POSITIVE_INFINITY + "'", float1 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test30838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30838");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("   A        ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaa##############0true-1.0097.0444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0true-1.0097.  a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097                 ...                                                     ", 36, 826);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0true-1.0097.  a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097                 ...                                                     " + "'", str3, "0true-1.0097.  a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097.     a    0true-1.0097                 ...                                                     ");
    }

    @Test
    public void test30840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30840");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30841");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aa                100.0aaaa                 ", 842);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A" + "'", str2, "00.0                                                     aaaa0true-1.0097.044444444444444444444444                                                                                                                                       0aaaa                                                                                                                                  A");
    }

    @Test
    public void test30843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30843");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny("                       a                             ###    a   HI!HI!...###    a   HI!HI!...###", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test30844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30844");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444", "a     0true-1.0097.00true-1.0097.00true-1.0097.00trhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh", 31);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444");
    }

    @Test
    public void test30846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 668, "97 true-1.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 t97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 t" + "'", str3, "97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 t97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 true-1.97 t");
    }

    @Test
    public void test30847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30847");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa      ", (float) 175);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 175.0f + "'", float2 == 175.0f);
    }

    @Test
    public void test30848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30848");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test30849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30849");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(84, 0, 141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test30850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444" + "'", str1, "...                     4444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444");
    }

    @Test
    public void test30851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30851");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                                      44444444444", "4444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0 a rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", "  A    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test30853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097...aa                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44                                                                                            A    44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30854");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "7.44444444444444444444444444444444A    4", 817);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test30855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...    0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", "                                ", "aaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaaaaaaaa0aaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR" + "'", str3, "...aaaa0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
    }

    @Test
    public void test30856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaA   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa", "...40TRUE-1.0097.04444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test30857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30857");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa100.0aaaa", (float) 329L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 329.0f + "'", float2 == 329.0f);
    }

    @Test
    public void test30858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30858");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test30859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30859");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!Hi!hi!hi!hi!hTRUETRUE", 144, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE");
    }

    @Test
    public void test30860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30860");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                A A ###################################                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test30861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30861");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444...4444444...44a1a4444444...4444444...44...a1", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("           A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           A" + "'", str1, "           A");
    }

    @Test
    public void test30863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid(" aaaa0aaaaa    ", 741, 891);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test30864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "a     0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30865");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("000044444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa###000##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 826, 570);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30866");
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
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test30867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "...##############################################......##############################################...AE444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test30868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30868");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                   aaaaa0aaaa                                                                         ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test30869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30869");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    A   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...    A    ", "a");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny(".0097.00tr          ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test30870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30870");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...40true-1.0097.04444444444444444444444444444444444...");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test30871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...   #a#4444...", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30872");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(670, 156, 465);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 156 + "'", int3 == 156);
    }

    @Test
    public void test30873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30873");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444...44444444444444444444444444444444440TRUE-1.0097...44097.044444444444444444444444444 ...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa###0.001##...aaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaa", "4444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.     A    4444444444444444444444444444444444444444444440true-1.0097.", 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30874");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h", "44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...4444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "A A A A                        a");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.concatWith("44444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...444444444444444444444444444444444444444444", (java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
    }

    @Test
    public void test30875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("100.0aaaa", "                          44444444444444444444444a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a" + "'", str1, "a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a");
    }

    @Test
    public void test30877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30877");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                       a44444444444444444444...4444                       a44444444444444444444...4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", ".0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-1.0097.0AAAA0AAAAA44444444444444444444444444444444444444444440TRUE-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30879");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test30880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 0, "0TRUE-1.0097.00TRUE-1....0true-1.0097...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str3, "a A 1000 A A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test30881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A     0true-1.0097.00true-1.0097.00true-1.0097.00tr", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30882");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                      Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi                                                             ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("TRUE97TRUE9");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9EURT79EURT" + "'", str1, "9EURT79EURT");
    }

    @Test
    public void test30884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30884");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("     a    44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                     aaaa0aaaaa    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30885");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                       a HI!HI!HI!HI!HI!HI!HI!HI!HI!HI... a   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!..." + "'", str1, "44444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.009744444444444444444444444444444444444444444440true-1.00974444444###################################    a   HI!HI!...");
    }

    @Test
    public void test30887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444", "0true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00true-1.0097.00a0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.790");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test30888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30888");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      100.0                                                      ", "       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa4444444444444444444444444444444444444a0aaaaa       aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444444440true-1.0097.0aaaa0aaaaa44444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test30889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             " + "'", str1, "444444444444444444444444444444444444444444444444444444444444440.7900.1-EURT044444444444444444444444444444444444444444444444444444444444444444444444444444444!hi!h!hi!h44444444444444444444444444444444444444444444444444444444444440.7900.1-EURT0440097...40097...4444444444444444444444444444444444444444444444444444444444440.7900.1-EURT04444444444444444444444444444444444444444444             ");
    }

    @Test
    public void test30890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30890");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                 ...                                                     AAAAAAAAAAAAAAAAAAAAAAAAAA", "0444", (int) '#');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny("4ue-1.0097...444444444444444444444444########################################################################################100.44", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test30891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa", 51, "aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa0.7900.1-eurt04444444444444444444444444444444444444444444aaaaa0aaaa     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaa                 ...                                                     444444444444444440true-1.0097...444444444444444444444444aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30892");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                  444444444444444444444444...44444                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444...44444" + "'", str1, "444444444444444444444444...44444");
    }

    @Test
    public void test30893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30893");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atruea-a1a.a97a.a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atruea-a1a.a97a.a" + "'", str1, "#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################atruea-a1a.a97a.a");
    }

    @Test
    public void test30894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30894");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("    aaaaa0aaaa                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    aa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("true -   97                                                                                                                                                                                                                                                                           a44444a444444a444444444444444444a44444a                                                                                                                                                                                                                                                                          ", "...                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30896");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "...44444444444444444444444444444444440true-1.0097...");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "", 57);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", strArray4, strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444..." + "'", str10, "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test30897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a0044444440004444444000444444400", "0 ", "#########################################hi!hi!hi!hi!hi!hi!hi!hi!hi!hi########");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test30898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30899");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "#########################################HI!HI!HI!HI!HI!HI!HI!HI!HI!HI#############################################################", 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30900");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0true-1.44444444444444444444444444444444444444444440true-1.0097.097.44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", (int) (byte) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, " ", 100, 35);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "         ...", 721, 648);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("        HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...         444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...44444...true-1.4444444...97.4444444...4444444444444...                  4                       ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test30901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970", "A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0true-100970");
    }

    @Test
    public void test30902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("A   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    ", "       ...      a         a         a         a         a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...      a         a         a         a         a" + "'", str2, "       ...      a         a         a         a         a");
    }

    @Test
    public void test30903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!hi!hiTTTTTTi!h", "100.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30904");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(".....4444444444444444444444444444...444444440true-10aaaa00970aaaa0..4444444444444444444444444444...4444444444........4444444444444444444444444444444.....4444444444444444444444444444...4444444444........4444444444444444444444444444...4444444444........4444444444444444444444444444.", "4444444444444444444444444444444444444444440true-1.0097.044444444444444444444444444444444444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444", 618);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30905");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "...                aaaaa0aaaa                     ", 236);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test30906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30906");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0    ..", "44444444444444444444444444444444444444444444444444444444444444444444TRUE-1.97.4444444444444444444444444444444444444444444                                                   ", 544);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30907");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("04true4-414.400974.4004true4-414.400974.4004true4-414.400974.4004tr4 4A4", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30908");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...44", "true-1.00true-1.97.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444");
    }

    @Test
    public void test30910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30910");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("HI", (float) 445L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 445.0f + "'", float2 == 445.0f);
    }

    @Test
    public void test30911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30911");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                  4                   0TRUE-1.0097.04444444444444444444444444444444444444444440TRUE-1.0097.0444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!Hi!hi!hi!hi!hTRUETRUE");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30912");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRUE-1.00....444444440tr...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30913");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##################################################################################################################################################################################################################################################################################### A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0A    44A    44A    44A    44A    44A    44A    44A  ######################################################################################################################################################################################################################################################################################", "                                              0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30914");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                               aAAAAAAAAAAAAAAAA......aAAAAAAAAAAAAAAAA...0aAAAAAAAAAAAAAAAA......");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 135, (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test30915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h", "97.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1.0097.097.000true-1.0097.000true-1.0097.000true-1.0097.000true-1AAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAAAAAAAA0AAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h" + "'", str2, "           A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
    }

    @Test
    public void test30916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30916");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                4444444..444444444444444440true-1.0097...44444444444444444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...", 655, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30917");
        char[] charArray7 = new char[] { '4', '4', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                  4                   0true-1.0097.04444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.04444444444444444444444444440true-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test30918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4true4-44497");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4true4-44497" + "'", str1, "4true4-44497");
    }

    @Test
    public void test30919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30919");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444 100.0 aaaa444444444444444444444", "4444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444440444444444044444444404444444a.........a....0001.....................................................a.........a", 87);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444 44444 4444444444444444444444444" + "'", str5, "444 44444 4444444444444444444444444");
    }

    @Test
    public void test30920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...4444444444444444444444444444444444444444444444444444444444...true-1.4444444...97.4444444...44444444444444444444444444444444444444444440444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...44444444444444444444444444444444440TRUE-1.0097...40444...444444444", "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0     A    RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT", 368);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30921");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "444###44444444444444444444444444444444440true-1#0097###44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444###44444444444444444444444444444444440true-1#0097###44" + "'", str1, "444###44444444444444444444444444444444440true-1#0097###44");
    }

    @Test
    public void test30922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30922");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444true4444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444-4444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444974444444444444444444444444444444444444444444 true - 1 . 97 . 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444 true - 1 . 97 . 4444444444444444444444444444444444444444444", 116.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 116.0d + "'", double2 == 116.0d);
    }

    @Test
    public void test30923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30923");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...0aaaa0aaaaa44444444444444444444444444444444...", "0true-1.0097.0444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30924");
        char[] charArray9 = new char[] { '4', '4', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("a", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh             A     ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                     aaaaaa0aaaaaaaaaaaaa444444...                                                                ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "44 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, 4,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test30925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                               true  ");
    }

    @Test
    public void test30926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30926");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTRUE-1..9.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 229);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30927");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444", "A         A         A        ...", 451);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test30928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("             AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                               ", 754);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                   AAAA0AAAAAAAAA0AAAAAAAAA0AAA...0...                                                                                                                                                                                   hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test30929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30929");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("4444444444444444444444440TRUE-1.009...", "0TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.04444444444444444444444444440TRUE-1.0097.0444444444444444444!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test30930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30930");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("eurt04444444444444444...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   44444444444444444444444444444444444444444440TRUE-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test30931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA 0true-1.00-1.0097.0444444444444444444444444444444...", "    A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A         A!hi!h!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA 0true-1.00-1.0097.0444444444444444444444444444444..." + "'", str2, "HI!HI!HI!HAAAAAAAAAAAAAAAAAAAAAAAAAAAA 0true-1.00-1.0097.0444444444444444444444444444444...");
    }

    @Test
    public void test30932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0" + "'", str2, "0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.a   HI!HI!...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0097...0true-1.0");
    }

    @Test
    public void test30933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...44aaaaaaaaaaaaaaaaaaaaaaaaaaa                     AAAA0AAAAA           aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test30934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0097...", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0097..." + "'", str3, "0097...");
    }

    @Test
    public void test30935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "0TRUE-1.00-1.0097.0444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0TRUE-1.00-1.0097.0444444444444444" + "'", str2, "0TRUE-1.00-1.0097.0444444444444444");
    }

    @Test
    public void test30936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", "0true-1.0097.0");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", 267, 43);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test30937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30937");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444...", (java.lang.CharSequence) "...             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0             0true-10aaaa00970aaaa0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444..." + "'", charSequence2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  aaaaa0aaaa0.7900.1-eurt04444444444444444...");
    }

    @Test
    public void test30938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30938");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                               A44444                                               ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30939");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "444444444444444444444440.7900.1-eurt0aaaa0.001", (java.lang.CharSequence) "                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30940");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444444444444444444444440true-1.0097.0a0a44444444444444444444444...a", "...44444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444444444444444444444444444444444440TRUE-1.044444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("1000", 50, 14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test30942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", 277, 967);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test30943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30943");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...........................................true-97...........................................true-97................................................................................true-97...........................................true-97......................................", "44444444444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "a0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test30944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30944");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 329, (long) 615, (long) 269);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 269L + "'", long3 == 269L);
    }

    @Test
    public void test30945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30945");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa0true-1.0097.0aaaa0aaaaa", ".1-eurt00.7900.1-eurt");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30946");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa", 83, "                                                 ...                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              " + "'", str3, "4444444444444444444444444...aaaaaaaaaaaaaaaaaaaaaaaaa                              ");
    }

    @Test
    public void test30947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30947");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444444444444444444444444444444444444444444444TRUE4444444444444444444444444444444444444444444", 4444444L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4444444L + "'", long2 == 4444444L);
    }

    @Test
    public void test30948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30948");
        char[] charArray14 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "##100.0###", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                      100.0                                                     aaaa100100.0                                                     aaaa.100.0                                                     aaaa0100.0                                                     aaaa                                                ", charArray14);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 38 + "'", int23 == 38);
    }

    @Test
    public void test30949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30949");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(". 97 . 4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test30950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444true-1.97.44444444444444444444444444444444444444444444");
    }

    @Test
    public void test30951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("        a4444444444444444444444444444444         ", "Aaaa                                                     0.001                            A      A  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        a4444444444444444444444444444444         " + "'", str2, "        a4444444444444444444444444444444         ");
    }

    @Test
    public void test30952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                         rue-1.0097.0                                                                                                                                                                                                                                                               ", 957);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  rue-1.0097.0                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  rue-1.0097.0                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test30953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30953");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!HI!HI!HI0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0T...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test30954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30954");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("atruea-a1aaaaaa4444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test30955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#0044444440004444444000444444400", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30956");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                              ", "aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa", 256, (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa" + "'", str4, "                                                              aaaaaaaaaaa4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           44444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           ...4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444           aaaaaaaaaaa");
    }

    @Test
    public void test30957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30957");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444...", "aaaaaa0aaaaaaa", 92);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test30958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30958");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 47, 0.0d, (double) 55.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test30959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30959");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444440.7900.1-eurt04444444444444444444444444444444444444444444.790.7900.1-eurt04444444444444444444444444444444444444444444.1-eurt0.7900.1-eurt044444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("444440true-1.0097.0100.0", strArray4);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...", "a", (int) '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", strArray11, strArray16);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444");
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny("                                      100.0                                                      ", strArray11);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444...");
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray23, "##100.0###");
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray25);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.endsWithAny(" A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0", strArray25);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("4", strArray11, strArray25);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.stripAll(strArray25);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  A      A                            100.0                                                     aaaa", strArray4, strArray29);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     A    ", "4444444...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray34, strArray37);
        int int39 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray37);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.replaceEach("                                  aaaa", strArray29, strArray37);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray37);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444" + "'", str17, "44444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4" + "'", str28, "4");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "  A      A                            100.0                                                     aaaa" + "'", str30, "  A      A                            100.0                                                     aaaa");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4" + "'", str38, "4");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "                                  aaaa" + "'", str40, "                                  aaaa");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str41, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test30960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30960");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "..................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30961");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#...#4#a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30962");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "                       4a4444444444444444444444...4444444444444444444444444444444444444444444444", 907);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("...A     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...A ..." + "'", str1, "...A ...");
    }

    @Test
    public void test30964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) ".0097.00true-1.0097.00true-1.0097.00tr");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30965");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("ih0.0100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ih0.0100.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444444444444444444444true-1.97.4444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                     ", 424);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30967");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A    4", "                                      100.0                                                     ", 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "00       000       000       00A");
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...44444...true-1.4444444...97.4444444...4444444444444...4", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "A    4" + "'", str6, "A    4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A    4" + "'", str8, "A    4");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test30968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 236);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test30969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30969");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 546);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test30970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30970");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0TRUE-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0, "100.0                                                                                      100.0                                                                                      100.0                                            ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0TRUE-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0TRUE-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test30971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30971");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...00true-1.0097.00true-1.0097.00tr", "0TRUE-1.0097.00T..0TRUE-1.0097.00T", 72);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...00true-1.0097.00true-1.0097.00tr" + "'", str4, "...00true-1.0097.00true-1.0097.00tr");
    }

    @Test
    public void test30972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "0444...44444444444444444444444444444444440TRUE-1.0097...44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30973");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444..444444444444..444444444444..444444444444..444444444444..444444444444..444444444444444", "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TRA0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR", 53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444..444444444444..444444444444..444444444444..444444444444..444444444444..444444444444444" + "'", str3, "444444444..444444444444..444444444444..444444444444..444444444444..444444444444..444444444444444");
    }

    @Test
    public void test30974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30974");
        char[] charArray15 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444440true-1.0097.04444444444444444444444444444444444444444444", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.00true-1.0097.00true-1.0097.00tr    A     0true-1.0097.00true-1.0097.00true-1.0097.00t", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444...4444444...4444444...4444444...4444444...4444444...4444444...4444444...444444", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "0aaaa", charArray15);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test30975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30975");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "0TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00TR4444A444440TRUE-1.0097.00TRUE-1.0097.00TRUE-1.0097.00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30977");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test30978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30978");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                               ...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test30979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30979");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0true-1.00-1.0097.04444444444444444444444444444444Ahi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               true-1.  97");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test30980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30980");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A    ", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("...44", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test30981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ", "...4444...                       a                       a                       a                       a                       a                       a  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    " + "'", str2, "    a   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...    a    ");
    }

    @Test
    public void test30982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30982");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  ", "                 4444a44444                  ", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                   " + "'", str4, "                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                   ");
    }

    @Test
    public void test30983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30983");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("41004.404                                                444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A444444444444444444444444A4444444444444444444", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test30984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("AAAA", "0ATRUEA-A1A.A0097A.A0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA" + "'", str2, "AAAA");
    }

    @Test
    public void test30985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30985");
        char[] charArray10 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "0TRUE-", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "true-1.       ...97", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       000       000       00790       000       000       00-0       00eurt0       00", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test30986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test30987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30987");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("true            ", "#a######################...##############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30988");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444444...44444true-1....4444497....444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test30989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30989");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "0AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30990");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                      100.0                                                AAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 109 + "'", int1 == 109);
    }

    @Test
    public void test30991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0atruea-a1a.a0097a.a0", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0atruea-a1a.a0097a.a0" + "'", str2, "0atruea-a1a.a0097a.a0");
    }

    @Test
    public void test30992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("....4444444444444444444444444444...", "...444###################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "....4444444444444444444444444444..." + "'", str2, "....4444444444444444444444444444...");
    }

    @Test
    public void test30993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30993");
        char[] charArray12 = new char[] { ' ', '4', 'a', 'a', 'a' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "100.0", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444true-1.497.44444444444444444444444444444444444444444444", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...44444444444444444444444444444444440true-1.0097...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaaaaa4444444...4444444...4444444...4...aaaaaaaaaaa                                                                                             ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A    ...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih   A44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("0       00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4aaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4, a, a, a]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 119 + "'", int18 == 119);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test30994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30994");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "RT00.7900.1-EURT00.7900.1-EURT00.7900.1-EURT0ART00.7900.1-EURT00.7900.1-EURT00.7900.1-E");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test30995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                    .001                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".001" + "'", str1, ".001");
    }

    @Test
    public void test30996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0## A rt00.7900.1-eurt00.7900.1-eurt00.7900.1-eurt0##100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0#####100.0###", "1aaaaaaaaaaa4444444...4444444...4444444...4    aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                                                             aaaaa0aaaa                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                                         0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444" + "'", str1, "0                                                                                                                                                                                                                                                                         0                                                                                                    4444a44444");
    }

    @Test
    public void test30998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                      ...                                                     ", "A A A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test30999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test30999");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaa" + "'", str1, "!hi!hi!hi...    A0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaaaaaa0true-1.0097.0aaaaaaaaaaaaaaaaaaaaaaa40true-1.0097.     A    40true-1.0097.     A    40true-1.0097.  A    4aaaaaa");
    }

    @Test
    public void test31000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest61.test31000");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr" + "'", str2, "0true-1.0097.00true-1.0097.00true-1.0097.00tr    a     0true-1.0097.00true-1.0097.00true-1.0097.00tr");
    }
}

